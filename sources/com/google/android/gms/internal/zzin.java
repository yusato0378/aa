// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.Log;

public class zzin
{

    public static boolean zzZ(Context context)
    {
        return zzac(context) == 3;
    }

    private static int zzaa(Context context)
    {
        return (zzab(context) % 1000) / 100 + 5;
    }

    private static int zzab(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            Log.w("Fitness", "Could not find package info for Google Play Services");
            return -1;
        }
        return i;
    }

    public static int zzac(Context context)
    {
        if(zzadP != -1) goto _L2; else goto _L1
_L1:
        zzaa(context);
        JVM INSTR tableswitch 8 13: default 48
    //                   8 72
    //                   9 48
    //                   10 65
    //                   11 48
    //                   12 48
    //                   13 72;
           goto _L3 _L4 _L3 _L5 _L3 _L3 _L4
_L3:
        int i;
        if(zzad(context))
            i = 1;
        else
            i = 2;
        zzadP = i;
_L2:
        return zzadP;
_L5:
        zzadP = 3;
        continue; /* Loop/switch isn't completed */
_L4:
        zzadP = 0;
        if(true) goto _L2; else goto _L6
_L6:
    }

    private static boolean zzad(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0;
    }

    private static int zzadP = -1;

}
