// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzr, DataType, DataSource

public class Subscription
    implements SafeParcelable
{
    public static class zza
    {

        static DataType zza(zza zza1)
        {
            return zza1.zzacC;
        }

        static DataSource zzb(zza zza1)
        {
            return zza1.zzacD;
        }

        static long zzc(zza zza1)
        {
            return zza1.zzadK;
        }

        static int zzd(zza zza1)
        {
            return zza1.zzadL;
        }

        public zza zzb(DataSource datasource)
        {
            zzacD = datasource;
            return this;
        }

        public zza zzb(DataType datatype)
        {
            zzacC = datatype;
            return this;
        }

        public Subscription zzoY()
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
            return new Subscription(this);
        }

        private DataType zzacC;
        private DataSource zzacD;
        private long zzadK;
        private int zzadL;

        public zza()
        {
            zzadK = -1L;
            zzadL = 2;
        }
    }


    Subscription(int i, DataSource datasource, DataType datatype, long l, int j)
    {
        zzzH = i;
        zzacD = datasource;
        zzacC = datatype;
        zzadK = l;
        zzadL = j;
    }

    private Subscription(zza zza1)
    {
        zzzH = 1;
        zzacC = zza.zza(zza1);
        zzacD = zza.zzb(zza1);
        zzadK = zza.zzc(zza1);
        zzadL = zza.zzd(zza1);
    }


    private boolean zza(Subscription subscription)
    {
        return zzu.equal(zzacD, subscription.zzacD) && zzu.equal(zzacC, subscription.zzacC) && zzadK == subscription.zzadK && zzadL == subscription.zzadL;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Subscription) && zza((Subscription)obj);
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

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, zzacD, Long.valueOf(zzadK), Integer.valueOf(zzadL)
        });
    }

    public String toDebugString()
    {
        String s;
        if(zzacD == null)
            s = zzacC.getName();
        else
            s = zzacD.toDebugString();
        return String.format("Subscription{%s}", new Object[] {
            s
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("dataSource", zzacD).zzg("dataType", zzacC).zzg("samplingIntervalMicros", Long.valueOf(zzadK)).zzg("accuracyMode", Integer.valueOf(zzadL)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzr.zza(this, parcel, i);
    }

    public long zzoW()
    {
        return zzadK;
    }

    public DataType zzoX()
    {
        if(zzacC == null)
            return zzacD.getDataType();
        else
            return zzacC;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzr();
    private final DataType zzacC;
    private final DataSource zzacD;
    private final long zzadK;
    private final int zzadL;
    private final int zzzH;

}
