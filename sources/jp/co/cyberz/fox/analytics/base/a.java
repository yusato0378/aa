// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import android.os.Build;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import jp.co.dimage.android.b;
import jp.co.dimage.android.l;

// Referenced classes of package jp.co.cyberz.fox.analytics.base:
//            g, e

public class jp.co.cyberz.fox.analytics.base.a
{
    public static final class a extends Enum
    {

        public static a a(String s1)
        {
            a aa[] = values();
            int j1 = aa.length;
            for(int i1 = 0; i1 < j1; i1++)
            {
                a a1 = aa[i1];
                if(a1.a().equals(s1))
                    return a1;
            }

            return null;
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(jp/co/cyberz/fox/analytics/base/a$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public String a()
        {
            return f;
        }

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        private final String f;

        static 
        {
            a = new a("AnalyticsEventStartSession", 0, "1");
            b = new a("AnalyticsEventEndSession", 1, "2");
            c = new a("AnalyticsEventPageView", 2, "3");
            d = new a("AnalyticsEventTrackEvent", 3, "4");
            e = new a("AnalyticsEventTracTransaction", 4, "5");
            g = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s1, int i1, String s2)
        {
            super(s1, i1);
            f = s2;
        }
    }


    public jp.co.cyberz.fox.analytics.base.a()
    {
        b = 0;
        c = "";
        d = null;
        e = null;
        f = 0;
        g = null;
        h = null;
        i = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = 0;
        r = null;
    }

    public int a()
    {
        return b;
    }

    public void a(double d1)
    {
        j = d1;
    }

    public void a(int i1)
    {
        b = i1;
    }

    public void a(String s1)
    {
        c = s1;
    }

    public void a(a a1)
    {
        m = a1;
    }

    public String b()
    {
        return c;
    }

    public void b(int i1)
    {
        f = i1;
    }

    public void b(String s1)
    {
        d = s1;
    }

    public String c()
    {
        return d;
    }

    public void c(int i1)
    {
        k = i1;
    }

    public void c(String s1)
    {
        e = s1;
    }

    public String d()
    {
        return e;
    }

    public void d(int i1)
    {
        q = i1;
    }

    public void d(String s1)
    {
        g = s1;
    }

    public int e()
    {
        return f;
    }

    public void e(String s1)
    {
        h = s1;
    }

    public String f()
    {
        return g;
    }

    public void f(String s1)
    {
        i = s1;
    }

    public String g()
    {
        return h;
    }

    public void g(String s1)
    {
        l = s1;
    }

    public String h()
    {
        return i;
    }

    public void h(String s1)
    {
        n = s1;
    }

    public double i()
    {
        return j;
    }

    public void i(String s1)
    {
        o = s1;
    }

    public int j()
    {
        return k;
    }

    public void j(String s1)
    {
        p = s1;
    }

    public String k()
    {
        return l;
    }

    public void k(String s1)
    {
        r = s1;
    }

    public a l()
    {
        return m;
    }

    public void l(String s1)
    {
        s = s1;
    }

    public String m()
    {
        return n;
    }

    public void m(String s1)
    {
        t = s1;
    }

    public String n()
    {
        return o;
    }

    public void n(String s1)
    {
        String as[];
        as = s1.split(",");
        b = Integer.valueOf(as[0]).intValue();
        m = a.a(as[1]);
        c = URLDecoder.decode(as[2], "UTF-8");
        o = as[3];
        if(jp.co.cyberz.fox.analytics.base.g.a(as[6]))
            s1 = null;
        else
            s1 = as[6];
        try
        {
            r = s1;
            d = URLDecoder.decode(as[11], "UTF-8");
            e = URLDecoder.decode(as[12], "UTF-8");
            f = Integer.valueOf(as[13]).intValue();
            g = URLDecoder.decode(as[14], "UTF-8");
            h = URLDecoder.decode(as[15], "UTF-8");
            i = URLDecoder.decode(as[16], "UTF-8");
            j = Double.valueOf(as[17]).doubleValue();
            k = Integer.valueOf(as[18]).intValue();
            l = as[19];
            s = URLDecoder.decode(as[29], "UTF-8");
            t = URLDecoder.decode(as[30], "UTF-8");
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            s1.printStackTrace();
        }
        return;
    }

    public String o()
    {
        return p;
    }

    public int p()
    {
        return q;
    }

    public void q()
    {
        q = q + 1;
    }

    public String r()
    {
        return r;
    }

    public String s()
    {
        return s;
    }

    public String t()
    {
        return t;
    }

    public String u()
    {
        String s1 = (new SimpleDateFormat("Z")).format(new Date());
        StringBuffer stringbuffer = new StringBuffer();
        try
        {
            stringbuffer.append(jp.co.cyberz.fox.analytics.base.g.a(Integer.valueOf(b))).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(m.a())).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(c), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(o)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.d)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.e)).append(",").append(jp.co.cyberz.fox.analytics.base.g.a(r, e.c)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(n)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.f)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.g)).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.h)).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(d), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(e), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.a(Integer.valueOf(f))).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(g), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(h), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(i), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.a(Double.valueOf(j))).append(",").append(jp.co.cyberz.fox.analytics.base.g.a(Integer.valueOf(k))).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(l)).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(e.m), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(e.i)).append(",").append(jp.co.cyberz.fox.analytics.base.g.a(Integer.valueOf(q))).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(Build.MODEL), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(android.os.Build.VERSION.RELEASE), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(s1)).append(",").append(",").append(",").append("2").append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(s), "UTF-8")).append(",").append(URLEncoder.encode(jp.co.cyberz.fox.analytics.base.g.b(t), "UTF-8")).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(jp.co.dimage.android.b.a())).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(jp.co.dimage.android.b.d())).append(",").append(jp.co.cyberz.fox.analytics.base.g.b(jp.co.dimage.android.l.a()));
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
        return stringbuffer.toString();
    }

    private static final String a = "UTF-8";
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private String g;
    private String h;
    private String i;
    private double j;
    private int k;
    private String l;
    private a m;
    private String n;
    private String o;
    private String p;
    private int q;
    private String r;
    private String s;
    private String t;
}
