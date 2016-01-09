// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcv

class zzax
{

    zzax()
    {
    }

    static String zzB(String s, String s1)
    {
        if(s1 == null)
        {
            if(s.length() > 0)
                return s;
            else
                return null;
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://hostname/?").append(s).toString()).getQueryParameter(s1);
        }
    }

    static void zzdP(String s)
    {
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorenter ;
        zzaDG = s;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        throw s;
    }

    static String zzf(Context context, String s, String s1)
    {
        String s2 = (String)zzaDH.get(s);
        Object obj = s2;
        if(s2 == null)
        {
            context = context.getSharedPreferences("gtm_click_referrers", 0);
            if(context != null)
                context = context.getString(s, "");
            else
                context = "";
            zzaDH.put(s, context);
            obj = context;
        }
        return zzB(((String) (obj)), s1);
    }

    static String zzi(Context context, String s)
    {
        if(zzaDG != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorenter ;
        if(zzaDG != null)
            break MISSING_BLOCK_LABEL_40;
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if(context == null)
            break MISSING_BLOCK_LABEL_51;
        zzaDG = context.getString("referrer", "");
_L3:
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
_L2:
        return zzB(zzaDG, s);
        zzaDG = "";
          goto _L3
        context;
        com/google/android/gms/tagmanager/zzax;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzj(Context context, String s)
    {
        String s1 = zzB(s, "conv");
        if(s1 != null && s1.length() > 0)
        {
            zzaDH.put(s1, s);
            zzcv.zza(context, "gtm_click_referrers", s1, s);
        }
    }

    private static String zzaDG;
    static Map zzaDH = new HashMap();

}
