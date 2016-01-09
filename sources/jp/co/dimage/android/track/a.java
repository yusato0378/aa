// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android.track;

import jp.appAdForce.android.AdManager;
import jp.co.dimage.android.c;
import jp.co.dimage.android.e;

// Referenced classes of package jp.co.dimage.android.track:
//            c

public class a
    implements e
{

    public a(AdManager admanager)
    {
        a = null;
        b = null;
        c = null;
        a = admanager;
        b = a.a();
        c = new jp.co.dimage.android.track.c(b);
    }

    public void a()
    {
        c.a();
    }

    public void a(String s)
    {
        c.a(s);
    }

    public void b()
    {
        c.b();
    }

    private AdManager a;
    private c b;
    private jp.co.dimage.android.track.c c;
}
