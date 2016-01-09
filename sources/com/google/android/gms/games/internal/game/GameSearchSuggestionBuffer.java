// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameSearchSuggestionRef, GameSearchSuggestion

public final class GameSearchSuggestionBuffer extends AbstractDataBuffer
{

    public GameSearchSuggestionBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzff(i);
    }

    public GameSearchSuggestion zzff(int i)
    {
        return new GameSearchSuggestionRef(zzPy, i);
    }
}
