// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk

public abstract class zzfh
{

    public zzfh()
    {
    }

    static Thread zza(zzfh zzfh1, Thread thread)
    {
        zzfh1.zzCg = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if(zzCg != null)
            zzCg.interrupt();
    }

    public abstract void onStop();

    public abstract void zzcX();

    public final Future zzeW()
    {
        return zzfk.zza(zznB);
    }

    public final void zzeX()
    {
        zzfk.zza(1, zznB);
    }

    private volatile Thread zzCg;
    private final Runnable zznB = new Runnable() {

        public final void run()
        {
            zzfh.zza(zzCh, Thread.currentThread());
            zzCh.zzcX();
        }

        final zzfh zzCh;

            
            {
                zzCh = zzfh.this;
                super();
            }
    }
;
}
