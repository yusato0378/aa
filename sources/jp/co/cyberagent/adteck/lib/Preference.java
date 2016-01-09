// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference
{

    public Preference()
    {
    }

    public static String get(Context context, String s, String s1)
    {
        context = getSharedPreferences(context);
        if(context == null)
            return null;
        else
            return context.getString(s, s1);
    }

    public static boolean get(Context context, String s, boolean flag)
    {
        context = getSharedPreferences(context);
        if(context == null)
            return false;
        else
            return context.getBoolean(s, flag);
    }

    protected static SharedPreferences getSharedPreferences(Context context)
    {
        if(context == null)
            return null;
        else
            return context.getSharedPreferences("adteck", 0);
    }

    public static boolean remove(Context context, String s)
    {
        context = getSharedPreferences(context);
        if(context != null)
            if((context = context.edit()) != null)
            {
                context.remove(s);
                return context.commit();
            }
        return false;
    }

    public static boolean set(Context context, String s, String s1)
    {
        context = getSharedPreferences(context);
        if(context != null)
            if((context = context.edit()) != null)
            {
                context.putString(s, s1);
                return context.commit();
            }
        return false;
    }

    public static boolean set(Context context, String s, boolean flag)
    {
        context = getSharedPreferences(context);
        if(context != null)
            if((context = context.edit()) != null)
            {
                context.putBoolean(s, flag);
                return context.commit();
            }
        return false;
    }
}
