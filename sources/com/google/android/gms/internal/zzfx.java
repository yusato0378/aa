// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;


public interface zzfx
{
    public static interface zza
    {

        public abstract void run();
    }

    public static class zzb
        implements zza
    {

        public void run()
        {
        }

        public zzb()
        {
        }
    }

    public static class zzc
        implements zzd
    {

        public void zza(Object obj)
        {
        }

        public zzc()
        {
        }
    }

    public static interface zzd
    {

        public abstract void zza(Object obj);
    }


    public abstract int getStatus();

    public abstract void reject();

    public abstract void zza(zzd zzd1, zza zza1);

    public abstract void zzd(Object obj);
}
