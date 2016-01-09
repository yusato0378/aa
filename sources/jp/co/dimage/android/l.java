// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.io.*;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Properties;
import jp.co.cyberz.fox.analytics.base.g;

// Referenced classes of package jp.co.dimage.android:
//            e, a

public class l
    implements e
{
    private static class a
        implements Runnable
    {

        public void run()
        {
            Object obj1 = null;
            Object obj = a.getContentResolver();
            obj = ((ContentResolver) (obj)).query(l.c, new String[] {
                "aid"
            }, null, null, null);
            if(obj == null) goto _L2; else goto _L1
_L1:
            boolean flag = ((Cursor) (obj)).moveToFirst();
            if(flag) goto _L3; else goto _L2
_L2:
            if(obj == null)
                break MISSING_BLOCK_LABEL_57;
            ((Cursor) (obj)).close();
_L5:
            return;
_L3:
            l.a = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("aid"));
            if(obj == null) goto _L5; else goto _L4
_L4:
            try
            {
                ((Cursor) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Object obj)
            {
                return;
            }
            obj;
            obj = null;
_L9:
            if(obj == null) goto _L5; else goto _L6
_L6:
            try
            {
                ((Cursor) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(Object obj)
            {
                return;
            }
            obj;
_L8:
            if(obj1 != null)
                try
                {
                    ((Cursor) (obj1)).close();
                }
                // Misplaced declaration of an exception variable
                catch(Object obj1) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch(Object obj)
            {
                Log.e("F.O.X", "", ((Throwable) (obj)));
            }
            return;
            obj;
            return;
            Exception exception1;
            exception1;
            obj1 = obj;
            obj = exception1;
            if(true) goto _L8; else goto _L7
_L7:
            Exception exception;
            exception;
              goto _L9
        }

        private Context a;

        public a(Context context)
        {
            a = null;
            a = context;
        }
    }


    public l()
    {
    }

    public static String a()
    {
        return a;
    }

    public static String a(Context context)
    {
        jp/co/dimage/android/l;
        JVM INSTR monitorenter ;
        if(context != null) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        jp/co/dimage/android/l;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if(!g.a(a) || b != null)
        {
            context = a;
            continue; /* Loop/switch isn't completed */
        }
        b = new Thread(new a(context));
        b.start();
        context = "";
        if(true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static String a(Context context, String s, String s1)
    {
        Object obj = null;
        Properties properties;
        properties = new Properties();
        context = context.openFileInput(s);
        Context context1 = context;
        properties.load(context);
        context1 = context;
        s1 = properties.getProperty(s1, "");
        s = s1;
        if(context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return s1;
            }
            s = s1;
        }
        return s;
        context;
        context = null;
_L6:
        context1 = context;
        jp.co.dimage.android.a.d("F.O.X", (new StringBuilder()).append("loadValue failed. file '").append(s).append("' not found.").toString());
        s = obj;
        if(context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s;
        context = null;
_L4:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadValue failed. ").append(s.getMessage()).toString());
        s = obj;
        if(context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context;
        context1 = null;
_L2:
        if(context1 != null)
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch(String s) { }
        throw context;
        context;
        continue; /* Loop/switch isn't completed */
        s;
        context1 = context;
        context = s;
        if(true) goto _L2; else goto _L1
_L1:
        s;
        if(true) goto _L4; else goto _L3
_L3:
        s1;
        if(true) goto _L6; else goto _L5
_L5:
    }

    public static String a(String s, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        s1 = MessageDigest.getInstance(s1);
        s1.update(s.getBytes());
        s = s1.digest();
        int i = 0;
_L1:
        if(i >= s.length)
            break MISSING_BLOCK_LABEL_94;
        int j;
        byte byte0 = s[i];
        j = byte0;
        if(byte0 < 0)
            j = byte0 + 256;
        stringbuffer.append("0123456789abcdef".charAt(j / 16));
        stringbuffer.append("0123456789abcdef".charAt(j % 16));
        i++;
          goto _L1
        s;
        return stringbuffer.toString();
    }

    public static String a(String s, String as[])
    {
        for(int i = 0; i < as.length; i++)
            as[i] = URLEncoder.encode(as[i]);

        return (new MessageFormat(s)).format(as);
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        Context context1;
        Object obj;
        obj = null;
        context1 = obj;
        Properties properties = new Properties();
        context1 = obj;
        properties.setProperty(s1, s2);
        context1 = obj;
        context = context.openFileOutput(s, 0);
        context1 = context;
        s1 = context;
        properties.store(context, "ADMAGE Session Information");
        if(context == null)
            break MISSING_BLOCK_LABEL_60;
        context.close();
_L2:
        return;
        context;
        s1 = context1;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("saveValue failed. file '").append(s).append("' not found.").toString());
        if(context1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return;
        }
        s;
        context = null;
_L6:
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("saveValue failed. ").append(s.getMessage()).toString());
        if(context == null) goto _L2; else goto _L3
_L3:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return;
        }
        s;
        context = null;
_L5:
        if(context != null)
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch(Context context) { }
        throw s;
        context;
        return;
        s;
        context = s1;
        continue; /* Loop/switch isn't completed */
        s;
        if(true) goto _L5; else goto _L4
_L4:
        s;
          goto _L6
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String b(String s)
    {
        String s1;
        if(a(s))
        {
            s1 = null;
        } else
        {
            int i = s.indexOf("://");
            s1 = s;
            if(i >= 0)
            {
                i += 3;
                int j = s.indexOf("/", i);
                if(j > 0)
                    return s.substring(i, j);
                else
                    return s.substring(i, s.length());
            }
        }
        return s1;
    }

    public static boolean b(Context context)
    {
        try
        {
            context.openFileOutput("__ADMAGE_DUMMY__", 0);
        }
        catch(Exception exception)
        {
            try
            {
                context.deleteFile("__ADMAGE_DUMMY__");
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                return false;
            }
            return false;
        }
        Exception exception1;
        try
        {
            context.deleteFile("__ADMAGE_DUMMY__");
        }
        // Misplaced declaration of an exception variable
        catch(Context context) { }
        return true;
        exception1;
        try
        {
            context.deleteFile("__ADMAGE_DUMMY__");
        }
        // Misplaced declaration of an exception variable
        catch(Context context) { }
        throw exception1;
    }

    public static String c(String s)
    {
        return a(s, "MD5");
    }

    public static String d(String s)
    {
        return a(s, "SHA-1");
    }

    public static String e(String s)
    {
        return a(s, "SHA-256");
    }

    public static String a = "";
    public static Thread b = null;
    public static final Uri c = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
    public static final String d = "aid";

}
