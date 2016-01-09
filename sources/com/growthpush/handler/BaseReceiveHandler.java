// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.handler;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.growthpush.utils.PermissionUtils;
import com.growthpush.view.AlertActivity;

// Referenced classes of package com.growthpush.handler:
//            ReceiveHandler

public class BaseReceiveHandler
    implements ReceiveHandler
{
    public static class Callback
    {

        public void onOpen(Context context, Intent intent)
        {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).setFlags(0x10000000));
        }

        public Callback()
        {
        }
    }


    public BaseReceiveHandler()
    {
        callback = new Callback();
    }

    public BaseReceiveHandler(Callback callback1)
    {
        this();
        setCallback(callback1);
    }

    private Notification generateNotification(Context context, Bundle bundle)
    {
        String s;
        Object obj;
        int i;
        int j;
        obj = context.getPackageManager();
        j = 0;
        s = "";
        i = j;
        ApplicationInfo applicationinfo = ((PackageManager) (obj)).getApplicationInfo(context.getPackageName(), 0);
        i = j;
        j = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).icon;
        i = j;
        obj = ((PackageManager) (obj)).getApplicationLabel(applicationinfo).toString();
        s = ((String) (obj));
        i = j;
_L2:
        String s1 = bundle.getString("message");
        boolean flag = false;
        if(bundle.containsKey("sound"))
            flag = Boolean.valueOf(bundle.getString("sound")).booleanValue();
        Object obj1 = new Intent(context, com/growthpush/view/AlertActivity);
        ((Intent) (obj1)).putExtras(bundle);
        ((Intent) (obj1)).putExtra("showDialog", false);
        ((Intent) (obj1)).setFlags(0x10000000);
        AlertActivity.setSharedCallback(callback);
        bundle = PendingIntent.getActivity(context, 0, ((Intent) (obj1)), 0x10000000);
        obj1 = new android.support.v4.app.NotificationCompat.Builder(context);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setTicker(s);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setSmallIcon(i);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setContentTitle(s);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setContentText(s1);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setContentIntent(bundle);
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setWhen(System.currentTimeMillis());
        ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setAutoCancel(true);
        if(flag && PermissionUtils.permitted(context, "android.permission.VIBRATE"))
            ((android.support.v4.app.NotificationCompat.Builder) (obj1)).setDefaults(7);
        return ((android.support.v4.app.NotificationCompat.Builder) (obj1)).build();
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        if(true) goto _L2; else goto _L1
_L1:
    }

    protected void addNotification(Context context, Intent intent)
    {
        if(context == null || intent == null || intent.getExtras() == null)
        {
            return;
        } else
        {
            ((NotificationManager)context.getSystemService("notification")).notify((new StringBuilder("GrowthPush")).append(context.getPackageName()).toString(), 1, generateNotification(context, intent.getExtras()));
            return;
        }
    }

    public Callback getCallback()
    {
        return callback;
    }

    public void onReceive(Context context, Intent intent)
    {
    }

    public void setCallback(Callback callback1)
    {
        callback = callback1;
    }

    protected void showAlert(Context context, Intent intent)
    {
        if(context == null || intent == null || intent.getExtras() == null)
        {
            return;
        } else
        {
            Intent intent1 = new Intent(context, com/growthpush/view/AlertActivity);
            intent1.putExtras(intent.getExtras());
            intent1.putExtra("showDialog", true);
            intent1.setFlags(0x70000000);
            AlertActivity.setSharedCallback(callback);
            context.startActivity(intent1);
            return;
        }
    }

    private Callback callback;
}
