// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzim;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzd, DataSource, DataType, Value, 
//            Field, RawDataPoint

public final class DataPoint
    implements SafeParcelable
{

    DataPoint(int i, DataSource datasource, long l, long l1, Value avalue[], 
            DataSource datasource1, long l2, long l3)
    {
        zzzH = i;
        zzacD = datasource;
        zzacW = datasource1;
        zzacT = l;
        zzacU = l1;
        zzacV = avalue;
        zzacX = l2;
        zzacY = l3;
    }

    private DataPoint(DataSource datasource)
    {
        zzzH = 4;
        zzacD = (DataSource)zzv.zzb(datasource, "Data source cannot be null");
        datasource = datasource.getDataType().getFields();
        zzacV = new Value[datasource.size()];
        datasource = datasource.iterator();
        for(int i = 0; datasource.hasNext(); i++)
        {
            Field field = (Field)datasource.next();
            zzacV[i] = new Value(field.getFormat());
        }

    }

    public DataPoint(DataSource datasource, DataSource datasource1, RawDataPoint rawdatapoint)
    {
        this(4, datasource, zza(Long.valueOf(rawdatapoint.zzacT), 0L), zza(Long.valueOf(rawdatapoint.zzacU), 0L), rawdatapoint.zzacV, datasource1, zza(Long.valueOf(rawdatapoint.zzacX), 0L), zza(Long.valueOf(rawdatapoint.zzacY), 0L));
    }

    DataPoint(List list, RawDataPoint rawdatapoint)
    {
        this(zza(list, rawdatapoint.zzadC), zza(list, rawdatapoint.zzadD), rawdatapoint);
    }

    public static DataPoint create(DataSource datasource)
    {
        return new DataPoint(datasource);
    }

    public static DataPoint extract(Intent intent)
    {
        if(intent == null)
            return null;
        else
            return (DataPoint)zzc.zza(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    private static long zza(Long long1, long l)
    {
        if(long1 != null)
            l = long1.longValue();
        return l;
    }

    private static DataSource zza(List list, int i)
    {
        if(i >= 0 && i < list.size())
            return (DataSource)list.get(i);
        else
            return null;
    }

    private boolean zza(DataPoint datapoint)
    {
        return zzu.equal(zzacD, datapoint.zzacD) && zzacT == datapoint.zzacT && zzacU == datapoint.zzacU && Arrays.equals(zzacV, datapoint.zzacV) && zzu.equal(zzacW, datapoint.zzacW);
    }

    private void zzdz(int i)
    {
        List list = getDataType().getFields();
        int j = list.size();
        boolean flag;
        if(i == j)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Attempting to insert %s values, but needed %s: %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), list
        });
    }

    private boolean zzoE()
    {
        return getDataType() == DataType.TYPE_LOCATION_SAMPLE;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataPoint) && zza((DataPoint)obj);
    }

    public DataSource getDataSource()
    {
        return zzacD;
    }

    public DataType getDataType()
    {
        return zzacD.getDataType();
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzacT, TimeUnit.NANOSECONDS);
    }

    public DataSource getOriginalDataSource()
    {
        return zzacW;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzacU, TimeUnit.NANOSECONDS);
    }

    public long getTimestamp(TimeUnit timeunit)
    {
        return timeunit.convert(zzacT, TimeUnit.NANOSECONDS);
    }

    public long getTimestampNanos()
    {
        return zzacT;
    }

    public Value getValue(Field field)
    {
        int i = getDataType().indexOf(field);
        return zzacV[i];
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, Long.valueOf(zzacT), Long.valueOf(zzacU)
        });
    }

    public transient DataPoint setFloatValues(float af[])
    {
        zzdz(af.length);
        for(int i = 0; i < af.length; i++)
            zzacV[i].setFloat(af[i]);

        return this;
    }

    public transient DataPoint setIntValues(int ai[])
    {
        zzdz(ai.length);
        for(int i = 0; i < ai.length; i++)
            zzacV[i].setInt(ai[i]);

        return this;
    }

    public DataPoint setTimeInterval(long l, long l1, TimeUnit timeunit)
    {
        zzacU = timeunit.toNanos(l);
        zzacT = timeunit.toNanos(l1);
        return this;
    }

    public DataPoint setTimestamp(long l, TimeUnit timeunit)
    {
        zzacT = timeunit.toNanos(l);
        if(zzoE() && zzim.zza(timeunit))
        {
            Log.w("Fitness", "Storing location at more than millisecond granularity is not supported. Extra precision is lost as the value is converted to milliseconds.");
            zzacT = zzim.zza(zzacT, TimeUnit.NANOSECONDS, TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public String toString()
    {
        String s1 = Arrays.toString(zzacV);
        long l = zzacU;
        long l1 = zzacT;
        long l2 = zzacX;
        long l3 = zzacY;
        String s2 = zzacD.toDebugString();
        String s;
        if(zzacW != null)
            s = zzacW.toDebugString();
        else
            s = "N/A";
        return String.format("DataPoint{%s@[%s, %s,raw=%s,insert=%s](%s %s)}", new Object[] {
            s1, Long.valueOf(l), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), s2, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public Value[] zzoF()
    {
        return zzacV;
    }

    public long zzoG()
    {
        return zzacX;
    }

    public long zzoH()
    {
        return zzacY;
    }

    public void zzoI()
    {
        DataSource datasource = getDataSource();
        zzv.zzb(getDataType().getName().equals(datasource.getDataType().getName()), "Conflicting data types found %s vs %s", new Object[] {
            getDataType(), getDataType()
        });
        boolean flag;
        if(zzacT > 0L)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Data point does not have the timestamp set: %s", new Object[] {
            this
        });
        if(zzacU <= zzacT)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Data point with start time greater than end time found: %s", new Object[] {
            this
        });
    }

    public long zzoJ()
    {
        return zzacU;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    private final DataSource zzacD;
    private long zzacT;
    private long zzacU;
    private final Value zzacV[];
    private DataSource zzacW;
    private long zzacX;
    private long zzacY;
    private final int zzzH;

}
