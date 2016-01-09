// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzgo extends zzki
{

    public zzgo()
    {
    }

    private String zzax(String s)
    {
        zzv.zzbS(s);
        String s1 = s;
        if(s != null)
        {
            s1 = s;
            if(s.startsWith("&"))
                s1 = s.substring(1);
        }
        zzv.zzh(s1, "Name can not be empty or \"&\"");
        return s1;
    }

    public void set(String s, String s1)
    {
        s = zzax(s);
        zzvi.put(s, s1);
    }

    public String toString()
    {
        return zzu(zzvi);
    }

    public void zza(zzgo zzgo1)
    {
        zzv.zzr(zzgo1);
        zzgo1.zzvi.putAll(zzvi);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzgo)zzki1);
    }

    public Map zzgj()
    {
        return Collections.unmodifiableMap(zzvi);
    }

    private final Map zzvi = new HashMap();
}
