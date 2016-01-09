// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzfl;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zza

public class zzg
{
    public static class zza
    {

        public boolean postDelayed(Runnable runnable, long l)
        {
            return mHandler.postDelayed(runnable, l);
        }

        public void removeCallbacks(Runnable runnable)
        {
            mHandler.removeCallbacks(runnable);
        }

        private final Handler mHandler;

        public zza(Handler handler)
        {
            mHandler = handler;
        }
    }


    public zzg(com.google.android.gms.ads.internal.zza zza1)
    {
        this(zza1, new zza(zzfl.zzCr));
    }

    zzg(com.google.android.gms.ads.internal.zza zza1, zza zza2)
    {
        zznD = false;
        zznE = false;
        zznF = 0L;
        zznA = zza2;
        zznB = new Runnable(new WeakReference(zza1)) {

            public void run()
            {
                zzg.zza(zznH, false);
                com.google.android.gms.ads.internal.zza zza3 = (com.google.android.gms.ads.internal.zza)zznG.get();
                if(zza3 != null)
                    zza3.zzb(zzg.zza(zznH));
            }

            final WeakReference zznG;
            final zzg zznH;

            
            {
                zznH = zzg.this;
                zznG = weakreference;
                super();
            }
        }
;
    }

    static AdRequestParcel zza(zzg zzg1)
    {
        return zzg1.zznC;
    }

    static boolean zza(zzg zzg1, boolean flag)
    {
        zzg1.zznD = flag;
        return flag;
    }

    public void cancel()
    {
        zznD = false;
        zznA.removeCallbacks(zznB);
    }

    public void pause()
    {
        zznE = true;
        if(zznD)
            zznA.removeCallbacks(zznB);
    }

    public void resume()
    {
        zznE = false;
        if(zznD)
        {
            zznD = false;
            zza(zznC, zznF);
        }
    }

    public void zza(AdRequestParcel adrequestparcel, long l)
    {
        if(zznD)
        {
            zzb.zzan("An ad refresh is already scheduled.");
        } else
        {
            zznC = adrequestparcel;
            zznD = true;
            zznF = l;
            if(!zznE)
            {
                zzb.zzal((new StringBuilder()).append("Scheduling ad refresh ").append(l).append(" milliseconds from now.").toString());
                zznA.postDelayed(zznB, l);
                return;
            }
        }
    }

    public boolean zzaK()
    {
        return zznD;
    }

    public void zzc(AdRequestParcel adrequestparcel)
    {
        zza(adrequestparcel, 60000L);
    }

    private final zza zznA;
    private final Runnable zznB;
    private AdRequestParcel zznC;
    private boolean zznD;
    private boolean zznE;
    private long zznF;
}
