// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.cocos2dx;

import android.app.Activity;
import android.content.Context;
import jp.appAdForce.android.AnalyticsManager;
import jp.co.dimage.android.e;

public final class Cocos2dxAnalyticsManager
    implements e
{

    public Cocos2dxAnalyticsManager()
    {
    }

    public static void sendEndSession(Context context)
    {
        ((Activity)context).runOnUiThread(new Runnable(context) {

            public void run()
            {
                AnalyticsManager.sendEndSession(a);
            }

            final Context a;

            
            {
                a = context;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c);
            }

            final Context a;
            final String b;
            final int c;

            
            {
                a = context;
                b = s;
                c = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d);
            }

            final Context a;
            final String b;
            final String c;
            final int d;

            
            {
                a = context;
                b = s;
                c = s1;
                d = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final int e;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, double d, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final double f;
            final int g;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = d1;
                g = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, double d, int i, 
            String s4)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, d, i, s4) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final double f;
            final int g;
            final String h;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = d1;
                g = i;
                h = s4;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, double d, 
            int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, s4, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final double g;
            final int h;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = d1;
                h = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, double d, 
            int i, String s5)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, s4, d, i, s5) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final double g;
            final int h;
            final String i;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = d1;
                h = j;
                i = s5;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, String s5, double d, int i)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, s4, s5, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final String g;
            final double h;
            final int i;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = s5;
                h = d1;
                i = j;
                super();
            }
        }
);
    }

    public static void sendEvent(Context context, String s, String s1, String s2, String s3, String s4, String s5, double d, int i, String s6)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, s4, s5, d, i, s6) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i, j);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final String g;
            final double h;
            final int i;
            final String j;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = s5;
                h = d1;
                i = k;
                j = s6;
                super();
            }
        }
);
    }

    public static void sendStartSession(Context context)
    {
        String s = (new Throwable()).getStackTrace()[1].getClassName();
        ((Activity)context).runOnUiThread(new Runnable(s, context) {

            public void run()
            {
                AnalyticsManager.a(a, b);
            }

            final String a;
            final Context b;

            
            {
                a = s;
                b = context;
                super();
            }
        }
);
    }

    public static void sendUserInfo(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                AnalyticsManager.sendUserInfo(a, b);
            }

            final Context a;
            final String b;

            
            {
                a = context;
                b = s;
                super();
            }
        }
);
    }

    public static void sendUserInfo(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1, s2, s3, s4, s5) {

            public void run()
            {
                AnalyticsManager.sendUserInfo(a, b, c, d, e, f, g);
            }

            final Context a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final String g;

            
            {
                a = context;
                b = s;
                c = s1;
                d = s2;
                e = s3;
                f = s4;
                g = s5;
                super();
            }
        }
);
    }
}
