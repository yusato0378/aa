// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadgeRef, GameBadge

public final class GameBadgeBuffer extends AbstractDataBuffer
{

    public Object get(int i)
    {
        return zzfc(i);
    }

    public GameBadge zzfc(int i)
    {
        return new GameBadgeRef(zzPy, i);
    }
}
