// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzb

public class DailyTotalResult
    implements Result, SafeParcelable
{

    DailyTotalResult(int i, Status status, DataSet dataset)
    {
        zzzH = i;
        zzKr = status;
        zzadJ = dataset;
    }

    public DailyTotalResult(DataSet dataset, Status status)
    {
        zzzH = 1;
        zzKr = status;
        zzadJ = dataset;
    }

    public static DailyTotalResult zzD(Status status)
    {
        return new DailyTotalResult(null, status);
    }

    private boolean zzb(DailyTotalResult dailytotalresult)
    {
        return zzKr.equals(dailytotalresult.zzKr) && zzu.equal(zzadJ, dailytotalresult.zzadJ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DailyTotalResult) && zzb((DailyTotalResult)obj);
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public DataSet getTotal()
    {
        return zzadJ;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, zzadJ
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("dataPoint", zzadJ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.result.zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final Status zzKr;
    private final DataSet zzadJ;
    private final int zzzH;

}
