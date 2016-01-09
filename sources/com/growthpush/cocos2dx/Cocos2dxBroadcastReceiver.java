// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.cocos2dx;

import com.growthpush.bridge.ExternalFrameworkBroadcastReceiver;

// Referenced classes of package com.growthpush.cocos2dx:
//            Cocos2dxBridge

public class Cocos2dxBroadcastReceiver extends ExternalFrameworkBroadcastReceiver
{

    public Cocos2dxBroadcastReceiver()
    {
        bridge = new Cocos2dxBridge();
    }
}
