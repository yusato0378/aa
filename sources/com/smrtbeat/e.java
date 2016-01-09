// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.io.*;
import java.util.*;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.*;

// Referenced classes of package com.smrtbeat:
//            c, N, f, P, 
//            m, j, M, k, 
//            n, l, p, i, 
//            h, o, v, u, 
//            g

final class e
{

    e()
    {
    }

    static String a(String s1, JSONObject jsonobject)
    {
        return b(s1, jsonobject);
    }

    static void a()
    {
        boolean flag1 = true;
        if(c.A) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        boolean flag;
        if((obj = com.smrtbeat.c.a()) == null)
            continue; /* Loop/switch isn't completed */
        obj = N.f(((android.content.Context) (obj)));
        long l1;
        long l2;
        if(c.O)
            flag = false;
        else
            flag = true;
        if(!flag)
            break; /* Loop/switch isn't completed */
        l1 = N.c(((SharedPreferences) (obj)));
        l2 = SystemClock.elapsedRealtime();
        if(l1 != 0L && l2 - l1 <= 0x1499700L && l1 <= l2 || b)
            break; /* Loop/switch isn't completed */
        flag = flag1;
_L4:
        if(flag)
        {
            (new Thread((new f()).a(((SharedPreferences) (obj))))).start();
            return;
        }
        if(true) goto _L1; else goto _L3
_L3:
        flag = false;
          goto _L4
        if(true) goto _L1; else goto _L5
_L5:
    }

    private static void a(File file)
    {
        file = file.listFiles();
        if(file != null)
        {
            int j1 = file.length;
            int i1 = 0;
            while(i1 < j1) 
            {
                File file1 = file[i1];
                if(file1 != null && file1.isFile())
                {
                    String s1 = c(file1);
                    if(s1.length() > 0)
                        try
                        {
                            if(c(new JSONObject(s1)))
                                file1.delete();
                        }
                        catch(JSONException jsonexception) { }
                }
                i1++;
            }
        }
    }

