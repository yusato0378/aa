// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzjj;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzr

public class ReadStatsRequest
    implements SafeParcelable
{

    ReadStatsRequest(int i, IBinder ibinder, String s)
    {
        zzzH = i;
        zzafk = com.google.android.gms.internal.zzjj.zza.zzaP(ibinder);
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return String.format("ReadStatsRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzr.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzafk.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzr();
    private final String zzJd;
    private final zzjj zzafk;
    private final int zzzH;

}
