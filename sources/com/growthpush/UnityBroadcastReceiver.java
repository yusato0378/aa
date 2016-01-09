// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.growthpush:
//            BroadcastReceiver, GrowthPush, UnityActivity

public class UnityBroadcastReceiver extends BroadcastReceiver
{

    public UnityBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        if(GrowthPush.getInstance().getClient() == null)
            UnityActivity.saveGrowthPushMessage(UnityActivity.parsePushGrowthPushMessage(intent));
    }
}
