// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchConfigImpl

public abstract class TurnBasedMatchConfig
{
    public static final class Builder
    {

        public Builder addInvitedPlayer(String s)
        {
            zzv.zzr(s);
            zzanJ.add(s);
            return this;
        }

        public Builder addInvitedPlayers(ArrayList arraylist)
        {
            zzv.zzr(arraylist);
            zzanJ.addAll(arraylist);
            return this;
        }

        public TurnBasedMatchConfig build()
        {
            return new TurnBasedMatchConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            zzanK = bundle;
            return this;
        }

        public Builder setVariant(int i)
        {
            boolean flag;
            if(i == -1 || i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
            zzanu = i;
            return this;
        }

        ArrayList zzanJ;
        Bundle zzanK;
        int zzanT;
        int zzanu;

        private Builder()
        {
            zzanu = -1;
            zzanJ = new ArrayList();
            zzanK = null;
            zzanT = 2;
        }

    }


    protected TurnBasedMatchConfig()
    {
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String[] getInvitedPlayerIds();

    public abstract int getVariant();

    public abstract int zzsh();
}
