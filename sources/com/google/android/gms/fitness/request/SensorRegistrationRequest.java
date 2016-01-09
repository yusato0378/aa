// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.internal.zzjm;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzs, SensorRequest

public class SensorRegistrationRequest
    implements SafeParcelable
{

    SensorRegistrationRequest(int i, DataSource datasource, DataType datatype, IBinder ibinder, int j, int k, long l, long l1, PendingIntent pendingintent, long l2, int i1, 
            List list, long l3, IBinder ibinder1, String s)
    {
        zzzH = i;
        zzacD = datasource;
        zzacC = datatype;
        long l4;
        if(ibinder == null)
            datasource = null;
        else
            datasource = com.google.android.gms.fitness.data.zzj.zza.zzau(ibinder);
        zzafl = datasource;
        l4 = l;
        if(l == 0L)
            l4 = j;
        zzadK = l4;
        zzafp = l2;
        l = l1;
        if(l1 == 0L)
            l = k;
        zzafo = l;
        zzafq = list;
        mPendingIntent = pendingintent;
        zzadL = i1;
        zzafs = Collections.emptyList();
        zzafr = l3;
        if(ibinder1 == null)
            datasource = null;
        else
            datasource = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder1);
        zzaeH = datasource;
        zzJd = s;
    }

    public SensorRegistrationRequest(DataSource datasource, DataType datatype, zzj zzj1, PendingIntent pendingintent, long l, long l1, long l2, int i, List list, List list1, long l3, zzjm zzjm1, String s)
    {
        zzzH = 5;
        zzacD = datasource;
        zzacC = datatype;
        zzafl = zzj1;
        mPendingIntent = pendingintent;
        zzadK = l;
        zzafp = l1;
        zzafo = l2;
        zzadL = i;
        zzafq = list;
        zzafs = list1;
        zzafr = l3;
        zzaeH = zzjm1;
        zzJd = s;
    }

    public SensorRegistrationRequest(SensorRequest sensorrequest, zzj zzj1, PendingIntent pendingintent, zzjm zzjm1, String s)
    {
        this(sensorrequest.getDataSource(), sensorrequest.getDataType(), zzj1, pendingintent, sensorrequest.getSamplingRate(TimeUnit.MICROSECONDS), sensorrequest.getFastestRate(TimeUnit.MICROSECONDS), sensorrequest.getMaxDeliveryLatency(TimeUnit.MICROSECONDS), sensorrequest.getAccuracyMode(), null, Collections.emptyList(), sensorrequest.zzpx(), zzjm1, s);
    }

    private boolean zzb(SensorRegistrationRequest sensorregistrationrequest)
    {
        return zzu.equal(zzacD, sensorregistrationrequest.zzacD) && zzu.equal(zzacC, sensorregistrationrequest.zzacC) && zzadK == sensorregistrationrequest.zzadK && zzafp == sensorregistrationrequest.zzafp && zzafo == sensorregistrationrequest.zzafo && zzadL == sensorregistrationrequest.zzadL && zzu.equal(zzafq, sensorregistrationrequest.zzafq);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SensorRegistrationRequest) && zzb((SensorRegistrationRequest)obj);
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

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, zzacC, zzafl, Long.valueOf(zzadK), Long.valueOf(zzafp), Long.valueOf(zzafo), Integer.valueOf(zzadL), zzafq
        });
    }

    public String toString()
    {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", new Object[] {
            zzacC, zzacD, Long.valueOf(zzadK), Long.valueOf(zzafp), Long.valueOf(zzafo)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzs.zza(this, parcel, i);
    }

    public long zzoW()
    {
        return zzadK;
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public PendingIntent zzpr()
    {
        return mPendingIntent;
    }

    public long zzps()
    {
        return zzafp;
    }

    public long zzpt()
    {
        return zzafo;
    }

    public List zzpu()
    {
        return zzafq;
    }

    public long zzpv()
    {
        return zzafr;
    }

    IBinder zzpw()
    {
        if(zzafl == null)
            return null;
        else
            return zzafl.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzs();
    private final PendingIntent mPendingIntent;
    private final String zzJd;
    private final DataType zzacC;
    private final DataSource zzacD;
    private final long zzadK;
    private final int zzadL;
    private final zzjm zzaeH;
    private zzj zzafl;
    int zzafm;
    int zzafn;
    private final long zzafo;
    private final long zzafp;
    private final List zzafq;
    private final long zzafr;
    private final List zzafs;
    private final int zzzH;

}
