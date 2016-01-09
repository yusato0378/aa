// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            LeaderboardVariant

public final class LeaderboardVariantEntity
    implements LeaderboardVariant
{

    public LeaderboardVariantEntity(LeaderboardVariant leaderboardvariant)
    {
        zzand = leaderboardvariant.getTimeSpan();
        zzane = leaderboardvariant.getCollection();
        zzanf = leaderboardvariant.hasPlayerInfo();
        zzang = leaderboardvariant.getRawPlayerScore();
        zzanh = leaderboardvariant.getDisplayPlayerScore();
        zzani = leaderboardvariant.getPlayerRank();
        zzanj = leaderboardvariant.getDisplayPlayerRank();
        zzank = leaderboardvariant.getPlayerScoreTag();
        zzanl = leaderboardvariant.getNumScores();
        zzanm = leaderboardvariant.zzsd();
        zzann = leaderboardvariant.zzse();
        zzano = leaderboardvariant.zzsf();
    }

    static int zza(LeaderboardVariant leaderboardvariant)
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(leaderboardvariant.getTimeSpan()), Integer.valueOf(leaderboardvariant.getCollection()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo()), Long.valueOf(leaderboardvariant.getRawPlayerScore()), leaderboardvariant.getDisplayPlayerScore(), Long.valueOf(leaderboardvariant.getPlayerRank()), leaderboardvariant.getDisplayPlayerRank(), Long.valueOf(leaderboardvariant.getNumScores()), leaderboardvariant.zzsd(), leaderboardvariant.zzsf(), 
            leaderboardvariant.zzse()
        });
    }

    static boolean zza(LeaderboardVariant leaderboardvariant, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof LeaderboardVariant) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(leaderboardvariant == obj) goto _L4; else goto _L3
_L3:
        obj = (LeaderboardVariant)obj;
        if(!zzu.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getTimeSpan()), Integer.valueOf(leaderboardvariant.getTimeSpan())) || !zzu.equal(Integer.valueOf(((LeaderboardVariant) (obj)).getCollection()), Integer.valueOf(leaderboardvariant.getCollection())) || !zzu.equal(Boolean.valueOf(((LeaderboardVariant) (obj)).hasPlayerInfo()), Boolean.valueOf(leaderboardvariant.hasPlayerInfo())) || !zzu.equal(Long.valueOf(((LeaderboardVariant) (obj)).getRawPlayerScore()), Long.valueOf(leaderboardvariant.getRawPlayerScore())) || !zzu.equal(((LeaderboardVariant) (obj)).getDisplayPlayerScore(), leaderboardvariant.getDisplayPlayerScore()) || !zzu.equal(Long.valueOf(((LeaderboardVariant) (obj)).getPlayerRank()), Long.valueOf(leaderboardvariant.getPlayerRank())) || !zzu.equal(((LeaderboardVariant) (obj)).getDisplayPlayerRank(), leaderboardvariant.getDisplayPlayerRank()) || !zzu.equal(Long.valueOf(((LeaderboardVariant) (obj)).getNumScores()), Long.valueOf(leaderboardvariant.getNumScores())) || !zzu.equal(((LeaderboardVariant) (obj)).zzsd(), leaderboardvariant.zzsd()) || !zzu.equal(((LeaderboardVariant) (obj)).zzsf(), leaderboardvariant.zzsf()))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((LeaderboardVariant) (obj)).zzse(), leaderboardvariant.zzse())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(LeaderboardVariant leaderboardvariant)
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(leaderboardvariant).zzg("TimeSpan", TimeSpan.zzeZ(leaderboardvariant.getTimeSpan())).zzg("Collection", LeaderboardCollection.zzeZ(leaderboardvariant.getCollection()));
        Object obj;
        if(leaderboardvariant.hasPlayerInfo())
            obj = Long.valueOf(leaderboardvariant.getRawPlayerScore());
        else
            obj = "none";
        zza1 = zza1.zzg("RawPlayerScore", obj);
        if(leaderboardvariant.hasPlayerInfo())
            obj = leaderboardvariant.getDisplayPlayerScore();
        else
            obj = "none";
        zza1 = zza1.zzg("DisplayPlayerScore", obj);
        if(leaderboardvariant.hasPlayerInfo())
            obj = Long.valueOf(leaderboardvariant.getPlayerRank());
        else
            obj = "none";
        zza1 = zza1.zzg("PlayerRank", obj);
        if(leaderboardvariant.hasPlayerInfo())
            obj = leaderboardvariant.getDisplayPlayerRank();
        else
            obj = "none";
        return zza1.zzg("DisplayPlayerRank", obj).zzg("NumScores", Long.valueOf(leaderboardvariant.getNumScores())).zzg("TopPageNextToken", leaderboardvariant.zzsd()).zzg("WindowPageNextToken", leaderboardvariant.zzsf()).zzg("WindowPagePrevToken", leaderboardvariant.zzse()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzsg();
    }

    public int getCollection()
    {
        return zzane;
    }

    public String getDisplayPlayerRank()
    {
        return zzanj;
    }

    public String getDisplayPlayerScore()
    {
        return zzanh;
    }

    public long getNumScores()
    {
        return zzanl;
    }

    public long getPlayerRank()
    {
        return zzani;
    }

    public String getPlayerScoreTag()
    {
        return zzank;
    }

    public long getRawPlayerScore()
    {
        return zzang;
    }

    public int getTimeSpan()
    {
        return zzand;
    }

    public boolean hasPlayerInfo()
    {
        return zzanf;
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

    public String zzsd()
    {
        return zzanm;
    }

    public String zzse()
    {
        return zzann;
    }

    public String zzsf()
    {
        return zzano;
    }

    public LeaderboardVariant zzsg()
    {
        return this;
    }

    private final int zzand;
    private final int zzane;
    private final boolean zzanf;
    private final long zzang;
    private final String zzanh;
    private final long zzani;
    private final String zzanj;
    private final String zzank;
    private final long zzanl;
    private final String zzanm;
    private final String zzann;
    private final String zzano;
}
