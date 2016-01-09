// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardRef, Leaderboard

public final class LeaderboardBuffer extends zzf
{

    public LeaderboardBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzm(i, j);
    }

    protected String zzlt()
    {
        return "external_leaderboard_id";
    }

    protected Leaderboard zzm(int i, int j)
    {
        return new LeaderboardRef(zzPy, i, j);
    }
}
