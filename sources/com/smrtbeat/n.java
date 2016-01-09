// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.smrtbeat:
//            F, v, u, e

final class n
    implements F
{

    n()
    {
        a = false;
        b = null;
    }

    final F a(File file)
    {
        b = file;
        return this;
    }

    public final boolean a()
    {
        return a;
    }

    public final void run()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(new v("screenshot", b.getName(), b));
        a = e.a((new u("https://images.smbeat.jp/api/upload", arraylist)).a(10000), b.getName());
    }

    private boolean a;
    private File b;
}
