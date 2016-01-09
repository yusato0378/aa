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
import java.io.*;
import java.net.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.smrtbeat:
//            v, P, N, c

class u
{

    u()
    {
    }

    public u(String s, List list)
    {
        b = s;
        c = list;
    }

    private static String a(v v1)
    {
        StringBuffer stringbuffer = (new StringBuffer("------------V2ymHFg03ehbqgZCaKO6jy")).append("\r\n");
        stringbuffer.append("Content-Disposition: form-data; name=\"").append(v1.a()).append("\"; filename=\"").append(v1.b()).append("\"\r\nContent-Type: ").append("application/octet-stream").append("\r\n\r\n");
        return stringbuffer.toString();
    }

    private static String a(InputStream inputstream)
    {
        Object obj4 = null;
        Object obj1 = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"), 8192);
        Object obj = obj1;
        Object obj2 = new StringBuilder();
_L3:
        obj = obj1;
        String s = ((BufferedReader) (obj1)).readLine();
        if(s != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        obj2 = ((StringBuilder) (obj2)).toString();
        Object obj3;
        obj = obj2;
        try
        {
            inputstream.close();
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(InputStream inputstream)
        {
            N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
                inputstream.getMessage()
            }));
            return ((String) (obj));
        }
_L5:
        return ((String) (obj));
_L2:
        obj = obj1;
        ((StringBuilder) (obj2)).append(s).append("\n");
          goto _L3
        obj3;
_L9:
        obj = obj1;
        N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
            ((UnsupportedEncodingException) (obj3)).getMessage()
        }));
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(InputStream inputstream)
        {
            N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
                inputstream.getMessage()
            }));
            return null;
        }
        obj = obj4;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_64;
        ((BufferedReader) (obj1)).close();
        return null;
        obj3;
        obj1 = null;
_L8:
        obj = obj1;
        N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
            ((IOException) (obj3)).getMessage()
        }));
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(InputStream inputstream)
        {
            N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
                inputstream.getMessage()
            }));
            return null;
        }
        obj = obj4;
        if(obj1 == null) goto _L5; else goto _L4
_L4:
        ((BufferedReader) (obj1)).close();
        return null;
        obj1;
        obj = null;
_L7:
        inputstream.close();
        if(obj != null)
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(InputStream inputstream)
            {
                N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
                    inputstream.getMessage()
                }));
            }
        throw obj1;
        obj1;
        if(true) goto _L7; else goto _L6
