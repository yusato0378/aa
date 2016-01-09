// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntity

public final class GameRequestRef extends zzc
    implements GameRequest
{

    public GameRequestRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzahA = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return GameRequestEntity.zza(this, obj);
    }

    public GameRequest freeze()
    {
        return new GameRequestEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return getLong("creation_timestamp");
    }

    public byte[] getData()
    {
        return getByteArray("data");
    }

    public long getExpirationTimestamp()
    {
        return getLong("expiration_timestamp");
    }

    public Game getGame()
    {
        return new GameRef(zzPy, zzRw);
    }

    public int getRecipientStatus(String s)
    {
        for(int i = zzRw; i < zzRw + zzahA; i++)
        {
            int j = zzPy.zzaD(i);
            if(zzPy.zzd("recipient_external_player_id", i, j).equals(s))
                return zzPy.zzc("recipient_status", i, j);
        }

        return -1;
    }

    public List getRecipients()
    {
        ArrayList arraylist = new ArrayList(zzahA);
        for(int i = 0; i < zzahA; i++)
            arraylist.add(new PlayerRef(zzPy, zzRw + i, "recipient_"));

        return arraylist;
    }

    public String getRequestId()
    {
        return getString("external_request_id");
    }

    public Player getSender()
    {
        return new PlayerRef(zzPy, zzlp(), "sender_");
    }

    public int getStatus()
    {
        return getInteger("status");
    }

    public int getType()
    {
        return getInteger("type");
    }

    public int hashCode()
    {
        return GameRequestEntity.zza(this);
    }

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public String toString()
    {
        return com.google.android.gms.games.request.GameRequestEntity.zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameRequestEntity)freeze()).writeToParcel(parcel, i);
    }

    private final int zzahA;
}
