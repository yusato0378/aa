// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.unity;

import android.app.Activity;
import jp.appAdForce.android.AnalyticsManager;
import jp.co.dimage.android.e;

public final class AnalyticsManagerUnity
    implements e
{

    private AnalyticsManagerUnity()
    {
    }

    public static void sendEndSession(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            public void run()
            {
                AnalyticsManager.sendEndSession(a);
            }

            final Activity a;

            
            {
                a = activity;
                super();
            }
        }
);
    }

    public static void sendEvent(Activity activity, String s, int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c);
            }

            final Activity a;
            final String b;
            final int c;

            
            {
                a = activity;
                b = s;
                c = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Activity activity, String s, String s1, int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d);
            }

            final Activity a;
            final String b;
            final String c;
            final int d;

            
            {
                a = activity;
                b = s;
                c = s1;
                d = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Activity activity, String s, String s1, String s2, int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final int e;

            
            {
                a = activity;
                b = s;
                c = s1;
                d = s2;
                e = i;
                super();
            }
        }
);
    }

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, double d, int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final double f;
            final int g;

            
            {
                a = activity;
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

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, double d, int i, 
            String s4)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, d, i, s4) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final double f;
            final int g;
            final String h;

            
            {
                a = activity;
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

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, String s4, double d, 
            int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, s4, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final double g;
            final int h;

            
            {
                a = activity;
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

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, String s4, double d, 
            int i, String s5)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, s4, d, i, s5) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final double g;
            final int h;
            final String i;

            
            {
                a = activity;
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

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, String s4, String s5, double d, int i)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, s4, s5, d, i) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final String g;
            final double h;
            final int i;

            
            {
                a = activity;
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

    public static void sendEvent(Activity activity, String s, String s1, String s2, String s3, String s4, String s5, double d, int i, String s6)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, s4, s5, d, i, s6) {

            public void run()
            {
                AnalyticsManager.sendEvent(a, b, c, d, e, f, g, h, i, j);
            }

            final Activity a;
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
                a = activity;
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

    public static void sendStartSession(Activity activity)
    {
        activity.runOnUiThread(new Runnable((new Throwable()).getStackTrace()[1].getClassName(), activity) {

            public void run()
            {
                AnalyticsManager.a(a, b);
            }

            final String a;
            final Activity b;

            
            {
                a = s;
                b = activity;
                super();
            }
        }
);
    }

    public static void sendUserInfo(Activity activity, String s)
    {
        activity.runOnUiThread(new Runnable(activity, s) {

            public void run()
            {
                AnalyticsManager.sendUserInfo(a, b);
            }

            final Activity a;
            final String b;

            
            {
                a = activity;
                b = s;
                super();
            }
        }
);
    }

    public static void sendUserInfo(Activity activity, String s, String s1, String s2, String s3, String s4, String s5)
    {
        activity.runOnUiThread(new Runnable(activity, s, s1, s2, s3, s4, s5) {

            public void run()
            {
                AnalyticsManager.sendUserInfo(a, b, c, d, e, f, g);
            }

            final Activity a;
            final String b;
            final String c;
            final String d;
            final String e;
            final String f;
            final String g;

            
            {
                a = activity;
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
