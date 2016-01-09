// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            e

final class l
    implements Runnable
{

    l()
    {
    }

    final Runnable a(String s, JSONObject jsonobject)
    {
        a = s;
        b = jsonobject;
        return this;
    }

    public final void run()
    {
        e.a(b, a);
    }

    private String a;
    private JSONObject b;
}
