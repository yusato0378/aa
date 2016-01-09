// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity, ParticipantResult

public final class ParticipantRef extends zzc
    implements Participant
{

    public ParticipantRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        zzanz = new PlayerRef(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return ParticipantEntity.zza(this, obj);
    }

    public Participant freeze()
    {
        return new ParticipantEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public int getCapabilities()
    {
        return getInteger("capabilities");
    }

    public String getDisplayName()
    {
        if(zzbH("external_player_id"))
            return getString("default_display_name");
        else
            return zzanz.getDisplayName();
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        if(zzbH("external_player_id"))
        {
            zza("default_display_name", chararraybuffer);
            return;
        } else
        {
            zzanz.getDisplayName(chararraybuffer);
            return;
        }
    }

    public Uri getHiResImageUri()
    {
        if(zzbH("external_player_id"))
            return zzbG("default_display_hi_res_image_uri");
        else
            return zzanz.getHiResImageUri();
    }

    public String getHiResImageUrl()
    {
        if(zzbH("external_player_id"))
            return getString("default_display_hi_res_image_url");
        else
            return zzanz.getHiResImageUrl();
    }

    public Uri getIconImageUri()
    {
        if(zzbH("external_player_id"))
            return zzbG("default_display_image_uri");
        else
            return zzanz.getIconImageUri();
    }

    public String getIconImageUrl()
    {
        if(zzbH("external_player_id"))
            return getString("default_display_image_url");
        else
            return zzanz.getIconImageUrl();
    }

    public String getParticipantId()
    {
        return getString("external_participant_id");
    }

    public Player getPlayer()
    {
        if(zzbH("external_player_id"))
            return null;
        else
            return zzanz;
    }

    public ParticipantResult getResult()
    {
        if(zzbH("result_type"))
        {
            return null;
        } else
        {
            int i = getInteger("result_type");
            int j = getInteger("placing");
            return new ParticipantResult(getParticipantId(), i, j);
        }
    }

    public int getStatus()
    {
        return getInteger("player_status");
    }

    public int hashCode()
    {
        return ParticipantEntity.zza(this);
    }

    public boolean isConnectedToRoom()
    {
        return getInteger("connected") > 0;
    }

    public String toString()
    {
        return ParticipantEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((ParticipantEntity)freeze()).writeToParcel(parcel, i);
    }

    public String zzqA()
    {
        return getString("client_address");
    }

    private final PlayerRef zzanz;
}
