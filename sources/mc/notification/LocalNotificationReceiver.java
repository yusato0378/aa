// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.*;
import android.graphics.BitmapFactory;
import mc.core.Res;

// Referenced classes of package mc.notification:
//            LocalNotification, LocalNotificationIdList

public class LocalNotificationReceiver extends BroadcastReceiver
{

    public LocalNotificationReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        int i = intent.getIntExtra("notification_id", 0);
        intent = intent.getStringExtra("message");
        Object obj = new Intent(context, LocalNotification.getActivityClass());
        ((Intent) (obj)).setFlags(0x20000);
        obj = PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x8000000);
        android.graphics.Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), Res.getDrawableId(context, "icon"));
        android.support.v4.app.NotificationCompat.Builder builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setContentTitle(context.getString(Res.getStringId(context, "app_name")));
        builder.setContentText(intent);
        builder.setSmallIcon(Res.getDrawableId(context, "icon"));
        builder.setLargeIcon(bitmap);
        builder.setTicker(intent);
        builder.setAutoCancel(true);
        builder.setDefaults(-1);
        builder.setContentIntent(((PendingIntent) (obj)));
        ((NotificationManager)context.getSystemService("notification")).notify(i, builder.build());
        LocalNotificationIdList.removeTag(i);
    }
}
