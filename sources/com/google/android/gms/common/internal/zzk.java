// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.content.*;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl

public abstract class zzk
{

    public zzk()
    {
    }

    public static zzk zzU(Context context)
    {
        synchronized(zzTK)
        {
            if(zzTL == null)
                zzTL = new zzl(context.getApplicationContext());
        }
        return zzTL;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean zza(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract boolean zza(String s, ServiceConnection serviceconnection, String s1);

    public abstract void zzb(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract void zzb(String s, ServiceConnection serviceconnection, String s1);

    private static final Object zzTK = new Object();
    private static zzk zzTL;

}
