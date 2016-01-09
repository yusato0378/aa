// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity, SnapshotMetadata

public abstract class SnapshotMetadataChange
{
    public static final class Builder
    {

        public SnapshotMetadataChange build()
        {
            return new SnapshotMetadataChangeEntity(zzadH, zzaoy, zzaoA, zzaoB, zzaoz);
        }

        public Builder fromMetadata(SnapshotMetadata snapshotmetadata)
        {
            zzadH = snapshotmetadata.getDescription();
            zzaoy = Long.valueOf(snapshotmetadata.getPlayedTime());
            zzaoz = Long.valueOf(snapshotmetadata.getProgressValue());
            if(zzaoy.longValue() == -1L)
                zzaoy = null;
            zzaoB = snapshotmetadata.getCoverImageUri();
            if(zzaoB != null)
                zzaoA = null;
            return this;
        }

        public Builder setCoverImage(Bitmap bitmap)
        {
            zzaoA = new BitmapTeleporter(bitmap);
            zzaoB = null;
            return this;
        }

        public Builder setDescription(String s)
        {
            zzadH = s;
            return this;
        }

        public Builder setPlayedTimeMillis(long l)
        {
            zzaoy = Long.valueOf(l);
            return this;
        }

        public Builder setProgressValue(long l)
        {
            zzaoz = Long.valueOf(l);
            return this;
        }

        private String zzadH;
        private BitmapTeleporter zzaoA;
        private Uri zzaoB;
        private Long zzaoy;
        private Long zzaoz;

        public Builder()
        {
        }
    }


    protected SnapshotMetadataChange()
    {
    }

    public abstract Bitmap getCoverImage();

    public abstract String getDescription();

    public abstract Long getPlayedTimeMillis();

    public abstract Long getProgressValue();

    public abstract BitmapTeleporter zzsm();

    public static final SnapshotMetadataChange EMPTY_CHANGE = new SnapshotMetadataChangeEntity();

}
