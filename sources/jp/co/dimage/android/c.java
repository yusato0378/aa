// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.*;
import android.net.*;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.io.*;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.text.MessageFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jp.appAdForce.android.AnalyticsManager;
import jp.co.cyberz.fox.analytics.base.g;
import jp.co.cyberz.fox.notify.a;

// Referenced classes of package jp.co.dimage.android:
//            e, a, m, i, 
//            l, b

public class c
    implements e
{
    public static final class a extends Enum
    {

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(jp/co/dimage/android/c$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        static 
        {
            a = new a("IMEI", 0);
            b = new a("UUID", 1);
            c = new a("ADID", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    static final class b extends Enum
    {

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(jp/co/dimage/android/c$b, s1);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        String a()
        {
            return d;
        }

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b e[];
        private String d;

        static 
        {
            a = new b("INSTALL", 0, "0");
            b = new b("START", 1, "1");
            c = new b("OTHERS", 2, "2");
            e = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1, String s2)
        {
            super(s1, i1);
            d = s2;
        }
    }


    public c(Context context)
    {
        a = null;
        b = "";
        c = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        n = "";
        o = false;
        be = false;
        bf = "";
        bg = false;
        bh = false;
        bi = false;
        bj = false;
        bl = "";
        bm = Boolean.valueOf(false);
        bn = "";
        bo = "";
        bp = "";
        bq = "";
        br = true;
        a = context;
        ab();
        Y();
        V();
        v();
        bk = (new MessageFormat("ADMAGESMPHSDK/Android/v2.15.7g/CZ/{0}/{1}/{2}/GL")).format(new String[] {
            android.os.Build.VERSION.RELEASE, Build.MODEL, Build.DEVICE
        });
        D();
        F();
        H();
        J();
        W();
    }

    public static boolean O()
    {
        return bs;
    }

    private void U()
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = obj;
        Properties properties = new Properties();
        obj1 = obj;
        properties.setProperty("xuid", h);
        obj1 = obj;
        properties.setProperty("xroute", i);
        obj1 = obj;
        obj = a.openFileOutput("__ADMAGE_CONVERSION__", 0);
        Object obj3;
        obj1 = obj;
        obj3 = obj;
        properties.store(((java.io.OutputStream) (obj)), "ADMAGE Session Information");
        Object obj2;
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        jp.co.dimage.android.a.d("F.O.X", (new MessageFormat("save: xuid={0} xroute={1}")).format(new String[] {
            h, i
        }));
        return;
        obj;
        obj3 = obj1;
        jp.co.dimage.android.a.b("F.O.X", "saveConversion failed. file '__ADMAGE_CONVERSION__' not found.");
        if(obj1 != null)
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        break MISSING_BLOCK_LABEL_74;
        obj2;
        obj = null;
_L4:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("saveConversion failed. ").append(((IOException) (obj2)).getMessage()).toString());
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        break MISSING_BLOCK_LABEL_74;
        obj2;
        obj = null;
_L2:
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        throw obj2;
        obj2;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        obj2;
        if(true) goto _L2; else goto _L1
_L1:
        obj2;
        if(true) goto _L4; else goto _L3
_L3:
    }

    private void V()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        Exception exception;
        try
        {
            List list = Arrays.asList(a.fileList());
            bg = list.contains("__ADMAGE_WEB_CONVERSION_COMPLETED__");
            bh = list.contains("__ADMAGE_APP_CONVERSION_COMPLETED__");
            bi = list.contains("__ADMAGE_CONVERSION_PAGE_OPENED__");
            bj = list.contains("__ADMAGE_LINE_FC_CONVERSION_COMPLETED__");
        }
        catch(NullPointerException nullpointerexception) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    private void W()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = false;
        m m1 = new m(a, k, l);
        if(m1.c())
            flag = true;
        m1.a(a, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private String X()
    {
        this;
        JVM INSTR monitorenter ;
        m m1 = new m(a, k, l);
        if(m1.c())
        {
            bl = m1.d();
            b(m1.e());
            b(bl, m1.e());
        }
        if(bl == null || bl.length() <= 0) goto _L2; else goto _L1
_L1:
        String s1 = bl;
_L5:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = "";
        String s3 = Z();
        String s2;
        s2 = s3;
        if(s3 == null)
            s2 = "";
        if(!Boolean.valueOf(false).booleanValue()) goto _L4; else goto _L3
_L3:
        if(jp.co.cyberz.fox.analytics.base.g.a(s2))
            break MISSING_BLOCK_LABEL_211;
        s1 = "2";
_L6:
        s3 = s1;
        s1 = s2;
        if(!jp.co.cyberz.fox.analytics.base.g.a(s2))
            break MISSING_BLOCK_LABEL_143;
        s1 = UUID.randomUUID().toString();
        s3 = "2";
        bl = s1;
        b(bl, s3);
        c(bl, s3);
        s1 = bl;
          goto _L5
_L4:
        if(jp.co.cyberz.fox.analytics.base.g.a(s2))
            break MISSING_BLOCK_LABEL_188;
        s1 = "2";
          goto _L6
        if(jp.co.cyberz.fox.analytics.base.g.a(""))
            break MISSING_BLOCK_LABEL_211;
        s1 = "1";
        s2 = "";
          goto _L6
        Exception exception;
        exception;
        throw exception;
        s2 = "";
          goto _L6
    }

    private void Y()
    {
        this;
        JVM INSTR monitorenter ;
        if(!jp.co.cyberz.fox.analytics.base.g.a(b)) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = Z();
        b(aa());
        if(!jp.co.cyberz.fox.analytics.base.g.d(s1) || bs) goto _L4; else goto _L3
_L3:
        b = s1;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        b = jp.co.dimage.android.i.a(s1, jp.co.dimage.android.i.a.a);
          goto _L2
        Object obj;
        obj;
        b = UUID.randomUUID().toString();
          goto _L2
        obj;
        throw obj;
    }

    private String Z()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        s1 = null;
        obj = null;
        obj1 = obj;
        obj2 = s1;
        Properties properties = new Properties();
        obj1 = obj;
        obj2 = s1;
        obj = a.openFileInput("__ADMAGE_RANDOM_DEVICE_ID__");
        obj1 = obj;
        obj2 = obj;
        properties.load(((InputStream) (obj)));
        obj1 = obj;
        obj2 = obj;
        s1 = properties.getProperty("random_device_id", "");
        if(obj == null)
            break MISSING_BLOCK_LABEL_71;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = s1;
            continue; /* Loop/switch isn't completed */
        }
        obj = s1;
_L2:
        obj1 = obj;
        if(obj == null)
            obj1 = "";
        return ((String) (obj1));
        obj;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_103;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = "";
            continue; /* Loop/switch isn't completed */
        }
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        if(obj2 == null)
            break MISSING_BLOCK_LABEL_125;
        ((FileInputStream) (obj2)).close();
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        obj = "";
        if(true) goto _L2; else goto _L1
_L1:
        obj;
        obj1 = null;
_L4:
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_149;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if(true) goto _L4; else goto _L3
_L3:
    }

    public static String a(Context context)
    {
        jp/co/dimage/android/c;
        JVM INSTR monitorenter ;
        Object obj;
        Context context1;
        Object obj1;
        String s1;
        String s2;
        Object obj2;
        Object obj3;
        s1 = "";
        obj2 = null;
        obj3 = null;
        s2 = null;
        obj = s2;
        context1 = obj2;
        obj1 = obj3;
        Properties properties = new Properties();
        obj = s2;
        context1 = obj2;
        obj1 = obj3;
        context = context.openFileInput("__ADMAGE_REFERRER__");
        obj = context;
        context1 = context;
        obj1 = context;
        properties.load(context);
        obj = context;
        context1 = context;
        obj1 = context;
        s2 = properties.getProperty("referrer", "");
        obj = s2;
        obj1 = obj;
        if(context == null)
            break MISSING_BLOCK_LABEL_96;
        context.close();
        obj1 = obj;
_L2:
        jp/co/dimage/android/c;
        JVM INSTR monitorexit ;
        return ((String) (obj1));
        context;
        obj1 = s1;
        if(obj == null)
            continue; /* Loop/switch isn't completed */
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            obj1 = s1;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = s1;
        continue; /* Loop/switch isn't completed */
        context;
        obj1 = s1;
        if(context1 == null)
            continue; /* Loop/switch isn't completed */
        try
        {
            context1.close();
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            obj1 = s1;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = s1;
        continue; /* Loop/switch isn't completed */
        context;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_160;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        catch(IOException ioexception) { }
        throw context;
        context;
        jp/co/dimage/android/c;
        JVM INSTR monitorexit ;
        throw context;
        context;
        obj1 = obj;
        if(true) goto _L2; else goto _L1
_L1:
    }

    private static String a(ApplicationInfo applicationinfo, String s1)
    {
        if(applicationinfo == null || applicationinfo.metaData == null)
            return "";
        applicationinfo = ((ApplicationInfo) (applicationinfo.metaData.get(s1)));
        if(applicationinfo == null)
            return "";
        else
            return applicationinfo.toString();
    }

    public static String a(InputStream inputstream)
    {
        Object obj;
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
        obj = new StringBuffer();
_L1:
        String s1 = inputstream.readLine();
        if(s1 != null)
            break MISSING_BLOCK_LABEL_44;
        obj = ((StringBuffer) (obj)).toString();
        inputstream.close();
        return ((String) (obj));
        ((StringBuffer) (obj)).append(s1);
          goto _L1
        Exception exception;
        exception;
        inputstream.close();
        throw exception;
    }

    private String aa()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        Object obj2;
        String s1;
        s1 = null;
        obj = null;
        obj1 = obj;
        obj2 = s1;
        Properties properties = new Properties();
        obj1 = obj;
        obj2 = s1;
        obj = a.openFileInput("__ADMAGE_RANDOM_DEVICE_ID__");
        obj1 = obj;
        obj2 = obj;
        properties.load(((InputStream) (obj)));
        obj1 = obj;
        obj2 = obj;
        s1 = properties.getProperty("random_device_id_type", "");
        if(obj == null)
            break MISSING_BLOCK_LABEL_71;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = s1;
            continue; /* Loop/switch isn't completed */
        }
        obj = s1;
_L2:
        obj1 = obj;
        if(obj == null)
            obj1 = "";
        return ((String) (obj1));
        obj;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_103;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            obj = "";
            continue; /* Loop/switch isn't completed */
        }
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        if(obj2 == null)
            break MISSING_BLOCK_LABEL_125;
        ((FileInputStream) (obj2)).close();
        obj = "";
        continue; /* Loop/switch isn't completed */
        obj;
        obj = "";
        if(true) goto _L2; else goto _L1
