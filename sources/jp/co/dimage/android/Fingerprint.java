// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package jp.co.dimage.android:
//            l, f

public class Fingerprint
{

    public Fingerprint()
    {
        b = "";
        c = "";
        d = "";
    }

    public String a()
    {
        return b;
    }

    public void a(Context context)
    {
        g = context;
        h = new WebView(context);
        h.getSettings().setJavaScriptEnabled(true);
        h.addJavascriptInterface(this, "droid");
        if(!l.a(d))
            h.loadUrl((new StringBuilder()).append(d).append("/view/collect.html").toString());
    }

    public void a(String s)
    {
        d = s;
    }

    public void a(f.a a1)
    {
        f = a1;
    }

    public void a(f f1)
    {
        e = f1;
    }

    public String b()
    {
        return c;
    }

    public void setFingerprintId(String s, long l1)
    {
        b = s;
        if(l1 > 0L)
            c = Long.toString(l1);
        e.d(b, c);
    }

    static final String a = "/view/collect.html";
    private static final String i = "FINGER_PRINT";
    private String b;
    private String c;
    private String d;
    private f e;
    private f.a f;
    private Context g;
    private WebView h;
}
