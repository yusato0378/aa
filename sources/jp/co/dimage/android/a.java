// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.util.Log;

public class a
{

    public a()
    {
    }

    public static void a(String s, String s1)
    {
        if(b)
            Log.i(s, s1);
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static void b(String s, String s1)
    {
        if(b)
            Log.e(s, s1);
    }

    public static void b(boolean flag)
    {
        b = flag;
    }

    public static void c(String s, String s1)
    {
        if(b)
            Log.w(s, s1);
    }

    public static void d(String s, String s1)
    {
        if(a)
            Log.d(s, s1);
    }

    public static void e(String s, String s1)
    {
        if(a)
            Log.v(s, s1);
    }

    private static boolean a = false;
    private static boolean b = false;

}
