// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzht

public final class zzhv
    implements zzht
{

    public zzhv()
    {
    }

    public static zzht zznd()
    {
        com/google/android/gms/internal/zzhv;
        JVM INSTR monitorenter ;
        zzhv zzhv1;
        if(zzVC == null)
            zzVC = new zzhv();
        zzhv1 = zzVC;
        com/google/android/gms/internal/zzhv;
        JVM INSTR monitorexit ;
        return zzhv1;
        Exception exception;
        exception;
        throw exception;
    }

    public long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime()
    {
        return SystemClock.elapsedRealtime();
    }

    private static zzhv zzVC;
}
