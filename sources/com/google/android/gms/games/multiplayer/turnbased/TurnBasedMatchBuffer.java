// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchRef, TurnBasedMatch

public final class TurnBasedMatchBuffer extends zzf
{

    public TurnBasedMatchBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzp(i, j);
    }

    protected String zzlt()
    {
        return "external_match_id";
    }

    protected TurnBasedMatch zzp(int i, int j)
    {
        return new TurnBasedMatchRef(zzPy, i, j);
    }
}
