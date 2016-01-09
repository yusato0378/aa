// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.content.Context;
import android.content.Intent;
import jp.co.dimage.android.*;

public class AdManager
    implements e
{

    public AdManager(Context context)
    {
        b = null;
        c = null;
        b = new c(context);
        c = new f(b);
    }

    public static void updateFrom2_10_4g()
    {
        jp.co.dimage.android.c.d(true);
    }

    public c a()
    {
        return b;
    }

    public void a(String s)
    {
        c.d(s);
    }

    public Context b()
    {
        return b.l();
    }

    public void b(String s)
    {
        c.f(s);
    }

    public boolean isAppConversionCompleted()
    {
        return b.A();
    }

    public boolean isConversionCompleted()
    {
        return b.z() || b.A();
    }

    public boolean isWebConversionCompleted()
    {
        return b.z();
    }

    public void openConversionPage(String s)
    {
        c.c(s);
    }

    public void sendConversion()
    {
        sendConversion("default");
    }

    public void sendConversion(String s)
    {
        b.c(true);
        c.a(s);
    }

    public void sendConversion(String s, String s1)
    {
        b.c(true);
        c.a(s, s1);
    }

    public void sendConversionForMobage(String s)
    {
        d = s;
        c.e(s, "mbga");
    }

    public void sendConversionForMobage(String s, String s1)
    {
        d = s1;
        c.b(s, s1, "mbga");
    }

    public void sendConversionForMobageWithCAReward(String s)
    {
        d = s;
        c.c(s, "mbga");
    }

    public void sendConversionForMobageWithCAReward(String s, String s1)
    {
        d = s1;
        c.a(s, s1, "mbga");
    }

    public void sendConversionWithBuid(String s)
    {
        sendConversion("default", s);
    }

    public void sendConversionWithCAReward(String s)
    {
        c.b(s);
    }

    public void sendConversionWithCAReward(String s, String s1)
    {
        c.b(s, s1);
    }

    public void sendReengagementConversion(Intent intent)
    {
        c.a(intent);
    }

    public void sendReengagementConversion(String s)
    {
        c.g(s);
    }

    public void sendUserIdForMobage(String s)
    {
        c.c(d, "mbga", s);
    }

    public void setDebugMode(boolean flag)
    {
        b.e(flag);
        b.S();
    }

    public void setOptout(boolean flag)
    {
        b.b(flag);
        c.k(flag);
    }

    public void setServerUrl(String s)
    {
        c.i(s);
    }

    public void setUrlScheme(Intent intent)
    {
        sendReengagementConversion(intent);
    }

    public static final String a = "v2.15.7g";
    private static String d = null;
    private c b;
    private f c;

}
