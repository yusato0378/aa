// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.zza;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzd, zzk, zzw

public class zzj
{

    protected zzj()
    {
    }

    protected static void zza(zzj zzj1)
    {
        synchronized(zznu)
        {
            zzqe = zzj1;
        }
        return;
        zzj1;
        obj;
        JVM INSTR monitorexit ;
        throw zzj1;
    }

    private static zzj zzbI()
    {
        zzj zzj1;
        synchronized(zznu)
        {
            zzj1 = zzqe;
        }
        return zzj1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static zza zzbJ()
    {
        return zzbI().zzqf;
    }

    public static zzd zzbK()
    {
        return zzbI().zzqg;
    }

    public static zzk zzbL()
    {
        return zzbI().zzqh;
    }

    private static final Object zznu = new Object();
    private static zzj zzqe;
    private final zza zzqf = new zza();
    private final zzd zzqg = new zzd();
    private final zzk zzqh = new zzk();
    private final zzw zzqi = new zzw();

    static 
    {
        zza(new zzj());
    }
}
