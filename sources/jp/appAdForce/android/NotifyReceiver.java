// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.content.*;
import jp.co.cyberz.fox.notify.BaseNotifyReceiver;

public class NotifyReceiver extends BroadcastReceiver
{

    public NotifyReceiver()
    {
        a = new BaseNotifyReceiver();
    }

    public void onReceive(Context context, Intent intent)
    {
        a.onReceive(context, intent);
    }

    public void storeRegistrationId(Context context, String s)
    {
        a.a(context, s);
    }

    BaseNotifyReceiver a;
}
