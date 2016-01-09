// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzbq, zzgd

public final class zzbp
    implements zzbs
{

    public zzbp(zzbq zzbq1)
    {
        zzth = zzbq1;
    }

    public void zza(zzgd zzgd, Map map)
    {
        zzgd = (String)map.get("name");
        if(zzgd == null)
        {
            zzb.zzan("App event with no name parameter.");
            return;
        } else
        {
            zzth.onAppEvent(zzgd, (String)map.get("info"));
            return;
        }
    }

    private final zzbq zzth;
}
