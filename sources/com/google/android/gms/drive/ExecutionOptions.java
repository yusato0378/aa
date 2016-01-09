// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzs;

// Referenced classes of package com.google.android.gms.drive:
//            Drive

public final class ExecutionOptions
{
    public static final class Builder
    {

        public ExecutionOptions build()
        {
            if(zzWh == 1 && !zzWg)
                throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
            else
                return new ExecutionOptions(zzWf, zzWg, zzWh);
        }

        public Builder setConflictStrategy(int i)
        {
            if(!ExecutionOptions.zzbs(i))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unrecognized value for conflict strategy: ").append(i).toString());
            } else
            {
                zzWh = i;
                return this;
            }
        }

        public Builder setNotifyOnCompletion(boolean flag)
        {
            zzWg = flag;
            return this;
        }

        public Builder setTrackingTag(String s)
        {
            if(!ExecutionOptions.zzca(s))
            {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", new Object[] {
                    Integer.valueOf(0x10000)
                }));
            } else
            {
                zzWf = s;
                return this;
            }
        }

        private String zzWf;
        private boolean zzWg;
        private int zzWh;

        public Builder()
        {
            zzWh = 0;
        }
    }


    public ExecutionOptions(String s, boolean flag, int i)
    {
        zzWf = s;
        zzWg = flag;
        zzWh = i;
    }

    public static void zza(GoogleApiClient googleapiclient, ExecutionOptions executionoptions)
    {
        googleapiclient = (zzs)googleapiclient.zza(Drive.zzKh);
        if(executionoptions.zznw() && !googleapiclient.zznR())
            throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
        else
            return;
    }

    public static boolean zzbr(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public static boolean zzbs(int i)
    {
        switch(i)
        {
        default:
            return false;

        case 0: // '\0'
        case 1: // '\001'
            return true;
        }
    }

    public static boolean zzca(String s)
    {
        return s != null && !s.isEmpty() && s.length() <= 0x10000;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if(obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(obj == this) goto _L4; else goto _L3
_L3:
        obj = (ExecutionOptions)obj;
        if(!zzu.equal(zzWf, ((ExecutionOptions) (obj)).zzWf) || zzWh != ((ExecutionOptions) (obj)).zzWh)
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzWg == ((ExecutionOptions) (obj)).zzWg) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzWf, Integer.valueOf(zzWh), Boolean.valueOf(zzWg)
        });
    }

    public String zznv()
    {
        return zzWf;
    }

    public boolean zznw()
    {
        return zzWg;
    }

    public int zznx()
    {
        return zzWh;
    }

    public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
    public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
    public static final int MAX_TRACKING_TAG_STRING_LENGTH = 0x10000;
    private final String zzWf;
    private final boolean zzWg;
    private final int zzWh;
}
