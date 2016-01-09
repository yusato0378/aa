// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.notification;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.PowerManager;
import jp.co.cyberagent.gn.plugin.PluginManager;
import jp.co.cyberagent.gn.plugin.PluginNativeActivity;

// Referenced classes of package jp.co.cyberagent.gn.plugin.notification:
//            NotificationBroadcastReceiver, NotificationParameter, NotificationDialogFragmentActivity, NotificationDialogParameter

public class NotificationController
{

    public NotificationController()
    {
    }

    public static boolean cancelAllLocalNotification(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(context != null)
        {
            AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
            NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
            if(alarmmanager != null)
                alarmmanager.cancel(PendingIntent.getBroadcast(context, 0, new Intent(context, jp/co/cyberagent/gn/plugin/notification/NotificationBroadcastReceiver), 0x8000000));
            flag = flag1;
            if(notificationmanager != null)
            {
                notificationmanager.cancelAll();
                flag = true;
            }
        }
        return flag;
    }

    public static boolean cancelLocalNotification(Context context, int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(context != null)
        {
            context = (NotificationManager)context.getSystemService("notification");
            flag = flag1;
            if(context != null)
            {
                context.cancel(i);
                flag = true;
            }
        }
        return flag;
    }

    public static void clearAllLocalNotification()
    {
        cancelAllLocalNotification(PluginManager.getCurrentActivity());
    }

    private static Intent createNotificationBroadcastIntent(Context context, String s)
    {
        Intent intent = null;
        if(context != null)
        {
            Intent intent1 = new Intent(context, jp/co/cyberagent/gn/plugin/notification/NotificationBroadcastReceiver);
            intent = intent1;
            if(intent1 != null)
            {
                intent = intent1;
                if(s != null)
                {
                    intent1.putExtra((new StringBuilder(String.valueOf(context.getPackageName()))).append(".localnotification.notificationparameter").toString(), s);
                    intent = intent1;
                }
            }
        }
        return intent;
    }

    public static int notifyLocalNotification(Context context, String s)
    {
        byte byte0 = -1;
        int i = byte0;
        if(s != null)
        {
            NotificationParameter notificationparameter = new NotificationParameter();
            i = byte0;
            if(notificationparameter != null)
            {
                i = byte0;
                if(notificationparameter.toParameter(s))
                    i = notifyLocalNotification(context, notificationparameter);
            }
        }
        return i;
    }

    public static int notifyLocalNotification(Context context, NotificationParameter notificationparameter)
    {
        int i = -1;
        if(notificationparameter != null)
        {
            Object obj2 = context.getPackageName();
            Object obj1 = notificationparameter.title;
            Object obj = obj1;
            if(obj1 == null)
                try
                {
                    obj = context.getPackageManager();
                    obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(((String) (obj2)), 0)).toString();
                }
                catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    namenotfoundexception = "";
                }
            obj1 = notificationparameter.getLargeIconBitmap(context);
            obj2 = notificationparameter.getSoundUri(context);
            i = notificationparameter.getSmallIconResourceId(context);
            i = notifyLocalNotification(context, notificationparameter.isShowDialog, notificationparameter.notificationNumber, ((String) (obj)), notificationparameter.text, notificationparameter.tickerText, i, ((Bitmap) (obj1)), notificationparameter.defaults, ((Uri) (obj2)), notificationparameter.lightColor, notificationparameter.lightOnMs, notificationparameter.lightOffMs, notificationparameter.vibratePattern);
        }
        return i;
    }

    public static int notifyLocalNotification(Context context, boolean flag, int i, String s, String s1, String s2, int j, Bitmap bitmap, 
            int k, Uri uri, int l, int i1, int j1, long al[])
    {
        byte byte0 = -1;
        int i2 = byte0;
        if(context != null)
        {
            NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
            android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
            int k1 = byte0;
            if(notificationmanager != null)
            {
                k1 = byte0;
                if(builder != null)
                {
                    Object obj = new Intent(context, jp/co/cyberagent/gn/plugin/PluginNativeActivity);
                    int l1 = (int)(System.currentTimeMillis() & -1L);
                    k1 = l1;
                    if(l1 == -1)
                        k1 = 0;
                    PluginManager.logDebug((new StringBuilder("NotificationController.notifyLocalNotification : notificationId = ")).append(k1).append(", notificationNumber = ").append(i).toString());
                    ((Intent) (obj)).setFlags(0x20020000);
                    obj = PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x8000000);
                    builder.setAutoCancel(true);
                    builder.setContentIntent(((PendingIntent) (obj)));
                    builder.setContentText(s1);
                    builder.setContentTitle(s);
                    builder.setDefaults(k);
                    builder.setLargeIcon(bitmap);
                    builder.setLights(l, i1, j1);
                    builder.setNumber(i);
                    builder.setOngoing(false);
                    builder.setSmallIcon(j);
                    builder.setSound(uri);
                    builder.setTicker(s2);
                    builder.setVibrate(al);
                    notificationmanager.notify(k1, builder.build());
                }
            }
            i2 = k1;
            if(flag)
            {
                startNotificationDialogFragmentActivity(context, k1, s, s1, j);
                i2 = k1;
            }
        }
        return i2;
    }

    public static int notifyLocalNotification(Context context, boolean flag, String s, String s1, String s2, int i)
    {
        return notifyLocalNotification(context, flag, 0, s, s1, s2, i, null, 5, null, 0, 0, 0, null);
    }

    public static boolean registerLocalNotification(String s, String s1)
    {
        android.app.Activity activity = PluginManager.getCurrentActivity();
        AlarmManager alarmmanager = (AlarmManager)activity.getSystemService("alarm");
        s1 = createNotificationBroadcastIntent(activity, s1);
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(alarmmanager != null)
            {
                flag = flag1;
                if(s1 != null)
                {
                    alarmmanager.set(1, Long.parseLong(s), PendingIntent.getBroadcast(activity, 0, s1, 0x8000000));
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void setLocalNotification(String s, String s1)
    {
        registerLocalNotification(s, s1);
    }

    private static boolean startNotificationDialogFragmentActivity(Context context, int i, String s, String s1, int j)
    {
        PowerManager powermanager = (PowerManager)context.getSystemService("power");
        Intent intent = new Intent(context, jp/co/cyberagent/gn/plugin/notification/NotificationDialogFragmentActivity);
        NotificationDialogParameter notificationdialogparameter = new NotificationDialogParameter();
        boolean flag1 = false;
        if(!powermanager.isScreenOn())
            return false;
        boolean flag = flag1;
        if(intent != null)
        {
            flag = flag1;
            if(notificationdialogparameter != null)
            {
                intent.setFlags(0x10000000);
                notificationdialogparameter.notificationId = i;
                notificationdialogparameter.title = s;
                notificationdialogparameter.text = s1;
                notificationdialogparameter.smallIconResourceId = j;
                s = notificationdialogparameter.toString();
                if(s != null)
                    intent.putExtra((new StringBuilder(String.valueOf(context.getPackageName()))).append(".localnotification.notificationparameter").toString(), s);
                context.startActivity(intent);
                flag = true;
            }
        }
        return flag;
    }

    public static final String INTENT_EXTRA_DATA_NAME = ".localnotification.notificationparameter";
    public static final int INVALID_NOTIFICATION_ID = -1;
    public static final int INVISIBLE_NOTIFICATION_NUMBER = 0;
}
