// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzk

public class LocationRequestInternal
    implements SafeParcelable
{

    LocationRequestInternal(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        zzzH = i;
        zzaft = locationrequest;
        zzark = flag;
        zzarl = flag1;
        zzarm = flag2;
        zzarn = list;
        mTag = s;
    }

    public static LocationRequestInternal zza(String s, LocationRequest locationrequest)
    {
        return new LocationRequestInternal(1, locationrequest, false, true, true, zzarj, s);
    }

    public static LocationRequestInternal zzb(LocationRequest locationrequest)
    {
        return zza(null, locationrequest);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof LocationRequestInternal)
            if(zzu.equal(zzaft, ((LocationRequestInternal) (obj = (LocationRequestInternal)obj)).zzaft) && zzark == ((LocationRequestInternal) (obj)).zzark && zzarl == ((LocationRequestInternal) (obj)).zzarl && zzarm == ((LocationRequestInternal) (obj)).zzarm && zzu.equal(zzarn, ((LocationRequestInternal) (obj)).zzarn))
                return true;
        return false;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzaft.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzaft.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(zzark);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(zzarl);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(zzarm);
        stringbuilder.append(" clients=");
        stringbuilder.append(zzarn);
        if(mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final zzk CREATOR = new zzk();
    static final List zzarj = Collections.emptyList();
    final String mTag;
    LocationRequest zzaft;
    boolean zzark;
    boolean zzarl;
    boolean zzarm;
    List zzarn;
    private final int zzzH;

}
