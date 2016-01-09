// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import jp.appAdForce.android.AdManager;
import jp.co.dimage.android.b;
import jp.co.dimage.android.c;
import jp.co.dimage.android.k;
import jp.co.dimage.android.l;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package jp.co.cyberz.fox.analytics.base:
//            f, a, c, g, 
//            b, d

public final class e
    implements jp.co.dimage.android.e
{

    private e(AdManager admanager)
    {
        bg = 0;
        admanager = admanager.a();
        d = admanager.p();
        f = admanager.o();
        g = admanager.w();
        h = admanager.m();
        m = admanager.k();
        Context context = admanager.l();
        bj = context.getFilesDir();
        i = "v2.15.7g";
        Object obj;
        String s;
        try
        {
            obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch(AdManager admanager)
        {
            Log.d("F.O.X-ANALYTICS", (new StringBuilder()).append("loadApplicationInfo faild. ").append(admanager.getMessage()).toString());
            return;
        }
        if(obj == null)
            Log.d("F.O.X-ANALYTICS", "ApplicationInfo is null.");
        d = a(((ApplicationInfo) (obj)), "APPADFORCE_APP_ID");
        e = a(((ApplicationInfo) (obj)), "ANALYTICS_APP_KEY");
        s = a(((ApplicationInfo) (obj)), "ANALYTICS_SERVER_URL");
        if(s != null && s.length() > 0)
        {
            j = s;
            try
            {
                j = jp.co.cyberz.fox.analytics.base.f.a(j);
            }
            catch(Exception exception)
            {
                Log.d("F.O.X-ANALYTICS", "server url is broken");
            }
        }
        try
        {
            bg = Integer.valueOf(a(((ApplicationInfo) (obj)), "ANALYTICS_QUEUE_INTERVAL")).intValue();
        }
        catch(Exception exception1) { }
        s = a(((ApplicationInfo) (obj)), "ANALYTICS_ENCRYPT");
        if(s != null && s.length() > 0)
            k = s;
        obj = a(((ApplicationInfo) (obj)), "ANALYTICS_DEBUG");
        if(obj != null && ((String) (obj)).length() > 0)
            l = ((String) (obj));
        Log.d("F.O.X-ANALYTICS", (new StringBuilder()).append("APP ID ").append(d).toString());
        Log.d("F.O.X-ANALYTICS", (new StringBuilder()).append("debug mode ").append(l).toString());
        jp.co.dimage.android.l.a(context.getApplicationContext());
        if(jp.co.dimage.android.c.a.c == admanager.y())
            jp.co.dimage.android.b.a(context, null);
        j();
    }

    private static String a(ApplicationInfo applicationinfo, String s)
    {
        applicationinfo = ((ApplicationInfo) (applicationinfo.metaData.get(s)));
        if(applicationinfo == null)
            return "";
        else
            return applicationinfo.toString();
    }

    static List a(e e1, List list)
    {
        return e1.b(list);
    }

    private static a a(String s)
    {
        a a1 = new a();
        a1.n(s);
        return a1;
    }

    public static e a(AdManager admanager)
    {
        if(be == null)
            be = new e(admanager);
        return be;
    }

    public static void a()
    {
        if(b != null)
            b.a(true);
        c();
    }

    private void a(Context context, a a1)
    {
        if("4".equals(c(context)))
        {
            (new k(context)).a(null, false, false, true, true, new jp.co.dimage.android.k.c(a1) {

                public void a()
                {
                    e.a(b, a);
                }

                final a a;
                final e b;

            
            {
                b = e.this;
                a = a1;
                super();
            }
            }
);
            return;
        } else
        {
            a(a1);
            return;
        }
    }

    public static void a(List list)
    {
        ArrayList arraylist = new ArrayList();
        a a1;
        for(list = list.iterator(); list.hasNext(); arraylist.add(a1))
        {
            a1 = (a)list.next();
            a1.q();
        }

        for(list = a.iterator(); list.hasNext(); arraylist.add((a)list.next()));
        a = arraylist;
        c();
    }

    private void a(a a1)
    {
        bf++;
        a1.a(bf);
        a1.i((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
        a.add(a1);
        if(bg <= 0)
            i();
        else
            i();
        c();
    }

    static void a(e e1, a a1)
    {
        e1.a(a1);
    }

    public static Boolean b(Context context)
    {
        jp/co/cyberz/fox/analytics/base/e;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        String s;
        Object obj1;
        obj1 = null;
        s = null;
        obj = s;
        context1 = obj1;
        Properties properties = new Properties();
        obj = s;
        context1 = obj1;
        context = context.openFileInput("__ADMAGE_RANDOM_DEVICE_ID__");
        obj = context;
        context1 = context;
        properties.load(context);
        obj = context;
        context1 = context;
        s = properties.getProperty("random_device_id", "");
        if(context == null)
            break MISSING_BLOCK_LABEL_68;
        context.close();
        context = s;
_L4:
        if(context == null) goto _L2; else goto _L1
_L1:
        if(!context.equals("")) goto _L3; else goto _L2
_L2:
        context = Boolean.valueOf(false);
_L5:
        jp/co/cyberz/fox/analytics/base/e;
        JVM INSTR monitorexit ;
        return context;
        context;
        context = s;
          goto _L4
        context;
        if(obj == null)
            break MISSING_BLOCK_LABEL_108;
        ((FileInputStream) (obj)).close();
        context = "";
          goto _L4
        context;
        context = "";
          goto _L4
        context;
        if(context1 == null)
            break MISSING_BLOCK_LABEL_130;
        context1.close();
        context = "";
          goto _L4
        context;
        context = "";
          goto _L4
        context;
        obj = null;
_L6:
        if(obj == null)
            break MISSING_BLOCK_LABEL_154;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        throw context;
        context;
        jp/co/cyberz/fox/analytics/base/e;
        JVM INSTR monitorexit ;
        throw context;
_L3:
        context = Boolean.valueOf(true);
          goto _L5
        Exception exception;
        exception;
        obj = context;
        context = exception;
          goto _L6
    }

    public static String b()
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int i1 = 0; i1 < a.size(); i1++)
            stringbuffer.append(((a)a.get(i1)).u()).append("\n");

        return stringbuffer.toString();
    }

    private String b(String s)
    {
        String s1 = s;
        if(!jp.co.cyberz.fox.analytics.base.g.a(s))
        {
            s1 = s;
            try
            {
                if(f())
                    s1 = jp.co.cyberz.fox.analytics.base.f.a(s, f.a.a);
            }
            catch(Exception exception)
            {
                exception.printStackTrace();
                return s;
            }
        }
        return s1;
    }

    private List b(List list)
    {
        list = b(c(list));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("v", i));
        arraylist.add(new BasicNameValuePair("p", list));
        arraylist.add(new BasicNameValuePair("e", k));
        arraylist.add(new BasicNameValuePair("d", l));
        arraylist.add(new BasicNameValuePair("o", "2"));
        if(b != null && !b.b())
        {
            arraylist.add(new BasicNameValuePair("u", b(b.a())));
            return arraylist;
        } else
        {
            arraylist.add(new BasicNameValuePair("u", ""));
            return arraylist;
        }
    }

    public static String c(Context context)
    {
        jp/co/cyberz/fox/analytics/base/e;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        String s;
        Object obj1;
        obj1 = null;
        s = null;
        obj = s;
        context1 = obj1;
        Properties properties = new Properties();
        obj = s;
        context1 = obj1;
        context = context.openFileInput("__ADMAGE_RANDOM_DEVICE_ID__");
        obj = context;
        context1 = context;
        properties.load(context);
        obj = context;
        context1 = context;
        s = properties.getProperty("random_device_id_type", "");
        if(context == null)
            break MISSING_BLOCK_LABEL_68;
        try
        {
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context = s;
            continue; /* Loop/switch isn't completed */
        }
        context = s;
_L2:
        obj = context;
        if(context == null)
            obj = "";
        return ((String) (obj));
        context;
        if(obj == null)
            break MISSING_BLOCK_LABEL_99;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context = "";
            continue; /* Loop/switch isn't completed */
        }
        context = "";
        continue; /* Loop/switch isn't completed */
        context;
        if(context1 == null)
            break MISSING_BLOCK_LABEL_121;
        context1.close();
        context = "";
        continue; /* Loop/switch isn't completed */
        context;
        context = "";
        if(true) goto _L2; else goto _L1
_L1:
        context;
        obj = null;
_L4:
        if(obj == null)
            break MISSING_BLOCK_LABEL_145;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        throw context;
        context;
        jp/co/cyberz/fox/analytics/base/e;
        JVM INSTR monitorexit ;
        throw context;
        Exception exception;
        exception;
        obj = context;
        context = exception;
        if(true) goto _L4; else goto _L3
_L3:
    }

    private String c(List list)
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int i1 = 0; i1 < list.size(); i1++)
        {
            a a1 = (a)list.get(i1);
            a1.h(UUID.randomUUID().toString());
            if(i1 != 0)
                stringbuffer.append("#");
            stringbuffer.append(a1.u());
        }

        if(e())
            Log.d("F.O.X-ANALYTICS", (new StringBuilder()).append("QUE is ").append(stringbuffer.toString()).toString());
        return stringbuffer.toString();
    }

    public static void c()
    {
        Object obj1;
        Object obj3;
        Object obj4;
        obj4 = null;
        obj3 = null;
        obj1 = obj4;
        if(a.size() <= 0) goto _L2; else goto _L1
_L1:
        obj1 = obj4;
        Object obj = new FileOutputStream(new File(bj, "__e.fox"), false);
        obj1 = obj;
        ((FileOutputStream) (obj)).write(b().getBytes());
_L3:
        if(obj == null)
            break MISSING_BLOCK_LABEL_60;
        ((FileOutputStream) (obj)).close();
_L4:
        return;
_L2:
        obj = null;
        obj1 = obj4;
        d();
          goto _L3
        obj;
        obj = null;
_L9:
        obj1 = obj;
        Log.e("F.O.X-ANALYTICS", "Queue save failed. file '__e.fox' not found.");
        if(obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
            return;
        }
          goto _L4
        obj;
        ((IOException) (obj)).printStackTrace();
        return;
        obj;
        obj = obj3;
_L8:
        obj1 = obj;
        Log.e("F.O.X-ANALYTICS", "Queue save failed. IOException");
        if(obj == null) goto _L4; else goto _L5
_L5:
        try
        {
            ((FileOutputStream) (obj)).close();
            return;
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        return;
        Exception exception;
        exception;
_L7:
        if(obj1 != null)
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            catch(IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        throw exception;
        exception;
        if(true) goto _L7; else goto _L6
_L6:
        Object obj2;
        obj2;
          goto _L8
        obj2;
          goto _L9
    }

    public static void d()
    {
        File file = new File(bj, "__e.fox");
        if(file.isFile())
            file.delete();
    }

    public static boolean e()
    {
        return "1".equals(l);
    }

    public static boolean f()
    {
        return "1".equals(k);
    }

    public static void g()
    {
        bm = true;
    }

    public static boolean h()
    {
        return bm;
    }

    private void i()
    {
        Object obj;
label0:
        {
            if(a != null && a.size() > 0 || b != null && !b.b())
            {
                obj = a;
                a = new ArrayList();
                if(android.os.Build.VERSION.SDK_INT > 10)
                    break label0;
                (new Handler(Looper.getMainLooper())).post(new Runnable(((List) (obj))) {

                    public void run()
                    {
                        (new jp.co.cyberz.fox.analytics.base.b(a, e.a(b, a))).execute(new String[] {
                            e.j
                        });
                    }

                    final List a;
                    final e b;

            
            {
                b = e.this;
                a = list;
                super();
            }
                }
);
            }
            return;
        }
        obj = new jp.co.cyberz.fox.analytics.base.b(((List) (obj)), b(((List) (obj))));
        (new d()).a(((android.os.AsyncTask) (obj)), new String[] {
            j
        });
    }

    private static void j()
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        obj = new File(bj, "__e.fox");
        if(!((File) (obj)).isFile())
            return;
        BufferedReader bufferedreader;
        obj = new FileReader(((File) (obj)).getAbsolutePath());
        bufferedreader = new BufferedReader(((java.io.Reader) (obj)));
_L3:
        String s = bufferedreader.readLine();
        if(s == null) goto _L2; else goto _L1
_L1:
        arraylist.add(a(s));
          goto _L3
_L5:
        a = new ArrayList();
        a.addAll(arraylist);
        return;
_L2:
        try
        {
            bufferedreader.close();
            ((FileReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            ((FileNotFoundException) (obj)).printStackTrace();
        }
        catch(IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        if(true) goto _L5; else goto _L4
_L4:
    }

    public void a(Context context)
    {
        n = System.currentTimeMillis();
        a a1 = new a();
        a1.a(jp.co.cyberz.fox.analytics.base.a.a.b);
        a1.l(bh);
        a1.m(bi);
        a(context, a1);
    }

    public void a(Context context, String s)
    {
        a(context, s, null, null, null, ((String) (null)), ((String) (null)));
    }

    public void a(Context context, String s, int i1)
    {
        a(context, s, "", i1);
    }

    public void a(Context context, String s, String s1, int i1)
    {
        a(context, s, s1, "", i1);
    }

    public void a(Context context, String s, String s1, String s2, int i1)
    {
        a a1 = new a();
        a1.a(a.a.d);
        a1.a(s);
        a1.b(s1);
        a1.c(s2);
        a1.b(i1);
        a1.l(bh);
        a1.m(bi);
        a(context, a1);
    }

    public void a(Context context, String s, String s1, String s2, String s3, double d1, 
            int i1)
    {
        a(context, s, "", "", s1, s2, s3, d1, i1, "JPY");
    }

    public void a(Context context, String s, String s1, String s2, String s3, double d1, 
            int i1, String s4)
    {
        a(context, s, "", "", s1, s2, s3, d1, i1, s4);
    }

    public void a(Context context, String s, String s1, String s2, String s3, String s4, double d1, int i1)
    {
        a(context, s, s1, "", s2, s3, s4, d1, i1, "JPY");
    }

    public void a(Context context, String s, String s1, String s2, String s3, String s4, double d1, int i1, String s5)
    {
        a(context, s, s1, "", s2, s3, s4, d1, i1, s5);
    }

    public void a(Context context, String s, String s1, String s2, String s3, String s4, String s5)
    {
        b = new jp.co.cyberz.fox.analytics.base.c();
        b.a(s);
        b.b(s1);
        b.c(s2);
        b.d(s3);
        b.e(s4);
        b.f(s5);
        i();
    }

    public void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, 
            double d1, int i1)
    {
        a(context, s, s1, s2, s3, s4, s5, d1, i1, "JPY");
    }

    public void a(Context context, String s, String s1, String s2, String s3, String s4, String s5, 
            double d1, int i1, String s6)
    {
        a a1 = new a();
        a1.a(a.a.e);
        a1.a(s);
        a1.b(s1);
        a1.c(s2);
        a1.d(s3);
        a1.e(s4);
        a1.f(s5);
        a1.a(d1);
        a1.c(i1);
        a1.g(s6);
        a1.l(bh);
        a1.m(bi);
        a(context, a1);
    }

    public void a(String s, Context context)
    {
        if(c != null) goto _L2; else goto _L1
_L1:
        c = UUID.randomUUID().toString();
_L4:
        bh = UUID.randomUUID().toString();
        bi = s;
        a a1 = new a();
        a1.a(a.a.a);
        a1.l(bh);
        a1.m(s);
        a(context, a1);
        return;
_L2:
        if(System.currentTimeMillis() - n > 30000L)
            c = UUID.randomUUID().toString();
        if(true) goto _L4; else goto _L3
_L3:
    }

    public static List a = new ArrayList();
    public static jp.co.cyberz.fox.analytics.base.c b = null;
    private static e be = null;
    private static int bf = 0;
    private static File bj;
    private static final String bk = "__e.fox";
    private static final long bl = 30000L;
    private static boolean bm = false;
    protected static String c;
    protected static String d = "";
    protected static String e = "";
    protected static String f = "";
    protected static String g = "";
    protected static String h = "";
    protected static String i = "";
    protected static String j = "http://analytics.app-adforce.jp/fax/analytics";
    protected static String k = "1";
    protected static String l = "0";
    public static String m = "";
    public static long n = 0L;
    protected static final String o = "2";
    private int bg;
    private String bh;
    private String bi;

    static 
    {
        bf = 0;
        n = 0L;
        bm = false;
    }
}
