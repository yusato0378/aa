// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.Context;

// Referenced classes of package com.smrtbeat:
//            P, N, u, s, 
//            t, c, r

public class ExceptionHander
    implements Thread.UncaughtExceptionHandler
{

    ExceptionHander(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        mDefaultHander = uncaughtexceptionhandler;
    }

    static void logHandledException(Context context, Throwable throwable)
    {
        if(throwable == null)
            N.a(P.b, "Throwable should not be null when calling logHandledException()");
        else
        if(N.e())
        {
            context = u.a(context, throwable, true);
            (new Thread((new s()).a(context))).start();
            return;
        }
    }

    static void logUnityLog(Context context, String s1, String s2, String s3)
    {
        if(!N.e())
        {
            return;
        } else
        {
            context = u.a(context, s1, s2, s3);
            context = new Thread((new t()).a(context));
            context.setPriority(2);
            context.start();
            return;
        }
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Context context = c.a();
        c.M = true;
        if(N.e())
            try
            {
                (new Thread(new r(this, u.a(context, throwable, false), N.j()))).start();
            }
            catch(Exception exception)
            {
                N.a(P.a, exception.toString());
            }
        if(mDefaultHander != null)
            mDefaultHander.uncaughtException(thread, throwable);
        try
        {
            Thread.sleep(5000L);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Thread thread)
        {
            return;
        }
    }

    private Thread.UncaughtExceptionHandler mDefaultHander;
}
