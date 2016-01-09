// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.webkit.WebView;
import jp.co.dimage.android.c;
import jp.co.dimage.android.e;
import jp.co.dimage.android.ltv.a;

// Referenced classes of package jp.appAdForce.android:
//            AdManager

public class LtvManager
    implements e
{

    public LtvManager(AdManager admanager)
    {
        a = null;
        b = null;
        c = null;
        c = admanager;
        a = c.a();
        b = new a(a);
    }

    public void addParam(String s, int i)
    {
        b.a(s, i);
    }

    public void addParam(String s, String s1)
    {
        b.a(s, s1);
    }

    public void clearParam()
    {
        b.d();
    }

    public void ltvOpenBrowser(String s)
    {
        b.a(s);
    }

    public void sendLtvConversion(int i)
    {
        b.a("_cvpoint", String.valueOf(i));
        b.a();
    }

    public void sendLtvConversion(int i, String s)
    {
        b.a("_cvpoint", String.valueOf(i));
        b.a("_buid", s);
        b.a();
    }

    public void setLtvCookie(WebView webview)
    {
        b.a(webview);
        b.b();
        b.c();
    }

    public static final String URL_PARAM_CURRENCY = "_currency";
    public static final String URL_PARAM_OUT = "_out";
    public static final String URL_PARAM_PRICE = "_price";
    public static final String URL_PARAM_SKU = "_sku";
    private c a;
    private a b;
    private AdManager c;
}
