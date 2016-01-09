// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.SystemClock;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.TimeUnit;

public class SensorRequest
{
    public static class Builder
    {

        static DataSource zza(Builder builder)
        {
            return builder.zzacD;
        }

        static DataType zzb(Builder builder)
        {
            return builder.zzacC;
        }

        static long zzc(Builder builder)
        {
            return builder.zzadK;
        }

        static long zzd(Builder builder)
        {
            return builder.zzafp;
        }

        static long zze(Builder builder)
        {
            return builder.zzafo;
        }

        static int zzf(Builder builder)
        {
            return builder.zzadL;
        }

        static long zzg(Builder builder)
        {
            return builder.zzafu;
        }

        public SensorRequest build()
        {
label0:
            {
                boolean flag1 = false;
                boolean flag;
                if(zzacD != null || zzacC != null)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Must call setDataSource() or setDataType()");
                if(zzacC != null && zzacD != null)
                {
                    flag = flag1;
                    if(!zzacC.equals(zzacD.getDataType()))
                        break label0;
                }
                flag = true;
            }
            zzv.zza(flag, "Specified data type is incompatible with specified data source");
            return new SensorRequest(this);
        }

        public Builder setAccuracyMode(int i)
        {
            zzadL = SensorRequest.zzei(i);
            return this;
        }

        public Builder setDataSource(DataSource datasource)
        {
            zzacD = datasource;
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            zzacC = datatype;
            return this;
        }

        public Builder setFastestRate(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(i >= 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Cannot use a negative interval");
            zzafv = true;
            zzafp = timeunit.toMicros(i);
            return this;
        }

        public Builder setMaxDeliveryLatency(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(i >= 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Cannot use a negative delivery interval");
            zzafo = timeunit.toMicros(i);
            return this;
        }

        public Builder setSamplingRate(long l, TimeUnit timeunit)
        {
            boolean flag;
            if(l >= 0L)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Cannot use a negative sampling interval");
            zzadK = timeunit.toMicros(l);
            if(!zzafv)
                zzafp = zzadK / 2L;
            return this;
        }

        public Builder setTimeout(long l, TimeUnit timeunit)
        {
            boolean flag1 = true;
            boolean flag;
            if(l > 0L)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid time out value specified: %d", new Object[] {
                Long.valueOf(l)
            });
            if(timeunit != null)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "Invalid time unit specified");
            zzafu = timeunit.toMicros(l);
            return this;
        }

        private DataType zzacC;
        private DataSource zzacD;
        private long zzadK;
        private int zzadL;
        private long zzafo;
        private long zzafp;
        private long zzafu;
        private boolean zzafv;

        public Builder()
        {
            zzadK = -1L;
            zzafp = 0L;
            zzafo = 0L;
            zzafv = false;
            zzadL = 2;
            zzafu = 0x7fffffffffffffffL;
        }
    }


    private SensorRequest(DataSource datasource, LocationRequest locationrequest)
    {
        zzaft = locationrequest;
        zzadK = TimeUnit.MILLISECONDS.toMicros(locationrequest.getInterval());
        zzafp = TimeUnit.MILLISECONDS.toMicros(locationrequest.getFastestInterval());
        zzafo = zzadK;
        zzacC = datasource.getDataType();
        zzadL = zza(locationrequest);
        zzacD = datasource;
        long l = locationrequest.getExpirationTime();
        if(l == 0x7fffffffffffffffL)
        {
            zzafu = 0x7fffffffffffffffL;
            return;
        } else
        {
            zzafu = TimeUnit.MILLISECONDS.toMicros(l - SystemClock.elapsedRealtime());
            return;
        }
    }

    private SensorRequest(Builder builder)
    {
        zzacD = Builder.zza(builder);
        zzacC = Builder.zzb(builder);
        zzadK = Builder.zzc(builder);
        zzafp = Builder.zzd(builder);
        zzafo = Builder.zze(builder);
        zzadL = Builder.zzf(builder);
        zzaft = null;
        zzafu = Builder.zzg(builder);
    }


    public static SensorRequest fromLocationRequest(DataSource datasource, LocationRequest locationrequest)
    {
        return new SensorRequest(datasource, locationrequest);
    }

    private static int zza(LocationRequest locationrequest)
    {
        switch(locationrequest.getPriority())
        {
        default:
            return 2;

        case 100: // 'd'
            return 3;

        case 104: // 'h'
            return 1;
        }
    }

    private boolean zza(SensorRequest sensorrequest)
    {
        return zzu.equal(zzacD, sensorrequest.zzacD) && zzu.equal(zzacC, sensorrequest.zzacC) && zzadK == sensorrequest.zzadK && zzafp == sensorrequest.zzafp && zzafo == sensorrequest.zzafo && zzadL == sensorrequest.zzadL && zzu.equal(zzaft, sensorrequest.zzaft) && zzafu == sensorrequest.zzafu;
    }

    public static int zzei(int i)
    {
        int j = i;
        switch(i)
        {
        case 2: // '\002'
        default:
            j = 2;
            // fall through

        case 1: // '\001'
        case 3: // '\003'
            return j;
        }
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SensorRequest) && zza((SensorRequest)obj);
    }

    public int getAccuracyMode()
    {
        return zzadL;
    }

    public DataSource getDataSource()
    {
        return zzacD;
    }

    public DataType getDataType()
    {
        return zzacC;
    }

    public long getFastestRate(TimeUnit timeunit)
    {
        return timeunit.convert(zzafp, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(TimeUnit timeunit)
    {
        return timeunit.convert(zzafo, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(TimeUnit timeunit)
    {
        return timeunit.convert(zzadK, TimeUnit.MICROSECONDS);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, zzacC, Long.valueOf(zzadK), Long.valueOf(zzafp), Long.valueOf(zzafo), Integer.valueOf(zzadL), zzaft, Long.valueOf(zzafu)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("dataSource", zzacD).zzg("dataType", zzacC).zzg("samplingRateMicros", Long.valueOf(zzadK)).zzg("deliveryLatencyMicros", Long.valueOf(zzafo)).zzg("timeOutMicros", Long.valueOf(zzafu)).toString();
    }

    public long zzpx()
    {
        return zzafu;
    }

    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;
    private final DataType zzacC;
    private final DataSource zzacD;
    private final long zzadK;
    private final int zzadL;
    private final long zzafo;
    private final long zzafp;
    private final LocationRequest zzaft;
    private final long zzafu;
}
