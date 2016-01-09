// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.SharedPreferences;
import android.os.SystemClock;

// Referenced classes of package com.smrtbeat:
//            e, u, P, N

final class f
    implements Runnable
{

    f()
    {
    }

    final Runnable a(SharedPreferences sharedpreferences)
    {
        a = sharedpreferences;
        return this;
    }

    public final void run()
    {
        e.a(true);
        org.json.JSONObject jsonobject = u.a();
        N.a(P.c, "SendPingData");
        if(e.b(jsonobject))
        {
            android.content.SharedPreferences.Editor editor = a.edit();
            editor.putLong("com.smrtbeat.pref6", SystemClock.elapsedRealtime());
            N.d(editor);
        }
        e.a(false);
    }

    private SharedPreferences a;
}
