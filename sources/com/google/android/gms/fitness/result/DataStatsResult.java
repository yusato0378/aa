// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzf

public class DataStatsResult
    implements Result, SafeParcelable
{

    DataStatsResult(int i, Status status, List list)
    {
        zzzH = i;
        zzKr = status;
        zzafO = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    List zzpH()
    {
        return zzafO;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    private final Status zzKr;
    private final List zzafO;
    private final int zzzH;

}
