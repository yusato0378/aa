// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzgm extends zzki
{

    public zzgm()
    {
        zzFd = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for(Iterator iterator = zzFd.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("dimension").append(entry.getKey()).toString(), entry.getValue()))
            entry = (java.util.Map.Entry)iterator.next();

        return zzu(hashmap);
    }

    public void zza(zzgm zzgm1)
    {
        zzgm1.zzFd.putAll(zzFd);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzgm)zzki1);
    }

    public Map zzgh()
    {
        return Collections.unmodifiableMap(zzFd);
    }

    private Map zzFd;
}
