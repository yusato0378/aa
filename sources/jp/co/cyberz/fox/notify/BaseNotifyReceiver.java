// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.notify;

import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Method;
import jp.co.dimage.android.e;

// Referenced classes of package jp.co.cyberz.fox.notify:
//            a

public class BaseNotifyReceiver extends BroadcastReceiver
    implements e
{

    public BaseNotifyReceiver()
    {
    }

    private int a(Context context, Intent intent, Object obj, String s)
    {
        obj = getClass().getClassLoader().loadClass(obj.toString());
        Object obj1 = ((Class) (obj)).newInstance();
        Bundle bundle = intent.getExtras();
        if(bundle.getString("messageByFox") != null)
            return 0;
        if(bundle.getString("message") != null)
        {
            try
            {
                s = ((Class) (obj)).getDeclaredMethod("onMessage", new Class[] {
                    android/content/Context, android/content/Intent
                });
                s.setAccessible(true);
                s.invoke(obj1, new Object[] {
                    context, intent
                });
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                try
                {
                    ((Class) (obj)).getMethod("onReceive", new Class[] {
                        android/content/Context, android/content/Intent
                    }).invoke(obj1, new Object[] {
                        context, intent
                    });
                }
                // Misplaced declaration of an exception variable
                catch(Context context)
                {
                    context.printStackTrace();
                }
            }
            return 1;
        }
        if(bundle.getString("registration_id") != null)
        {
            try
            {
                Method method = ((Class) (obj)).getDeclaredMethod("onRegistered", new Class[] {
                    android/content/Context, java/lang/String
                });
                method.setAccessible(true);
                method.invoke(obj1, new Object[] {
                    context, s
                });
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                try
                {
                    ((Class) (obj)).getMethod("onReceive", new Class[] {
                        android/content/Context, android/content/Intent
                    }).invoke(obj1, new Object[] {
                        context, intent
                    });
                }
                // Misplaced declaration of an exception variable
                catch(Context context)
                {
                    context.printStackTrace();
                }
            }
            return 1;
        }
        try
        {
            ((Class) (obj)).getMethod("onReceive", new Class[] {
                android/content/Context, android/content/Intent
            }).invoke(obj1, new Object[] {
                context, intent
            });
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context.printStackTrace();
        }
        return 1;
    }

    private void a(Context context, Intent intent, String s)
    {
        Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("APPADFORCE_NOTIFY_RECEIVER");
        if(obj == null)
            break MISSING_BLOCK_LABEL_57;
        if(obj.toString().length() == 0)
            return;
        try
        {
            a(context, intent, obj, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context.printStackTrace();
        }
    }

    public void a(Context context, String s)
    {
        if(s == null)
        {
            Log.d(c, "skip store to preference");
            return;
        } else
        {
            jp.co.cyberz.fox.notify.a.b(context, s);
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        if(s != null)
        {
            a(context, s);
            a = context.getSharedPreferences("notify", 0);
            android.content.SharedPreferences.Editor editor = a.edit();
            editor.putString("regId_temp", s);
            editor.commit();
        }
        Object obj = intent.getExtras();
        if(((Bundle) (obj)).getString("messageByFox") != null)
        {
            jp.co.cyberz.fox.notify.a.d(context, ((Bundle) (obj)).getString("message"));
            String s1 = ((Bundle) (obj)).getString("taskId");
            a = context.getSharedPreferences("notify", 0);
            android.content.SharedPreferences.Editor editor2 = a.edit();
            editor2.putString("taskId", s1);
            editor2.commit();
        }
        obj = ((Bundle) (obj)).getString("url");
        if(obj != null)
        {
            a = context.getSharedPreferences("notify", 0);
            android.content.SharedPreferences.Editor editor1 = a.edit();
            editor1.putString("url", ((String) (obj)));
            editor1.commit();
        }
        a(context, intent, s);
    }

    private static String c = "F.O.X Notify";
    private static final String d = "APPADFORCE_NOTIFY_RECEIVER";
    SharedPreferences a;
    android.content.SharedPreferences.Editor b;

}
