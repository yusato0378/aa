// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzc, zze

public abstract class zzd extends zzc
{

    protected zzd(zze zze)
    {
        super(zze);
    }

    public boolean isInitialized()
    {
        return zzFE && !zzFF;
    }

    public void zzfV()
    {
        zzgb();
        zzFE = true;
    }

    protected void zzgR()
    {
        if(!isInitialized())
            throw new IllegalStateException("Not initialized");
        else
            return;
    }

    protected abstract void zzgb();

    private boolean zzFE;
    private boolean zzFF;
}