_L1:
        obj;
        obj1 = null;
_L4:
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_149;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if(true) goto _L4; else goto _L3
_L3:
    }

    private void ab()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a.getPackageManager();
        if(obj != null) goto _L2; else goto _L1
_L1:
        jp.co.dimage.android.a.b("F.O.X", "PackageManager is null.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((PackageManager) (obj)).getApplicationInfo(a.getPackageName(), 0);
        if(obj != null)
            break MISSING_BLOCK_LABEL_90;
        jp.co.dimage.android.a.b("F.O.X", "ApplicationInfo is null.");
          goto _L3
        obj;
        throw obj;
        obj;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj)).getMessage()).toString());
          goto _L3
        if((((ApplicationInfo) (obj)).flags & 2) == 2)
        {
            jp.co.dimage.android.a.a(true);
            jp.co.dimage.android.a.b(true);
        }
        ApplicationInfo applicationinfo = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128);
        if(applicationinfo != null)
            break MISSING_BLOCK_LABEL_176;
        jp.co.dimage.android.a.b("F.O.X", "ApplicationInfo is null.");
          goto _L3
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(namenotfoundexception.getMessage()).toString());
          goto _L3
        e = a(applicationinfo, "APPADFORCE_APP_ID");
        f = a(applicationinfo, "APPADFORCE_APP_OPTIONS");
        namenotfoundexception = null;
        String s1 = a(applicationinfo, "APPADFORCE_SERVER_URL");
        namenotfoundexception = s1;
        if(!jp.co.dimage.android.l.a(s1)) goto _L5; else goto _L4
