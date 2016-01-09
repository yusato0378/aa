// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardScore

public final class LeaderboardScoreEntity
    implements LeaderboardScore
{

    public LeaderboardScoreEntity(LeaderboardScore leaderboardscore)
    {
        zzamQ = leaderboardscore.getRank();
        zzamR = (String)zzv.zzr(leaderboardscore.getDisplayRank());
        zzamS = (String)zzv.zzr(leaderboardscore.getDisplayScore());
        zzamT = leaderboardscore.getRawScore();
        zzamU = leaderboardscore.getTimestampMillis();
        zzamV = leaderboardscore.getScoreHolderDisplayName();
        zzamW = leaderboardscore.getScoreHolderIconImageUri();
        zzamX = leaderboardscore.getScoreHolderHiResImageUri();
        Object obj = leaderboardscore.getScoreHolder();
        if(obj == null)
            obj = null;
        else
            obj = (PlayerEntity)((Player) (obj)).freeze();
        zzamY = ((PlayerEntity) (obj));
        zzamZ = leaderboardscore.getScoreTag();
        zzana = leaderboardscore.getScoreHolderIconImageUrl();
        zzanb = leaderboardscore.getScoreHolderHiResImageUrl();
    }

    static int zza(LeaderboardScore leaderboardscore)
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(leaderboardscore.getRank()), leaderboardscore.getDisplayRank(), Long.valueOf(leaderboardscore.getRawScore()), leaderboardscore.getDisplayScore(), Long.valueOf(leaderboardscore.getTimestampMillis()), leaderboardscore.getScoreHolderDisplayName(), leaderboardscore.getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolder()
        });
    }

    static boolean zza(LeaderboardScore leaderboardscore, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof LeaderboardScore) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(leaderboardscore == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardScore)obj;
        if(!zzu.equal(Long.valueOf(((LeaderboardScore) (obj)).getRank()), Long.valueOf(leaderboardscore.getRank())) || !zzu.equal(((LeaderboardScore) (obj)).getDisplayRank(), leaderboardscore.getDisplayRank()) || !zzu.equal(Long.valueOf(((LeaderboardScore) (obj)).getRawScore()), Long.valueOf(leaderboardscore.getRawScore())) || !zzu.equal(((LeaderboardScore) (obj)).getDisplayScore(), leaderboardscore.getDisplayScore()) || !zzu.equal(Long.valueOf(((LeaderboardScore) (obj)).getTimestampMillis()), Long.valueOf(leaderboardscore.getTimestampMillis())) || !zzu.equal(((LeaderboardScore) (obj)).getScoreHolderDisplayName(), leaderboardscore.getScoreHolderDisplayName()) || !zzu.equal(((LeaderboardScore) (obj)).getScoreHolderIconImageUri(), leaderboardscore.getScoreHolderIconImageUri()) || !zzu.equal(((LeaderboardScore) (obj)).getScoreHolderHiResImageUri(), leaderboardscore.getScoreHolderHiResImageUri()) || !zzu.equal(((LeaderboardScore) (obj)).getScoreHolder(), leaderboardscore.getScoreHolder()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((LeaderboardScore) (obj)).getScoreTag(), leaderboardscore.getScoreTag())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(LeaderboardScore leaderboardscore)
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(leaderboardscore).zzg("Rank", Long.valueOf(leaderboardscore.getRank())).zzg("DisplayRank", leaderboardscore.getDisplayRank()).zzg("Score", Long.valueOf(leaderboardscore.getRawScore())).zzg("DisplayScore", leaderboardscore.getDisplayScore()).zzg("Timestamp", Long.valueOf(leaderboardscore.getTimestampMillis())).zzg("DisplayName", leaderboardscore.getScoreHolderDisplayName()).zzg("IconImageUri", leaderboardscore.getScoreHolderIconImageUri()).zzg("IconImageUrl", leaderboardscore.getScoreHolderIconImageUrl()).zzg("HiResImageUri", leaderboardscore.getScoreHolderHiResImageUri()).zzg("HiResImageUrl", leaderboardscore.getScoreHolderHiResImageUrl());
        Player player;
        if(leaderboardscore.getScoreHolder() == null)
            player = null;
        else
            player = leaderboardscore.getScoreHolder();
        return zza1.zzg("Player", player).zzg("ScoreTag", leaderboardscore.getScoreTag()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzsc();
    }

    public String getDisplayRank()
    {
        return zzamR;
    }

    public void getDisplayRank(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzamR, chararraybuffer);
    }

    public String getDisplayScore()
    {
        return zzamS;
    }

    public void getDisplayScore(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzamS, chararraybuffer);
    }

    public long getRank()
    {
        return zzamQ;
    }

    public long getRawScore()
    {
        return zzamT;
    }

    public Player getScoreHolder()
    {
        return zzamY;
    }

    public String getScoreHolderDisplayName()
    {
        if(zzamY == null)
            return zzamV;
        else
            return zzamY.getDisplayName();
    }

    public void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer)
    {
        if(zzamY == null)
        {
            zzhu.zzb(zzamV, chararraybuffer);
            return;
        } else
        {
            zzamY.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getScoreHolderHiResImageUri()
    {
        if(zzamY == null)
            return zzamX;
        else
            return zzamY.getHiResImageUri();
    }

    public String getScoreHolderHiResImageUrl()
    {
        if(zzamY == null)
            return zzanb;
        else
            return zzamY.getHiResImageUrl();
    }

    public Uri getScoreHolderIconImageUri()
    {
        if(zzamY == null)
            return zzamW;
        else
            return zzamY.getIconImageUri();
    }

    public String getScoreHolderIconImageUrl()
    {
        if(zzamY == null)
            return zzana;
        else
            return zzamY.getIconImageUrl();
    }

    public String getScoreTag()
    {
        return zzamZ;
    }

    public long getTimestampMillis()
    {
        return zzamU;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public LeaderboardScore zzsc()
    {
        return this;
    }

    private final long zzamQ;
    private final String zzamR;
    private final String zzamS;
    private final long zzamT;
    private final long zzamU;
    private final String zzamV;
    private final Uri zzamW;
    private final Uri zzamX;
    private final PlayerEntity zzamY;
    private final String zzamZ;
    private final String zzana;
    private final String zzanb;
}
