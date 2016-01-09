// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.notify;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.text.MessageFormat;
import jp.appAdForce.android.AdManager;
import jp.co.dimage.android.c;
import jp.co.dimage.android.e;
import jp.co.dimage.android.l;

// Referenced classes of package jp.co.cyberz.fox.notify:
//            c

public class a
    implements e
{

    public a(Context context, AdManager admanager)
    {
        bi = admanager.a();
        bj = context;
        d(context);
        f();
        c(context);
    }

    protected static int a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return i1;
    }

    private static String a(ApplicationInfo applicationinfo, String s)
    {
        if(applicationinfo == null || applicationinfo.metaData == null)
            return "";
        applicationinfo = ((ApplicationInfo) (applicationinfo.metaData.get(s)));
        if(applicationinfo == null)
            return "";
        else
            return applicationinfo.toString();
    }

    private void a(String s, String s1)
    {
        MessageFormat messageformat = new MessageFormat("appId={0} serverUrl={1} _pushEnable={2}");
        if(aW.booleanValue())
        {
            jp.co.dimage.android.a.d("F.O.X", messageformat.format(new String[] {
                bl, bh
            }));
            Log.d("F.O.X", messageformat.format(new String[] {
                bl, bh
            }));
            return;
        } else
        {
            jp.co.dimage.android.a.d("F.O.X", messageformat.format(new String[] {
                bl, s, s1
            }));
            Log.d("F.O.X", messageformat.format(new String[] {
                bl, s, s1
            }));
            return;
        }
    }

    protected static String b(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not get package name: ").append(context).toString());
        }
        return context;
    }

    public static boolean b()
    {
        return bm;
    }

    public static boolean b(Context context, String s)
    {
        bh = be;
        bh = (new StringBuilder()).append(bh).append(bf).toString();
        String s1 = context.getSharedPreferences("notify", 0).getString("regId", "");
        if(s == null)
        {
            Log.e("LOG_TAG", "registerId is null");
            return false;
        }
        if(s1.equals(s))
        {
            Log.d("LOG_TAG", "registerId did not change");
            return false;
        }
        if(bk == null)
        {
            Log.e("LOG_TAG", "xuniq is null");
            return false;
        }
        if(bl == null)
        {
            Log.e("LOG_TAG", "appid is null");
            return false;
        } else
        {
            String s2 = bl;
            String s3 = bk;
            bh = jp.co.dimage.android.l.a(bh, new String[] {
                s2, s3, s
            });
            (new jp.co.cyberz.fox.notify.c(context, s)).execute(new String[] {
                bh
            });
            return true;
        }
    }

    public static void c()
    {
        bm = true;
    }

    private void c(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("notify", 0);
        int i1 = sharedpreferences.getInt("notifyId", -1);
        if(i1 == -1)
            return;
        ((NotificationManager)context.getSystemService("notification")).cancel(i1);
        bh = be;
        String s1 = sharedpreferences.getString("taskId", "");
        String s = sharedpreferences.getString("url", "");
        String s2 = bl;
        String s3 = bk;
        bh = (new StringBuilder()).append(bh).append(bg).toString();
        bh = jp.co.dimage.android.l.a(bh, new String[] {
            s2, s3, s1
        });
        (new jp.co.cyberz.fox.notify.c()).execute(new String[] {
            bh
        });
        if(!"".equals(s) && s != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(s));
            intent.setFlags(0x10000000);
            try
            {
                context.startActivity(intent);
            }
            // Misplaced declaration of an exception variable
            catch(Context context)
            {
                Log.d(n, "There is no Activities");
            }
        }
        context = sharedpreferences.edit();
        context.remove("taskId");
        context.remove("notifyId");
        context.remove("url");
        context.commit();
    }

    public static void c(Context context, String s)
    {
        Object obj = context.getSharedPreferences("notify", 0);
        int i1 = a(context);
        context = b(context);
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("regId", s);
        ((android.content.SharedPreferences.Editor) (obj)).putString("appVersion", String.valueOf(i1));
        ((android.content.SharedPreferences.Editor) (obj)).putString("appVersionName", context);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
    }

    public static void d()
    {
        bm = false;
    }

    private static void d(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            context = a(packagemanager.getApplicationInfo(context.getPackageName(), 128), "DEBUG_NOTIFY_URL");
            if(!"".equals(context))
            {
                be = context;
                Log.d(n, (new StringBuilder()).append("debug url applied : ").append(be).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            return;
        }
    }

    protected static void d(Context context, String s)
    {
        Object obj;
        NotificationManager notificationmanager;
        Notification notification;
        if(s == null)
            return;
        notificationmanager = (NotificationManager)context.getSystemService("notification");
        notification = new Notification();
        obj = "";
        Object obj2;
        context.getPackageManager();
        obj2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities[0].name;
        obj = obj2;
_L1:
        String s1;
        obj2 = new Intent("android.intent.action.MAIN");
        ((Intent) (obj2)).setClassName(context.getPackageName(), ((String) (obj)));
        ((Intent) (obj2)).setFlags(0x10000000);
        obj2 = PendingIntent.getActivity(context, 0, ((Intent) (obj2)), 0);
        obj = context.getPackageManager();
        notification.icon = context.getApplicationInfo().icon;
        s1 = (String)context.getApplicationInfo().loadLabel(((PackageManager) (obj)));
        notification.tickerText = s;
        notification.sound = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        notification.flags = 8;
        obj = URLDecoder.decode(s, "UTF-8");
        s = ((String) (obj));
_L2:
        notification.setLatestEventInfo(context, s1, s, ((PendingIntent) (obj2)));
        context = context.getSharedPreferences("notify", 0).edit();
        context.putInt("notifyId", 11111);
        context.commit();
        notificationmanager.notify(11111, notification);
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        namenotfoundexception.printStackTrace();
          goto _L1
        Object obj1;
        obj1;
        Log.d(n, "using unsupported character for notification message");
          goto _L2
        obj1;
        Log.d(n, "using percent");
          goto _L2
        obj1;
        Log.e(n, ((Exception) (obj1)).getMessage());
          goto _L2
    }

    private void e(Context context, String s)
    {
        Object obj = Class.forName("com.google.android.gcm.GCMRegistrar");
        try
        {
            obj = ((Class) (obj)).getDeclaredMethod("register", new Class[] {
                android/content/Context, [Ljava/lang/String;
            });
            ((Method) (obj)).setAccessible(true);
            ((Method) (obj)).invoke(null, new Object[] {
                context, new String[] {
                    s
                }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context) { }
        try
        {
            Log.e(n, "please import proper gcm.jar");
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            Log.e(n, "please import gcm.jar");
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context.printStackTrace();
        }
        return;
    }

    private boolean e()
    {
        return true;
    }

    private void f()
    {
        if(!jp.co.cyberz.fox.analytics.base.e.b(bj).booleanValue())
        {
            c();
            Log.d(n, "Registration will be suspended until ids are set.");
            return;
        } else
        {
            g();
            bl = bi.p();
            bk = bi.o();
            return;
        }
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = bj.getPackageManager();
        if(obj != null) goto _L2; else goto _L1
_L1:
        jp.co.dimage.android.a.b("F.O.X", "PackageManager is null.");
        Log.e("F.O.X", "PackageManager is null.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        obj = ((PackageManager) (obj)).getApplicationInfo(bj.getPackageName(), 0);
        if(obj != null)
            break MISSING_BLOCK_LABEL_137;
        jp.co.dimage.android.a.b("F.O.X", "ApplicationInfo is null.");
        Log.e("F.O.X", "ApplicationInfo is null.");
          goto _L3
        obj;
        throw obj;
        obj;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj)).getMessage()).toString());
        Log.e("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj)).getMessage()).toString());
          goto _L3
        if((((ApplicationInfo) (obj)).flags & 2) == 2)
        {
            jp.co.dimage.android.a.a(true);
            jp.co.dimage.android.a.b(true);
        }
        obj = bj.getPackageManager().getApplicationInfo(bj.getPackageName(), 128);
        if(obj != null)
            break MISSING_BLOCK_LABEL_261;
        jp.co.dimage.android.a.b("F.O.X", "ApplicationInfo is null.");
        Log.e("F.O.X", "ApplicationInfo is null.");
          goto _L3
        obj;
        jp.co.dimage.android.a.b("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj)).getMessage()).toString());
        Log.e("F.O.X", (new StringBuilder()).append("loadApplicationInfo faild. ").append(((android.content.pm.PackageManager.NameNotFoundException) (obj)).getMessage()).toString());
          goto _L3
        bl = a(((ApplicationInfo) (obj)), "APPADFORCE_APP_ID");
          goto _L3
    }

    public String a()
    {
        int i1 = 0;
        Object obj = bj.getSharedPreferences("notify", 0);
        String s = ((SharedPreferences) (obj)).getString("regId", "");
        if(s == null)
        {
            Log.i(n, "Registration not found.");
            return "";
        }
        String s1 = ((SharedPreferences) (obj)).getString("appVersion", "");
        if(!"".equals(s1))
            i1 = Integer.parseInt(s1);
        obj = ((SharedPreferences) (obj)).getString("appVersionName", "");
        int j1 = a(bj);
        s1 = b(bj);
        if(i1 != j1)
        {
            Log.i(n, (new StringBuilder()).append("App version changed.").append(String.valueOf(j1)).toString());
            return "";
        }
        if(!((String) (obj)).equals(s1))
        {
            Log.i(n, "App version name changed.");
            return "";
        } else
        {
            Log.i(n, (new StringBuilder()).append("App version stayed:").append(j1).append("  App version name:").append(s1).toString());
            return s;
        }
    }

    public void a(Context context, String s)
    {
        String s1 = a();
        if(jp.co.dimage.android.l.a(s1))
        {
            Log.d(n, "No regId");
            e(context, s);
            return;
        } else
        {
            Log.d(n, (new StringBuilder()).append("already hold regId:").append(s1).toString());
            return;
        }
    }

    public static final String a = "message";
    public static final String b = "notify";
    private static String be = "http://notify.app-adforce.jp";
    private static String bf = "/reg/?_appid={0}&_xuniq={1}&_regid={2}";
    private static String bg = "/open/?_appid={0}&_xuniq={1}&_taskid={2}";
    private static String bh;
    private static String bk;
    private static String bl;
    private static boolean bm = false;
    public static final String c = "notifyId";
    public static final String d = "regId";
    public static final String e = "regId_temp";
    public static final String f = "taskId";
    public static final String g = "url";
    public static final String h = "appVersion";
    public static final String i = "appVersionName";
    public static final int j = 9000;
    public static final String k = "DEBUG_NOTIFY_URL";
    public static final boolean l = false;
    private static final int m = 11111;
    private static String n = "F.O.X Notify";
    private static boolean o = true;
    private c bi;
    private Context bj;

}
