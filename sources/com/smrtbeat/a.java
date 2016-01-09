// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.view.Window;

// Referenced classes of package com.smrtbeat:
//            G, c, N

final class a
    implements Runnable
{

    a()
    {
        c = null;
        d = null;
        e = 0;
        h = new Object();
    }

    private boolean a()
    {
label0:
        {
            synchronized(h)
            {
                if(c != null && d != null && i != null)
                    break label0;
                e = e + 1;
            }
            return false;
        }
        Window window;
        Context context;
        window = c;
        context = d;
        obj;
        JVM INSTR monitorexit ;
        G.a(window, context, this, i);
        return true;
        exception;
        throw exception;
    }

    final void a(Activity activity)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        e = 0;
        if(!c.I)
            break MISSING_BLOCK_LABEL_31;
        c = null;
        d = null;
_L2:
        return;
        c = activity.getWindow();
        d = activity.getApplicationContext();
        i = new Handler(activity.getMainLooper());
        if(true) goto _L2; else goto _L1
_L1:
        activity;
        throw activity;
    }

    final void b(Activity activity)
    {
        synchronized(h)
        {
            if(c == activity.getWindow())
            {
                c = null;
                d = null;
            }
        }
    }

    public final void run()
    {
        do
        {
label0:
            {
                try
                {
                    Thread.sleep(1000L);
                }
                catch(InterruptedException interruptedexception) { }
                if(!N.g())
                    return;
                synchronized(h)
                {
                    if(e <= 3)
                        break label0;
                }
                return;
            }
            a();
        } while(true);
    }

    private static final int f = 3;
    private static final long g = 1000L;
    Canvas a;
    Bitmap b;
    private Window c;
    private Context d;
    private int e;
    private Object h;
    private Handler i;
}
