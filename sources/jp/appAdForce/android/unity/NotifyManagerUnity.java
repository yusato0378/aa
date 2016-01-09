// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.unity;

import android.app.Activity;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.NotifyManager;

public class NotifyManagerUnity extends NotifyManager
{

    public NotifyManagerUnity(Activity activity, AdManager admanager)
    {
        super(activity, admanager);
        a = activity;
        b = this;
    }

    static NotifyManager a(NotifyManagerUnity notifymanagerunity)
    {
        return notifymanagerunity.b;
    }

    public void registerToGCMUnity(Activity activity, String s)
    {
        a.runOnUiThread(new Runnable(activity, s) {

            public void run()
            {
                NotifyManagerUnity.a(c).registerToGCM(a, b);
            }

            final Activity a;
            final String b;
            final NotifyManagerUnity c;

            
            {
                c = NotifyManagerUnity.this;
                a = activity;
                b = s;
                super();
            }
        }
);
    }

    private Activity a;
    private NotifyManager b;
}
