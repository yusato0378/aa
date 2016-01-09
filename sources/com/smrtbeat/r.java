// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.os.SystemClock;
import java.io.File;
import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            e, ExceptionHander

final class r
    implements Runnable
{

    r(ExceptionHander exceptionhander, JSONObject jsonobject, File file)
    {
        b = jsonobject;
        c = file;
        super();
    }

    public final void run()
    {
        long l = SystemClock.elapsedRealtime();
        e.a(b, 5000L);
        l = SystemClock.elapsedRealtime() - l;
        if(c != null && 5000L > l)
            e.a(c, 5000L - l);
    }

    private ExceptionHander a;
    private final JSONObject b;
    private final File c;
}
