// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfoCreator, PlayerLevel

public final class PlayerLevelInfo
    implements SafeParcelable
{

    PlayerLevelInfo(int i, long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        boolean flag;
        if(l != -1L)
            flag = true;
        else
            flag = false;
        zzv.zzP(flag);
        zzv.zzr(playerlevel);
        zzv.zzr(playerlevel1);
        zzzH = i;
        zzagN = l;
        zzagO = l1;
        zzagP = playerlevel;
        zzagQ = playerlevel1;
    }

    public PlayerLevelInfo(long l, long l1, PlayerLevel playerlevel, PlayerLevel playerlevel1)
    {
        this(1, l, l1, playerlevel, playerlevel1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof PlayerLevelInfo) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(obj == this) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevelInfo)obj;
        if(!zzu.equal(Long.valueOf(zzagN), Long.valueOf(((PlayerLevelInfo) (obj)).zzagN)) || !zzu.equal(Long.valueOf(zzagO), Long.valueOf(((PlayerLevelInfo) (obj)).zzagO)) || !zzu.equal(zzagP, ((PlayerLevelInfo) (obj)).zzagP))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(zzagQ, ((PlayerLevelInfo) (obj)).zzagQ)) goto _L4; else goto _L5
_L5:
        return false;
    }

    public PlayerLevel getCurrentLevel()
    {
        return zzagP;
    }

    public long getCurrentXpTotal()
    {
        return zzagN;
    }

    public long getLastLevelUpTimestamp()
    {
        return zzagO;
    }

    public PlayerLevel getNextLevel()
    {
        return zzagQ;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzagN), Long.valueOf(zzagO), zzagP, zzagQ
        });
    }

    public boolean isMaxLevel()
    {
        return zzagP.equals(zzagQ);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelInfoCreator.zza(this, parcel, i);
    }

    public static final PlayerLevelInfoCreator CREATOR = new PlayerLevelInfoCreator();
    private final long zzagN;
    private final long zzagO;
    private final PlayerLevel zzagP;
    private final PlayerLevel zzagQ;
    private final int zzzH;

}
