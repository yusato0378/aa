// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.internal.zzkk;
import com.google.android.gms.internal.zzkp;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzam, zze

public class zzj extends zzd
{

    zzj(zze zze)
    {
        super(zze);
    }

    public void zzfW()
    {
        Object obj = zzga();
        String s = ((zzam) (obj)).zziE();
        if(s != null)
            zzGq.setAppName(s);
        obj = ((zzam) (obj)).zziG();
        if(obj != null)
            zzGq.setAppVersion(((String) (obj)));
    }

    protected void zzgb()
    {
        zzgJ().zzum().zza(zzGq);
        zzfW();
    }

    public zzkp zzhq()
    {
        zzgR();
        return zzGq;
    }

    private final zzkp zzGq = new zzkp();
}
