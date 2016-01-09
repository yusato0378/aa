// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.notification;

import mc.core.Res;
import org.cocos2dx.cpp.AppActivity;

// Referenced classes of package mc.notification:
//            LocalNotificationSender

public class LocalNotification
{

    public LocalNotification()
    {
    }

    public static void cancelAllLocalNotifications()
    {
        LocalNotificationSender.cancelAllLocalNotifications();
    }

    public static void cancelLocalNotification(int i)
    {
        LocalNotificationSender.cancelLocalNotification(i);
    }

    static AppActivity getActivity()
    {
        return _activity;
    }

    static Class getActivityClass()
    {
        return org/cocos2dx/cpp/AppActivity;
    }

    static int getAppName()
    {
        return Res.getStringId(_activity, "app_name");
    }

    static int getIcon()
    {
        return Res.getDrawableId(_activity, "icon");
    }

    public static void onCreate(AppActivity appactivity)
    {
        _activity = appactivity;
    }

    public static void showLocalNotification(String s, int i, int j)
    {
        LocalNotificationSender.showLocalNotification(s, i, j);
    }

    static final String KEY_MESSAGE = "message";
    static final String KEY_NOTIFICATION_ID = "notification_id";
    private static AppActivity _activity;
}
