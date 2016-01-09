// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameInstanceRef, GameInstance

public final class GameInstanceBuffer extends AbstractDataBuffer
{

    public GameInstanceBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzfe(i);
    }

    public GameInstance zzfe(int i)
    {
        return new GameInstanceRef(zzPy, i);
    }
}
