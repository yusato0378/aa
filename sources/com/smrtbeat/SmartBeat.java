// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.*;

// Referenced classes of package com.smrtbeat:
//            N, y, c, e, 
//            P, SmartBeatJni, ExceptionHander, v, 
//            I

public class SmartBeat
{

    public SmartBeat()
    {
    }

    public static void addExtraData(String s, String s1)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            N.a(s, s1);
            return;
        }
    }

    public static void addExtraData(HashMap hashmap)
    {
        if(isSupported() && hashmap != null)
        {
            hashmap = hashmap.entrySet().iterator();
            while(hashmap.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)hashmap.next();
                addExtraData((String)entry.getKey(), (String)entry.getValue());
            }
        }
    }

    public static boolean beginOnDrawFrame()
    {
        return y.b();
    }

    public static void disable()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.N = true;
            return;
        }
    }

    public static void disableAutoScreenCapture()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.z = false;
            return;
        }
    }

    public static void enable()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.N = false;
            return;
        }
    }

    public static void enableAutoScreenCapture()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.z = true;
            return;
        }
    }

    public static void enableDebugLog(String s)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.t = s;
            return;
        }
    }

    public static void enableLogCat()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.u = true;
            c.v = "";
            return;
        }
    }

    public static void enableLogCat(String s)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.u = true;
            c.v = s;
            return;
        }
    }

    public static void endOnDrawFrame()
    {
        y.c();
    }

    public static void flush()
    {
        if(!isSupported())
        {
            return;
        } else
        {
            e.c();
            return;
        }
    }

    public static void initAndStartSession(Application application, String s)
    {
        if(!isSupported())
        {
            N.a(P.c, String.format("This Android version(%d) is not supported", new Object[] {
                Integer.valueOf(android.os.Build.VERSION.SDK_INT)
            }));
            return;
        }
        Context context = application.getApplicationContext();
        if(context == null)
            throw new IllegalArgumentException("context must not be null");
        if(s == null || s.length() <= 0)
            throw new IllegalArgumentException("apiKey must not be empty");
        if(s.length() != 36)
        {
            Log.e("SmartBeat", (new StringBuilder("Invalid api key:")).append(s).toString());
            return;
        }
        N.a(N.f(context));
        c.a = s;
        N.a(context);
        c.a(context);
        c.p = SmartBeatJni.a(application);
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHander(Thread.getDefaultUncaughtExceptionHandler()));
        if(android.os.Build.VERSION.SDK_INT >= 14)
            v.a(application);
        e.c();
        e.b();
    }

    public static void initAndStartSession(Application application, String s, boolean flag)
    {
        if(flag)
            flag = false;
        else
            flag = true;
        c.N = flag;
        initAndStartSession(application, s);
    }

    public static boolean isEnabled()
    {
        return !c.N;
    }

    private static boolean isSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 8;
    }

    public static boolean isWhiteListed()
    {
        return y.b(Build.MODEL);
    }

    public static void leaveBreadcrumbs(String s)
    {
        while(!isSupported() || s == null || s.length() <= 0) 
            return;
        if(s.length() > 32)
        {
            N.a(P.c, String.format("Breadcrumb length should be up to %d", new Object[] {
                Integer.valueOf(32)
            }));
            N.a(s.substring(0, 32));
            return;
        } else
        {
            N.a(s);
            return;
        }
    }

    public static void logHandleExceptionForUnity(Context context, String s, String s1)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            ExceptionHander.logUnityLog(context, s, s1, UUID.randomUUID().toString());
            return;
        }
    }

    public static void logHandleExceptionForUnity(Context context, String s, String s1, String s2)
    {
        if(isSupported())
        {
            String s3 = UUID.randomUUID().toString();
            ExceptionHander.logUnityLog(context, s, s1, s3);
            if(s2 != null && s2.length() > 0)
            {
                context = new Thread((new I()).a(new File(s2), s3));
                context.setPriority(2);
                context.start();
                return;
            }
        }
    }

    public static void logHandledException(Context context, Throwable throwable)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            ExceptionHander.logHandledException(context, throwable);
            return;
        }
    }

    public static void notifyDump(String s)
    {
        SmartBeatJni.a(s);
    }

    public static void notifyOnPause(Activity activity)
    {
        while(!isSupported() || android.os.Build.VERSION.SDK_INT >= 14) 
            return;
        N.c(activity);
    }

    public static void notifyOnResume(Activity activity)
    {
        if(isSupported())
        {
            if(android.os.Build.VERSION.SDK_INT < 14)
            {
                N.b(activity);
                return;
            }
            if(c.D.length() <= 0)
            {
                N.b(activity);
                return;
            }
        }
    }

    public static void onSurfaceCreated(int i)
    {
        c.q = i;
        y.a();
    }

    public static void setActivityAsSensitive(String s)
    {
        while(!isSupported() || s == null || s.length() == 0) 
            return;
        c.B.add(s);
    }

    public static void setActivityAsSensitive(List list)
    {
        while(!isSupported() || list == null || list.size() == 0) 
            return;
        c.B.addAll(list);
    }

    public static void setOpenGLESVersion(int i)
    {
        Log.w("SmartBeat", "deprecated API (SmartBeat.setOpenGLESVersion) is used.");
    }

    public static void setUserId(String s)
    {
        if(!isSupported())
        {
            return;
        } else
        {
            c.w = s;
            return;
        }
    }

    public static void whiteListBoardForOpenGLES(String s)
    {
        Log.w("SmartBeat", "deprecated API (SmartBeat.whiteListBoardForOpenGLES) is used.");
    }

    public static void whiteListModelForOpenGLES(String s)
    {
        y.a(s);
    }
}
