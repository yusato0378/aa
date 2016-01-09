// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.Context;
import java.lang.reflect.Method;

// Referenced classes of package jp.co.dimage.android:
//            a

public class b
{
    public static interface a
    {

        public abstract void a(String s, boolean flag);
    }


    public b()
    {
    }

    static Object a(Context context)
    {
        return b(context);
    }

    public static String a()
    {
        return a;
    }

    static String a(Object obj)
    {
        return c(obj);
    }

    static String a(String s)
    {
        a = s;
        return s;
    }

    public static void a(Context context, a a1)
    {
        if(!c() || context == null)
        {
            return;
        } else
        {
            (new Thread(new Runnable(context, a1) {

                public void run()
                {
                    Object obj;
                    try
                    {
                        b.a(true);
                        obj = b.a(a);
                    }
                    catch(Exception exception)
                    {
                        b.a(false);
                        return;
                    }
                    if(obj == null)
                        break MISSING_BLOCK_LABEL_25;
                    b.a(b.a(obj));
                    if(obj == null)
                        break MISSING_BLOCK_LABEL_37;
                    b.b(b.b(obj));
                    if(b != null)
                        b.a(b.e(), b.f());
                    b.a(false);
                    return;
                    Exception exception1;
                    exception1;
                    b.a(false);
                    throw exception1;
                }

                final Context a;
                final a b;

            
            {
                a = context;
                b = a1;
                super();
            }
            }
)).start();
            return;
        }
    }

    static boolean a(boolean flag)
    {
        c = flag;
        return flag;
    }

    private static Object b(Context context)
    {
        try
        {
            Class class1 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            context = ((Context) (class1.getMethod("getAdvertisingIdInfo", new Class[] {
                android/content/Context
            }).invoke(class1, new Object[] {
                context
            })));
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            jp.co.dimage.android.a.c("F.O.X", "Could not get advertisingID from Google Play Services.");
            return null;
        }
        return context;
    }

    public static boolean b()
    {
        return c;
    }

    static boolean b(Object obj)
    {
        return d(obj);
    }

    static boolean b(boolean flag)
    {
        b = flag;
        return flag;
    }

    private static String c(Object obj)
    {
        try
        {
            obj = (String)obj.getClass().getMethod("getId", new Class[0]).invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            jp.co.dimage.android.a.c("F.O.X", "Could not get advertisingID from Google Play Services.");
            return null;
        }
        return ((String) (obj));
    }

    public static boolean c()
    {
        try
        {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        }
        catch(Exception exception)
        {
            jp.co.dimage.android.a.c("F.O.X", "Google Play Services were not found.");
            return false;
        }
        return true;
    }

    public static String d()
    {
        if(b)
            return "0";
        else
            return "1";
    }

    private static boolean d(Object obj)
    {
        boolean flag;
        try
        {
            flag = ((Boolean)obj.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            return true;
        }
        return flag;
    }

    static String e()
    {
        return a;
    }

    static boolean f()
    {
        return b;
    }

    private static String a = "";
    private static boolean b = true;
    private static boolean c = false;

}
