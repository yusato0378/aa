// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader
{
    public static final class Builder
    {

        private Builder()
        {
        }
    }


    public LeaderboardScoreBufferHeader(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if(bundle == null)
            bundle1 = new Bundle();
        zzKa = bundle1;
    }

    public Bundle zzsb()
    {
        return zzKa;
    }

    private final Bundle zzKa;
}
