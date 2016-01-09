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
import com.google.android.gms.internal.zzjm;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzd

public class DataDeleteRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static long zza(Builder builder)
        {
            return builder.zzGX;
        }

        static long zzb(Builder builder)
        {
            return builder.zzacE;
        }

        static List zzc(Builder builder)
        {
            return builder.zzaeJ;
        }

        static List zzd(Builder builder)
        {
            return builder.zzacO;
        }

        static List zze(Builder builder)
        {
            return builder.zzaeK;
        }

        static boolean zzf(Builder builder)
        {
            return builder.zzaeL;
        }

        static boolean zzg(Builder builder)
        {
            return builder.zzaeM;
        }

        private void zzpi()
        {
            if(!zzaeK.isEmpty())
            {
                Iterator iterator = zzaeK.iterator();
                while(iterator.hasNext()) 
                {
                    Session session = (Session)iterator.next();
                    boolean flag;
                    if(session.getStartTime(TimeUnit.MILLISECONDS) >= zzGX && session.getEndTime(TimeUnit.MILLISECONDS) <= zzacE)
                        flag = true;
                    else
                        flag = false;
                    zzv.zza(flag, "Session %s is outside the time interval [%d, %d]", new Object[] {
                        session, Long.valueOf(zzGX), Long.valueOf(zzacE)
                    });
                }
            }
        }

        public Builder addDataSource(DataSource datasource)
        {
            boolean flag1 = true;
            boolean flag;
            if(!zzaeL)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "All data is already marked for deletion");
            if(datasource != null)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid data source");
            if(!zzaeJ.contains(datasource))
                zzaeJ.add(datasource);
            return this;
        }

        public Builder addDataType(DataType datatype)
        {
            boolean flag1 = true;
            boolean flag;
            if(!zzaeL)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "All data is already marked for deletion");
            if(datatype != null)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid data type");
            if(!zzacO.contains(datatype))
                zzacO.add(datatype);
            return this;
        }

        public Builder addSession(Session session)
        {
            boolean flag1 = true;
            boolean flag;
            if(!zzaeM)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "All sessions already marked for deletion");
            if(session != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Must specify a valid session");
            if(session.getEndTime(TimeUnit.MILLISECONDS) > 0L)
                flag = flag1;
            else
                flag = false;
            zzv.zzb(flag, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            zzaeK.add(session);
            return this;
        }

        public DataDeleteRequest build()
        {
label0:
            {
                boolean flag3 = false;
                boolean flag;
                boolean flag1;
                boolean flag2;
                if(zzGX > 0L && zzacE > zzGX)
                    flag2 = true;
                else
                    flag2 = false;
                zzv.zza(flag2, "Must specify a valid time interval");
                if(zzaeL || !zzaeJ.isEmpty() || !zzacO.isEmpty())
                    flag = true;
                else
                    flag = false;
                if(zzaeM || !zzaeK.isEmpty())
                    flag1 = true;
                else
                    flag1 = false;
                if(!flag)
                {
                    flag2 = flag3;
                    if(!flag1)
                        break label0;
                }
                flag2 = true;
            }
            zzv.zza(flag2, "No data or session marked for deletion");
            zzpi();
            return new DataDeleteRequest(this);
        }

        public Builder deleteAllData()
        {
            boolean flag;
            if(zzacO.isEmpty() && zzaeJ.isEmpty())
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Specific data source/type already specified for deletion. DataSources: %s DataTypes: %s", new Object[] {
                zzaeJ, zzacO
            });
            zzaeL = true;
            return this;
        }

        public Builder deleteAllSessions()
        {
            zzv.zzb(zzaeK.isEmpty(), "Specific sessions already added for deletion: %s", new Object[] {
                zzaeK
            });
            zzaeM = true;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            boolean flag;
            if(l > 0L)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid start time :%d", new Object[] {
                Long.valueOf(l)
            });
            if(l1 > l)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid end time :%d", new Object[] {
                Long.valueOf(l1)
            });
            zzGX = timeunit.toMillis(l);
            zzacE = timeunit.toMillis(l1);
            return this;
        }

        private long zzGX;
        private long zzacE;
        private List zzacO;
        private List zzaeJ;
        private List zzaeK;
        private boolean zzaeL;
        private boolean zzaeM;

        public Builder()
        {
            zzaeJ = new ArrayList();
            zzacO = new ArrayList();
            zzaeK = new ArrayList();
            zzaeL = false;
            zzaeM = false;
        }
    }


    DataDeleteRequest(int i, long l, long l1, List list, List list1, 
            List list2, boolean flag, boolean flag1, IBinder ibinder, String s)
    {
        zzzH = i;
        zzGX = l;
        zzacE = l1;
        zzaeJ = Collections.unmodifiableList(list);
        zzacO = Collections.unmodifiableList(list1);
        zzaeK = list2;
        zzaeL = flag;
        zzaeM = flag1;
        if(ibinder == null)
            list = null;
        else
            list = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = list;
        zzJd = s;
    }

    public DataDeleteRequest(long l, long l1, List list, List list1, List list2, 
            boolean flag, boolean flag1, zzjm zzjm1, String s)
    {
        zzzH = 2;
        zzGX = l;
        zzacE = l1;
        zzaeJ = Collections.unmodifiableList(list);
        zzacO = Collections.unmodifiableList(list1);
        zzaeK = list2;
        zzaeL = flag;
        zzaeM = flag1;
        zzaeH = zzjm1;
        zzJd = s;
    }

    private DataDeleteRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), null, null);
    }


    public DataDeleteRequest(DataDeleteRequest datadeleterequest, zzjm zzjm1, String s)
    {
        this(datadeleterequest.zzGX, datadeleterequest.zzacE, datadeleterequest.zzaeJ, datadeleterequest.zzacO, datadeleterequest.zzaeK, datadeleterequest.zzaeL, datadeleterequest.zzaeM, zzjm1, s);
    }

    private boolean zzb(DataDeleteRequest datadeleterequest)
    {
        return zzGX == datadeleterequest.zzGX && zzacE == datadeleterequest.zzacE && zzu.equal(zzaeJ, datadeleterequest.zzaeJ) && zzu.equal(zzacO, datadeleterequest.zzacO) && zzu.equal(zzaeK, datadeleterequest.zzaeK) && zzaeL == datadeleterequest.zzaeL && zzaeM == datadeleterequest.zzaeM;
    }

    public boolean deleteAllData()
    {
        return zzaeL;
    }

    public boolean deleteAllSessions()
    {
        return zzaeM;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataDeleteRequest) && zzb((DataDeleteRequest)obj);
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

    public String getPackageName()
    {
        return zzJd;
    }

    public List getSessions()
    {
        return zzaeK;
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
            Long.valueOf(zzGX), Long.valueOf(zzacE)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("startTimeMillis", Long.valueOf(zzGX)).zzg("endTimeMillis", Long.valueOf(zzacE)).zzg("dataSources", zzaeJ).zzg("dateTypes", zzacO).zzg("sessions", zzaeK).zzg("deleteAllData", Boolean.valueOf(zzaeL)).zzg("deleteAllSessions", Boolean.valueOf(zzaeM)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
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
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public boolean zzpg()
    {
        return zzaeL;
    }

    public boolean zzph()
    {
        return zzaeM;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    private final long zzGX;
    private final String zzJd;
    private final long zzacE;
    private final List zzacO;
    private final zzjm zzaeH;
    private final List zzaeJ;
    private final List zzaeK;
    private final boolean zzaeL;
    private final boolean zzaeM;
    private final int zzzH;

}
