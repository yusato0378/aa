// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScoreBufferHeader, LeaderboardScoreRef, LeaderboardScore

public final class LeaderboardScoreBuffer extends AbstractDataBuffer
{

    public LeaderboardScoreBuffer(DataHolder dataholder)
    {
        super(dataholder);
        zzamP = new LeaderboardScoreBufferHeader(dataholder.zzlm());
    }

    public LeaderboardScore get(int i)
    {
        return new LeaderboardScoreRef(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public LeaderboardScoreBufferHeader zzsa()
    {
        return zzamP;
    }

    private final LeaderboardScoreBufferHeader zzamP;
}
