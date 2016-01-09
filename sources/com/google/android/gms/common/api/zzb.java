// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzb
    implements zzi.zzb
{

    protected zzb(DataHolder dataholder)
    {
        zzPy = dataholder;
    }

    protected abstract void zza(Object obj, DataHolder dataholder);

    public final void zzk(Object obj)
    {
        zza(obj, zzPy);
    }

    public void zzkJ()
    {
        if(zzPy != null)
            zzPy.close();
    }

    private final DataHolder zzPy;
}
