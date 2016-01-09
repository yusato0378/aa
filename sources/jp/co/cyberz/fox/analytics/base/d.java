// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import android.os.AsyncTask;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

public class d
{

    public d()
    {
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 13;
    }

    public transient void a(AsyncTask asynctask, Object aobj[])
    {
        try
        {
            if(c && a != null)
            {
                a.invoke(asynctask, new Object[] {
                    b, aobj
                });
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch(AsyncTask asynctask)
        {
            return;
        }
        asynctask.execute(aobj);
        return;
    }

    private static Method a;
    private static Object b = android/os/AsyncTask.getField("THREAD_POOL_EXECUTOR").get(null);
    private static boolean c;

    static 
    {
        Method amethod[];
        int i;
        int j;
        a = null;
        b = null;
        c = a();
        amethod = android/os/AsyncTask.getMethods();
        j = amethod.length;
        i = 0;
_L2:
        if(i < j)
        {
            Method method = amethod[i];
            if(!"executeOnExecutor".equals(method.getName()))
                break MISSING_BLOCK_LABEL_101;
            Class aclass[] = method.getParameterTypes();
            if(aclass.length != 2 || aclass[0] != java/util/concurrent/Executor || !aclass[1].isArray())
                break MISSING_BLOCK_LABEL_101;
            a = method;
        }
        if(a == null)
            break MISSING_BLOCK_LABEL_100;
        return;
        i++;
        if(true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        a = null;
    }
}
