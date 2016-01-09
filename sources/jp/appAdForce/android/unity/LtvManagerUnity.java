// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.unity;

import android.app.Activity;
import jp.appAdForce.android.AdManager;
import jp.appAdForce.android.LtvManager;
import jp.co.dimage.android.e;

public class LtvManagerUnity extends LtvManager
    implements e
{

    public LtvManagerUnity(Activity activity, AdManager admanager)
    {
        super(admanager);
        a = activity;
        b = this;
    }

    static LtvManager a(LtvManagerUnity ltvmanagerunity)
    {
        return ltvmanagerunity.b;
    }

    public void sendLtvConversionUnity(int i)
    {
        a.runOnUiThread(new Runnable(i) {

            public void run()
            {
                LtvManagerUnity.a(b).sendLtvConversion(a);
            }

            final int a;
            final LtvManagerUnity b;

            
            {
                b = LtvManagerUnity.this;
                a = i;
                super();
            }
        }
);
    }

    public void sendLtvConversionUnity(int i, String s)
    {
        a.runOnUiThread(new Runnable(i, s) {

            public void run()
            {
                LtvManagerUnity.a(c).sendLtvConversion(a, b);
            }

            final int a;
            final String b;
            final LtvManagerUnity c;

            
            {
                c = LtvManagerUnity.this;
                a = i;
                b = s;
                super();
            }
        }
);
    }

    private Activity a;
    private LtvManager b;
}
