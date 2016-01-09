// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.cocos2dx;

import android.content.Context;
import com.growthpush.GrowthPush;
import com.growthpush.model.Environment;

public class GrowthPushJNI
{

    public GrowthPushJNI()
    {
    }

    public static Environment convertIntToEnvironment(int i)
    {
        switch(i)
        {
        default:
            return null;

        case 1: // '\001'
            return Environment.development;

        case 2: // '\002'
            return Environment.production;
        }
    }

    public static void initialize(int i, String s, int j, boolean flag)
    {
        GrowthPush.getInstance().initialize(context, i, s, convertIntToEnvironment(j), flag);
    }

    public static void register(String s)
    {
        GrowthPush.getInstance().register(s);
    }

    public static void setContext(Context context1)
    {
        context = context1;
    }

    public static void setDeviceTags()
    {
        GrowthPush.getInstance().setDeviceTags();
    }

    public static void setTag(String s)
    {
        setTag(s, null);
    }

    public static void setTag(String s, String s1)
    {
        GrowthPush.getInstance().setTag(s, s1);
    }

    public static void trackEvent(String s)
    {
        trackEvent(s, null);
    }

    public static void trackEvent(String s, String s1)
    {
        GrowthPush.getInstance().trackEvent(s, s1);
    }

    private static Context context = null;

}
