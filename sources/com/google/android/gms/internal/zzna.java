// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbg;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzmz, zzmo, zzmy

public class zzna
{

    public zzna()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzna(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        zzaCO = s;
    }

    zzna(ScheduledExecutorService scheduledexecutorservice)
    {
        zzaEL = null;
        zzaCO = null;
        zzaEJ = scheduledexecutorservice;
        mClosed = false;
    }

    public void zza(Context context, zzmo zzmo, long l, zzmy zzmy)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.zzam("ResourceLoaderScheduler: Loading new resource.");
        if(zzaEL == null)
            break MISSING_BLOCK_LABEL_17;
        this;
        JVM INSTR monitorexit ;
        return;
        if(zzaCO == null)
            break MISSING_BLOCK_LABEL_66;
        context = new zzmz(context, zzmo, zzmy, zzaCO);
_L1:
        zzaEL = zzaEJ.schedule(context, l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new zzmz(context, zzmo, zzmy);
          goto _L1
    }

    private boolean mClosed;
    private String zzaCO;
    private final ScheduledExecutorService zzaEJ;
    private ScheduledFuture zzaEL;
}
