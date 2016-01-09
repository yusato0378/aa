// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//            ActivityRecognitionResultCreator, DetectedActivity

public class ActivityRecognitionResult
    implements SafeParcelable
{

    public ActivityRecognitionResult(int i, List list, long l, long l1, int j)
    {
        zzzH = i;
        zzapB = list;
        zzapC = l;
        zzapD = l1;
        zzapE = j;
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1)
    {
        this(detectedactivity, l, l1, 0);
    }

    public ActivityRecognitionResult(DetectedActivity detectedactivity, long l, long l1, int i)
    {
        this(Collections.singletonList(detectedactivity), l, l1, i);
    }

    public ActivityRecognitionResult(List list, long l, long l1)
    {
        this(list, l, l1, 0);
    }

    public ActivityRecognitionResult(List list, long l, long l1, int i)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if(list != null && list.size() > 0)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Must have at least 1 detected activity");
        if(l > 0L && l1 > 0L)
            flag = flag1;
        else
            flag = false;
        zzv.zzb(flag, "Must set times");
        zzzH = 2;
        zzapB = list;
        zzapC = l;
        zzapD = l1;
        zzapE = i;
    }

    public static ActivityRecognitionResult extractResult(Intent intent)
    {
        if(!hasResult(intent))
            return null;
        intent = ((Intent) (intent.getExtras().get("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")));
        if(intent instanceof byte[])
        {
            Parcel parcel = Parcel.obtain();
            parcel.unmarshall((byte[])(byte[])intent, 0, ((byte[])(byte[])intent).length);
            parcel.setDataPosition(0);
            return CREATOR.createFromParcel(parcel);
        }
        if(intent instanceof ActivityRecognitionResult)
            return (ActivityRecognitionResult)intent;
        else
            return null;
    }

    public static boolean hasResult(Intent intent)
    {
        if(intent == null)
            return false;
        else
            return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT");
    }

    public int describeContents()
    {
        return 0;
    }

    public int getActivityConfidence(int i)
    {
        for(Iterator iterator = zzapB.iterator(); iterator.hasNext();)
        {
            DetectedActivity detectedactivity = (DetectedActivity)iterator.next();
            if(detectedactivity.getType() == i)
                return detectedactivity.getConfidence();
        }

        return 0;
    }

    public long getElapsedRealtimeMillis()
    {
        return zzapD;
    }

    public DetectedActivity getMostProbableActivity()
    {
        return (DetectedActivity)zzapB.get(0);
    }

    public List getProbableActivities()
    {
        return zzapB;
    }

    public long getTime()
    {
        return zzapC;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityRecognitionResult [probableActivities=").append(zzapB).append(", timeMillis=").append(zzapC).append(", elapsedRealtimeMillis=").append(zzapD).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ActivityRecognitionResultCreator.zza(this, parcel, i);
    }

    public static final ActivityRecognitionResultCreator CREATOR = new ActivityRecognitionResultCreator();
    public static final String EXTRA_ACTIVITY_RESULT = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT";
    List zzapB;
    long zzapC;
    long zzapD;
    int zzapE;
    private final int zzzH;

}
