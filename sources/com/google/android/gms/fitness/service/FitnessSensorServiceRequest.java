// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.service;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.zzj;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.service:
//            zza, zzb, SensorEventDispatcher

public class FitnessSensorServiceRequest
    implements SafeParcelable
{

    FitnessSensorServiceRequest(int i, DataSource datasource, IBinder ibinder, long l, long l1)
    {
        zzzH = i;
        zzacD = datasource;
        zzafl = com.google.android.gms.fitness.data.zzj.zza.zzau(ibinder);
        zzafT = l;
        zzafU = l1;
    }

    private boolean zza(FitnessSensorServiceRequest fitnesssensorservicerequest)
    {
        return zzu.equal(zzacD, fitnesssensorservicerequest.zzacD) && zzafT == fitnesssensorservicerequest.zzafT && zzafU == fitnesssensorservicerequest.zzafU;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof FitnessSensorServiceRequest) && zza((FitnessSensorServiceRequest)obj);
    }

    public long getBatchInterval(TimeUnit timeunit)
    {
        return timeunit.convert(zzafU, TimeUnit.MICROSECONDS);
    }

    public DataSource getDataSource()
    {
        return zzacD;
    }

    public SensorEventDispatcher getDispatcher()
    {
        return new zzb(zzafl);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        if(zzafT == -1L)
            return -1L;
        else
            return timeunit.convert(zzafT, TimeUnit.MICROSECONDS);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, Long.valueOf(zzafT), Long.valueOf(zzafU)
        });
    }

    public String toString()
    {
        return String.format("FitnessSensorServiceRequest{%s}", new Object[] {
            zzacD
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.fitness.service.zza.zza(this, parcel, i);
    }

    public long zzoW()
    {
        return zzafT;
    }

    public long zzpL()
    {
        return zzafU;
    }

    IBinder zzpw()
    {
        return zzafl.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final int UNSPECIFIED = -1;
    private final DataSource zzacD;
    private final long zzafT;
    private final long zzafU;
    private final zzj zzafl;
    private final int zzzH;

}
