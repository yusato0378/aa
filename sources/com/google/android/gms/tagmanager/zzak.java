// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import java.util.*;

abstract class zzak
{

    public transient zzak(String s, String as[])
    {
        zzaDv = s;
        zzaDu = new HashSet(as.length);
        int j = as.length;
        for(int i = 0; i < j; i++)
        {
            s = as[i];
            zzaDu.add(s);
        }

    }

    public abstract com.google.android.gms.internal.zzd.zza zzD(Map map);

    boolean zzg(Set set)
    {
        return set.containsAll(zzaDu);
    }

    public String zzwS()
    {
        return zzaDv;
    }

    public Set zzwT()
    {
        return zzaDu;
    }

    public abstract boolean zzwn();

    private final Set zzaDu;
    private final String zzaDv;
}
