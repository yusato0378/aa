// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGame, ExtendedGameEntity, GameBadgeRef

public class ExtendedGameRef extends zzc
    implements ExtendedGame
{

    ExtendedGameRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzalO = new GameRef(dataholder, i);
        zzahA = j;
        if(zzbF("external_snapshot_id") && !zzbH("external_snapshot_id"))
        {
            zzama = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            zzama = null;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return ExtendedGameEntity.zza(this, obj);
    }

    public Object freeze()
    {
        return zzrC();
    }

    public Game getGame()
    {
        return zzalO;
    }

    public int hashCode()
    {
        return ExtendedGameEntity.zza(this);
    }

    public String toString()
    {
        return ExtendedGameEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ExtendedGameEntity)zzrC()).writeToParcel(parcel, i);
    }

    public SnapshotMetadata zzrA()
    {
        return zzama;
    }

    public ExtendedGame zzrC()
    {
        return new ExtendedGameEntity(this);
    }

    public ArrayList zzrr()
    {
        int i = 0;
        if(zzPy.zzd("badge_title", zzRw, zzPy.zzaD(zzRw)) == null)
            return new ArrayList(0);
        ArrayList arraylist = new ArrayList(zzahA);
        for(; i < zzahA; i++)
            arraylist.add(new GameBadgeRef(zzPy, zzRw + i));

        return arraylist;
    }

    public int zzrs()
    {
        return getInteger("availability");
    }

    public boolean zzrt()
    {
        return getBoolean("owned");
    }

    public int zzru()
    {
        return getInteger("achievement_unlocked_count");
    }

    public long zzrv()
    {
        return getLong("last_played_server_time");
    }

    public long zzrw()
    {
        return getLong("price_micros");
    }

    public String zzrx()
    {
        return getString("formatted_price");
    }

    public long zzry()
    {
        return getLong("full_price_micros");
    }

    public String zzrz()
    {
        return getString("formatted_full_price");
    }

    private final int zzahA;
    private final GameRef zzalO;
    private final SnapshotMetadataRef zzama;
}
