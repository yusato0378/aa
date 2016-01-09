// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.*;

public class zzg
{

    public zzg(long l, String s, String s1, boolean flag, long l1, 
            Map map)
    {
        zzv.zzbS(s);
        zzv.zzbS(s1);
        zzFW = l;
        zzFg = s;
        zzFX = s1;
        zzFY = flag;
        zzFZ = l1;
        if(map != null)
        {
            zzvi = new HashMap(map);
            return;
        } else
        {
            zzvi = Collections.emptyMap();
            return;
        }
    }

    public String getClientId()
    {
        return zzFg;
    }

    public long zzha()
    {
        return zzFW;
    }

    public String zzhb()
    {
        return zzFX;
    }

    public boolean zzhc()
    {
        return zzFY;
    }

    public long zzhd()
    {
        return zzFZ;
    }

    public Map zzhe()
    {
        return zzvi;
    }

    public void zzl(long l)
    {
        zzFZ = l;
    }

    private final long zzFW;
    private final String zzFX;
    private final boolean zzFY;
    private long zzFZ;
    private final String zzFg;
    private final Map zzvi;
}
