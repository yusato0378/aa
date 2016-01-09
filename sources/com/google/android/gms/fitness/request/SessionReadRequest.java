// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzjk;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzv

public class SessionReadRequest
    implements SafeParcelable
{
    public static class Builder
    {

        static String zza(Builder builder)
        {
            return builder.zzafy;
        }

        static String zzb(Builder builder)
        {
            return builder.zzBL;
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
            return builder.zzacO;
        }

        static List zzf(Builder builder)
        {
            return builder.zzaeJ;
        }

        static boolean zzg(Builder builder)
        {
            return builder.zzafz;
        }

        static boolean zzh(Builder builder)
        {
            return builder.zzaeU;
        }

        static List zzi(Builder builder)
        {
            return builder.zzafA;
        }

        public SessionReadRequest build()
        {
            boolean flag;
            if(zzGX > 0L)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid start time: %s", new Object[] {
                Long.valueOf(zzGX)
            });
            if(zzacE > 0L && zzacE > zzGX)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Invalid end time: %s", new Object[] {
                Long.valueOf(zzacE)
            });
            return new SessionReadRequest(this);
        }

        public Builder enableServerQueries()
        {
            zzaeU = true;
            return this;
        }

        public Builder excludePackage(String s)
        {
            zzv.zzb(s, "Attempting to use a null package name");
            if(!zzafA.contains(s))
                zzafA.add(s);
            return this;
        }

        public Builder read(DataSource datasource)
        {
            zzv.zzb(datasource, "Attempting to add a null data source");
            if(!zzaeJ.contains(datasource))
                zzaeJ.add(datasource);
            return this;
        }

        public Builder read(DataType datatype)
        {
            zzv.zzb(datatype, "Attempting to use a null data type");
            if(!zzacO.contains(datatype))
                zzacO.add(datatype);
            return this;
        }

        public Builder readSessionsFromAllApps()
        {
            zzafz = true;
            return this;
        }

        public Builder setSessionId(String s)
        {
            zzBL = s;
            return this;
        }

        public Builder setSessionName(String s)
        {
            zzafy = s;
            return this;
        }

        public Builder setTimeInterval(long l, long l1, TimeUnit timeunit)
        {
            zzGX = timeunit.toMillis(l);
            zzacE = timeunit.toMillis(l1);
            return this;
        }

        private String zzBL;
        private long zzGX;
        private long zzacE;
        private List zzacO;
        private List zzaeJ;
        private boolean zzaeU;
        private List zzafA;
        private String zzafy;
        private boolean zzafz;

        public Builder()
        {
            zzGX = 0L;
            zzacE = 0L;
            zzacO = new ArrayList();
            zzaeJ = new ArrayList();
            zzafz = false;
            zzaeU = false;
            zzafA = new ArrayList();
        }
    }


    SessionReadRequest(int i, String s, String s1, long l, long l1, 
            List list, List list1, boolean flag, boolean flag1, List list2, IBinder ibinder, String s2)
    {
        zzzH = i;
        zzafy = s;
        zzBL = s1;
        zzGX = l;
        zzacE = l1;
        zzacO = Collections.unmodifiableList(list);
        zzaeJ = Collections.unmodifiableList(list1);
        zzafz = flag;
        zzaeU = flag1;
        zzafA = list2;
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zzjk.zza.zzaQ(ibinder);
        zzafB = s;
        zzJd = s2;
    }

    private SessionReadRequest(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder), Builder.zzi(builder), null, null);
    }


    public SessionReadRequest(SessionReadRequest sessionreadrequest, zzjk zzjk1, String s)
    {
        this(sessionreadrequest.zzafy, sessionreadrequest.zzBL, sessionreadrequest.zzGX, sessionreadrequest.zzacE, sessionreadrequest.zzacO, sessionreadrequest.zzaeJ, sessionreadrequest.zzafz, sessionreadrequest.zzaeU, sessionreadrequest.zzafA, zzjk1, s);
    }

    public SessionReadRequest(String s, String s1, long l, long l1, List list, 
            List list1, boolean flag, boolean flag1, List list2, zzjk zzjk1, String s2)
    {
        zzzH = 4;
        zzafy = s;
        zzBL = s1;
        zzGX = l;
        zzacE = l1;
        zzacO = Collections.unmodifiableList(list);
        zzaeJ = Collections.unmodifiableList(list1);
        zzafz = flag;
        zzaeU = flag1;
        zzafA = list2;
        zzafB = zzjk1;
        zzJd = s2;
    }

    private boolean zzb(SessionReadRequest sessionreadrequest)
    {
        return zzu.equal(zzafy, sessionreadrequest.zzafy) && zzBL.equals(sessionreadrequest.zzBL) && zzGX == sessionreadrequest.zzGX && zzacE == sessionreadrequest.zzacE && zzu.equal(zzacO, sessionreadrequest.zzacO) && zzu.equal(zzaeJ, sessionreadrequest.zzaeJ) && zzafz == sessionreadrequest.zzafz && zzafA.equals(sessionreadrequest.zzafA) && zzaeU == sessionreadrequest.zzaeU;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadRequest) && zzb((SessionReadRequest)obj);
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

    public List getExcludedPackages()
    {
        return zzafA;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    public String getSessionId()
    {
        return zzBL;
    }

    public String getSessionName()
    {
        return zzafy;
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
            zzafy, zzBL, Long.valueOf(zzGX), Long.valueOf(zzacE)
        });
    }

    public boolean includeSessionsFromAllApps()
    {
        return zzafz;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("sessionName", zzafy).zzg("sessionId", zzBL).zzg("startTimeMillis", Long.valueOf(zzGX)).zzg("endTimeMillis", Long.valueOf(zzacE)).zzg("dataTypes", zzacO).zzg("dataSources", zzaeJ).zzg("sessionsFromAllApps", Boolean.valueOf(zzafz)).zzg("excludedPackages", zzafA).zzg("useServer", Boolean.valueOf(zzaeU)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzv.zza(this, parcel, i);
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
        if(zzafB == null)
            return null;
        else
            return zzafB.asBinder();
    }

    public boolean zzpk()
    {
        return zzaeU;
    }

    public boolean zzpz()
    {
        return zzafz;
    }

    public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.fitness.request.zzv();
    private final String zzBL;
    private final long zzGX;
    private final String zzJd;
    private final long zzacE;
    private final List zzacO;
    private final List zzaeJ;
    private final boolean zzaeU;
    private final List zzafA;
    private final zzjk zzafB;
    private final String zzafy;
    private boolean zzafz;
    private final int zzzH;

}
