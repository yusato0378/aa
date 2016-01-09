// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics;

import android.content.*;
import android.os.PowerManager;
import com.google.android.gms.analytics.internal.zzae;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzq;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.analytics:
//            AnalyticsService

public final class AnalyticsReceiver extends BroadcastReceiver
{

    public AnalyticsReceiver()
    {
    }

    public static boolean zzH(Context context)
    {
        zzv.zzr(context);
        if(zzEe != null)
        {
            return zzEe.booleanValue();
        } else
        {
            boolean flag = zzal.zza(context, com/google/android/gms/analytics/AnalyticsReceiver, false);
            zzEe = Boolean.valueOf(flag);
            return flag;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        zzae zzae1;
        Object obj = zze.zzJ(context);
        zzae1 = ((zze) (obj)).zzgH();
        intent = intent.getAction();
        boolean flag;
        if(((zze) (obj)).zzgI().zzhP())
            zzae1.zza("Device AnalyticsReceiver got", intent);
        else
            zzae1.zza("Local AnalyticsReceiver got", intent);
        if(!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = AnalyticsService.zzI(context);
        obj = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
        ((Intent) (obj)).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent = ((Intent) (zznu));
        intent;
        JVM INSTR monitorenter ;
        context.startService(((Intent) (obj)));
        if(flag)
            break MISSING_BLOCK_LABEL_101;
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        context = (PowerManager)context.getSystemService("power");
        if(zzEd == null)
        {
            zzEd = context.newWakeLock(1, "Analytics WakeLock");
            zzEd.setReferenceCounted(false);
        }
        zzEd.acquire(1000L);
_L3:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context;
        zzae1.zzaI("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
          goto _L3
    }

    static android.os.PowerManager.WakeLock zzEd;
    static Boolean zzEe;
    static Object zznu = new Object();

}
