// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android.unity;

import android.app.Activity;
import jp.appAdForce.android.AdManager;
import jp.co.dimage.android.e;

public class AdManagerUnity extends AdManager
    implements e
{

    public AdManagerUnity(Activity activity)
    {
        super(activity);
        b = activity;
        c = this;
    }

    static AdManager a(AdManagerUnity admanagerunity)
    {
        return admanagerunity.c;
    }

    public void sendConversionForMobageUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendConversionForMobage(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendConversionForMobageUnity(String s, String s1)
    {
        b.runOnUiThread(new Runnable(s, s1) {

            public void run()
            {
                AdManagerUnity.a(c).sendConversionForMobage(a, b);
            }

            final String a;
            final String b;
            final AdManagerUnity c;

            
            {
                c = AdManagerUnity.this;
                a = s;
                b = s1;
                super();
            }
        }
);
    }

    public void sendConversionForMobageWithCARewardUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendConversionForMobageWithCAReward(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendConversionForMobageWithCARewardUnity(String s, String s1)
    {
        b.runOnUiThread(new Runnable(s, s1) {

            public void run()
            {
                AdManagerUnity.a(c).sendConversionForMobageWithCAReward(a, b);
            }

            final String a;
            final String b;
            final AdManagerUnity c;

            
            {
                c = AdManagerUnity.this;
                a = s;
                b = s1;
                super();
            }
        }
);
    }

    public void sendConversionUnity()
    {
        b.runOnUiThread(new Runnable() {

            public void run()
            {
                AdManagerUnity.a(a).sendConversion();
            }

            final AdManagerUnity a;

            
            {
                a = AdManagerUnity.this;
                super();
            }
        }
);
    }

    public void sendConversionUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendConversion(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendConversionUnity(String s, String s1)
    {
        b.runOnUiThread(new Runnable(s, s1) {

            public void run()
            {
                AdManagerUnity.a(c).sendConversion(a, b);
            }

            final String a;
            final String b;
            final AdManagerUnity c;

            
            {
                c = AdManagerUnity.this;
                a = s;
                b = s1;
                super();
            }
        }
);
    }

    public void sendConversionWithBuidUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendConversionWithBuid(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendConversionWithCARewardUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendConversionWithCAReward(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendConversionWithCARewardUnity(String s, String s1)
    {
        b.runOnUiThread(new Runnable(s, s1) {

            public void run()
            {
                AdManagerUnity.a(c).sendConversionWithCAReward(a, b);
            }

            final String a;
            final String b;
            final AdManagerUnity c;

            
            {
                c = AdManagerUnity.this;
                a = s;
                b = s1;
                super();
            }
        }
);
    }

    public void sendReengagementConversion(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            public void run()
            {
                AdManagerUnity.a(b).sendReengagementConversion(a.getIntent());
            }

            final Activity a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = activity;
                super();
            }
        }
);
    }

    public void sendReengagementConversion(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendReengagementConversion(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void sendUserIdForMobageUnity(String s)
    {
        b.runOnUiThread(new Runnable(s) {

            public void run()
            {
                AdManagerUnity.a(b).sendUserIdForMobage(a);
            }

            final String a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = s;
                super();
            }
        }
);
    }

    public void setUrlScheme(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            public void run()
            {
                AdManagerUnity.a(b).setUrlScheme(a.getIntent());
            }

            final Activity a;
            final AdManagerUnity b;

            
            {
                b = AdManagerUnity.this;
                a = activity;
                super();
            }
        }
);
    }

    private Activity b;
    private AdManager c;
}
