// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

// Referenced classes of package com.google.android.gms.games.internal.player:
//            MostRecentGameInfo, MostRecentGameInfoEntity, PlayerColumnNames

public final class MostRecentGameInfoRef extends zzc
    implements MostRecentGameInfo
{

    public MostRecentGameInfoRef(DataHolder dataholder, int i, PlayerColumnNames playercolumnnames)
    {
        super(dataholder, i);
        zzagR = playercolumnnames;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return MostRecentGameInfoEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzrV();
    }

    public int hashCode()
    {
        return MostRecentGameInfoEntity.zza(this);
    }

    public String toString()
    {
        return MostRecentGameInfoEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((MostRecentGameInfoEntity)zzrV()).writeToParcel(parcel, i);
    }

    public String zzrP()
    {
        return getString(zzagR.zzamB);
    }

    public String zzrQ()
    {
        return getString(zzagR.zzamC);
    }

    public long zzrR()
    {
        return getLong(zzagR.zzamD);
    }

    public Uri zzrS()
    {
        return zzbG(zzagR.zzamE);
    }

    public Uri zzrT()
    {
        return zzbG(zzagR.zzamF);
    }

    public Uri zzrU()
    {
        return zzbG(zzagR.zzamG);
    }

    public MostRecentGameInfo zzrV()
    {
        return new MostRecentGameInfoEntity(this);
    }

    private final PlayerColumnNames zzagR;
}
