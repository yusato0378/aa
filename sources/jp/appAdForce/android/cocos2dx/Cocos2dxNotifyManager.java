// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.cocos2dx;

import android.app.Activity;
import android.content.Context;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.NotifyManager;

// Referenced classes of package jp.appAdForce.android.cocos2dx:
//            Cocos2dxAdManager

public class Cocos2dxNotifyManager
{

    public Cocos2dxNotifyManager()
    {
    }

    static AdManager a(Context context)
    {
        return b(context);
    }

    private static AdManager b(Context context)
    {
        context = new AdManager(context);
        if(a != null && !"".equals(a))
            context.setServerUrl(a);
        return context;
    }

    public static void notifyManager(Context context)
    {
        ((Activity)context).runOnUiThread(new Runnable(context) {

            public void run()
            {
                AdManager admanager = Cocos2dxNotifyManager.a(a);
                new NotifyManager(a, admanager);
            }

            final Context a;

            
            {
                a = context;
                super();
            }
        }
);
    }

    public static void registerToGCM(Context context, String s)
    {
        ((Activity)context).runOnUiThread(new Runnable(context, s) {

            public void run()
            {
                AdManager admanager = Cocos2dxAdManager.a(a);
                (new NotifyManager(a, admanager)).registerToGCM(a, b);
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

    public static String a;
}
