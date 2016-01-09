// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivityCreator

public class DetectedActivity
    implements SafeParcelable
{

    public DetectedActivity(int i, int j)
    {
        zzzH = 1;
        zzapG = i;
        zzapH = j;
    }

    public DetectedActivity(int i, int j, int k)
    {
        zzzH = i;
        zzapG = j;
        zzapH = k;
    }

    private int zzfv(int i)
    {
        int j = i;
        if(i > 14)
            j = 4;
        return j;
    }

    public static String zzfw(int i)
    {
        switch(i)
        {
        case 6: // '\006'
        default:
            return Integer.toString(i);

        case 0: // '\0'
            return "IN_VEHICLE";

        case 1: // '\001'
            return "ON_BICYCLE";

        case 2: // '\002'
            return "ON_FOOT";

        case 3: // '\003'
            return "STILL";

        case 4: // '\004'
            return "UNKNOWN";

        case 5: // '\005'
            return "TILTING";

        case 7: // '\007'
            return "WALKING";

        case 8: // '\b'
            return "RUNNING";
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getConfidence()
    {
        return zzapH;
    }

    public int getType()
    {
        return zzfv(zzapG);
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return (new StringBuilder()).append("DetectedActivity [type=").append(zzfw(getType())).append(", confidence=").append(zzapH).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        DetectedActivityCreator.zza(this, parcel, i);
    }

    public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;
    public static final Comparator zzapF = new Comparator() {

        public int compare(Object obj, Object obj1)
        {
            return zza((DetectedActivity)obj, (DetectedActivity)obj1);
        }

        public int zza(DetectedActivity detectedactivity, DetectedActivity detectedactivity1)
        {
            int j = Integer.valueOf(detectedactivity1.getConfidence()).compareTo(Integer.valueOf(detectedactivity.getConfidence()));
            int i = j;
            if(j == 0)
                i = Integer.valueOf(detectedactivity.getType()).compareTo(Integer.valueOf(detectedactivity1.getType()));
            return i;
        }

    }
;
    int zzapG;
    int zzapH;
    private final int zzzH;

}
