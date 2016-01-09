// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            F, e

final class j
    implements F
{

    j()
    {
        a = false;
        b = null;
    }

    final F a(JSONObject jsonobject)
    {
        b = jsonobject;
        return this;
    }

    public final boolean a()
    {
        return a;
    }

    public final void run()
    {
        a = e.b(b);
    }

    private boolean a;
    private JSONObject b;
}
