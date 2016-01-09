// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameRef, ExtendedGame

public final class ExtendedGameBuffer extends zzf
{

    public ExtendedGameBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzl(i, j);
    }

    protected ExtendedGame zzl(int i, int j)
    {
        return new ExtendedGameRef(zzPy, i, j);
    }

    protected String zzlt()
    {
        return "external_game_id";
    }
}
