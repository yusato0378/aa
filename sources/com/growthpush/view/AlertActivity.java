// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.view;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.growthpush.utils.SystemUtils;

// Referenced classes of package com.growthpush.view:
//            DialogCallback, AlertFragment

public class AlertActivity extends FragmentActivity
    implements DialogCallback
{

    public AlertActivity()
    {
    }

    public static com.growthpush.handler.BaseReceiveHandler.Callback getSharedCallback()
    {
        return sharedCallback;
    }

    private void manageKeyguard()
    {
        KeyguardManager keyguardmanager = (KeyguardManager)getSystemService("keyguard");
        if(keyguardmanager.inKeyguardRestrictedInputMode())
            if(android.os.Build.VERSION.SDK_INT >= 16)
            {
                if(keyguardmanager.isKeyguardSecure())
                {
                    getWindow().addFlags(0x80000);
                    return;
                }
                if(keyguardmanager.isKeyguardLocked())
                {
                    getWindow().addFlags(0x400000);
                    return;
                }
            } else
            {
                getWindow().addFlags(0x480000);
                return;
            }
    }

    private void managePower()
    {
        final android.os.PowerManager.WakeLock wakeLock = SystemUtils.getPowerManager(getApplicationContext());
        if(wakeLock == null)
            return;
        wakeLock = wakeLock.newWakeLock(0x1000000a, getClass().getName());
        try
        {
            wakeLock.acquire();
        }
        catch(SecurityException securityexception)
        {
            return;
        }
        (new Handler()).postDelayed(new Runnable() {

            public void run()
            {
                wakeLock.release();
            }

            final AlertActivity this$0;
            private final android.os.PowerManager.WakeLock val$wakeLock;

            
            {
                this$0 = AlertActivity.this;
                wakeLock = wakelock;
                super();
            }
        }
, 10000L);
    }

    public static void setSharedCallback(com.growthpush.handler.BaseReceiveHandler.Callback callback)
    {
        sharedCallback = callback;
    }

    private void showDialog()
    {
        manageKeyguard();
        managePower();
        final AlertFragment fragment = new AlertFragment();
        fragment.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putString("message", getIntent().getExtras().getString("message"));
        fragment.setArguments(bundle);
        if(!isFinishing())
            runOnUiThread(new Runnable() {

                public void run()
                {
                    fragment.show(getSupportFragmentManager(), getClass().getName());
                }

                final AlertActivity this$0;
                private final AlertFragment val$fragment;

            
            {
                this$0 = AlertActivity.this;
                fragment = alertfragment;
                super();
            }
            }
);
    }

    public void onClickNegative(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        finish();
    }

    public void onClickPositive(DialogInterface dialoginterface)
    {
        dialoginterface.dismiss();
        if(sharedCallback != null)
            sharedCallback.onOpen(this, getIntent());
        dialoginterface = (NotificationManager)getSystemService("notification");
        if(dialoginterface != null)
            dialoginterface.cancel((new StringBuilder("GrowthPush")).append(getPackageName()).toString(), 1);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(0x103000f);
        if(getIntent().getExtras().getBoolean("showDialog"))
        {
            showDialog();
            return;
        }
        if(sharedCallback != null)
            sharedCallback.onOpen(this, getIntent());
        finish();
    }

    public void onDestroy()
    {
        getWindow().clearFlags(0x480000);
        super.onDestroy();
    }

    private static final int WAKE_LOCK_TIMEROUT = 10000;
    private static com.growthpush.handler.BaseReceiveHandler.Callback sharedCallback = null;

}
