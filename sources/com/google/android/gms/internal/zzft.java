// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzfv, zzfw

public class zzft
    implements zzfv
{

    public zzft(Object obj)
    {
        zzCM = obj;
        zzCO.zzfm();
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return zzCM;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return zzCM;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }

    public void zzb(Runnable runnable)
    {
        zzCO.zzb(runnable);
    }

    private final Object zzCM;
    private final zzfw zzCO = new zzfw();
}
