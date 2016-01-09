// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;

public class zzmj
{

    public zzmj(String s, Integer integer, String s1, boolean flag)
    {
        this(s, integer, s1, flag, "");
    }

    public zzmj(String s, Integer integer, String s1, boolean flag, String s2)
    {
        zzv.zzr(s);
        zzv.zzr(s2);
        zzaCk = s;
        zzaGN = integer;
        zzaGO = s1;
        zzaGP = flag;
        zzaEI = s2;
    }

    public String getContainerId()
    {
        return zzaCk;
    }

    public Integer zzyf()
    {
        return zzaGN;
    }

    public String zzyg()
    {
        return zzaGO;
    }

    public String zzyh()
    {
        if(zzaGO != null)
            return (new StringBuilder()).append(zzaGO).append("_").append(zzaCk).toString();
        else
            return zzaCk;
    }

    public boolean zzyi()
    {
        return zzaGP;
    }

    public String zzyj()
    {
        return zzaEI;
    }

    private final String zzaCk;
    private final String zzaEI;
    private final Integer zzaGN;
    private final String zzaGO;
    private final boolean zzaGP;
}
