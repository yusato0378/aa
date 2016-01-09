// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.content.Context;
import jp.co.cyberz.fox.notify.a;

// Referenced classes of package jp.appAdForce.android:
//            AdManager

public class NotifyManager
{

    public NotifyManager(Context context, AdManager admanager)
    {
        a = new a(context, admanager);
    }

    public String getRegistrationId()
    {
        return a.a();
    }

    public void registerToGCM(Context context, String s)
    {
        a.a(context, s);
    }

    private a a;
}
