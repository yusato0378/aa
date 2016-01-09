// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.bridge;

import android.content.Context;
import android.content.Intent;
import com.growthpush.BroadcastReceiver;
import com.growthpush.GrowthPush;
import com.growthpush.handler.DefaultReceiveHandler;

// Referenced classes of package com.growthpush.bridge:
//            ExternalFrameworkBridge

public abstract class ExternalFrameworkBroadcastReceiver extends BroadcastReceiver
{

    public ExternalFrameworkBroadcastReceiver()
    {
        bridge = null;
    }

    public void onReceive(Context context, Intent intent)
    {
        if(GrowthPush.getInstance().getReceiveHandler() != null && (GrowthPush.getInstance().getReceiveHandler() instanceof DefaultReceiveHandler))
            ((DefaultReceiveHandler)GrowthPush.getInstance().getReceiveHandler()).setCallback(new com.growthpush.handler.BaseReceiveHandler.Callback() {

                public void onOpen(Context context1, Intent intent1)
                {
                    super.onOpen(context1, intent1);
                    if(intent1 != null && intent1.getExtras() != null && bridge != null)
                        bridge.callbackExternalFrameworkWithExtra(intent1.getExtras());
                }

                final ExternalFrameworkBroadcastReceiver this$0;

            
            {
                this$0 = ExternalFrameworkBroadcastReceiver.this;
                super();
            }
            }
);
        super.onReceive(context, intent);
    }

    protected ExternalFrameworkBridge bridge;
}
