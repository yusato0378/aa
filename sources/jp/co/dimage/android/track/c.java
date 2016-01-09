// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android.track;

import jp.co.dimage.android.e;
import jp.co.dimage.android.l;

// Referenced classes of package jp.co.dimage.android.track:
//            b

public class c
    implements e
{

    public c(jp.co.dimage.android.c c1)
    {
        c = null;
        e = null;
        f = null;
        a = c1;
        b = "";
        e = c1.p();
        f = c1.o();
    }

    public String a(String s, String s1, String s2)
    {
        return l.a("/p/track?_app={0}&_xtid={1}&_xuniq={2}&_xtrack={3}&_pre_xtrack={4}", new String[] {
            e, s, f, s1, s2
        });
    }

    public void a()
    {
        c = a.w();
        if(d != null)
            d.a();
        d = new b(a.k());
        d.execute(new Void[0]);
    }

    public void a(String s)
    {
        if(c == null)
            throw new IllegalStateException("tracking task is not started.");
        String s1 = a(c, s, b);
        b = s;
        if(!a.g())
        {
            return;
        } else
        {
            d.a(s1);
            return;
        }
    }

    public void b()
    {
        d.a();
        d = null;
        c = null;
    }

    public String c()
    {
        return c;
    }

    private jp.co.dimage.android.c a;
    private String b;
    private String c;
    private b d;
    private String e;
    private String f;
}