    static void a(JSONObject jsonobject)
    {
label0:
        {
            if(!c(jsonobject))
            {
                String as[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/exception/").toString())).list();
                int i1 = 0;
                if(as != null)
                    i1 = as.length;
                if(i1 < c.C)
                    break label0;
                N.a(P.c, "Dropped ExceptionData due to Event full");
            }
            return;
        }
        b(jsonobject, (new StringBuilder(String.valueOf(c.n))).append("/exception/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
    }

    static void a(JSONObject jsonobject, long l1)
    {
label0:
        {
            (new Thread(new m())).start();
            N.a(P.c, "SendCrashEvent");
            if(!M.a((new j()).a(jsonobject), 5000L))
            {
                if(k() < c.C)
                    break label0;
                N.a(P.c, "Dropped CrashData due to Event full");
            }
            return;
        }
        b(jsonobject, (new StringBuilder(String.valueOf(c.n))).append("/crash/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
    }

    static void a(JSONObject jsonobject, File file, long l1)
    {
        h();
        File file1 = new File((new StringBuilder(String.valueOf(c.n))).append("/dump_tmp/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
        c(jsonobject, file1.getAbsolutePath());
        jsonobject = new File((new StringBuilder(String.valueOf(c.n))).append("/dump/").append(c.o).append("/").append(c.o).append(".dmp").toString());
        boolean flag1 = M.a((new k()).a(file1, file, jsonobject), 5000L);
        boolean flag;
        if(k() >= c.C)
            flag = true;
        else
            flag = false;
        if(flag1 || flag)
        {
            file.delete();
            file1.delete();
            return;
        } else
        {
            File file2 = new File((new StringBuilder(String.valueOf(c.n))).append("/dump/").append(c.o).append("/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
            file2.getParentFile().mkdirs();
            file1.renameTo(file2);
            file.renameTo(jsonobject);
            return;
        }
    }

    static void a(JSONObject jsonobject, String s1)
    {
        c(jsonobject, s1);
    }

    static void a(boolean flag)
    {
        b = flag;
    }

    private static boolean a(SharedPreferences sharedpreferences)
    {
        boolean flag;
        if(c.O)
            flag = false;
        else
            flag = true;
        if(flag)
        {
            long l1 = N.c(sharedpreferences);
            long l2 = SystemClock.elapsedRealtime();
            if((l1 == 0L || l2 - l1 > 0x1499700L || l1 > l2) && !b)
                return true;
        }
        return false;
    }

    static boolean a(File file, long l1)
    {
        if(file == null || !file.exists())
            return true;
        if(!N.i())
            return false;
        else
            return M.a((new n()).a(file), l1);
    }

    private static boolean a(File file, File afile[])
    {
        if(afile != null)
        {
            file = (new StringBuilder(String.valueOf(file.getName()))).append(".id").toString();
            int j1 = afile.length;
            int i1 = 0;
            while(i1 < j1) 
            {
                if(afile[i1].getName().contentEquals(file))
                    return true;
                i1++;
            }
        }
        return false;
    }

    static boolean a(String s1)
    {
        return b(s1);
    }

    static boolean a(String s1, String s2)
    {
        return b(s1, s2);
    }

    static boolean a(JSONObject jsonobject, String s1, boolean flag)
    {
        return b(jsonobject, s1, false);
    }

    private static String b(String s1, JSONObject jsonobject)
    {
label0:
        {
            if(c.a.length() <= 0)
            {
                N.a(P.a, "Data cannot send due to invalide api key.");
                return "";
            }
            DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            HttpProtocolParams.setUseExpectContinue(httpparams, false);
            HttpConnectionParams.setConnectionTimeout(httpparams, 20000);
            HttpConnectionParams.setSoTimeout(httpparams, 20000);
            s1 = new HttpPost(s1);
            s1.addHeader("X-SmartBeat-Api-Key", c.a);
            s1.addHeader("Content-Type", "application/json");
            try
            {
                s1.setEntity(new StringEntity(jsonobject.toString(), "UTF-8"));
                s1 = defaulthttpclient.execute(s1);
                if(s1.getStatusLine().getStatusCode() != 200)
                    break label0;
                s1 = (String)(new BasicResponseHandler()).handleResponse(s1);
            }
            // Misplaced declaration of an exception variable
            catch(String s1)
            {
                return "";
            }
            return s1;
        }
        return "";
    }

    static void b()
    {
        boolean flag1 = true;
        if(c.Q == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = com.smrtbeat.c.a();
        if(obj != null) goto _L4; else goto _L3
_L3:
        N.a(P.a, "failed to check remote controle due to context is null");
_L8:
        boolean flag = false;
_L6:
        if(flag)
        {
            f();
            return;
        }
          goto _L1
_L4:
        long l1;
        long l2;
        long l3;
        obj = N.f(((android.content.Context) (obj)));
        l1 = N.b(((SharedPreferences) (obj)));
        l2 = N.d(((SharedPreferences) (obj)));
        l3 = System.currentTimeMillis();
        if(l3 <= l1)
            continue; /* Loop/switch isn't completed */
        flag = flag1;
        if(l3 - l2 > l1) goto _L6; else goto _L5
_L5:
        if(l3 >= l1 - 0x36ee80L) goto _L8; else goto _L7
_L7:
        flag = flag1;
          goto _L6
    }

    private static void b(File file)
    {
        File afile[] = file.listFiles();
        if(afile == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = afile.length;
        i1 = 0;
_L5:
        if(i1 < j1) goto _L3; else goto _L2
_L2:
        file.delete();
        return;
_L3:
        b(afile[i1]);
        i1++;
        if(true) goto _L5; else goto _L4
_L4:
    }

    private static void b(JSONObject jsonobject, String s1)
    {
        (new Thread((new l()).a(s1, jsonobject))).start();
    }

    private static boolean b(String s1)
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            flag1 = "OK".equals((new JSONObject(s1)).get("status"));
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            return false;
        }
        if(flag1)
            flag = true;
        return flag;
    }

    private static boolean b(String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = false;
        int i1;
        boolean flag2;
        try
        {
            s1 = (new JSONObject(s1)).getJSONArray("filesSaved");
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            return flag1;
        }
        i1 = 0;
        flag1 = flag;
        if(i1 >= s1.length())
            return flag;
        flag1 = flag;
        flag2 = s2.equals(s1.get(i1));
        if(flag2)
            flag = true;
        i1++;
        if(false)
            ;
        else
            break MISSING_BLOCK_LABEL_22;
    }

    static boolean b(JSONObject jsonobject)
    {
        return c(jsonobject);
    }

    private static boolean b(JSONObject jsonobject, String s1, boolean flag)
    {
        boolean flag1;
        try
        {
            flag1 = "true".equalsIgnoreCase(jsonobject.getString(s1));
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            return flag;
        }
        if(flag1)
            flag = true;
        return flag;
    }

    private static String c(File file)
    {
        String s1 = "";
        file = new BufferedReader(new InputStreamReader(new FileInputStream(file)), 8192);
        Object obj;
        StringBuffer stringbuffer;
        stringbuffer = new StringBuffer();
        obj = file.readLine();
_L2:
        if(obj != null)
            break MISSING_BLOCK_LABEL_58;
        obj = stringbuffer.toString();
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch(File file)
        {
            return ((String) (obj));
        }
        return ((String) (obj));
        stringbuffer.append(((String) (obj)));
        obj = file.readLine();
        if(true) goto _L2; else goto _L1
_L1:
        file;
        file = null;
_L6:
        obj = s1;
        if(file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch(File file)
            {
                return "";
            }
            return "";
        } else
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj;
        file = null;
_L4:
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
        Throwable throwable;
        throwable;
        if(true) goto _L6; else goto _L5
_L5:
    }

    static void c()
    {
        (new Thread(new p())).start();
    }

    private static void c(JSONObject jsonobject, String s1)
    {
        s1 = new File(s1);
        s1.getParentFile().mkdirs();
        try
        {
            s1.createNewFile();
            s1 = new BufferedWriter(new FileWriter(s1), 8192);
            s1.write(jsonobject.toString());
            s1.flush();
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(JSONObject jsonobject)
        {
            return;
        }
    }

    private static boolean c(JSONObject jsonobject)
    {
        return b(b("https://api.smbeat.jp/api/errors", jsonobject));
    }

    static void d()
    {
        h();
    }

    private static void d(JSONObject jsonobject)
    {
        if(k() >= c.C)
        {
            N.a(P.c, "Dropped CrashData due to Event full");
            return;
        } else
        {
            b(jsonobject, (new StringBuilder(String.valueOf(c.n))).append("/crash/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
            return;
        }
    }

    static void e()
    {
        j();
    }

    private static void e(JSONObject jsonobject)
    {
        String as[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/exception/").toString())).list();
        int i1 = 0;
        if(as != null)
            i1 = as.length;
        if(i1 >= c.C)
        {
            N.a(P.c, "Dropped ExceptionData due to Event full");
            return;
        } else
        {
            b(jsonobject, (new StringBuilder(String.valueOf(c.n))).append("/exception/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString());
            return;
        }
    }

    private static void f()
    {
        com/smrtbeat/e;
        JVM INSTR monitorenter ;
        Thread thread = c.Q;
        if(thread == null) goto _L2; else goto _L1
_L1:
        com/smrtbeat/e;
        JVM INSTR monitorexit ;
        return;
_L2:
        Thread thread1 = new Thread(new i());
        c.Q = thread1;
        thread1.start();
        if(true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean g()
    {
        Object obj = com.smrtbeat.c.a();
        if(obj == null)
        {
            N.a(P.a, "failed to check remote controle due to context is null");
        } else
        {
            obj = N.f(((android.content.Context) (obj)));
            long l1 = N.b(((SharedPreferences) (obj)));
            long l2 = N.d(((SharedPreferences) (obj)));
            long l3 = System.currentTimeMillis();
            if(l3 > l1 && l3 - l2 > l1)
                return true;
            if(l3 < l1 - 0x36ee80L)
                return true;
        }
        return false;
    }

    private static void h()
    {
        String as[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/").toString())).list(new h());
        int i1 = 0;
        if(as != null)
            i1 = as.length;
        if(i1 >= c.C)
        {
            N.a(P.c, "Dropped CaputredImages due to Event full");
            return;
        }
        File file = new File((new StringBuilder(String.valueOf(c.n))).append("/").append(c.o).append(".id").toString());
        file.getParentFile().mkdirs();
        try
        {
            file.createNewFile();
            return;
        }
        catch(IOException ioexception)
        {
            return;
        }
    }

    private static void i()
    {
        (new Thread(new m())).start();
    }

    private static void j()
    {
        com/smrtbeat/e;
        JVM INSTR monitorenter ;
        boolean flag;
        b(new File((new StringBuilder(String.valueOf(c.n))).append("/start/").toString()));
        flag = N.e();
        if(flag) goto _L2; else goto _L1
_L1:
        com/smrtbeat/e;
        JVM INSTR monitorexit ;
        return;
_L2:
        File afile2[];
        a(new File((new StringBuilder(String.valueOf(c.n))).append("/crash/").toString()));
        a(new File((new StringBuilder(String.valueOf(c.n))).append("/exception/").toString()));
        afile2 = (new File((new StringBuilder(String.valueOf(c.n))).append("/dump/").toString())).listFiles();
        if(afile2 == null) goto _L4; else goto _L3
_L3:
        int k1 = afile2.length;
        int i1 = 0;
          goto _L5
_L4:
        File afile[];
        File afile1[];
        afile = (new File(c.n)).listFiles(new o());
        afile1 = (new File((new StringBuilder(String.valueOf(c.n))).append("/capture/").toString())).listFiles();
        if(afile1 == null) goto _L1; else goto _L6
_L6:
        int l1 = afile1.length;
        int j1 = 0;
_L27:
        if(j1 >= l1) goto _L1; else goto _L7
_L7:
        File file2 = afile1[j1];
        if(file2.getName().equals(c.o)) goto _L9; else goto _L8
_L8:
        if(!a(file2, afile)) goto _L11; else goto _L10
_L10:
        afile2 = file2.listFiles();
        if(afile2 == null) goto _L13; else goto _L12
_L12:
        int i2 = afile2.length;
        k1 = 0;
        i1 = 0;
          goto _L14
_L25:
        if(i1 != 0) goto _L9; else goto _L15
_L15:
        b(new File((new StringBuilder(String.valueOf(c.n))).append("/").append(file2.getName()).append(".id").toString()));
_L11:
        b(file2);
          goto _L9
_L24:
        File file3 = afile2[i1];
        File afile3[] = file3.listFiles();
        if(afile3 != null) goto _L17; else goto _L16
_L16:
        flag = true;
_L19:
        if(!flag)
            break; /* Loop/switch isn't completed */
        b(file3);
        break; /* Loop/switch isn't completed */
_L17:
        l1 = afile3.length;
        j1 = 0;
        File file1 = null;
        File file = null;
        Object obj;
        Object obj1;
        for(; j1 < l1; j1++)
            break MISSING_BLOCK_LABEL_470;

        if(file == null || file1 == null)
            break MISSING_BLOCK_LABEL_540;
        obj1 = new ArrayList(2);
        ((List) (obj1)).add(new v("errors", "json.txt", file1));
        ((List) (obj1)).add(new v("minidump", file.getName(), file));
        flag = b((new u("https://minidumps.smbeat.jp/api/errors/multi", ((List) (obj1)))).a(2000));
        continue; /* Loop/switch isn't completed */
        obj1 = afile3[j1];
        if(((File) (obj1)).getName().endsWith(".dmp"))
        {
            file = ((File) (obj1));
            break MISSING_BLOCK_LABEL_654;
        }
        if(((File) (obj1)).getName().endsWith(".dat"))
            file1 = ((File) (obj1));
        break MISSING_BLOCK_LABEL_654;
        obj;
        N.a(P.c, String.format("failed to send dump: %s", new Object[] {
            ((Exception) (obj)).toString()
        }));
        flag = false;
        continue; /* Loop/switch isn't completed */
        if(!file3.getAbsolutePath().contains(c.o))
            flag = true;
        else
            flag = false;
        if(true) goto _L19; else goto _L18
_L26:
        file3 = afile2[k1];
        if(!a(file3, 0L)) goto _L21; else goto _L20
_L20:
        b(file3);
_L23:
        k1++;
        continue; /* Loop/switch isn't completed */
_L21:
        i1 = 1;
        if(true) goto _L23; else goto _L22
_L22:
        obj;
        throw obj;
_L13:
        i1 = 0;
        break; /* Loop/switch isn't completed */
_L5:
        if(i1 < k1) goto _L24; else goto _L4
_L14:
        if(k1 < i2) goto _L26; else goto _L25
_L9:
        j1++;
          goto _L27
_L18:
        i1++;
          goto _L5
    }

    private static int k()
    {
        Object aobj[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/crash/").toString())).list();
        int i1 = 0;
        if(aobj != null)
            i1 = aobj.length;
        aobj = (new File((new StringBuilder(String.valueOf(c.n))).append("/dump/").toString())).listFiles(new g());
        int j1 = i1;
        if(aobj != null)
            j1 = i1 + aobj.length;
        return j1;
    }

    private static String l()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/crash/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString();
    }

    private static String m()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/dump_tmp/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString();
    }

    private static String n()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/dump/").append(c.o).append("/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString();
    }

    private static String o()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/dump/").append(c.o).append("/").append(c.o).append(".dmp").toString();
    }

    private static int p()
    {
        String as[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/exception/").toString())).list();
        int i1 = 0;
        if(as != null)
            i1 = as.length;
        return i1;
    }

    private static String q()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/exception/").append(String.valueOf(System.currentTimeMillis())).append("-").append(String.valueOf((new Random(System.currentTimeMillis())).nextInt())).append(".dat").toString();
    }

    private static int r()
    {
        String as[] = (new File((new StringBuilder(String.valueOf(c.n))).append("/").toString())).list(new h());
        int i1 = 0;
        if(as != null)
            i1 = as.length;
        return i1;
    }

    private static String s()
    {
        return (new StringBuilder(String.valueOf(c.n))).append("/").append(c.o).append(".id").toString();
    }

    private static final String a = ".id";
    private static boolean b = false;
    private static final long c = 0x36ee80L;

    static 
    {
        b = false;
    }
}
