// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.app.Application;
import java.io.File;

// Referenced classes of package com.smrtbeat:
//            C, P, N

class v
{

    v()
    {
    }

    v(String s, String s1, File file)
    {
        a = s;
        b = s1;
        c = file;
    }

    static void a(Application application)
    {
        if(application != null)
        {
            application.registerActivityLifecycleCallbacks(new C());
            return;
        } else
        {
            N.a(P.a, "Failed to register activity lifecycle callback");
            return;
        }
    }

    private static android.app.Application.ActivityLifecycleCallbacks d()
    {
        return new C();
    }

    final String a()
    {
        return a;
    }

    final String b()
    {
        return b;
    }

    final File c()
    {
        return c;
    }

    private String a;
    private String b;
    private File c;
}
