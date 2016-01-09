// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import java.util.Random;

public class zzk extends zzq.zza
{

    public zzk()
    {
        zzoe = new Object();
        zzbM();
    }

    public long getValue()
    {
        return zzqk;
    }

    public void zzbM()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        int i;
        long l;
        i = 3;
        l = 0L;
_L2:
        int j;
        j = i - 1;
        if(j <= 0)
            break MISSING_BLOCK_LABEL_71;
        long l1 = (long)zzqj.nextInt() + 0x80000000L;
        l = l1;
        i = j;
        if(l1 == zzqk) goto _L2; else goto _L1
_L1:
        l = l1;
        i = j;
        if(l1 == 0L) goto _L2; else goto _L3
_L3:
        l = l1;
        zzqk = l;
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private Object zzoe;
    private final Random zzqj = new Random();
    private long zzqk;
}
