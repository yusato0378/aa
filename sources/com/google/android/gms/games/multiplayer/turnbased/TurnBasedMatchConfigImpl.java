// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfig

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig
{

    TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder builder)
    {
        zzanu = builder.zzanu;
        zzanT = builder.zzanT;
        zzanK = builder.zzanK;
        int i = builder.zzanJ.size();
        zzanL = (String[])builder.zzanJ.toArray(new String[i]);
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzanK;
    }

    public String[] getInvitedPlayerIds()
    {
        return zzanL;
    }

    public int getVariant()
    {
        return zzanu;
    }

    public int zzsh()
    {
        return zzanT;
    }

    private final Bundle zzanK;
    private final String zzanL[];
    private final int zzanT;
    private final int zzanu;
}
