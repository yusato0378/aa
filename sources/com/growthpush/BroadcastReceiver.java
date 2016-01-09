// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.growthpush.handler.ReceiveHandler;

// Referenced classes of package com.growthpush:
//            GrowthPush, Logger

public class BroadcastReceiver extends android.content.BroadcastReceiver
{

    public BroadcastReceiver()
    {
    }

    private void handleReceive(Context context, Intent intent)
    {
        String s = GoogleCloudMessaging.getInstance(context).getMessageType(intent);
        if(s != null && s.equals("gcm"))
            GrowthPush.getInstance().getReceiveHandler().onReceive(context, intent);
    }

    private void handleRegistration(Context context, Intent intent)
    {
        if(intent.getExtras().containsKey("error"))
            GrowthPush.getInstance().getLogger().error(String.format("GCM Registration failed. %s", new Object[] {
                intent.getExtras().getString("error")
            }));
        if(intent.getExtras().containsKey("registration_id"))
            GrowthPush.getInstance().registerClient(intent.getExtras().getString("registration_id"));
    }

    public void onReceive(Context context, Intent intent)
    {
        if(intent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION"))
            handleRegistration(context, intent);
        else
        if(intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            handleReceive(context, intent);
            return;
        }
    }
}