_L6:
        obj3;
          goto _L8
        obj3;
        obj1 = null;
          goto _L9
    }

    static JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        a(jsonobject1, "type", "ping");
        a(jsonobject1, "userId", c.w);
        a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        a(jsonobject, "request", jsonobject1);
        a(jsonobject, "environment", c());
        a(jsonobject, "sdk", d());
        return jsonobject;
    }

    private static JSONObject a(long l)
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "type", "breakpad-exception-report");
        a(jsonobject, "userId", c.w);
        a(jsonobject, "requestId", c.o);
        a(jsonobject, "occuredAt", String.valueOf(l));
        return jsonobject;
    }

    private static JSONObject a(long l, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "userId", c.w);
        if(!flag)
            a(jsonobject, "requestId", c.o);
        a(jsonobject, "occuredAt", String.valueOf(l));
        return jsonobject;
    }

    static JSONObject a(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        long l = System.currentTimeMillis();
        JSONObject jsonobject1 = new JSONObject();
        a(jsonobject1, "type", "breakpad-exception-report");
        a(jsonobject1, "userId", c.w);
        a(jsonobject1, "requestId", c.o);
        a(jsonobject1, "occuredAt", String.valueOf(l));
        a(jsonobject, "request", jsonobject1);
        a(jsonobject, "exception", a(((Throwable) (null)), false));
        a(jsonobject, "performance", b(context));
        a(jsonobject, "environment", a(context, l));
        a(jsonobject, "sdk", d());
        return jsonobject;
    }

    private static JSONObject a(Context context, long l)
    {
        JSONObject jsonobject = c();
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
        a(jsonobject, "runningApps", ((String) (obj)));
        a(jsonobject, "mobileNet", N.c(context));
        a(jsonobject, "wifi", N.d(context));
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context.getRotation();
        JVM INSTR tableswitch 0 3: default 124
    //                   0 392
    //                   1 399
    //                   2 406
    //                   3 413;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        context = (new StringBuilder("unknown:")).append(String.valueOf(context.getRotation())).toString();
_L9:
        a(jsonobject, "screenRotation", ((String) (context)));
_L2:
        a(jsonobject, "screenDpi", String.valueOf(c.j));
        a(jsonobject, "screenWidth", String.valueOf(c.k));
        a(jsonobject, "screenHeight", String.valueOf(c.l));
        a(jsonobject, "board", Build.BOARD);
        a(jsonobject, "boardPlatform", N.a(com.smrtbeat.c.a(), "ro.board.platform"));
        obj = Build.CPU_ABI;
        context = ((Context) (obj));
        if(Build.CPU_ABI2 != null)
        {
            context = ((Context) (obj));
            if(Build.CPU_ABI2.length() > 0)
                context = (new StringBuilder(String.valueOf(obj))).append(" / ").append(Build.CPU_ABI2).toString();
        }
        a(jsonobject, "cpuAbi", ((String) (context)));
        a(jsonobject, "manufacturer", Build.MANUFACTURER);
        a(jsonobject, "buildType", Build.TYPE);
        context = new JSONObject();
        if(c.u)
            a(((JSONObject) (context)), "log", N.b());
        a(((JSONObject) (context)), "hacked", String.valueOf(c.i));
        a(((JSONObject) (context)), "msFromStart", String.valueOf(l - c.m));
        a(jsonobject, "log", ((JSONObject) (context)));
        a(jsonobject);
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
        JSONObject jsonobject1 = a(l, false);
        a(jsonobject1, "type", "unity-exception-report");
        a(jsonobject1, "requestId", s2);
        a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        a(jsonobject, "request", jsonobject1);
        s2 = new JSONObject();
        a(((JSONObject) (s2)), "message", s);
        a(((JSONObject) (s2)), "stackTrace", s1);
        b(s2);
        a(((JSONObject) (s2)), "handled", String.valueOf(false));
        a(jsonobject, "exception", ((JSONObject) (s2)));
        a(jsonobject, "performance", b(context));
        a(jsonobject, "environment", a(context, l));
        a(jsonobject, "sdk", d());
        return jsonobject;
    }

    static JSONObject a(Context context, Throwable throwable, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        long l = System.currentTimeMillis();
        JSONObject jsonobject1 = a(l, flag);
        a(jsonobject1, "type", "exception-report");
        a(jsonobject, "request", jsonobject1);
        a(jsonobject, "exception", a(throwable, flag));
        a(jsonobject, "performance", b(context));
        a(jsonobject, "environment", a(context, l));
        a(jsonobject, "sdk", d());
        return jsonobject;
    }

    private static JSONObject a(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "message", s);
        a(jsonobject, "stackTrace", s1);
        b(jsonobject);
        a(jsonobject, "handled", String.valueOf(false));
        return jsonobject;
    }

    private static JSONObject a(Throwable throwable, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        if(throwable != null)
        {
            String s = throwable.getMessage();
            Object obj = s;
            if(s == null)
                obj = "";
            a(jsonobject, "message", ((String) (obj)));
            a(jsonobject, "cause", throwable.getClass().getName());
            obj = new JSONObject();
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            if(astacktraceelement != null && astacktraceelement.length > 1 && astacktraceelement[0] != null)
            {
                a(((JSONObject) (obj)), "file", astacktraceelement[0].getFileName());
                a(((JSONObject) (obj)), "line", String.valueOf(astacktraceelement[0].getLineNumber()));
                a(((JSONObject) (obj)), "class", astacktraceelement[0].getClassName());
                a(((JSONObject) (obj)), "method", astacktraceelement[0].getMethodName());
            }
            a(jsonobject, "location", ((JSONObject) (obj)));
            obj = new StringWriter();
            throwable.printStackTrace(new PrintWriter(((java.io.Writer) (obj))));
            a(jsonobject, "stackTrace", ((StringWriter) (obj)).toString());
        }
        b(jsonobject);
        a(jsonobject, "handled", String.valueOf(flag));
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
        a(jsonobject, "customMeta", jsonobject1);
_L2:
        return;
_L4:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        a(jsonobject1, (String)entry.getKey(), (String)entry.getValue());
        if(true) goto _L6; else goto _L5
_L5:
    }

    private static void a(JSONObject jsonobject, long l)
    {
        JSONObject jsonobject1 = new JSONObject();
        if(c.u)
            a(jsonobject1, "log", N.b());
        a(jsonobject1, "hacked", String.valueOf(c.i));
        a(jsonobject1, "msFromStart", String.valueOf(l - c.m));
        a(jsonobject, "log", jsonobject1);
    }

    private static void a(JSONObject jsonobject, Context context)
    {
        JSONObject jsonobject1 = new JSONObject();
        if(context != null)
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            context = (ActivityManager)context.getSystemService("activity");
            context.getMemoryInfo(memoryinfo);
            a(jsonobject1, "sysAvail", String.valueOf(memoryinfo.availMem));
            a(jsonobject1, "sysLow", String.valueOf(memoryinfo.lowMemory));
            a(jsonobject1, "sysThreshold", String.valueOf(memoryinfo.threshold));
            a(jsonobject1, "appPss", String.valueOf(context.getProcessMemoryInfo(new int[] {
                Process.myPid()
            })[0].getTotalPss() << 10));
        } else
        {
            a(jsonobject1, "sysAvail", "");
            a(jsonobject1, "sysLow", "");
            a(jsonobject1, "sysThreshold", "");
            a(jsonobject1, "appPss", "");
        }
        context = Runtime.getRuntime();
        a(jsonobject1, "appAvail", String.valueOf(context.freeMemory()));
        a(jsonobject1, "appMax", String.valueOf(context.maxMemory()));
        a(jsonobject1, "appTotal", String.valueOf(context.totalMemory()));
        a(jsonobject, "memory", jsonobject1);
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
        a(jsonobject, "message", ((String) (throwable)));
    }

    private static byte[] a(File file)
    {
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        abyte0 = new byte[10];
        bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj = new FileInputStream(file);
_L2:
        file = ((File) (obj));
        int i = ((FileInputStream) (obj)).read(abyte0);
        Object obj1;
label0:
        {
            {
                if(i > 0)
                    break label0;
                try
                {
                    bytearrayoutputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch(File file) { }
                try
                {
                    ((FileInputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch(File file) { }
            }
            return bytearrayoutputstream.toByteArray();
        }
        file = ((File) (obj));
        bytearrayoutputstream.write(abyte0);
        if(true) goto _L2; else goto _L1
_L1:
        obj1;
_L8:
        file = ((File) (obj));
        N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
            ((FileNotFoundException) (obj1)).getMessage()
        }));
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(File file) { }
        if(obj != null)
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(File file) { }
        break MISSING_BLOCK_LABEL_44;
        obj1;
        obj = null;
_L6:
        file = ((File) (obj));
        N.a(P.a, String.format("HttpMultipartRequest:%s", new Object[] {
            ((IOException) (obj1)).getMessage()
        }));
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(File file) { }
        if(obj != null)
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(File file) { }
        break MISSING_BLOCK_LABEL_44;
        obj;
        file = null;
_L4:
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        if(file != null)
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch(File file) { }
        throw obj;
        obj;
        if(true) goto _L4; else goto _L3
_L3:
        obj1;
        if(true) goto _L6; else goto _L5
_L5:
        obj1;
        obj = null;
        if(true) goto _L8; else goto _L7
_L7:
    }

    static JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        a(jsonobject1, "type", "remote");
        a(jsonobject1, "userId", c.w);
        a(jsonobject1, "occuredAt", String.valueOf(System.currentTimeMillis()));
        a(jsonobject, "request", jsonobject1);
        a(jsonobject, "environment", c());
        a(jsonobject, "sdk", d());
        return jsonobject;
    }

    private static JSONObject b(Context context)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        if(context != null)
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            context = (ActivityManager)context.getSystemService("activity");
            context.getMemoryInfo(memoryinfo);
            a(jsonobject1, "sysAvail", String.valueOf(memoryinfo.availMem));
            a(jsonobject1, "sysLow", String.valueOf(memoryinfo.lowMemory));
            a(jsonobject1, "sysThreshold", String.valueOf(memoryinfo.threshold));
            a(jsonobject1, "appPss", String.valueOf(context.getProcessMemoryInfo(new int[] {
                Process.myPid()
            })[0].getTotalPss() << 10));
        } else
        {
            a(jsonobject1, "sysAvail", "");
            a(jsonobject1, "sysLow", "");
            a(jsonobject1, "sysThreshold", "");
            a(jsonobject1, "appPss", "");
        }
        context = Runtime.getRuntime();
        a(jsonobject1, "appAvail", String.valueOf(context.freeMemory()));
        a(jsonobject1, "appMax", String.valueOf(context.maxMemory()));
        a(jsonobject1, "appTotal", String.valueOf(context.totalMemory()));
        a(jsonobject, "memory", jsonobject1);
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
        a(jsonobject, "breadcrumbs", ((String) (obj)));
        return;
