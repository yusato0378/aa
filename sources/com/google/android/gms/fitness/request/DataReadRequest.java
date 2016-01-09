// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.internal.zzix;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzf

public class DataReadRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static List zza(Builder builder)
        {
            return builder.zzacO;
        }

        static List zzb(Builder builder)
        {
            return builder.zzaeJ;
        }

        static long zzc(Builder builder)
        {
            return builder.zzGX;
        }

        static long zzd(Builder builder)
        {
            return builder.zzacE;
        }

        static List zze(Builder builder)
        {
            return builder.zzaeO;
        }

        static List zzf(Builder builder)
        {
            return builder.zzaeP;
        }

        static int zzg(Builder builder)
        {
            return builder.zzacR;
        }

        static long zzh(Builder builder)
        {
            return builder.zzaeQ;
        }

        static DataSource zzi(Builder builder)
        {
            return builder.zzaeR;
        }

        static int zzj(Builder builder)
        {
            return builder.zzaeS;
        }

        static boolean zzk(Builder builder)
        {
            return builder.zzaeT;
        }

        static boolean zzl(Builder builder)
        {
            return builder.zzaeU;
        }

        static List zzm(Builder builder)
        {
            return builder.zzaeW;
        }

        public Builder aggregate(DataSource datasource, DataType datatype)
        {
            zzv.zzb(datasource, "Attempting to add a null data source");
            DataType datatype1;
            boolean flag;
            if(!zzaeJ.contains(datasource))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Cannot add the same data source for aggregated and detailed");
            datatype1 = datasource.getDataType();
            zzv.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(datatype1), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype1
            });
            zzv.zzb(DataType.getAggregatesForInput(datatype1).contains(datatype), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype1, datatype
            });
            if(!zzaeP.contains(datasource))
                zzaeP.add(datasource);
            return this;
        }

        public Builder aggregate(DataType datatype, DataType datatype1)
        {
            zzv.zzb(datatype, "Attempting to use a null data type");
            boolean flag;
            if(!zzacO.contains(datatype))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Cannot add the same data type as aggregated and detailed");
            zzv.zzb(DataType.AGGREGATE_INPUT_TYPES.contains(datatype), "Unsupported input data type specified for aggregation: %s", new Object[] {
                datatype
            });
            zzv.zzb(DataType.getAggregatesForInput(datatype).contains(datatype1), "Invalid output aggregate data type specified: %s -> %s", new Object[] {
                datatype, datatype1
            });
            if(!zzaeO.contains(datatype))
                zzaeO.add(datatype);
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzacR = 4;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivitySegment(int i, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            if(datasource != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid activity data source specified");
            zzv.zzb(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            zzaeR = datasource;
            zzacR = 4;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzacR = 3;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByActivityType(int i, TimeUnit timeunit, DataSource datasource)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            if(datasource != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid activity data source specified");
            zzv.zzb(datasource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", new Object[] {
                datasource
            });
            zzaeR = datasource;
            zzacR = 3;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketBySession(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzacR = 2;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public Builder bucketByTime(int i, TimeUnit timeunit)
        {
            boolean flag;
            if(zzacR == 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Bucketing strategy already set to %s", new Object[] {
                Integer.valueOf(zzacR)
            });
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid minimum duration for an activity segment: %d", new Object[] {
                Integer.valueOf(i)
            });
            zzacR = 1;
            zzaeQ = timeunit.toMillis(i);
            return this;
        }

        public DataReadRequest build()
        {
label0:
            {
                boolean flag2 = true;
                boolean flag;
                boolean flag1;
                if(!zzaeJ.isEmpty() || !zzacO.isEmpty() || !zzaeP.isEmpty() || !zzaeO.isEmpty())
                    flag1 = true;
                else
                    flag1 = false;
                zzv.zza(flag1, "Must add at least one data source (aggregated or detailed)");
                if(zzGX > 0L)
                    flag1 = true;
                else
                    flag1 = false;
                zzv.zza(flag1, "Invalid start time: %s", new Object[] {
                    Long.valueOf(zzGX)
                });
                if(zzacE > 0L && zzacE > zzGX)
                    flag1 = true;
                else
                    flag1 = false;
                zzv.zza(flag1, "Invalid end time: %s", new Object[] {
                    Long.valueOf(zzacE)
                });
                if(zzaeP.isEmpty() && zzaeO.isEmpty())
                    flag = true;
                else
                    flag = false;
                if(flag)
                {
                    flag1 = flag2;
                    if(zzacR == 0)
                        break label0;
                }
                if(!flag && zzacR != 0)
                    flag1 = flag2;
                else
                    flag1 = false;
            }
            zzv.zza(flag1, "Must specify a valid bucketing strategy while requesting aggregation");
            return new DataReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            zzaeU = true;
            return this;
        }

        public Builder read(DataSource datasource)
        {
            zzv.zzb(datasource, "Attempting to add a null data source");
            boolean flag;
            if(!zzaeP.contains(datasource))
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Cannot add the same data source as aggregated and detailed");
            if(!zzaeJ.contains(datasource))
                zzaeJ.add(datasource);
            return this;
        }

        public Builder read(DataType datatype)
        {
            zzv.zzb(datatype, "Attempting to use a null data type");
            boolean flag;
            if(!zzaeO.contains(datatype))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Cannot add the same data type as aggregated and detailed");
            if(!zzacO.contains(datatype))
                zzacO.add(datatype);
            return this;
        }

        public Builder setLimit(int i)
        {
            boolean flag;
            if(i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid limit %d is specified", new Object[] {
                Integer.valueOf(i)
            });
            zzaeS = i;
            return this;
        }

        public Builder setTimeRange(long l, long l1, TimeUnit timeunit)
        {
            zzGX = timeunit.toMillis(l);
            zzacE = timeunit.toMillis(l1);
            return this;
        }

        private long zzGX;
        private long zzacE;
        private List zzacO;
        private int zzacR;
        private List zzaeJ;
        private List zzaeO;
        private List zzaeP;
        private long zzaeQ;
        private DataSource zzaeR;
        private int zzaeS;
        private boolean zzaeT;
        private boolean zzaeU;
        private List zzaeW;

        public Builder()
        {
            zzacO = new ArrayList();
            zzaeJ = new ArrayList();
            zzaeO = new ArrayList();
            zzaeP = new ArrayList();
            zzacR = 0;
            zzaeQ = 0L;
            zzaeS = 0;
            zzaeT = false;
            zzaeU = false;
            zzaeW = new ArrayList();
        }
    }


    DataReadRequest(int i, List list, List list1, long l, long l1, 
            List list2, List list3, int j, long l2, DataSource datasource, int k, 
            boolean flag, boolean flag1, IBinder ibinder, String s, List list4)
    {
        zzzH = i;
        zzacO = Collections.unmodifiableList(list);
        zzaeJ = Collections.unmodifiableList(list1);
        zzGX = l;
        zzacE = l1;
        zzaeO = Collections.unmodifiableList(list2);
        zzaeP = Collections.unmodifiableList(list3);
        zzacR = j;
        zzaeQ = l2;
        zzaeR = datasource;
        zzaeS = k;
        zzaeT = flag;
        zzaeU = flag1;
        if(ibinder == null)
            list = null;
        else
            list = com.google.android.gms.internal.zzix.zza.zzaD(ibinder);
        zzaeV = list;
        zzJd = s;
        list = list4;
        if(list4 == null)
            list = Collections.EMPTY_LIST;
        zzaeW = list;
    }

    private DataReadRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), Builder.zzj(builder), Builder.zzk(builder), Builder.zzl(builder), null, null, Builder.zzm(builder));
    }


    public DataReadRequest(DataReadRequest datareadrequest, zzix zzix1, String s)
    {
        this(datareadrequest.zzacO, datareadrequest.zzaeJ, datareadrequest.zzGX, datareadrequest.zzacE, datareadrequest.zzaeO, datareadrequest.zzaeP, datareadrequest.zzacR, datareadrequest.zzaeQ, datareadrequest.zzaeR, datareadrequest.zzaeS, datareadrequest.zzaeT, datareadrequest.zzaeU, zzix1, s, datareadrequest.zzaeW);
    }

    public DataReadRequest(List list, List list1, long l, long l1, List list2, 
            List list3, int i, long l2, DataSource datasource, int j, boolean flag, 
            boolean flag1, zzix zzix1, String s, List list4)
    {
        zzzH = 4;
        zzacO = Collections.unmodifiableList(list);
        zzaeJ = Collections.unmodifiableList(list1);
        zzGX = l;
        zzacE = l1;
        zzaeO = Collections.unmodifiableList(list2);
        zzaeP = Collections.unmodifiableList(list3);
        zzacR = i;
        zzaeQ = l2;
        zzaeR = datasource;
        zzaeS = j;
        zzaeT = flag;
        zzaeU = flag1;
        zzaeV = zzix1;
        zzJd = s;
        zzaeW = list4;
    }

    private boolean zzb(DataReadRequest datareadrequest)
    {
        return zzacO.equals(datareadrequest.zzacO) && zzaeJ.equals(datareadrequest.zzaeJ) && zzGX == datareadrequest.zzGX && zzacE == datareadrequest.zzacE && zzacR == datareadrequest.zzacR && zzaeP.equals(datareadrequest.zzaeP) && zzaeO.equals(datareadrequest.zzaeO) && zzu.equal(zzaeR, datareadrequest.zzaeR) && zzaeQ == datareadrequest.zzaeQ && zzaeU == datareadrequest.zzaeU;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataReadRequest) && zzb((DataReadRequest)obj);
    }

    public DataSource getActivityDataSource()
    {
        return zzaeR;
    }

    public List getAggregatedDataSources()
    {
        return zzaeP;
    }

    public List getAggregatedDataTypes()
    {
        return zzaeO;
    }

    public long getBucketDuration(TimeUnit timeunit)
    {
        return timeunit.convert(zzaeQ, TimeUnit.MILLISECONDS);
    }

    public int getBucketType()
    {
        return zzacR;
    }

    public List getDataSources()
    {
        return zzaeJ;
    }

    public List getDataTypes()
    {
        return zzacO;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzacE, TimeUnit.MILLISECONDS);
    }

    public int getLimit()
    {
        return zzaeS;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzGX, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzacR), Long.valueOf(zzGX), Long.valueOf(zzacE)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataReadRequest{");
        if(!zzacO.isEmpty())
        {
            for(Iterator iterator = zzacO.iterator(); iterator.hasNext(); stringbuilder.append(((DataType)iterator.next()).zzoO()).append(" "));
        }
        if(!zzaeJ.isEmpty())
        {
            for(Iterator iterator1 = zzaeJ.iterator(); iterator1.hasNext(); stringbuilder.append(((DataSource)iterator1.next()).toDebugString()).append(" "));
        }
        if(zzacR != 0)
        {
            stringbuilder.append("bucket by ").append(Bucket.zzdx(zzacR));
            if(zzaeQ > 0L)
                stringbuilder.append(" >").append(zzaeQ).append("ms");
            stringbuilder.append(": ");
        }
        if(!zzaeO.isEmpty())
        {
            for(Iterator iterator2 = zzaeO.iterator(); iterator2.hasNext(); stringbuilder.append(((DataType)iterator2.next()).zzoO()).append(" "));
        }
        if(!zzaeP.isEmpty())
        {
            for(Iterator iterator3 = zzaeP.iterator(); iterator3.hasNext(); stringbuilder.append(((DataSource)iterator3.next()).toDebugString()).append(" "));
        }
        stringbuilder.append(String.format("(%tF %tT - %tF %tT)", new Object[] {
            Long.valueOf(zzGX), Long.valueOf(zzGX), Long.valueOf(zzacE), Long.valueOf(zzacE)
        }));
        if(zzaeR != null)
            stringbuilder.append("activities: ").append(zzaeR.toDebugString());
        if(zzaeU)
            stringbuilder.append(" +server");
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public long zzjm()
    {
        return zzGX;
    }

    public long zzoD()
    {
        return zzacE;
    }

    public IBinder zzpf()
    {
        if(zzaeV == null)
            return null;
        else
            return zzaeV.asBinder();
    }

    public boolean zzpk()
    {
        return zzaeU;
    }

    public boolean zzpl()
    {
        return zzaeT;
    }

    public long zzpm()
    {
        return zzaeQ;
    }

    public List zzpn()
    {
        return zzaeW;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final int NO_LIMIT = 0;
    private final long zzGX;
    private final String zzJd;
    private final long zzacE;
    private final List zzacO;
    private final int zzacR;
    private final List zzaeJ;
    private final List zzaeO;
    private final List zzaeP;
    private final long zzaeQ;
    private final DataSource zzaeR;
    private final int zzaeS;
    private final boolean zzaeT;
    private final boolean zzaeU;
    private final zzix zzaeV;
    private final List zzaeW;
    private final int zzzH;

}
