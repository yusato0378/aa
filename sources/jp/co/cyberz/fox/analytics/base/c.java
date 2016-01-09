// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import java.net.URLEncoder;

// Referenced classes of package jp.co.cyberz.fox.analytics.base:
//            g, e

public class c
{

    public c()
    {
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = false;
    }

    public String a()
    {
        if(jp.co.cyberz.fox.analytics.base.g.a(b))
            return "";
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            stringbuffer.append(b).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(c), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(d), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(e), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(f), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(g), "UTF-8")).append(",").append(e.d).append(",").append(e.f).append(",");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return stringbuffer.toString();
    }

    public void a(String s)
    {
        b = s;
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public void b(String s)
    {
        c = s;
    }

    public boolean b()
    {
        return h;
    }

    public void c(String s)
    {
        d = s;
    }

    public void d(String s)
    {
        e = s;
    }

    public void e(String s)
    {
        f = s;
    }

    public void f(String s)
    {
        g = s;
    }

    private static final String a = "UTF-8";
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private boolean h;
}
