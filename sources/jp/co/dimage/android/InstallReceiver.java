// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.*;

// Referenced classes of package jp.co.dimage.android:
//            a, c, f

public class InstallReceiver extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }


    public InstallReceiver()
    {
        a = null;
    }

    private void a(Context context, Intent intent)
    {
        intent = intent.getStringExtra("referrer");
        jp.co.dimage.android.a.a("ADMAGE_DEBUG", (new StringBuilder()).append("referrer: ").append(intent).toString());
        context = new c(context);
        a = new f(context);
        a(((c) (context)), a, ((String) (intent)));
    }

    private void a(c c1, f f1, String s)
    {
        c1.a(s, new a(f1, s) {

            public void a()
            {
                a.e(b);
            }

            public void b()
            {
                a.d(b);
            }

            final f a;
            final String b;
            final InstallReceiver c;

            
            {
                c = InstallReceiver.this;
                a = f1;
                b = s;
                super();
            }
        }
);
    }

    public void onReceive(Context context, Intent intent)
    {
        jp.co.dimage.android.a.a("ADMAGE_DEBUG", "---------- enter ----------");
        jp.co.dimage.android.a.a("ADMAGE_DEBUG", (new StringBuilder()).append("action: ").append(intent.getAction()).toString());
        if("com.android.vending.INSTALL_REFERRER".equals(intent.getAction()))
            a(context, intent);
    }

    private f a;
}
