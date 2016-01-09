// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzr, zzj

public final class zzq extends zzaq.zza
{

    public zzq()
    {
    }

    public void zza(zzr zzr1)
    {
        zzj zzj1;
        synchronized(zzoe)
        {
            zzaLP = (zzr)com.google.android.gms.common.internal.zzv.zzr(zzr1);
            zzj1 = zzaLL;
        }
        if(zzj1 != null)
            zzr1.zzb(zzj1);
        return;
        zzr1;
        obj;
        JVM INSTR monitorexit ;
        throw zzr1;
    }

    public void zzv(int i, int j)
    {
        zzr zzr1;
        zzj zzj1;
        synchronized(zzoe)
        {
            zzr1 = zzaLP;
            zzj1 = new zzj(i, j);
            zzaLL = zzj1;
        }
        if(zzr1 != null)
            zzr1.zzb(zzj1);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private zzj zzaLL;
    private zzr zzaLP;
    private final Object zzoe = new Object();
}
