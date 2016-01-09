// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.handler;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.growthpush.handler:
//            BaseReceiveHandler

public class OnlyAlertReceiveHandler extends BaseReceiveHandler
{

    public OnlyAlertReceiveHandler()
    {
    }

    public OnlyAlertReceiveHandler(BaseReceiveHandler.Callback callback)
    {
        this();
        setCallback(callback);
    }

    public void onReceive(Context context, Intent intent)
    {
        super.onReceive(context, intent);
        showAlert(context, intent);
    }
}
