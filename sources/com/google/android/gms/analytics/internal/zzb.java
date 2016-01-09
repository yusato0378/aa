// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzkk;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzf, zzq, zzk, 
//            zze, zzg, zzaa, zzv

public class zzb extends zzd
{

    public zzb(zze zze, zzf zzf1)
    {
        super(zze);
        zzv.zzr(zzf1);
        zzFu = zzf1.zzj(zze);
    }

    static zzk zza(zzb zzb1)
    {
        return zzb1.zzFu;
    }

    private String zzgC()
    {
        if(!zzgI().zzhP())
            return "";
        String s;
        String s1;
        try
        {
            s1 = String.valueOf(getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode);
        }
        catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            zze("Failed to get service version", namenotfoundexception);
            return "0";
        }
        s = s1;
        if(s1.length() > 4)
            s = s1.substring(0, 4);
        s = (new StringBuilder()).append("4.5.0-").append(s).toString();
        return s;
    }

    void onServiceConnected()
    {
        zzgF();
        zzFu.onServiceConnected();
    }

    public void setLocalDispatchPeriod(int i)
    {
        zzgR();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzgJ().zze(new Runnable(i) {

            public void run()
            {
                zzb.zza(zzFx).zzq((long)zzFw * 1000L);
            }

            final int zzFw;
            final zzb zzFx;

            
            {
                zzFx = zzb.this;
                zzFw = i;
                super();
            }
        }
);
    }

    public void start()
    {
        zzFu.start();
    }

    public void zzG(boolean flag)
    {
        zza("Network connectivity status changed", Boolean.valueOf(flag));
        zzgJ().zze(new Runnable(flag) {

            public void run()
            {
                zzb.zza(zzFx).zzG(zzFy);
            }

            final zzb zzFx;
            final boolean zzFy;

            
            {
                zzFx = zzb.this;
                zzFy = flag;
                super();
            }
        }
);
    }

    public long zza(zzg zzg)
    {
        zzgR();
        zzv.zzr(zzg);
        zzgF();
        long l = zzFu.zza(zzg, true);
        if(l == 0L)
            zzFu.zzc(zzg);
        return l;
    }

    public void zza(zzaa zzaa)
    {
        zzv.zzr(zzaa);
        zzgR();
        zzb("Hit delivery requested", zzaa);
        zzgJ().zze(new Runnable(zzaa) {

            public void run()
            {
                zzb.zza(zzFx).zza(zzFB);
            }

            final zzaa zzFB;
            final zzb zzFx;

            
            {
                zzFx = zzb.this;
                zzFB = zzaa;
                super();
            }
        }
);
    }

    public void zza(com.google.android.gms.analytics.internal.zzv zzv1)
    {
        zzgR();
        zzgJ().zze(new Runnable(zzv1) {

            public void run()
            {
                zzb.zza(zzFx).zzb(zzFC);
            }

            final com.google.android.gms.analytics.internal.zzv zzFC;
            final zzb zzFx;

            
            {
                zzFx = zzb.this;
                zzFC = zzv1;
                super();
            }
        }
);
    }

    public void zza(String s, Runnable runnable)
    {
        zzv.zzh(s, "campaign param can't be empty");
        zzgJ().zze(new Runnable(s, runnable) {

            public void run()
            {
                zzb.zza(zzFx).zzaN(zzFz);
                if(zzFA != null)
                    zzFA.run();
            }

            final Runnable zzFA;
            final zzb zzFx;
            final String zzFz;

            
            {
                zzFx = zzb.this;
                zzFz = s;
                zzFA = runnable;
                super();
            }
        }
);
    }

    public void zzgA()
    {
        zzaF("Radio powered up");
        zzgw();
    }

    void zzgB()
    {
        zzgF();
        zzFu.zzgB();
    }

    protected void zzgb()
    {
        zzFu.zzfV();
    }

    public void zzgv()
    {
        zzgR();
        zzgE();
        zzgJ().zze(new Runnable() {

            public void run()
            {
                zzb.zza(zzFx).zzgv();
            }

            final zzb zzFx;

            
            {
                zzFx = zzb.this;
                super();
            }
        }
);
    }

    public void zzgw()
    {
        zzgR();
        Context context = getContext();
        if(AnalyticsReceiver.zzH(context) && AnalyticsService.zzI(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            zza(((com.google.android.gms.analytics.internal.zzv) (null)));
            return;
        }
    }

    public boolean zzgx()
    {
        zzgR();
        Future future = zzgJ().zzb(new Callable() {

            public Object call()
                throws Exception
            {
                return zzeY();
            }

            public Void zzeY()
                throws Exception
            {
                zzb.zza(zzFx).zzhy();
                return null;
            }

            final zzb zzFx;

            
            {
                zzFx = zzb.this;
                super();
            }
        }
);
        try
        {
            future.get();
        }
        catch(InterruptedException interruptedexception)
        {
            zzd("syncDispatchLocalHits interrupted", interruptedexception);
            return false;
        }
        catch(ExecutionException executionexception)
        {
            zze("syncDispatchLocalHits failed", executionexception);
            return false;
        }
        return true;
    }

    public String zzgy()
    {
        return zzFv;
    }

    public void zzgz()
    {
        zzgR();
        zzkk.zzgF();
        zzFu.zzgz();
    }

    private final zzk zzFu;
    private final String zzFv = zzgC();
}
