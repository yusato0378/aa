// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;

public class SystemUtils
{

    public SystemUtils()
    {
    }

    public static ActivityManager getActivityManager(Context context)
    {
        context = (ActivityManager)context.getSystemService("activity");
        return context;
        context;
_L2:
        return null;
        context;
        if(true) goto _L2; else goto _L1
_L1:
    }

    public static PowerManager getPowerManager(Context context)
    {
        context = (PowerManager)context.getSystemService("power");
        return context;
        context;
_L2:
        return null;
        context;
        if(true) goto _L2; else goto _L1
_L1:
    }
}
