// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.mcraft.cocos2dx;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import org.cocos2dx.lib.Cocos2dxActivity;

public class PlatformAndroid
{

    public PlatformAndroid()
    {
    }

    public static String getAppId()
    {
        return Cocos2dxActivity.getContext().getPackageName();
    }

    public static String getAppVersion()
    {
        Object obj = Cocos2dxActivity.getContext();
        try
        {
            obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 128).versionName;
        }
        catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
            return "";
        }
        return ((String) (obj));
    }

    public static String getBuildVersion()
    {
        Context context = Cocos2dxActivity.getContext();
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
        }
        catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
            return "";
        }
        return String.valueOf(i);
    }

    public static String getDeviceModelName()
    {
        return Build.MODEL;
    }

    public static String getLanguage()
    {
        return Cocos2dxActivity.getContext().getResources().getConfiguration().locale.getLanguage();
    }

    public static String getSystemVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static void initialize()
    {
        if(!sClassLoaded)
        {
            if(!nativeInit())
                throw new RuntimeException("native init failed");
            sClassLoaded = true;
        }
    }

    public static void launchAppWithUrl(String s)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if(Cocos2dxActivity.getContext().getPackageManager().queryIntentActivities(s, 0).isEmpty())
        {
            return;
        } else
        {
            Cocos2dxActivity.getContext().startActivity(s);
            return;
        }
    }

    private static native boolean nativeInit();

    private static boolean sClassLoaded;

    static 
    {
        if(!nativeInit())
        {
            throw new RuntimeException("native init failed");
        } else
        {
            sClassLoaded = true;
        }
    }
}
