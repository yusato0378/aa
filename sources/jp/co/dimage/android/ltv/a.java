// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android.ltv;

import android.content.*;
import android.net.Uri;
import android.webkit.*;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.util.*;
import jp.co.dimage.android.*;

public class a
    implements e
{

    public a(c c1)
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = new HashMap();
        j = null;
        k = null;
        l = "";
        m = "1";
        k = c1;
        h();
    }

    static String a(a a1)
    {
        return a1.l;
    }

    static String a(a a1, String s)
    {
        a1.l = s;
        return s;
    }

    static c b(a a1)
    {
        return a1.k;
    }

    private String c(String s)
    {
        String s2 = jp.co.dimage.android.l.a("/p/ls?_app={0}&_xuid={1}&_xuniq={2}", new String[] {
            b, e, a
        });
        String s1 = s2;
        if(!jp.co.dimage.android.l.a(f))
            s1 = (new StringBuilder()).append(s2).append("&_xtid=").append(f).toString();
        String s3 = g();
        s2 = s1;
        if(!jp.co.dimage.android.l.a(s3))
            s2 = (new StringBuilder()).append(s1).append("&").append(s3).toString();
        s1 = s2;
        if(!jp.co.dimage.android.l.a(g))
            s1 = (new StringBuilder()).append(s2).append("&_xroute=").append(g).toString();
        if(s == null || s.length() <= 0)
            s = "default";
        s1 = (new StringBuilder()).append(s1).append("&_rurl=").append(URLEncoder.encode(s)).toString();
        s = s1;
        if(!jp.co.dimage.android.l.a(h))
            s = (new StringBuilder()).append(s1).append("&_model=").append(h).toString();
        return (new StringBuilder()).append(c).append(s).toString();
    }

    private boolean d(String s)
    {
        boolean flag1 = false;
        int i1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if(i1 < e.ad.length)
                {
                    if(!s.equals(e.ad[i1]))
                        break label0;
                    flag = true;
                }
                return flag;
            }
            i1++;
        } while(true);
    }

    private void e()
    {
        (new k(j)).a(null, false, false, true, false, new jp.co.dimage.android.k.c() {

            public void a()
            {
                try
                {
                    String s = jp.co.dimage.android.b.a();
                    if(!jp.co.dimage.android.l.a(s))
                    {
                        a.a(a, (new StringBuilder()).append(a.a(a)).append("&_adid=").append(jp.co.dimage.android.i.a(s, jp.co.dimage.android.i.a.a)).toString());
                        a.a(a, (new StringBuilder()).append(a.a(a)).append("&_adte=").append(jp.co.dimage.android.b.d()).toString());
                    }
                }
                catch(GeneralSecurityException generalsecurityexception) { }
                (new g(jp.co.dimage.android.ltv.a.b(a))).execute(new String[] {
                    a.a(a)
                });
            }

            final a a;

            
            {
                a = a.this;
                super();
            }
        }
);
    }

    private String f()
    {
        String s1 = jp.co.dimage.android.l.a("/p/cv?_app={0}&_xuid={1}&_xuniq={2}", new String[] {
            b, e, a
        });
        String s = s1;
        if(!jp.co.dimage.android.l.a(f))
            s = (new StringBuilder()).append(s1).append("&_xtid=").append(f).toString();
        String s2 = g();
        s1 = s;
        if(!jp.co.dimage.android.l.a(s2))
            s1 = (new StringBuilder()).append(s).append("&").append(s2).toString();
        s = s1;
        if(!jp.co.dimage.android.l.a(h))
            s = (new StringBuilder()).append(s1).append("&_model=").append(h).toString();
        s1 = s;
        if(!jp.co.dimage.android.l.a(g))
            s1 = (new StringBuilder()).append(s).append("&_xroute=").append(g).toString();
        return (new StringBuilder()).append(c).append(s1).toString();
    }

    private String g()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if(i.size() != 0)
        {
            Iterator iterator = i.keySet().iterator();
            boolean flag = false;
            do
            {
                if(!iterator.hasNext())
                    break;
                String s = (String)iterator.next();
                if(!d(s))
                {
                    String s1 = (String)i.get(s);
                    s = (new StringBuilder()).append(s).append("=").append(URLEncoder.encode(s1)).toString();
                    if(flag)
                        stringbuffer.append("&");
                    stringbuffer.append(s);
                    flag = true;
                }
            } while(true);
        }
        return stringbuffer.toString();
    }

    private void h()
    {
        b = k.p();
        a = k.o();
        e = k.m();
        c = k.t();
        j = k.l();
        d = k.k();
        f = k.w();
        g = k.n();
        h = k.I();
        if(jp.co.dimage.android.c.a.c == k.y())
            jp.co.dimage.android.b.a(j, null);
    }

    public void a()
    {
        if(!k.g())
            return;
        String s = f();
        if(jp.co.dimage.android.c.a.c == k.y())
        {
            l = s;
            e();
            return;
        } else
        {
            (new g(k)).execute(new String[] {
                s
            });
            return;
        }
    }

    public void a(Intent intent)
    {
        j.startActivity(intent);
    }

    public void a(WebView webview)
    {
        CookieManager cookiemanager = CookieManager.getInstance();
        cookiemanager.setAcceptCookie(true);
        if(android.os.Build.VERSION.SDK_INT < 21)
        {
            CookieSyncManager.createInstance(j);
            CookieSyncManager.getInstance().startSync();
            cookiemanager.removeExpiredCookie();
            return;
        } else
        {
            cookiemanager.setAcceptThirdPartyCookies(webview, true);
            return;
        }
    }

    public void a(String s)
    {
        if(!k.g())
            return;
        s = c(s);
        Intent intent = new Intent("android.intent.action.VIEW");
        try
        {
            intent.setData(Uri.parse(s));
            a(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return;
        }
    }

    public void a(String s, int i1)
    {
        a(s, String.valueOf(i1));
    }

    public void a(String s, String s1)
    {
        if(!jp.co.dimage.android.l.a(s))
            i.put(s, s1);
    }

    public void a(String s, String s1, String s2)
    {
        s1 = (new StringBuilder()).append(s1).append("=").append(s2).toString();
        CookieManager.getInstance().setCookie(s, s1);
    }

    public void b()
    {
        String s = jp.co.dimage.android.l.b(c);
        a(s, "_app_xuid", e);
        a(s, "_sdk", d);
        a(s, "_app", b);
        a(s, "_xuniq", a);
        a(s, "_app_inner", m);
        a(s, "_xtid", f);
        a(s, "_xroute", g);
        a(s, "_model", h);
    }

    public void b(String s)
    {
        if(!k.g())
            return;
        String s1 = f();
        s = (new StringBuilder()).append(s1).append("&_cvpoint=").append(s).toString();
        if(jp.co.dimage.android.c.a.c == k.y())
        {
            l = s;
            e();
            return;
        } else
        {
            (new g(k)).execute(new String[] {
                s
            });
            return;
        }
    }

    public void c()
    {
        if(android.os.Build.VERSION.SDK_INT < 21)
        {
            CookieSyncManager.getInstance().sync();
            return;
        } else
        {
            CookieManager.getInstance().flush();
            return;
        }
    }

    public void d()
    {
        i = new HashMap();
    }

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private HashMap i;
    private Context j;
    private c k;
    private String l;
    private String m;
}
