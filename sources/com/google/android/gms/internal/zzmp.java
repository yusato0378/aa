// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzmj

public class zzmp
    implements Result
{
    public static class zza
    {

        public Status getStatus()
        {
            return zzKr;
        }

        public zza zzyn()
        {
            return zzaHb;
        }

        public byte[] zzyo()
        {
            return zzaHc;
        }

        public zzmj zzyp()
        {
            return zzaHe;
        }

        public zzmq.zzc zzyq()
        {
            return zzaHf;
        }

        public long zzyr()
        {
            return zzaHd;
        }

        private final Status zzKr;
        private final zza zzaHb;
        private final byte zzaHc[];
        private final long zzaHd;
        private final zzmj zzaHe;
        private final zzmq.zzc zzaHf;

        public zza(Status status, zzmj zzmj, zza zza1)
        {
            this(status, zzmj, null, null, zza1, 0L);
        }

        public zza(Status status, zzmj zzmj, byte abyte0[], zzmq.zzc zzc, zza zza1, long l)
        {
            zzKr = status;
            zzaHe = zzmj;
            zzaHc = abyte0;
            zzaHf = zzc;
            zzaHb = zza1;
            zzaHd = l;
        }
    }

    public static final class zza.zza extends Enum
    {

        public static zza.zza valueOf(String s)
        {
            return (zza.zza)Enum.valueOf(com/google/android/gms/internal/zzmp$zza$zza, s);
        }

        public static zza.zza[] values()
        {
            return (zza.zza[])zzaHj.clone();
        }

        public static final zza.zza zzaHg;
        public static final zza.zza zzaHh;
        public static final zza.zza zzaHi;
        private static final zza.zza zzaHj[];

        static 
        {
            zzaHg = new zza.zza("NETWORK", 0);
            zzaHh = new zza.zza("DISK", 1);
            zzaHi = new zza.zza("DEFAULT", 2);
            zzaHj = (new zza.zza[] {
                zzaHg, zzaHh, zzaHi
            });
        }

        private zza.zza(String s, int i)
        {
            super(s, i);
        }
    }


    public zzmp(zza zza1)
    {
        zzaHa = zza1;
    }

    public Status getStatus()
    {
        return zzaHa.getStatus();
    }

    public zza zzym()
    {
        return zzaHa;
    }

    private final zza zzaHa;
}
