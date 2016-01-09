// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh, zzcd, zzcc, zzfl, 
//            zzgd

public class zzcb extends zzfh
{

    zzcb(zzgd zzgd, String s)
    {
        zznp = zzgd;
        zztM = new zzcd(zzgd);
        zztN = s;
        zzh.zzbb().zza(this);
    }

    public void onStop()
    {
        zztM.abort();
    }

    public void zzcX()
    {
        zztM.zzI(zztN);
        zzfl.zzCr.post(new Runnable() {

            public void run()
            {
                zzh.zzbb().zzb(zztO);
            }

            final zzcb zztO;

            
            {
                zztO = zzcb.this;
                super();
            }
        }
);
        return;
        Exception exception;
        exception;
        zzfl.zzCr.post(new _cls1());
        throw exception;
    }

    final zzgd zznp;
    final zzcd zztM;
    private final String zztN;
}
