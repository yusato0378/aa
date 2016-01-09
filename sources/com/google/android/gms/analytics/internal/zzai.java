// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;

class zzai
{

    public zzai(zzht zzht1)
    {
        zzv.zzr(zzht1);
        zznR = zzht1;
    }

    public zzai(zzht zzht1, long l)
    {
        zzv.zzr(zzht1);
        zznR = zzht1;
        zzIG = l;
    }

    public void clear()
    {
        zzIG = 0L;
    }

    public void start()
    {
        zzIG = zznR.elapsedRealtime();
    }

    public boolean zzt(long l)
    {
        while(zzIG == 0L || zznR.elapsedRealtime() - zzIG > l) 
            return true;
        return false;
    }

    private long zzIG;
    private final zzht zznR;
}
