// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.notification;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import jp.co.cyberagent.gn.plugin.PluginManager;
import jp.co.cyberagent.gn.plugin.PluginNativeActivity;

// Referenced classes of package jp.co.cyberagent.gn.plugin.notification:
//            NotificationDialogParameter, NotificationController

public class NotificationDialogFragmentActivity extends FragmentActivity
{

    public NotificationDialogFragmentActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m_Activity = this;
        m_NotificationId = -1;
        bundle = new android.app.AlertDialog.Builder(this);
        Object obj = getIntent();
        if(obj != null)
        {
            obj = ((Intent) (obj)).getStringExtra((new StringBuilder(String.valueOf(getPackageName()))).append(".localnotification.notificationparameter").toString());
            NotificationDialogParameter notificationdialogparameter = new NotificationDialogParameter();
            if(notificationdialogparameter != null && notificationdialogparameter.toParameter(((String) (obj))))
            {
                m_NotificationId = notificationdialogparameter.notificationId;
                if(notificationdialogparameter.smallIconResourceId != 0)
                    bundle.setIcon(notificationdialogparameter.smallIconResourceId);
                bundle.setTitle(notificationdialogparameter.title);
                bundle.setMessage(notificationdialogparameter.text);
            }
        }
        bundle.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                PluginManager.logDebug((new StringBuilder("AlertDialog : OK : which = ")).append(i).toString());
                if(NotificationDialogFragmentActivity.m_Activity != null)
                {
                    if(NotificationDialogFragmentActivity.m_NotificationId != -1)
                        NotificationController.cancelLocalNotification(NotificationDialogFragmentActivity.m_Activity, NotificationDialogFragmentActivity.m_NotificationId);
                    dialoginterface = new Intent(NotificationDialogFragmentActivity.m_Activity, jp/co/cyberagent/gn/plugin/PluginNativeActivity);
                    dialoginterface.setFlags(0x20020000);
                    NotificationDialogFragmentActivity.m_Activity.startActivity(dialoginterface);
                    NotificationDialogFragmentActivity.m_Activity.finish();
                }
            }

            final NotificationDialogFragmentActivity this$0;

            
            {
                this$0 = NotificationDialogFragmentActivity.this;
                super();
            }
        }
);
        bundle.setNegativeButton("Cancel", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                PluginManager.logDebug((new StringBuilder("AlertDialog : Cancel : which = ")).append(i).toString());
                if(NotificationDialogFragmentActivity.m_Activity != null)
                    NotificationDialogFragmentActivity.m_Activity.finish();
            }

            final NotificationDialogFragmentActivity this$0;

            
            {
                this$0 = NotificationDialogFragmentActivity.this;
                super();
            }
        }
);
        bundle.show();
    }

    public void onStop()
    {
        super.onStop();
        finish();
    }

    private static Activity m_Activity;
    private static int m_NotificationId;


}
