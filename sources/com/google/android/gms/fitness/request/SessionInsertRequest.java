// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzjm;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzu

public class SessionInsertRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static Session zza(Builder builder)
        {
            return builder.zzacG;
        }

        static List zzb(Builder builder)
        {
            return builder.zzacQ;
        }

        static List zzc(Builder builder)
        {
            return builder.zzafw;
        }

        private void zzd(DataPoint datapoint)
        {
            zzf(datapoint);
            zze(datapoint);
        }

        private void zze(DataPoint datapoint)
        {
            long l2 = zzacG.getStartTime(TimeUnit.NANOSECONDS);
            long l3 = zzacG.getEndTime(TimeUnit.NANOSECONDS);
            long l4 = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            long l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if(l4 != 0L && l1 != 0L)
            {
                TimeUnit timeunit = TimeUnit.MILLISECONDS;
                long l = l1;
                if(l1 > l3)
                    l = zzim.zza(l1, TimeUnit.NANOSECONDS, timeunit);
                boolean flag;
                if(l4 >= l2 && l <= l3)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Data point %s has start and end times outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if(l != datapoint.getEndTime(TimeUnit.NANOSECONDS))
                {
                    Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getEndTime(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimeInterval(l4, l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzf(DataPoint datapoint)
        {
label0:
            {
                TimeUnit timeunit;
                long l;
                long l2;
                long l3;
label1:
                {
                    l2 = zzacG.getStartTime(TimeUnit.NANOSECONDS);
                    l3 = zzacG.getEndTime(TimeUnit.NANOSECONDS);
                    long l1 = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
                    if(l1 == 0L)
                        break label0;
                    timeunit = TimeUnit.MILLISECONDS;
                    if(l1 >= l2)
                    {
                        l = l1;
                        if(l1 <= l3)
                            break label1;
                    }
                    l = zzim.zza(l1, TimeUnit.NANOSECONDS, timeunit);
                }
                boolean flag;
                if(l >= l2 && l <= l3)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Data point %s has time stamp outside session interval [%d, %d]", new Object[] {
                    datapoint, Long.valueOf(l2), Long.valueOf(l3)
                });
                if(datapoint.getTimestamp(TimeUnit.NANOSECONDS) != l)
                {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", new Object[] {
                        Long.valueOf(datapoint.getTimestamp(TimeUnit.NANOSECONDS)), Long.valueOf(l), timeunit
                    }));
                    datapoint.setTimestamp(l, TimeUnit.NANOSECONDS);
                }
            }
        }

        private void zzpy()
        {
            for(Iterator iterator = zzacQ.iterator(); iterator.hasNext();)
            {
                Iterator iterator2 = ((DataSet)iterator.next()).getDataPoints().iterator();
                while(iterator2.hasNext()) 
                    zzd((DataPoint)iterator2.next());
            }

            for(Iterator iterator1 = zzafw.iterator(); iterator1.hasNext(); zzd((DataPoint)iterator1.next()));
        }

        public Builder addAggregateDataPoint(DataPoint datapoint)
        {
            com.google.android.gms.fitness.data.DataSource datasource;
            long l;
            long l1;
            boolean flag;
            if(datapoint != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid aggregate data point.");
            l = datapoint.getStartTime(TimeUnit.NANOSECONDS);
            l1 = datapoint.getEndTime(TimeUnit.NANOSECONDS);
            if(l > 0L && l1 > l)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Aggregate data point should have valid start and end times: %s", new Object[] {
                datapoint
            });
            datasource = datapoint.getDataSource();
            if(!zzafx.contains(datasource))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Data set/Aggregate data point for this data source %s is already added.", new Object[] {
                datasource
            });
            zzafx.add(datasource);
            zzafw.add(datapoint);
            return this;
        }

        public Builder addDataSet(DataSet dataset)
        {
            boolean flag1 = true;
            com.google.android.gms.fitness.data.DataSource datasource;
            boolean flag;
            if(dataset != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid data set.");
            datasource = dataset.getDataSource();
            if(!zzafx.contains(datasource))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Data set for this data source %s is already added.", new Object[] {
                datasource
            });
            if(!dataset.getDataPoints().isEmpty())
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "No data points specified in the input data set.");
            zzafx.add(datasource);
            zzacQ.add(dataset);
            return this;
        }

        public SessionInsertRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if(zzacG != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Must specify a valid session.");
            if(zzacG.getEndTime(TimeUnit.MILLISECONDS) != 0L)
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "Must specify a valid end time, cannot insert a continuing session.");
            zzpy();
            return new SessionInsertRequest(this);
        }

        public Builder setSession(Session session)
        {
            zzacG = session;
            return this;
        }

        private Session zzacG;
        private List zzacQ;
        private List zzafw;
        private List zzafx;

        public Builder()
        {
            zzacQ = new ArrayList();
            zzafw = new ArrayList();
            zzafx = new ArrayList();
        }
    }


    SessionInsertRequest(int i, Session session, List list, List list1, IBinder ibinder, String s)
    {
        zzzH = i;
        zzacG = session;
        zzacQ = Collections.unmodifiableList(list);
        zzafw = Collections.unmodifiableList(list1);
        if(ibinder == null)
            session = null;
        else
            session = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = session;
        zzJd = s;
    }

    public SessionInsertRequest(Session session, List list, List list1, zzjm zzjm1, String s)
    {
        zzzH = 2;
        zzacG = session;
        zzacQ = Collections.unmodifiableList(list);
        zzafw = Collections.unmodifiableList(list1);
        zzaeH = zzjm1;
        zzJd = s;
    }

    private SessionInsertRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), null, null);
    }


    public SessionInsertRequest(SessionInsertRequest sessioninsertrequest, zzjm zzjm1, String s)
    {
        this(sessioninsertrequest.zzacG, sessioninsertrequest.zzacQ, sessioninsertrequest.zzafw, zzjm1, s);
    }

    private boolean zzb(SessionInsertRequest sessioninsertrequest)
    {
        return zzu.equal(zzacG, sessioninsertrequest.zzacG) && zzu.equal(zzacQ, sessioninsertrequest.zzacQ) && zzu.equal(zzafw, sessioninsertrequest.zzafw);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionInsertRequest) && zzb((SessionInsertRequest)obj);
    }

    public List getAggregateDataPoints()
    {
        return zzafw;
    }

    public List getDataSets()
    {
        return zzacQ;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    public Session getSession()
    {
        return zzacG;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacG, zzacQ, zzafw
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("session", zzacG).zzg("dataSets", zzacQ).zzg("aggregateDataPoints", zzafw).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzu.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.request.zzu();
    private final String zzJd;
    private final Session zzacG;
    private final List zzacQ;
    private final zzjm zzaeH;
    private final List zzafw;
    private final int zzzH;

}
