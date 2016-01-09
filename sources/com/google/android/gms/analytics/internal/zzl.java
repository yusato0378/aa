// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;


public final class zzl extends Enum
{

    private zzl(String s, int i)
    {
        super(s, i);
    }

    public static zzl valueOf(String s)
    {
        return (zzl)Enum.valueOf(com/google/android/gms/analytics/internal/zzl, s);
    }

    public static zzl[] values()
    {
        return (zzl[])zzGJ.clone();
    }

    public static zzl zzaO(String s)
    {
        if("BATCH_BY_SESSION".equalsIgnoreCase(s))
            return zzGE;
        if("BATCH_BY_TIME".equalsIgnoreCase(s))
            return zzGF;
        if("BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s))
            return zzGG;
        if("BATCH_BY_COUNT".equalsIgnoreCase(s))
            return zzGH;
        if("BATCH_BY_SIZE".equalsIgnoreCase(s))
            return zzGI;
        else
            return zzGD;
    }

    public static final zzl zzGD;
    public static final zzl zzGE;
    public static final zzl zzGF;
    public static final zzl zzGG;
    public static final zzl zzGH;
    public static final zzl zzGI;
    private static final zzl zzGJ[];

    static 
    {
        zzGD = new zzl("NONE", 0);
        zzGE = new zzl("BATCH_BY_SESSION", 1);
        zzGF = new zzl("BATCH_BY_TIME", 2);
        zzGG = new zzl("BATCH_BY_BRUTE_FORCE", 3);
        zzGH = new zzl("BATCH_BY_COUNT", 4);
        zzGI = new zzl("BATCH_BY_SIZE", 5);
        zzGJ = (new zzl[] {
            zzGD, zzGE, zzGF, zzGG, zzGH, zzGI
        });
    }
}
