// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzhu;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            Leaderboard, LeaderboardVariant, LeaderboardVariantEntity

public final class LeaderboardEntity
    implements Leaderboard
{

    public LeaderboardEntity(Leaderboard leaderboard)
    {
        zzamL = leaderboard.getLeaderboardId();
        zzWF = leaderboard.getDisplayName();
        zzafY = leaderboard.getIconImageUri();
        zzagj = leaderboard.getIconImageUrl();
        zzamM = leaderboard.getScoreOrder();
        Object obj = leaderboard.getGame();
        int j;
        if(obj == null)
            obj = null;
        else
            obj = new GameEntity(((Game) (obj)));
        zzamO = ((Game) (obj));
        leaderboard = leaderboard.getVariants();
        j = leaderboard.size();
        zzamN = new ArrayList(j);
        for(int i = 0; i < j; i++)
            zzamN.add((LeaderboardVariantEntity)(LeaderboardVariantEntity)((LeaderboardVariant)leaderboard.get(i)).freeze());

    }

    static int zza(Leaderboard leaderboard)
    {
        return zzu.hashCode(new Object[] {
            leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants()
        });
    }

    static boolean zza(Leaderboard leaderboard, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof Leaderboard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(leaderboard == obj) goto _L4; else goto _L3
_L3:
        obj = (Leaderboard)obj;
        if(!zzu.equal(((Leaderboard) (obj)).getLeaderboardId(), leaderboard.getLeaderboardId()) || !zzu.equal(((Leaderboard) (obj)).getDisplayName(), leaderboard.getDisplayName()) || !zzu.equal(((Leaderboard) (obj)).getIconImageUri(), leaderboard.getIconImageUri()) || !zzu.equal(Integer.valueOf(((Leaderboard) (obj)).getScoreOrder()), Integer.valueOf(leaderboard.getScoreOrder())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(((Leaderboard) (obj)).getVariants(), leaderboard.getVariants())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Leaderboard leaderboard)
    {
        return zzu.zzq(leaderboard).zzg("LeaderboardId", leaderboard.getLeaderboardId()).zzg("DisplayName", leaderboard.getDisplayName()).zzg("IconImageUri", leaderboard.getIconImageUri()).zzg("IconImageUrl", leaderboard.getIconImageUrl()).zzg("ScoreOrder", Integer.valueOf(leaderboard.getScoreOrder())).zzg("Variants", leaderboard.getVariants()).toString();
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzrZ();
    }

    public String getDisplayName()
    {
        return zzWF;
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzWF, chararraybuffer);
    }

    public Game getGame()
    {
        return zzamO;
    }

    public Uri getIconImageUri()
    {
        return zzafY;
    }

    public String getIconImageUrl()
    {
        return zzagj;
    }

    public String getLeaderboardId()
    {
        return zzamL;
    }

    public int getScoreOrder()
    {
        return zzamM;
    }

    public ArrayList getVariants()
    {
        return new ArrayList(zzamN);
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

    public Leaderboard zzrZ()
    {
        return this;
    }

    private final String zzWF;
    private final Uri zzafY;
    private final String zzagj;
    private final String zzamL;
    private final int zzamM;
    private final ArrayList zzamN;
    private final Game zzamO;
}
