// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelCreator

public final class PlayerLevel
    implements SafeParcelable
{

    PlayerLevel(int i, int j, long l, long l1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if(l >= 0L)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Min XP must be positive!");
        if(l1 > l)
            flag = flag1;
        else
            flag = false;
        zzv.zza(flag, "Max XP must be more than min XP!");
        zzzH = i;
        zzagK = j;
        zzagL = l;
        zzagM = l1;
    }

    public PlayerLevel(int i, long l, long l1)
    {
        this(1, i, l, l1);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof PlayerLevel) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(this == obj) goto _L4; else goto _L3
_L3:
        obj = (PlayerLevel)obj;
        if(!zzu.equal(Integer.valueOf(((PlayerLevel) (obj)).getLevelNumber()), Integer.valueOf(getLevelNumber())) || !zzu.equal(Long.valueOf(((PlayerLevel) (obj)).getMinXp()), Long.valueOf(getMinXp())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Long.valueOf(((PlayerLevel) (obj)).getMaxXp()), Long.valueOf(getMaxXp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int getLevelNumber()
    {
        return zzagK;
    }

    public long getMaxXp()
    {
        return zzagM;
    }

    public long getMinXp()
    {
        return zzagL;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzagK), Long.valueOf(zzagL), Long.valueOf(zzagM)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("LevelNumber", Integer.valueOf(getLevelNumber())).zzg("MinXp", Long.valueOf(getMinXp())).zzg("MaxXp", Long.valueOf(getMaxXp())).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlayerLevelCreator.zza(this, parcel, i);
    }

    public static final PlayerLevelCreator CREATOR = new PlayerLevelCreator();
    private final int zzagK;
    private final long zzagL;
    private final long zzagM;
    private final int zzzH;

}
