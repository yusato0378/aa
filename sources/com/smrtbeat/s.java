// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            e

final class s
    implements Runnable
{

    s()
    {
    }

    final Runnable a(JSONObject jsonobject)
    {
        a = jsonobject;
        return this;
    }

    public final void run()
    {
        e.a(a);
    }

    private JSONObject a;
}
