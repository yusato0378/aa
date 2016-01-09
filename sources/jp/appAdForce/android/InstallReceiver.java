// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.lang.reflect.Method;
import jp.co.dimage.android.a;

public class InstallReceiver extends BroadcastReceiver
{

    public InstallReceiver()
    {
        jp.co.dimage.android.a.a("ADMAGE_DEBUG", "constructor InstallReceiver");
        a = new jp.co.dimage.android.InstallReceiver();
    }

    private void a(Context context, Intent intent)
    {
        Object obj1;
        ApplicationInfo applicationinfo;
        applicationinfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        obj1 = applicationinfo.metaData.get("APPADFORCE_FORWARD_RECEIVER");
        Object obj;
        if(obj1 == null)
            break MISSING_BLOCK_LABEL_47;
        obj = obj1;
        if(obj1.toString().length() != 0)
            break MISSING_BLOCK_LABEL_58;
        obj = applicationinfo.metaData.get("APPADFORCE_FORWARD_RECIEVER");
        if(obj == null)
            break MISSING_BLOCK_LABEL_172;
        if(obj.toString().length() == 0)
            return;
        try
        {
            Object obj3 = getClass().getClassLoader().loadClass(obj.toString());
            Object obj2 = ((Class) (obj3)).newInstance();
            obj3 = ((Class) (obj3)).getMethod("onReceive", new Class[] {
                android/content/Context, android/content/Intent
            });
            jp.co.dimage.android.a.a("ADMAGE_DEBUG", (new StringBuilder()).append("FORWARD INSTALL RECEIVER : ").append(obj.toString()).toString());
            ((Method) (obj3)).invoke(obj2, new Object[] {
                context, intent
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context.printStackTrace();
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        a.onReceive(context, intent);
        a(context, intent);
    }

    private jp.co.dimage.android.InstallReceiver a;
}
