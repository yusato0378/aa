// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzgn extends zzki
{

    public zzgn()
    {
        zzFe = new HashMap(4);
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        java.util.Map.Entry entry;
        for(Iterator iterator = zzFe.entrySet().iterator(); iterator.hasNext(); hashmap.put((new StringBuilder()).append("metric").append(entry.getKey()).toString(), entry.getValue()))
            entry = (java.util.Map.Entry)iterator.next();

        return zzu(hashmap);
    }

    public void zza(zzgn zzgn1)
    {
        zzgn1.zzFe.putAll(zzFe);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzgn)zzki1);
    }

    public Map zzgi()
    {
        return Collections.unmodifiableMap(zzFe);
    }

    private Map zzFe;
}
