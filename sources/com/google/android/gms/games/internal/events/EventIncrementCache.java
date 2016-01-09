// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.events;

import android.os.Handler;
import android.os.Looper;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class EventIncrementCache
{

    public EventIncrementCache(Looper looper, int i)
    {
        zzalI = new Handler(looper);
        zzalK = new HashMap();
        zzalL = i;
    }

    static void zza(EventIncrementCache eventincrementcache)
    {
        eventincrementcache.zzrq();
    }

    private void zzrq()
    {
        synchronized(zzalH)
        {
            zzalJ = false;
            flush();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void flush()
    {
        Object obj = zzalH;
        obj;
        JVM INSTR monitorenter ;
        java.util.Map.Entry entry;
        for(Iterator iterator = zzalK.entrySet().iterator(); iterator.hasNext(); zzr((String)entry.getKey(), ((AtomicInteger)entry.getValue()).get()))
            entry = (java.util.Map.Entry)iterator.next();

        break MISSING_BLOCK_LABEL_72;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzalK.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    protected abstract void zzr(String s, int i);

    public void zzv(String s, int i)
    {
        Object obj = zzalH;
        obj;
        JVM INSTR monitorenter ;
        AtomicInteger atomicinteger1;
        if(!zzalJ)
        {
            zzalJ = true;
            zzalI.postDelayed(new Runnable() {

                public void run()
                {
                    EventIncrementCache.zza(zzalM);
                }

                final EventIncrementCache zzalM;

            
            {
                zzalM = EventIncrementCache.this;
                super();
            }
            }
, zzalL);
        }
        atomicinteger1 = (AtomicInteger)zzalK.get(s);
        AtomicInteger atomicinteger;
        atomicinteger = atomicinteger1;
        if(atomicinteger1 != null)
            break MISSING_BLOCK_LABEL_81;
        atomicinteger = new AtomicInteger();
        zzalK.put(s, atomicinteger);
        atomicinteger.addAndGet(i);
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    final Object zzalH = new Object();
    private Handler zzalI;
    private boolean zzalJ;
    private HashMap zzalK;
    private int zzalL;
}
