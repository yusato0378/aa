// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.FitnessActivities;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzp, Application

public class Session
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

        static String zzc(Builder builder)
        {
            return builder.mName;
        }

        static String zzd(Builder builder)
        {
            return builder.zzadG;
        }

        static String zze(Builder builder)
        {
            return builder.zzadH;
        }

        static int zzf(Builder builder)
        {
            return builder.zzacP;
        }

        static Application zzg(Builder builder)
        {
            return builder.zzadc;
        }

        static Long zzh(Builder builder)
        {
            return builder.zzadI;
        }

        public Session build()
        {
label0:
            {
                boolean flag1 = false;
                StringBuilder stringbuilder;
                boolean flag;
                if(zzGX > 0L)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Start time should be specified.");
                if(zzacE != 0L)
                {
                    flag = flag1;
                    if(zzacE <= zzGX)
                        break label0;
                }
                flag = true;
            }
            zzv.zza(flag, "End time should be later than start time.");
            if(zzadG == null)
            {
                stringbuilder = new StringBuilder();
                String s;
                if(mName == null)
                    s = "";
                else
                    s = mName;
                zzadG = stringbuilder.append(s).append(zzGX).toString();
            }
            return new Session(this);
        }

        public Builder setActiveTime(long l, TimeUnit timeunit)
        {
            zzadI = Long.valueOf(timeunit.toMillis(l));
            return this;
        }

        public Builder setActivity(String s)
        {
            return zzdK(FitnessActivities.zzcl(s));
        }

        public Builder setDescription(String s)
        {
            boolean flag;
            if(s.length() <= 1000)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Session description cannot exceed %d characters", new Object[] {
                Integer.valueOf(1000)
            });
            zzadH = s;
            return this;
        }

        public Builder setEndTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if(l >= 0L)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "End time should be positive.");
            zzacE = timeunit.toMillis(l);
            return this;
        }

        public Builder setIdentifier(String s)
        {
            boolean flag;
            if(s != null && TextUtils.getTrimmedLength(s) > 0)
                flag = true;
            else
                flag = false;
            zzv.zzQ(flag);
            zzadG = s;
            return this;
        }

        public Builder setName(String s)
        {
            boolean flag;
            if(s.length() <= 100)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Session name cannot exceed %d characters", new Object[] {
                Integer.valueOf(100)
            });
            mName = s;
            return this;
        }

        public Builder setStartTime(long l, TimeUnit timeunit)
        {
            boolean flag;
            if(l > 0L)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Start time should be positive.");
            zzGX = timeunit.toMillis(l);
            return this;
        }

        public Builder zzdK(int i)
        {
            zzacP = i;
            return this;
        }

        private String mName;
        private long zzGX;
        private long zzacE;
        private int zzacP;
        private String zzadG;
        private String zzadH;
        private Long zzadI;
        private Application zzadc;

        public Builder()
        {
            zzGX = 0L;
            zzacE = 0L;
            mName = null;
            zzacP = 4;
        }
    }


    Session(int i, long l, long l1, String s, String s1, 
            String s2, int j, Application application, Long long1)
    {
        zzzH = i;
        zzGX = l;
        zzacE = l1;
        mName = s;
        zzadG = s1;
        zzadH = s2;
        zzacP = j;
        zzadc = application;
        zzadI = long1;
    }

    public Session(long l, long l1, String s, String s1, String s2, 
            int i, Application application, Long long1)
    {
        this(3, l, l1, s, s1, s2, i, application, long1);
    }

    private Session(Builder builder)
    {
        this(Builder.zza(builder), Builder.zzb(builder), com.google.android.gms.fitness.data.Builder.zzc(builder), Builder.zzd(builder), Builder.zze(builder), Builder.zzf(builder), Builder.zzg(builder), Builder.zzh(builder));
    }


    public static Session extract(Intent intent)
    {
        if(intent == null)
            return null;
        else
            return (Session)zzc.zza(intent, "vnd.google.fitness.session", CREATOR);
    }

    public static String getMimeType(String s)
    {
        return (new StringBuilder()).append("vnd.google.fitness.session/").append(s).toString();
    }

    private boolean zza(Session session)
    {
        return zzGX == session.zzGX && zzacE == session.zzacE && zzu.equal(mName, session.mName) && zzu.equal(zzadG, session.zzadG) && zzu.equal(zzadH, session.zzadH) && zzu.equal(zzadc, session.zzadc) && zzacP == session.zzacP;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof Session) && zza((Session)obj);
    }

    public long getActiveTime(TimeUnit timeunit)
    {
        boolean flag;
        if(zzadI != null)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Active time is not set");
        return timeunit.convert(zzadI.longValue(), TimeUnit.MILLISECONDS);
    }

    public String getActivity()
    {
        return FitnessActivities.getName(zzacP);
    }

    public String getAppPackageName()
    {
        if(zzadc == null)
            return null;
        else
            return zzadc.getPackageName();
    }

    public String getDescription()
    {
        return zzadH;
    }

    public long getEndTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzacE, TimeUnit.MILLISECONDS);
    }

    public String getIdentifier()
    {
        return zzadG;
    }

    public String getName()
    {
        return mName;
    }

    public long getStartTime(TimeUnit timeunit)
    {
        return timeunit.convert(zzGX, TimeUnit.MILLISECONDS);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public boolean hasActiveTime()
    {
        return zzadI != null;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzGX), Long.valueOf(zzacE), zzadG
        });
    }

    public boolean isOngoing()
    {
        return zzacE == 0L;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("startTime", Long.valueOf(zzGX)).zzg("endTime", Long.valueOf(zzacE)).zzg("name", mName).zzg("identifier", zzadG).zzg("description", zzadH).zzg("activity", Integer.valueOf(zzacP)).zzg("application", zzadc).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public long zzjm()
    {
        return zzGX;
    }

    public int zzoB()
    {
        return zzacP;
    }

    public long zzoD()
    {
        return zzacE;
    }

    public Application zzoM()
    {
        return zzadc;
    }

    public Long zzoU()
    {
        return zzadI;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    public static final String EXTRA_SESSION = "vnd.google.fitness.session";
    public static final String MIME_TYPE_PREFIX = "vnd.google.fitness.session/";
    private final String mName;
    private final long zzGX;
    private final long zzacE;
    private final int zzacP;
    private final String zzadG;
    private final String zzadH;
    private final Long zzadI;
    private final Application zzadc;
    private final int zzzH;

}
