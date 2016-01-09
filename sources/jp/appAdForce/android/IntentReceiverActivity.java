// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.appAdForce.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import jp.co.dimage.android.l;

// Referenced classes of package jp.appAdForce.android:
//            AdManager

public class IntentReceiverActivity extends Activity
{

    public IntentReceiverActivity()
    {
    }

    private void a()
    {
        startActivity(getPackageManager().getLaunchIntentForPackage("com.android.vending"));
        finish();
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        finish();
        return;
        obj;
        finish();
        throw obj;
    }

    private void a(Context context)
    {
        if(context == null)
        {
            a();
            return;
        }
        String s = context.getPackageName();
        try
        {
            startActivity(context.getPackageManager().getLaunchIntentForPackage(s));
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Context context)
        {
            context.printStackTrace();
        }
        a(s);
    }

    private void a(String s)
    {
        if(l.a(s))
        {
            a();
            return;
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("market://details?id=").append(s).toString())));
        finish();
        return;
        s;
        s.printStackTrace();
        finish();
        return;
        s;
        finish();
        throw s;
    }

    public void onResume()
    {
        super.onResume();
        AdManager admanager = new AdManager(getApplicationContext());
        admanager.setUrlScheme(getIntent());
        a(admanager.b());
    }
}
