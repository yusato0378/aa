// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.view.Display;
import android.view.WindowManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            u, c, N

final class w
{

    w()
    {
    }

    static JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        u.a(jsonobject1, "type", "ping");
        u.a(jsonobject1, "userId", c.w);
        u.a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        u.a(jsonobject, "request", jsonobject1);
        u.a(jsonobject, "environment", u.c());
        u.a(jsonobject, "sdk", u.d());
        return jsonobject;
    }

    private static JSONObject a(long l)
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, "type", "breakpad-exception-report");
        u.a(jsonobject, "userId", c.w);
        u.a(jsonobject, "requestId", c.o);
        u.a(jsonobject, "occuredAt", String.valueOf(l));
        return jsonobject;
    }

    private static JSONObject a(long l, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, "userId", c.w);
        if(!flag)
            u.a(jsonobject, "requestId", c.o);
        u.a(jsonobject, "occuredAt", String.valueOf(l));
        return jsonobject;
    }

    static JSONObject a(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        long l = System.currentTimeMillis();
        u.a(jsonobject, "request", u.a(l));
        u.a(jsonobject, "exception", u.a(null, false));
        u.a(jsonobject, "performance", u.b(context));
        u.a(jsonobject, "environment", u.a(context, l));
        u.a(jsonobject, "sdk", u.d());
        return jsonobject;
    }

    private static JSONObject a(Context context, long l)
    {
        JSONObject jsonobject = u.c();
        if(context == null) goto _L2; else goto _L1
_L1:
        Object obj;
        if(context.getPackageManager().checkPermission("android.permission.GET_TASKS", c.b) == 0)
        {
            obj = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
            if(obj == null)
                obj = "0";
            else
                obj = String.valueOf(((List) (obj)).size());
        } else
        {
            obj = "no permission";
        }
        u.a(jsonobject, "runningApps", ((String) (obj)));
        u.a(jsonobject, "mobileNet", N.c(context));
        u.a(jsonobject, "wifi", N.d(context));
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context.getRotation();
        JVM INSTR tableswitch 0 3: default 124
    //                   0 329
    //                   1 335
    //                   2 341
    //                   3 347;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        context = (new StringBuilder("unknown:")).append(String.valueOf(context.getRotation())).toString();
_L9:
        u.a(jsonobject, "screenRotation", context);
_L2:
        u.a(jsonobject, "screenDpi", String.valueOf(c.j));
        u.a(jsonobject, "screenWidth", String.valueOf(c.k));
        u.a(jsonobject, "screenHeight", String.valueOf(c.l));
        u.a(jsonobject, "board", Build.BOARD);
        u.a(jsonobject, "boardPlatform", N.a(com.smrtbeat.c.a(), "ro.board.platform"));
        obj = Build.CPU_ABI;
        context = ((Context) (obj));
        if(Build.CPU_ABI2 != null)
        {
            context = ((Context) (obj));
            if(Build.CPU_ABI2.length() > 0)
                context = (new StringBuilder(String.valueOf(obj))).append(" / ").append(Build.CPU_ABI2).toString();
        }
        u.a(jsonobject, "cpuAbi", context);
        u.a(jsonobject, "manufacturer", Build.MANUFACTURER);
        u.a(jsonobject, "buildType", Build.TYPE);
        u.a(jsonobject, l);
        u.a(jsonobject);
        return jsonobject;
_L4:
        context = "ROTATION_0";
        continue; /* Loop/switch isn't completed */
_L5:
        context = "ROTATION_90";
        continue; /* Loop/switch isn't completed */
_L6:
        context = "ROTATION_180";
        continue; /* Loop/switch isn't completed */
_L7:
        context = "ROTATION_270";
        if(true) goto _L9; else goto _L8
_L8:
    }

    static JSONObject a(Context context, String s, String s1, String s2)
    {
        JSONObject jsonobject = new JSONObject();
        long l = System.currentTimeMillis();
        JSONObject jsonobject1 = u.a(l, false);
        u.a(jsonobject1, "type", "unity-exception-report");
        u.a(jsonobject1, "requestId", s2);
        u.a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        u.a(jsonobject, "request", jsonobject1);
        u.a(jsonobject, "exception", u.a(s, s1));
        u.a(jsonobject, "performance", u.b(context));
        u.a(jsonobject, "environment", u.a(context, l));
        u.a(jsonobject, "sdk", u.d());
        return jsonobject;
    }

    static JSONObject a(Context context, Throwable throwable, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        long l = System.currentTimeMillis();
        JSONObject jsonobject1 = u.a(l, flag);
        u.a(jsonobject1, "type", "exception-report");
        u.a(jsonobject, "request", jsonobject1);
        u.a(jsonobject, "exception", u.a(throwable, flag));
        u.a(jsonobject, "performance", u.b(context));
        u.a(jsonobject, "environment", u.a(context, l));
        u.a(jsonobject, "sdk", u.d());
        return jsonobject;
    }

    private static JSONObject a(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, "message", s);
        u.a(jsonobject, "stackTrace", s1);
        u.b(jsonobject);
        u.a(jsonobject, "handled", String.valueOf(false));
        return jsonobject;
    }

    private static JSONObject a(Throwable throwable, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        if(throwable != null)
        {
            u.a(jsonobject, throwable);
            u.b(jsonobject, throwable);
            u.c(jsonobject, throwable);
            u.d(jsonobject, throwable);
        }
        u.b(jsonobject);
        u.a(jsonobject, "handled", String.valueOf(flag));
        return jsonobject;
    }

    private static void a(JSONObject jsonobject)
    {
        if(c.s == null || c.s.size() <= 0) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = new JSONObject();
        iterator = c.s.entrySet().iterator();
_L6:
        if(iterator.hasNext()) goto _L4; else goto _L3
_L3:
        u.a(jsonobject, "customMeta", jsonobject1);
_L2:
        return;
_L4:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        u.a(jsonobject1, (String)entry.getKey(), (String)entry.getValue());
        if(true) goto _L6; else goto _L5
_L5:
    }

    private static void a(JSONObject jsonobject, long l)
    {
        JSONObject jsonobject1 = new JSONObject();
        if(c.u)
            u.a(jsonobject1, "log", N.b());
        u.a(jsonobject1, "hacked", String.valueOf(c.i));
        u.a(jsonobject1, "msFromStart", String.valueOf(l - c.m));
        u.a(jsonobject, "log", jsonobject1);
    }

    private static void a(JSONObject jsonobject, Context context)
    {
        JSONObject jsonobject1 = new JSONObject();
        if(context != null)
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            context = (ActivityManager)context.getSystemService("activity");
            context.getMemoryInfo(memoryinfo);
            u.a(jsonobject1, "sysAvail", String.valueOf(memoryinfo.availMem));
            u.a(jsonobject1, "sysLow", String.valueOf(memoryinfo.lowMemory));
            u.a(jsonobject1, "sysThreshold", String.valueOf(memoryinfo.threshold));
            u.a(jsonobject1, "appPss", String.valueOf(context.getProcessMemoryInfo(new int[] {
                Process.myPid()
            })[0].getTotalPss() << 10));
        } else
        {
            u.a(jsonobject1, "sysAvail", "");
            u.a(jsonobject1, "sysLow", "");
            u.a(jsonobject1, "sysThreshold", "");
            u.a(jsonobject1, "appPss", "");
        }
        context = Runtime.getRuntime();
        u.a(jsonobject1, "appAvail", String.valueOf(context.freeMemory()));
        u.a(jsonobject1, "appMax", String.valueOf(context.maxMemory()));
        u.a(jsonobject1, "appTotal", String.valueOf(context.totalMemory()));
        u.a(jsonobject, "memory", jsonobject1);
    }

    private static void a(JSONObject jsonobject, String s, String s1)
    {
        try
        {
            jsonobject.put(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            return;
        }
    }

    private static void a(JSONObject jsonobject, String s, JSONObject jsonobject1)
    {
        try
        {
            jsonobject.put(s, jsonobject1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            return;
        }
    }

    private static void a(JSONObject jsonobject, Throwable throwable)
    {
        String s = throwable.getMessage();
        throwable = s;
        if(s == null)
            throwable = "";
        u.a(jsonobject, "message", throwable);
    }

    static JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        u.a(jsonobject1, "type", "remote");
        u.a(jsonobject1, "userId", c.w);
        u.a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        u.a(jsonobject, "request", jsonobject1);
        u.a(jsonobject, "environment", u.c());
        u.a(jsonobject, "sdk", u.d());
        return jsonobject;
    }

    private static JSONObject b(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, context);
        return jsonobject;
    }

    private static void b(JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        obj1 = "";
        obj = obj1;
        if(c.r == null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        if(c.r.size() <= 0) goto _L2; else goto _L3
_L3:
        obj = new StringBuilder();
        obj1 = c.r.iterator();
_L7:
        if(((Iterator) (obj1)).hasNext()) goto _L5; else goto _L4
_L4:
        ((StringBuilder) (obj)).deleteCharAt(((StringBuilder) (obj)).length() - 1);
        obj = ((StringBuilder) (obj)).toString();
_L2:
        u.a(jsonobject, "breadcrumbs", ((String) (obj)));
        return;
_L5:
        ((StringBuilder) (obj)).append(((String)((Iterator) (obj1)).next()).replaceAll("\\|", "_"));
        ((StringBuilder) (obj)).append("|");
        if(true) goto _L7; else goto _L6
_L6:
    }

    private static void b(JSONObject jsonobject, Throwable throwable)
    {
        u.a(jsonobject, "cause", throwable.getClass().getName());
    }

    private static JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, "uid", c.f);
        u.a(jsonobject, "model", c.e);
        u.a(jsonobject, "brand", c.d);
        u.a(jsonobject, "appVer", c.c);
        u.a(jsonobject, "appVerCode", c.g);
        u.a(jsonobject, "appName", c.b);
        u.a(jsonobject, "osVer", c.h);
        u.a(jsonobject, "locale", Locale.getDefault().getDisplayLanguage(Locale.US));
        u.a(jsonobject, "optOutCrashLog", String.valueOf(c.N));
        return jsonobject;
    }

    private static void c(JSONObject jsonobject, Throwable throwable)
    {
        JSONObject jsonobject1 = new JSONObject();
        throwable = throwable.getStackTrace();
        if(throwable != null && throwable.length > 1 && throwable[0] != null)
        {
            u.a(jsonobject1, "file", throwable[0].getFileName());
            u.a(jsonobject1, "line", String.valueOf(throwable[0].getLineNumber()));
            u.a(jsonobject1, "class", throwable[0].getClassName());
            u.a(jsonobject1, "method", throwable[0].getMethodName());
        }
        u.a(jsonobject, "location", jsonobject1);
    }

    private static JSONObject d()
    {
        JSONObject jsonobject = new JSONObject();
        u.a(jsonobject, "name", "SmartBeat-Android");
        u.a(jsonobject, "version", "1.8.1");
        return jsonobject;
    }

    private static void d(JSONObject jsonobject, Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        u.a(jsonobject, "stackTrace", stringwriter.toString());
    }
}
