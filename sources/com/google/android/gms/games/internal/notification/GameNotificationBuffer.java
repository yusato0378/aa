// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.AbstractDataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotificationRef, GameNotification

public final class GameNotificationBuffer extends AbstractDataBuffer
{

    public Object get(int i)
    {
        return zzfh(i);
    }

    public GameNotification zzfh(int i)
    {
        return new GameNotificationRef(zzPy, i);
    }
}
