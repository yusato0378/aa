// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import java.util.Calendar;
import java.util.HashSet;
import org.cocos2dx.cpp.AppActivity;

// Referenced classes of package mc.notification:
//            LocalNotificationIdList, LocalNotification, LocalNotificationReceiver

class LocalNotificationSender
{

    LocalNotificationSender()
    {
    }

    public static void cancelAllLocalNotifications()
    {
        LocalNotificationIdList.loadTagSet();
        int j = LocalNotificationIdList._tags.size();
        Integer ainteger[] = new Integer[j];
        LocalNotificationIdList._tags.toArray(ainteger);
        for(int i = 0; i < j; i++)
        {
            PendingIntent pendingintent = getPengingIntent(null, ainteger[i].intValue());
            ((AlarmManager)LocalNotification.getActivity().getSystemService("alarm")).cancel(pendingintent);
        }

        LocalNotificationIdList.removeAllTags();
    }

    public static void cancelLocalNotification(int i)
    {
        PendingIntent pendingintent = getPengingIntent(null, i);
        ((AlarmManager)LocalNotification.getActivity().getSystemService("alarm")).cancel(pendingintent);
        LocalNotificationIdList.removeTag(i);
    }

    private static PendingIntent getPengingIntent(String s, int i)
    {
        Intent intent = new Intent(LocalNotification.getActivity().getApplicationContext(), mc/notification/LocalNotificationReceiver);
        intent.putExtra("notification_id", i);
        intent.putExtra("message", s);
        return PendingIntent.getBroadcast(LocalNotification.getActivity(), i, intent, 0x8000000);
    }

    public static void showLocalNotification(String s, int i, int j)
    {
        s = getPengingIntent(s, j);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis((long)i * 1000L);
        ((AlarmManager)LocalNotification.getActivity().getSystemService("alarm")).set(0, calendar.getTimeInMillis(), s);
        LocalNotificationIdList.addTag(j);
    }
}