_L4:
        namenotfoundexception = s1;
        g = "";
_L6:
        j = a(applicationinfo, "APPADFORCE_INSTALL_CV");
        m = a(applicationinfo, "APPADFORCE_TEST_MODE");
        bf = a(applicationinfo, "APPADFORCE_CRYPTO_SALT");
        k = a(applicationinfo, "APPADFORCE_ID_DIR");
        l = a(applicationinfo, "APPADFORCE_ID_FILE");
        a(a.b);
        c = b();
        if(aW.booleanValue())
            jp.co.dimage.android.a.d("F.O.X", (new MessageFormat("appId={0} appOptions={1} serverUrl={2} salt={3}")).format(new String[] {
                e, f, g, bf
            }));
          goto _L3
_L5:
        namenotfoundexception = s1;
        g = jp.co.dimage.android.i.a(s1);
          goto _L6
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. APPADFORCE_SERVER_URL = ").append(namenotfoundexception).append(". ").append(generalsecurityexception.getMessage()).toString());
          goto _L6
    }

    private void ac()
    {
        Object obj = Pattern.compile("[0-9a-zA-Z-_\\.]*");
        if(e == null || e.length() == 0)
            throw new IllegalStateException("Invalid APPADFORCE_APP_ID");
        if(e.length() > 8)
            throw new IllegalStateException("Invalid APPADFORCE_APP_ID");
        try
        {
            if(Integer.parseInt(e) <= 0)
                throw new IllegalStateException("Invalid APPADFORCE_APP_ID");
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new IllegalStateException("Invalid APPADFORCE_APP_ID");
        }
        if(f != null && f.length() > 0)
        {
            if(f.length() > 32)
                throw new IllegalStateException("Invalid APPADFORCE_APP_OPTIONS. Too long.");
            obj = ((Pattern) (obj)).matcher(f);
            if(obj == null || !((Matcher) (obj)).matches())
                throw new IllegalStateException("Invalid APPADFORCE_APP_OPTIONS. Contains invalid characters.");
        }
        if(g == null || g.length() == 0)
            throw new IllegalStateException("Invalid APPADFORCE_SERVER_URL");
        if(g != null && g.length() > 1024)
            throw new IllegalStateException("Invalid APPADFORCE_SERVER_URL");
        if(j != null && j.length() > 0 && !j.equals("1"))
            throw new IllegalStateException("Invalid APPADFORCE_INSTALL_CV");
        if(m != null && m.length() > 0 && !m.equals("1"))
            throw new IllegalStateException("Invalid APPADFORCE_TEST_MODE");
        else
            return;
    }

    private void b(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if(s1 == null) goto _L2; else goto _L1
_L1:
        int i1 = s1.length();
        if(i1 > 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        String s3;
        Object obj;
        obj = null;
        s3 = obj;
        Properties properties = new Properties();
        s3 = obj;
        properties.setProperty("random_device_id", s1);
        s3 = obj;
        properties.setProperty("random_device_id_type", s2);
        s3 = obj;
        s1 = a.openFileOutput("__ADMAGE_RANDOM_DEVICE_ID__", 0);
        s3 = s1;
        s2 = s1;
        properties.store(s1, "ADMAGE Random Device ID");
        if(s1 == null) goto _L2; else goto _L4
_L4:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
          goto _L2
        s1;
        s2 = s3;
        jp.co.dimage.android.a.b("F.O.X", "saveRandomDeviceId failed. file '__ADMAGE_RANDOM_DEVICE_ID__' not found.");
        if(s3 == null) goto _L2; else goto _L5
_L5:
        try
        {
            s3.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
          goto _L2
        s2;
        s1 = null;
_L9:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("saveRandomDeviceId failed. ").append(s2.getMessage()).toString());
        if(s1 == null) goto _L2; else goto _L6
_L6:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
          goto _L2
        s2;
        s1 = null;
_L8:
        if(s1 == null)
            break MISSING_BLOCK_LABEL_187;
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
        throw s2;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        Exception exception;
        exception;
        s1 = s2;
        s2 = exception;
        continue; /* Loop/switch isn't completed */
        s2;
        if(true) goto _L8; else goto _L7
_L7:
        s2;
          goto _L9
    }

    private void c(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        if(jp.co.dimage.android.l.a(s1)) goto _L2; else goto _L1
_L1:
        boolean flag = jp.co.dimage.android.l.a(s2);
        if(!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        m m1 = new m(a, k, l);
        if(m1.d() == null)
            m1.d(s2, s1);
        if(true) goto _L2; else goto _L4
_L4:
        s1;
        throw s1;
    }

    public static void d(boolean flag)
    {
        bs = flag;
    }

    private boolean d(String s1, String s2)
    {
        while(jp.co.dimage.android.l.a(s1) || jp.co.dimage.android.l.a(s2) || !"2".equals(s2)) 
            return false;
        h = s1;
        i = s2;
        U();
        jp.co.dimage.android.a.d("F.O.X", MessageFormat.format("update: xuid={0} xroute={1}", new Object[] {
            h, i
        }));
        return true;
    }

    private void f(String s1)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = obj;
        Properties properties = new Properties();
        obj1 = obj;
        properties.setProperty("referrer", s1);
        obj1 = obj;
        obj = a.openFileOutput("__ADMAGE_REFERRER__", 0);
        Object obj2;
        obj1 = obj;
        obj2 = obj;
        properties.store(((java.io.OutputStream) (obj)), "ADMAGE Session Information");
        IOException ioexception;
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        jp.co.dimage.android.a.d("F.O.X", (new MessageFormat("save: referrer={0}")).format(new String[] {
            s1
        }));
        return;
        obj;
        obj2 = obj1;
        jp.co.dimage.android.a.b("F.O.X", "saveReferrer failed. file '__ADMAGE_REFERRER__' not found.");
        if(obj1 != null)
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        break MISSING_BLOCK_LABEL_60;
        ioexception;
        obj = null;
_L4:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("saveReferrer failed. ").append(ioexception.getMessage()).toString());
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        break MISSING_BLOCK_LABEL_60;
        s1;
        obj = null;
_L2:
        if(obj != null)
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch(Object obj) { }
        throw s1;
        s1;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        s1;
        if(true) goto _L2; else goto _L1
_L1:
        ioexception;
        if(true) goto _L4; else goto _L3
_L3:
    }

    public boolean A()
    {
        return bh;
    }

    public boolean B()
    {
        return bi;
    }

    public boolean C()
    {
        return bj;
    }

    public void D()
    {
        try
        {
            bn = a.getApplicationContext().getPackageName();
            return;
        }
        catch(Exception exception)
        {
            jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("setBundleId failed. ").append(exception.getMessage()).toString());
        }
    }

    public String E()
    {
        return bn;
    }

    public void F()
    {
        PackageManager packagemanager = a.getPackageManager();
        try
        {
            bo = packagemanager.getPackageInfo(a.getApplicationContext().getPackageName(), 1).versionName;
            return;
        }
        catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("setBundleVersion failed. ").append(namenotfoundexception.getMessage()).toString());
        }
    }

    public String G()
    {
        return bo;
    }

    public void H()
    {
        bp = URLEncoder.encode(Build.MODEL);
    }

    public String I()
    {
        return bp;
    }

    public void J()
    {
        bq = android.os.Build.VERSION.RELEASE;
    }

    public String K()
    {
        return bq;
    }

    public String L()
    {
        return bf;
    }

    public boolean M()
    {
        return o;
    }

    public boolean N()
    {
        return br;
    }

    public String P()
    {
        return k;
    }

    public String Q()
    {
        return l;
    }

    public boolean R()
    {
        return be;
    }

    public void S()
    {
        if(T())
        {
            jp.co.dimage.android.a.d("F.O.X", "getting Advertising ID...will take a few seconds");
            return;
        }
        Object obj = jp.co.dimage.android.b.a();
        String s1 = ((String) (obj));
        if(jp.co.dimage.android.l.a(((String) (obj))))
            s1 = "(only shown on the first launch)";
        jp.co.dimage.android.a.d("F.O.X", "===== FORCE OPERATION X DEBUG DESCRIPTION =====");
        jp.co.dimage.android.a.d("F.O.X", "Force Operation X SDK v2.15.7g");
        try
        {
            obj = a.getPackageManager().getApplicationInfo(a.getPackageName(), 128);
        }
        catch(Exception exception)
        {
            jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("getApplicationInfo failed. ").append(exception.getMessage()).toString());
            return;
        }
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("APPADFORCE_APP_ID: ").append(e).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("APPADFORCE_SERVER_URL: ").append(a(((ApplicationInfo) (obj)), "APPADFORCE_SERVER_URL")).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("APPADFORCE_CRYPTO_SALT: ").append(bf).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("ANALYTICS_APP_KEY: ").append(a(((ApplicationInfo) (obj)), "ANALYTICS_APP_KEY")).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("adid: ").append(s1).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("xuniq: ").append(b).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("xuid: ").append(h).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("xroute: ").append(i).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("referrer: ").append(c).toString());
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("gms.version: ").append(a(((ApplicationInfo) (obj)), "com.google.android.gms.version")).toString());
        jp.co.dimage.android.a.d("F.O.X", "===== FORCE OPERATION X DEBUG DESCRIPTION =====");
    }

    public boolean T()
    {
        return jp.co.dimage.android.l.a(b) || "0063c5d7d1a05e85cb8b1b68b4dbca2f21".equals(b);
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj = null;
        obj1 = obj;
        Properties properties = new Properties();
        obj1 = obj;
        obj = a.openFileInput("__ADMAGE_CONVERSION__");
        obj1 = obj;
        properties.load(((InputStream) (obj)));
        obj1 = obj;
        h = properties.getProperty("xuid", "");
        obj1 = obj;
        i = properties.getProperty("xroute", "");
        if(obj == null)
            break MISSING_BLOCK_LABEL_69;
        Exception exception;
        Object obj2;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch(IOException ioexception) { }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_69;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        break MISSING_BLOCK_LABEL_69;
        obj2;
        obj = null;
_L4:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadConversion failed. ").append(((IOException) (obj2)).getMessage()).toString());
        if(obj == null)
            break MISSING_BLOCK_LABEL_69;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        break MISSING_BLOCK_LABEL_69;
        obj2;
        obj = null;
_L2:
        if(obj == null)
            break MISSING_BLOCK_LABEL_145;
        try
        {
            ((FileInputStream) (obj)).close();
        }
        catch(IOException ioexception1) { }
        throw obj2;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        if(true) goto _L2; else goto _L1
_L1:
        obj2;
        if(true) goto _L4; else goto _L3
_L3:
    }

    public void a(String s1)
    {
        int i1 = 0;
        this;
        JVM INSTR monitorenter ;
        if(s1 == null) goto _L2; else goto _L1
_L1:
        int j1 = s1.length();
        if(j1 != 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        String as[];
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("referrer: ").append(s1).toString());
        as = s1.split("&");
        j1 = as.length;
_L4:
        if(i1 >= j1)
            break MISSING_BLOCK_LABEL_133;
        String as1[];
        as1 = as[i1].split("=");
        if(as1.length != 2)
            break MISSING_BLOCK_LABEL_181;
        if("_xuid".equals(as1[0]))
            h = as1[1];
        if("_xroute".equals(as1[0]))
            i = as1[1];
        break MISSING_BLOCK_LABEL_181;
        s1;
        throw s1;
        U();
        jp.co.dimage.android.a.d("F.O.X", (new MessageFormat("update: xuid={0} xroute={1}")).format(new String[] {
            h, i
        }));
        f(s1);
          goto _L2
        i1++;
          goto _L4
    }

    public void a(String s1, String s2)
    {
        bl = s1;
        b(s1, s2);
        c(s1, s2);
    }

    public void a(String s1, InstallReceiver.a a1)
    {
        if(e(s1))
        {
            a1.a();
            return;
        } else
        {
            a1.b();
            return;
        }
    }

    public void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        d = a1;
        if(a1 == a.b)
            bm = Boolean.valueOf(true);
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        Object obj2 = null;
        Properties properties;
        if(flag)
            obj = "1";
        else
            obj = "0";
        obj1 = obj2;
        properties = new Properties();
        obj1 = obj2;
        properties.setProperty("car_flg", ((String) (obj)));
        obj1 = obj2;
        obj = a.openFileOutput("__FOX_REINSTALL_CAR__", 0);
        obj1 = obj;
        properties.store(((java.io.OutputStream) (obj)), "CAReward reinstall flg");
        if(obj == null)
            break MISSING_BLOCK_LABEL_72;
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_72;
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        break MISSING_BLOCK_LABEL_72;
        obj;
        obj1 = null;
