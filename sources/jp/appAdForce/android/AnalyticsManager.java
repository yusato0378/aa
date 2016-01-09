// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.content.Context;
import jp.co.dimage.android.e;

// Referenced classes of package jp.appAdForce.android:
//            AdManager

public final class AnalyticsManager
    implements e
{

    private AnalyticsManager()
    {
    }

    private static void a(Context context)
    {
        if(a == null)
            a = jp.co.cyberz.fox.analytics.base.e.a(new AdManager(context));
    }

    public static void a(String s, Context context)
    {
        if(!jp.co.cyberz.fox.analytics.base.e.b(context).booleanValue())
        {
            jp.co.cyberz.fox.analytics.base.e.g();
            return;
        } else
        {
            a(context);
            a.a(s, context);
            return;
        }
    }

    public static void sendEndSession(Context context)
    {
        if(!jp.co.cyberz.fox.analytics.base.e.b(context).booleanValue())
        {
            return;
        } else
        {
            a(context);
            a.a(context);
            return;
        }
    }

    public static void sendEvent(Context context, String s, int i)
    {
        a(context);
        a.a(context, s, i);
    }

    public static void sendEvent(Context context, String s, String s1, int i)
    {
        a(context);
        a.a(context, s, s1, i);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, int i)
    {
        a(context);
        a.a(context, s, s1, s2, i);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, double d, int i)
    {
        a(context);
        a.a(context, s, s1, s2, s3, d, i);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, double d, int i, 
            String s4)
    {
        a(context);
        a.a(context, s, s1, s2, s3, d, i, s4);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, double d, 
            int i)
    {
        a(context);
        a.a(context, s, s1, s2, s3, s4, d, i);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, double d, 
            int i, String s5)
    {
        a(context);
        a.a(context, s, s1, s2, s3, s4, d, i, s5);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, String s5, double d, int i)
    {
        a(context);
        a.a(context, s, s1, s2, s3, s4, s5, d, i);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, String s5, double d, int i, String s6)
    {
        a(context);
        a.a(context, s, s1, s2, s3, s4, s5, d, i, s6);
    }

    public static void sendStartSession(Context context)
    {
        a((new Throwable()).getStackTrace()[1].getClassName(), context);
    }

    public static void sendUserInfo(Context context, String s)
    {
        a(context);
        a.a(context, s);
    }

    public static void sendUserInfo(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        a(context);
        a.a(context, s, s1, s2, s3, s4, s5);
    }

    private static jp.co.cyberz.fox.analytics.base.e a = null;

}
