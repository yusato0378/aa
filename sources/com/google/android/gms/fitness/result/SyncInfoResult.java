// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzl

public class SyncInfoResult
    implements Result, SafeParcelable
{

    SyncInfoResult(int i, Status status, long l)
    {
        zzzH = i;
        zzKr = status;
        zzOB = l;
    }

    private boolean zzb(SyncInfoResult syncinforesult)
    {
        return zzKr.equals(syncinforesult.zzKr) && zzu.equal(Long.valueOf(zzOB), Long.valueOf(syncinforesult.zzOB));
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SyncInfoResult) && zzb((SyncInfoResult)obj);
    }

    public Status getStatus()
    {
        return zzKr;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, Long.valueOf(zzOB)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("timestamp", Long.valueOf(zzOB)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public long zzpJ()
    {
        return zzOB;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    private final Status zzKr;
    private final long zzOB;
    private final int zzzH;

}
