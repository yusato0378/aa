// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.SharedPreferences;
import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            c, N, u, e

final class i
    implements Runnable
{

    i()
    {
    }

    public final void run()
    {
        android.content.Context context;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        flag1 = false;
        flag3 = c.O;
        context = c.a();
        if(context == null) goto _L2; else goto _L1
_L1:
        android.content.SharedPreferences.Editor editor;
        Object obj;
        obj = N.f(context);
        editor = ((SharedPreferences) (obj)).edit();
        String s = e.a("https://control.smbeat.jp/api/remote", u.b());
        if(!e.a(s) || context == null) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject = new JSONObject(s);
        if(jsonobject.has("suppressSdk"))
        {
            flag1 = e.a(jsonobject, "suppressSdk", false);
            editor.putBoolean("com.smrtbeat.pref1", flag1);
            c.O = flag1;
        }
        if(jsonobject.has("suppressCap"))
        {
            flag2 = e.a(jsonobject, "suppressCap", false);
            editor.putBoolean("com.smrtbeat.pref5", flag2);
            c.P = flag2;
        }
        boolean flag = true;
_L11:
        N.a(editor);
        if(!flag) goto _L6; else goto _L5
_L5:
        if(flag1 == flag3) goto _L8; else goto _L7
_L7:
        N.c(editor);
_L6:
        N.d(editor);
_L2:
        c.Q = null;
        return;
        obj;
        N.a(editor);
        N.d(editor);
        if(true) goto _L2; else goto _L9
_L9:
        obj;
        N.a(editor);
        N.d(editor);
        c.Q = null;
        throw obj;
_L8:
        if(flag1)
            N.e(((SharedPreferences) (obj)));
        if(true) goto _L6; else goto _L4
_L4:
        flag = false;
        flag1 = flag2;
        if(true) goto _L11; else goto _L10
_L10:
    }
}
