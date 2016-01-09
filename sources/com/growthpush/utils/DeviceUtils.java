// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;
import java.util.TimeZone;

public class DeviceUtils
{

    public DeviceUtils()
    {
    }

    public static String getBuild(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return null;
        }
        return String.valueOf(i);
    }

    public static String getDevice()
    {
        return Build.MODEL;
    }

    public static String getLanguage()
    {
        return Locale.getDefault().getLanguage();
    }

    public static String getOs()
    {
        return (new StringBuilder("Android ")).append(android.os.Build.VERSION.RELEASE).toString();
    }

    public static String getTimeZone()
    {
        return TimeZone.getDefault().getID();
    }

    public static String getVersion(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionName;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return null;
        }
        return context;
    }
}
