// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore, LeaderboardScoreEntity

public final class LeaderboardScoreRef extends zzc
    implements LeaderboardScore
{

    LeaderboardScoreRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        zzanc = new PlayerRef(dataholder, i);
    }

    public boolean equals(Object obj)
    {
        return LeaderboardScoreEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzsc();
    }

    public String getDisplayRank()
    {
        return getString("display_rank");
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        zza("display_rank", chararraybuffer);
    }

    public String getDisplayScore()
    {
        return getString("display_score");
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        zza("display_score", chararraybuffer);
    }

    public long getRank()
    {
        return getLong("rank");
    }

    public long getRawScore()
    {
        return getLong("raw_score");
    }

    public Player getScoreHolder()
    {
        if(zzbH("external_player_id"))
            return null;
        else
            return zzanc;
    }

    public String getScoreHolderDisplayName()
    {
        if(zzbH("external_player_id"))
            return getString("default_display_name");
        else
            return zzanc.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if(zzbH("external_player_id"))
        {
            zza("default_display_name", chararraybuffer);
            return;
        } else
        {
            zzanc.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if(zzbH("external_player_id"))
            return null;
        else
            return zzanc.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl()
    {
        if(zzbH("external_player_id"))
            return null;
        else
            return zzanc.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri()
    {
        if(zzbH("external_player_id"))
            return zzbG("default_display_image_uri");
        else
            return zzanc.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl()
    {
        if(zzbH("external_player_id"))
            return getString("default_display_image_url");
        else
            return zzanc.getIconImageUrl();
    }

    public String getScoreTag()
    {
        return getString("score_tag");
    }

    public long getTimestampMillis()
    {
        return getLong("achieved_timestamp");
    }

    public int hashCode()
    {
        return LeaderboardScoreEntity.zza(this);
    }

    public String toString()
    {
        return LeaderboardScoreEntity.zzb(this);
    }

    public LeaderboardScore zzsc()
    {
        return new LeaderboardScoreEntity(this);
    }

    private final PlayerRef zzanc;
}
