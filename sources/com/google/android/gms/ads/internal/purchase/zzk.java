// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzfl;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzl

public class zzk
{

    public zzk(String s)
    {
        zzqF = s;
    }

    public boolean zza(String s, int i, Intent intent)
    {
        if(s != null && intent != null)
        {
            String s1 = zzh.zzaZ().zze(intent);
            intent = zzh.zzaZ().zzf(intent);
            if(s1 != null && intent != null)
            {
                if(!s.equals(zzh.zzaZ().zzU(s1)))
                {
                    zzb.zzan("Developer payload not match.");
                    return false;
                }
                if(zzqF != null && !zzl.zzc(zzqF, s1, intent))
                {
                    zzb.zzan("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String zzeb()
    {
        return zzh.zzaQ().zzfb();
    }

    private final String zzqF;
}
