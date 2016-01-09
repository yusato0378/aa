// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;


public final class zzn extends Enum
{

    private zzn(String s, int i)
    {
        super(s, i);
    }

    public static zzn valueOf(String s)
    {
        return (zzn)Enum.valueOf(com/google/android/gms/analytics/internal/zzn, s);
    }

    public static zzn[] values()
    {
        return (zzn[])zzGQ.clone();
    }

    public static zzn zzaP(String s)
    {
        if("GZIP".equalsIgnoreCase(s))
            return zzGP;
        else
            return zzGO;
    }

    public static final zzn zzGO;
    public static final zzn zzGP;
    private static final zzn zzGQ[];

    static 
    {
        zzGO = new zzn("NONE", 0);
        zzGP = new zzn("GZIP", 1);
        zzGQ = (new zzn[] {
            zzGO, zzGP
        });
    }
}
