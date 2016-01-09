// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.handler;

import android.content.Context;
import android.content.Intent;

public interface ReceiveHandler
{

    public abstract void onReceive(Context context, Intent intent);
}
