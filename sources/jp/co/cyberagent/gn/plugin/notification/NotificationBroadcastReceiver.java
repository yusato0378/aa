// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.notification;

import android.content.*;
import jp.co.cyberagent.gn.plugin.PluginManager;

// Referenced classes of package jp.co.cyberagent.gn.plugin.notification:
//            NotificationController

public class NotificationBroadcastReceiver extends BroadcastReceiver
{

    public NotificationBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringExtra((new StringBuilder(String.valueOf(context.getPackageName()))).append(".localnotification.notificationparameter").toString());
        PluginManager.logDebug("NotificationBroadcastReceiver.onReceive : ");
        PluginManager.logDebug((new StringBuilder("context.getPackageName() = ")).append(context.getPackageName()).toString());
        PluginManager.logDebug((new StringBuilder("context.getClass().getName() = ")).append(context.getClass().getName()).toString());
        if(intent != null)
        {
            int i = NotificationController.notifyLocalNotification(context, intent);
            PluginManager.logDebug((new StringBuilder("NotificationBroadcastReceiver.onReceive : notificationId = ")).append(i).toString());
        }
    }
}
