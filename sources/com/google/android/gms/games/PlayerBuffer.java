// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games:
//            PlayerRef, Player

public final class PlayerBuffer extends AbstractDataBuffer
{

    public PlayerBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Player get(int i)
    {
        return new PlayerRef(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