_L2:
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_109;
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
        if(true) goto _L2; else goto _L1
_L1:
    }

    public boolean a(Uri uri)
    {
        return d(uri.getQueryParameter("_xuid"), uri.getQueryParameter("_xroute"));
    }

    public boolean a(Bundle bundle)
    {
        return d(bundle.getString("_xuid"), bundle.getString("_xroute"));
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = a(a);
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if("1".equals(s1))
            a(jp.co.dimage.android.a.a);
        if("2".equals(s1))
            a(a.b);
        if("4".equals(s1))
            a(a.c);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void b(boolean flag)
    {
        o = flag;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = X();
        if(!jp.co.cyberz.fox.analytics.base.g.d(s1) || bs) goto _L2; else goto _L1
_L1:
        b = s1;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = jp.co.dimage.android.i.a(s1, jp.co.dimage.android.i.a.a);
          goto _L3
        Object obj;
        obj;
        b = UUID.randomUUID().toString();
        c(b, "2");
          goto _L3
        obj;
        throw obj;
    }

    public void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = jp.co.dimage.android.l.a(s1);
        if(!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        Properties properties = new Properties();
        obj = obj1;
        properties.setProperty("buid", s1);
        obj = obj1;
        s1 = a.openFileOutput("__ADMAGE_BUID__", 0);
        obj = s1;
        properties.store(s1, "Buyer unique id");
        if(s1 == null)
            continue; /* Loop/switch isn't completed */
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
        continue; /* Loop/switch isn't completed */
        s1;
        if(obj == null)
            continue; /* Loop/switch isn't completed */
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(String s1) { }
        if(true) goto _L1; else goto _L3
_L3:
        s1;
        obj = null;
_L5:
        if(obj == null)
            break MISSING_BLOCK_LABEL_108;
        try
        {
            ((FileOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj) { }
        throw s1;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
        Exception exception;
        exception;
        obj = s1;
        s1 = exception;
        if(true) goto _L5; else goto _L4
_L4:
    }

    public void c(boolean flag)
    {
        br = flag;
    }

    public void d(String s1)
    {
        bf = s1;
    }

    public boolean d()
    {
        return !jp.co.dimage.android.l.a(Z());
    }

    public String e()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Properties properties;
        properties = new Properties();
        obj = a.openFileInput("__ADMAGE_BUID__");
        properties.load(((InputStream) (obj)));
        obj1 = properties.getProperty("buid", "Buyer unique id");
        if(obj == null)
            break MISSING_BLOCK_LABEL_47;
        ((FileInputStream) (obj)).close();
        obj = obj1;
_L1:
        obj1 = obj;
        if(obj == null)
            obj1 = "";
        return ((String) (obj1));
        obj;
        obj = obj1;
          goto _L1
        obj;
        obj = null;
_L4:
        if(obj == null)
            break MISSING_BLOCK_LABEL_79;
        ((FileInputStream) (obj)).close();
        obj = null;
          goto _L1
        obj;
        obj = null;
          goto _L1
        obj;
_L3:
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_99;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if(true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
          goto _L4
    }

    public void e(boolean flag)
    {
        be = flag;
    }

    public boolean e(String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(!jp.co.dimage.android.l.a(s1))
        {
            flag = flag1;
            if(s1.length() > 5)
            {
                flag = flag1;
                if("LINE_".equals(s1.substring(0, 5)))
                    flag = true;
            }
        }
        return flag;
    }

    public String f()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Properties properties;
        properties = new Properties();
        obj = a.openFileInput("__FOX_REINSTALL_CAR__");
        properties.load(((InputStream) (obj)));
        obj1 = properties.getProperty("car_flg", "CAReward reinstall flg");
        if(obj == null)
            break MISSING_BLOCK_LABEL_47;
        ((FileInputStream) (obj)).close();
        obj = obj1;
_L1:
        obj1 = obj;
        if(obj == null)
            obj1 = "";
        return ((String) (obj1));
        obj;
        obj = obj1;
          goto _L1
        obj;
        obj = null;
_L4:
        if(obj == null)
            break MISSING_BLOCK_LABEL_79;
        ((FileInputStream) (obj)).close();
        obj = null;
          goto _L1
        obj;
        obj = null;
          goto _L1
        obj;
_L3:
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_99;
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch(Object obj1) { }
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if(true) goto _L3; else goto _L2
_L2:
        Exception exception;
        exception;
          goto _L4
    }

    public boolean g()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)a.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkinfo == null)
            return false;
        else
            return networkinfo.isConnected();
    }

    public boolean h()
    {
        if((new File("/system/bin/su")).exists())
        {
            jp.co.dimage.android.a.d("F.O.X", "su fund!");
            return true;
        } else
        {
            return false;
        }
    }

    public void i()
    {
        AnalyticsManager.sendStartSession(a);
    }

    public void j()
    {
        String s1 = a.getSharedPreferences("notify", 0).getString("regId_temp", "");
        if(jp.co.dimage.android.l.a(s1))
        {
            Log.i("F.O.X Notify", "Registration not found.");
            return;
        } else
        {
            jp.co.cyberz.fox.notify.a.b(a, s1);
            return;
        }
    }

    public String k()
    {
        return bk;
    }

    public Context l()
    {
        return a;
    }

    public String m()
    {
        return h;
    }

    public String n()
    {
        return i;
    }

    public String o()
    {
        return b;
    }

    public String p()
    {
        return e;
    }

    public String q()
    {
        return f;
    }

    public String r()
    {
        return c;
    }

    public String s()
    {
        return j;
    }

    public String t()
    {
        return g;
    }

    public String u()
    {
        return m;
    }

    public void v()
    {
        n = UUID.randomUUID().toString();
    }

    public String w()
    {
        return n;
    }

    public boolean x()
    {
        return bm.booleanValue();
    }

    public a y()
    {
        return d;
    }

    public boolean z()
    {
        return bg;
    }

    private static boolean bs = false;
    private Context a;
    private String b;
    private boolean be;
    private String bf;
    private boolean bg;
    private boolean bh;
    private boolean bi;
    private boolean bj;
    private String bk;
    private String bl;
    private Boolean bm;
    private String bn;
    private String bo;
    private String bp;
    private String bq;
    private boolean br;
    private String c;
    private a d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private boolean o;

}
