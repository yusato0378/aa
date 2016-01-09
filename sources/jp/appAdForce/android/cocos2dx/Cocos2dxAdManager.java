// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.cocos2dx;

import android.app.Activity;
import android.content.Context;
import jp.appAdForce.android.AdManager;
import jp.co.dimage.android.e;

public class Cocos2dxAdManager
    implements e
{

    public Cocos2dxAdManager()
    {
    }

    public static AdManager a(Context context)
    {
        context = new AdManager(context);
        if(serverUrl != null && !"".equals(serverUrl))
            context.setServerUrl(serverUrl);
        return context;
    }

    public static void sendConversion(Context context)
    {
        ((Activity)context).runOnUiThread(new Runnable(context) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversion();
            }

            final Context a;

            
            {
                a = context;
                super();
            }
        }
);
    }

    public static void sendConversion(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversion(b);
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

    public static void sendConversion(Context context, String s, String s1)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversion(b, c);
            }

            final Context a;
            final String b;
            final String c;

            
            {
                a = context;
                b = s;
                c = s1;
                super();
            }
        }
);
    }

    public static void sendConversionForMobage(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionForMobage(b);
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

    public static void sendConversionForMobage(Context context, String s, String s1)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionForMobage(b, c);
            }

            final Context a;
            final String b;
            final String c;

            
            {
                a = context;
                b = s;
                c = s1;
                super();
            }
        }
);
    }

    public static void sendConversionForMobageWithCAReward(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionForMobageWithCAReward(b);
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

    public static void sendConversionForMobageWithCAReward(Context context, String s, String s1)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionForMobageWithCAReward(b, c);
            }

            final Context a;
            final String b;
            final String c;

            
            {
                a = context;
                b = s;
                c = s1;
                super();
            }
        }
);
    }

    public static void sendConversionWithBuid(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionWithBuid(b);
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

    public static void sendConversionWithCAReward(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionWithCAReward(b);
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

    public static void sendConversionWithCAReward(Context context, String s, String s1)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s, s1) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendConversionWithCAReward(b, c);
            }

            final Context a;
            final String b;
            final String c;

            
            {
                a = context;
                b = s;
                c = s1;
                super();
            }
        }
);
    }

    public static void sendConversionWithUrlScheme(Context context)
    {
        if(context == null)
        {
            return;
        } else
        {
            Activity activity = (Activity)context;
            activity.runOnUiThread(new Runnable(context, activity) {

                public void run()
                {
                    Cocos2dxAdManager.a(a).setUrlScheme(b.getIntent());
                }

                final Context a;
                final Activity b;

            
            {
                a = context;
                b = activity;
                super();
            }
            }
);
            return;
        }
    }

    public static void sendConversionWithUrlScheme(Context context, String s)
    {
        if(context == null)
        {
            return;
        } else
        {
            s = (Activity)context;
            s.runOnUiThread(new Runnable(context, s) {

                public void run()
                {
                    Cocos2dxAdManager.a(a).setUrlScheme(b.getIntent());
                }

                final Context a;
                final Activity b;

            
            {
                a = context;
                b = activity;
                super();
            }
            }
);
            return;
        }
    }

    public static void sendUserIdForMobage(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                Cocos2dxAdManager.a(a).sendUserIdForMobage(b);
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

    public static void setOptout(Context context, boolean flag)
    {
        a(context).setOptout(flag);
    }

    public static void setServerUrl(String s)
    {
        serverUrl = s;
    }

    public static void updateFrom2_10_4g()
    {
        AdManager.updateFrom2_10_4g();
    }

    public static String serverUrl;
}
