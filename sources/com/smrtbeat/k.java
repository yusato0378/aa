// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.smrtbeat:
//            F, v, u, e

final class k
    implements F
{

    k()
    {
        a = false;
        b = null;
        c = null;
        d = null;
    }

    final F a(File file, File file1, File file2)
    {
        b = file;
        c = file1;
        d = file2;
        return this;
    }

    public final boolean a()
    {
        return a;
    }

    public final void run()
    {
        try
        {
            ArrayList arraylist = new ArrayList(2);
            arraylist.add(new v("errors", "json.txt", b));
            arraylist.add(new v("minidump", d.getName(), c));
            a = e.a((new u("https://minidumps.smbeat.jp/api/errors/multi", arraylist)).a(2000));
            return;
        }
        catch(Exception exception)
        {
            return;
        }
    }

    private boolean a;
    private File b;
    private File c;
    private File d;
}
