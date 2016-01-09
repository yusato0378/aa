// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.Looper;
import android.webkit.WebView;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzgd

public abstract class zzbo
    implements zzbs
{

    public zzbo()
    {
    }

    public void zza(zzgd zzgd1, Map map)
    {
        if(!Looper.myLooper().equals(Looper.getMainLooper()))
        {
            zzgd1.getWebView().post(new Runnable(zzgd1, map) {

                public void run()
                {
                    zztg.zza(zzte, zztf);
                }

                final zzgd zzte;
                final Map zztf;
                final zzbo zztg;

            
            {
                zztg = zzbo.this;
                zzte = zzgd1;
                zztf = map;
                super();
            }
            }
);
            return;
        } else
        {
            zzb(zzgd1, map);
            return;
        }
    }

    abstract void zzb(zzgd zzgd1, Map map);
}
