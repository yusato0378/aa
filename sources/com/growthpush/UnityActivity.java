// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.growthpush.handler.DefaultReceiveHandler;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import java.util.Iterator;
import java.util.Set;
import jp.co.cyberagent.gn.plugin.PluginActivity;
import jp.co.cyberagent.gn.plugin.PluginManager;

// Referenced classes of package com.growthpush:
//            GrowthPush

public class UnityActivity extends UnityPlayerActivity
{

    public UnityActivity()
    {
        started = false;
    }

    public static void callTrackGrowthPushMessage()
    {
        if(growthPushMessage != null)
        {
            UnityPlayer.UnitySendMessage("GrowthPushReceiveAndroid", "LaunchWithNotification", growthPushMessage);
            growthPushMessage = null;
        }
    }

    public static String parsePushGrowthPushMessage(Intent intent)
    {
        Bundle bundle;
        Object obj = null;
        bundle = null;
        if(intent != null)
            bundle = intent.getExtras();
        intent = obj;
        if(bundle == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        intent = "";
        iterator = bundle.keySet().iterator();
_L5:
        if(iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return intent;
_L3:
        String s = (String)iterator.next();
        String s1 = bundle.get(s).toString();
        PluginManager.logDebug("unity", (new StringBuilder(String.valueOf(s))).append(" => ").append(s1).toString());
        if(!s.equals("showDialog") && !s.equals("collapse_key") && !s.equals("from"))
            intent = (new StringBuilder(String.valueOf(intent))).append(String.format("&%s=%s", new Object[] {
                s, s1
            })).toString();
        if(true) goto _L5; else goto _L4
_L4:
    }

    public static void saveGrowthPushMessage(String s)
    {
        growthPushMessage = s;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        PluginManager.logDebug("unity", "onCreate");
        bundle = new DefaultReceiveHandler() {

            public void onReceive(Context context, Intent intent)
            {
                PluginManager.logDebug("unity", "onReceive");
                super.onReceive(context, intent);
            }

            final UnityActivity this$0;

            
            {
                this$0 = UnityActivity.this;
                super();
            }
        }
;
        bundle.setCallback(new com.growthpush.handler.DefaultReceiveHandler.Callback() {

            public void onOpen(Context context, Intent intent)
            {
                PluginManager.logDebug("unity", "onOpen");
                intent = UnityActivity.parsePushGrowthPushMessage(intent);
                if(intent != null)
                    UnityPlayer.UnitySendMessage("GrowthPushReceiveAndroid", "LaunchWithNotification", intent);
                intent = new Intent(context, jp/co/cyberagent/gn/plugin/PluginActivity);
                intent.setFlags(0x20020000);
                context.startActivity(intent);
            }

            final UnityActivity this$0;

            
            {
                this$0 = UnityActivity.this;
                super();
            }
        }
);
        GrowthPush.getInstance().setReceiveHandler(bundle);
    }

    protected void onResume()
    {
        PluginManager.logDebug("unity", "onResume");
        super.onResume();
        if(!started)
            GrowthPush.getInstance().trackEvent("Launch");
        started = false;
    }

    protected void onStart()
    {
        PluginManager.logDebug("unity", "onStart");
        super.onStart();
        GrowthPush.getInstance().trackEvent("Launch");
        started = true;
    }

    private static String growthPushMessage = null;
    private boolean started;

}
