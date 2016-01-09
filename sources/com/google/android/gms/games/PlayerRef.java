// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.internal.player.MostRecentGameInfoRef;
import com.google.android.gms.games.internal.player.PlayerColumnNames;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerLevel, PlayerLevelInfo, PlayerEntity

public final class PlayerRef extends zzc
    implements Player
{

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        zzagR = new PlayerColumnNames(s);
        zzagS = new MostRecentGameInfoRef(dataholder, i, zzagR);
        if(zzpV())
        {
            i = getInteger(zzagR.zzams);
            int j = getInteger(zzagR.zzamv);
            s = new PlayerLevel(i, getLong(zzagR.zzamt), getLong(zzagR.zzamu));
            if(i != j)
                dataholder = new PlayerLevel(j, getLong(zzagR.zzamu), getLong(zzagR.zzamw));
            else
                dataholder = s;
            zzagH = new PlayerLevelInfo(getLong(zzagR.zzamr), getLong(zzagR.zzamx), s, dataholder);
            return;
        } else
        {
            zzagH = null;
            return;
        }
    }

    private boolean zzpV()
    {
        while(zzbH(zzagR.zzamr) || getLong(zzagR.zzamr) == -1L) 
            return false;
        return true;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return PlayerEntity.zza(this, obj);
    }

    public Player freeze()
    {
        return new PlayerEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return getString(zzagR.zzamj);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        zza(zzagR.zzamj, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return zzbG(zzagR.zzamm);
    }

    public String getHiResImageUrl()
    {
        return getString(zzagR.zzamn);
    }

    public Uri getIconImageUri()
    {
        return zzbG(zzagR.zzamk);
    }

    public String getIconImageUrl()
    {
        return getString(zzagR.zzaml);
    }

    public long getLastPlayedWithTimestamp()
    {
        if(!zzbF(zzagR.zzamq) || zzbH(zzagR.zzamq))
            return -1L;
        else
            return getLong(zzagR.zzamq);
    }

    public PlayerLevelInfo getLevelInfo()
    {
        return zzagH;
    }

    public String getPlayerId()
    {
        return getString(zzagR.zzami);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(zzagR.zzamo);
    }

    public String getTitle()
    {
        return getString(zzagR.zzamy);
    }

    public void getTitle(CharArrayBuffer chararraybuffer)
    {
        zza(zzagR.zzamy, chararraybuffer);
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public int hashCode()
    {
        return PlayerEntity.zzb(this);
    }

    public boolean isProfileVisible()
    {
        return getBoolean(zzagR.zzamA);
    }

    public String toString()
    {
        return com.google.android.gms.games.PlayerEntity.zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }

    public boolean zzpS()
    {
        return getBoolean(zzagR.zzamH);
    }

    public int zzpT()
    {
        return getInteger(zzagR.zzamp);
    }

    public MostRecentGameInfo zzpU()
    {
        if(zzbH(zzagR.zzamB))
            return null;
        else
            return zzagS;
    }

    private final PlayerLevelInfo zzagH;
    private final PlayerColumnNames zzagR;
    private final MostRecentGameInfoRef zzagS;
}