_L5:
        ((StringBuilder) (obj)).append(((String)((Iterator) (obj1)).next()).replaceAll("\\|", "_"));
        ((StringBuilder) (obj)).append("|");
        if(true) goto _L7; else goto _L6
_L6:
    }

    private static void b(JSONObject jsonobject, Throwable throwable)
    {
        a(jsonobject, "cause", throwable.getClass().getName());
    }

    private static JSONObject c()
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "uid", c.f);
        a(jsonobject, "model", c.e);
        a(jsonobject, "brand", c.d);
        a(jsonobject, "appVer", c.c);
        a(jsonobject, "appVerCode", c.g);
        a(jsonobject, "appName", c.b);
        a(jsonobject, "osVer", c.h);
        a(jsonobject, "locale", Locale.getDefault().getDisplayLanguage(Locale.US));
        a(jsonobject, "optOutCrashLog", String.valueOf(c.N));
        return jsonobject;
    }

    private static void c(JSONObject jsonobject, Throwable throwable)
    {
        JSONObject jsonobject1 = new JSONObject();
        throwable = throwable.getStackTrace();
        if(throwable != null && throwable.length > 1 && throwable[0] != null)
        {
            a(jsonobject1, "file", throwable[0].getFileName());
            a(jsonobject1, "line", String.valueOf(throwable[0].getLineNumber()));
            a(jsonobject1, "class", throwable[0].getClassName());
            a(jsonobject1, "method", throwable[0].getMethodName());
        }
        a(jsonobject, "location", jsonobject1);
    }

    private static JSONObject d()
    {
        JSONObject jsonobject = new JSONObject();
        a(jsonobject, "name", "SmartBeat-Android");
        a(jsonobject, "version", "1.8.1");
        return jsonobject;
    }

    private static void d(JSONObject jsonobject, Throwable throwable)
    {
        StringWriter stringwriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringwriter));
        a(jsonobject, "stackTrace", stringwriter.toString());
    }

    public final String a(int i)
    {
        Object obj;
        Object obj1;
        OutputStream outputstream;
        Object obj2;
        obj1 = null;
        obj = null;
        obj2 = null;
        outputstream = null;
        if(c.a.length() > 0) goto _L2; else goto _L1
_L1:
        N.a(P.a, "Data cannot send due to invalide api key.");
        obj1 = "";
_L13:
        return ((String) (obj1));
_L2:
        URLConnection urlconnection = (new URL(b)).openConnection();
        obj1 = outputstream;
        obj = obj2;
        urlconnection.setReadTimeout(i);
        obj1 = outputstream;
        obj = obj2;
        urlconnection.setConnectTimeout(i);
        obj1 = outputstream;
        obj = obj2;
        urlconnection.addRequestProperty("X-SmartBeat-Api-Key", c.a);
        obj1 = outputstream;
        obj = obj2;
        urlconnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=----------V2ymHFg03ehbqgZCaKO6jy");
        obj1 = outputstream;
        obj = obj2;
        ((HttpURLConnection)urlconnection).setRequestMethod("POST");
        obj1 = outputstream;
        obj = obj2;
        urlconnection.setDoOutput(true);
        obj1 = outputstream;
        obj = obj2;
        urlconnection.connect();
        obj1 = outputstream;
        obj = obj2;
        outputstream = urlconnection.getOutputStream();
        obj1 = outputstream;
        obj = outputstream;
        if(c == null) goto _L4; else goto _L3
_L3:
        obj1 = outputstream;
        obj = outputstream;
        obj2 = c.iterator();
_L7:
        obj1 = outputstream;
        obj = outputstream;
        if(((Iterator) (obj2)).hasNext()) goto _L5; else goto _L4
_L4:
        obj1 = outputstream;
        obj = outputstream;
        outputstream.write("------------V2ymHFg03ehbqgZCaKO6jy--\r\n".getBytes());
        obj1 = outputstream;
        obj = outputstream;
        obj2 = a(urlconnection.getInputStream());
        obj = obj2;
        if(urlconnection != null)
            ((HttpURLConnection)urlconnection).disconnect();
        obj1 = obj;
        if(outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj1)
            {
                return ((String) (obj));
            }
            return ((String) (obj));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        obj1 = outputstream;
        obj = outputstream;
        v v1 = (v)((Iterator) (obj2)).next();
        obj1 = outputstream;
        obj = outputstream;
        StringBuffer stringbuffer = (new StringBuffer("------------V2ymHFg03ehbqgZCaKO6jy")).append("\r\n");
        obj1 = outputstream;
        obj = outputstream;
        stringbuffer.append("Content-Disposition: form-data; name=\"").append(v1.a()).append("\"; filename=\"").append(v1.b()).append("\"\r\nContent-Type: ").append("application/octet-stream").append("\r\n\r\n");
        obj1 = outputstream;
        obj = outputstream;
        outputstream.write(stringbuffer.toString().getBytes());
        obj1 = outputstream;
        obj = outputstream;
        outputstream.write(a(v1.c()));
        obj1 = outputstream;
        obj = outputstream;
        outputstream.write("\r\n".getBytes());
        if(true) goto _L7; else goto _L6
_L6:
        obj;
_L11:
        N.a(P.d, (new StringBuilder("failed to send data")).append(((Exception) (obj)).toString()).toString());
        if(urlconnection != null)
            ((HttpURLConnection)urlconnection).disconnect();
        Exception exception;
        if(obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj)
            {
                return "";
            }
            return "";
        } else
        {
            return "";
        }
        exception;
        urlconnection = null;
_L9:
        if(urlconnection != null)
            ((HttpURLConnection)urlconnection).disconnect();
        if(obj != null)
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        throw exception;
        exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = obj1;
        if(true) goto _L9; else goto _L8
_L8:
        obj;
        urlconnection = null;
        if(true) goto _L11; else goto _L10
_L10:
        if(true) goto _L13; else goto _L12
_L12:
    }

    private static final String a = "----------V2ymHFg03ehbqgZCaKO6jy";
    private String b;
    private List c;
}
