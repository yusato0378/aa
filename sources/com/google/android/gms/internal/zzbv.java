// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbw, zzgd

public class zzbv
    implements zzbs
{

    public zzbv(zzbw zzbw1)
    {
        zztF = zzbw1;
    }

    public void zza(zzgd zzgd, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        zztF.zzd(flag);
    }

    private final zzbw zztF;
}
