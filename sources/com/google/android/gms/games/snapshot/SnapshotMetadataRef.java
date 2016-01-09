// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.games.*;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntity

public final class SnapshotMetadataRef extends zzc
    implements SnapshotMetadata
{

    public SnapshotMetadataRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        zzamO = new GameRef(dataholder, i);
        zzaoM = new PlayerRef(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return SnapshotMetadataEntity.zza(this, obj);
    }

    public SnapshotMetadata freeze()
    {
        return new SnapshotMetadataEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public float getCoverImageAspectRatio()
    {
        float f = getFloat("cover_icon_image_height");
        float f1 = getFloat("cover_icon_image_width");
        if(f == 0.0F)
            return 0.0F;
        else
            return f1 / f;
    }

    public Uri getCoverImageUri()
    {
        return zzbG("cover_icon_image_uri");
    }

    public String getCoverImageUrl()
    {
        return getString("cover_icon_image_url");
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zza("description", chararraybuffer);
    }

    public Game getGame()
    {
        return zzamO;
    }

    public long getLastModifiedTimestamp()
    {
        return getLong("last_modified_timestamp");
    }

    public Player getOwner()
    {
        return zzaoM;
    }

    public long getPlayedTime()
    {
        return getLong("duration");
    }

    public long getProgressValue()
    {
        return getLong("progress_value");
    }

    public String getSnapshotId()
    {
        return getString("external_snapshot_id");
    }

    public String getTitle()
    {
        return getString("title");
    }

    public String getUniqueName()
    {
        return getString("unique_name");
    }

    public boolean hasChangePending()
    {
        return getInteger("pending_change_count") > 0;
    }

    public int hashCode()
    {
        return SnapshotMetadataEntity.zza(this);
    }

    public String toString()
    {
        return SnapshotMetadataEntity.zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((SnapshotMetadataEntity)freeze()).writeToParcel(parcel, i);
    }

    private final Game zzamO;
    private final Player zzaoM;
}
