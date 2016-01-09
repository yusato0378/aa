// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.*;
import com.google.android.gms.internal.zzhu;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadata, SnapshotMetadataEntityCreator

public final class SnapshotMetadataEntity
    implements SafeParcelable, SnapshotMetadata
{

    SnapshotMetadataEntity(int i, GameEntity gameentity, PlayerEntity playerentity, String s, Uri uri, String s1, String s2, 
            String s3, long l, long l1, float f, String s4, 
            boolean flag, long l2)
    {
        zzzH = i;
        zzalP = gameentity;
        zzaoE = playerentity;
        zzaia = s;
        zzaoB = uri;
        zzaoF = s1;
        zzaoI = f;
        zzWn = s2;
        zzadH = s3;
        zzaoG = l;
        zzaoH = l1;
        zzaoJ = s4;
        zzaoK = flag;
        zzaoL = l2;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotmetadata)
    {
        zzzH = 5;
        zzalP = new GameEntity(snapshotmetadata.getGame());
        zzaoE = new PlayerEntity(snapshotmetadata.getOwner());
        zzaia = snapshotmetadata.getSnapshotId();
        zzaoB = snapshotmetadata.getCoverImageUri();
        zzaoF = snapshotmetadata.getCoverImageUrl();
        zzaoI = snapshotmetadata.getCoverImageAspectRatio();
        zzWn = snapshotmetadata.getTitle();
        zzadH = snapshotmetadata.getDescription();
        zzaoG = snapshotmetadata.getLastModifiedTimestamp();
        zzaoH = snapshotmetadata.getPlayedTime();
        zzaoJ = snapshotmetadata.getUniqueName();
        zzaoK = snapshotmetadata.hasChangePending();
        zzaoL = snapshotmetadata.getProgressValue();
    }

    static int zza(SnapshotMetadata snapshotmetadata)
    {
        return zzu.hashCode(new Object[] {
            snapshotmetadata.getGame(), snapshotmetadata.getOwner(), snapshotmetadata.getSnapshotId(), snapshotmetadata.getCoverImageUri(), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio()), snapshotmetadata.getTitle(), snapshotmetadata.getDescription(), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getPlayedTime()), snapshotmetadata.getUniqueName(), 
            Boolean.valueOf(snapshotmetadata.hasChangePending()), Long.valueOf(snapshotmetadata.getProgressValue())
        });
    }

    static boolean zza(SnapshotMetadata snapshotmetadata, Object obj)
    {
        boolean flag1 = true;
        if(obj instanceof SnapshotMetadata) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if(snapshotmetadata == obj) goto _L4; else goto _L3
_L3:
        obj = (SnapshotMetadata)obj;
        if(!zzu.equal(((SnapshotMetadata) (obj)).getGame(), snapshotmetadata.getGame()) || !zzu.equal(((SnapshotMetadata) (obj)).getOwner(), snapshotmetadata.getOwner()) || !zzu.equal(((SnapshotMetadata) (obj)).getSnapshotId(), snapshotmetadata.getSnapshotId()) || !zzu.equal(((SnapshotMetadata) (obj)).getCoverImageUri(), snapshotmetadata.getCoverImageUri()) || !zzu.equal(Float.valueOf(((SnapshotMetadata) (obj)).getCoverImageAspectRatio()), Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())) || !zzu.equal(((SnapshotMetadata) (obj)).getTitle(), snapshotmetadata.getTitle()) || !zzu.equal(((SnapshotMetadata) (obj)).getDescription(), snapshotmetadata.getDescription()) || !zzu.equal(Long.valueOf(((SnapshotMetadata) (obj)).getLastModifiedTimestamp()), Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())) || !zzu.equal(Long.valueOf(((SnapshotMetadata) (obj)).getPlayedTime()), Long.valueOf(snapshotmetadata.getPlayedTime())) || !zzu.equal(((SnapshotMetadata) (obj)).getUniqueName(), snapshotmetadata.getUniqueName()) || !zzu.equal(Boolean.valueOf(((SnapshotMetadata) (obj)).hasChangePending()), Boolean.valueOf(snapshotmetadata.hasChangePending())))
            break; /* Loop/switch isn't completed */
        flag = flag1;
        if(zzu.equal(Long.valueOf(((SnapshotMetadata) (obj)).getProgressValue()), Long.valueOf(snapshotmetadata.getProgressValue()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(SnapshotMetadata snapshotmetadata)
    {
        return zzu.zzq(snapshotmetadata).zzg("Game", snapshotmetadata.getGame()).zzg("Owner", snapshotmetadata.getOwner()).zzg("SnapshotId", snapshotmetadata.getSnapshotId()).zzg("CoverImageUri", snapshotmetadata.getCoverImageUri()).zzg("CoverImageUrl", snapshotmetadata.getCoverImageUrl()).zzg("CoverImageAspectRatio", Float.valueOf(snapshotmetadata.getCoverImageAspectRatio())).zzg("Description", snapshotmetadata.getDescription()).zzg("LastModifiedTimestamp", Long.valueOf(snapshotmetadata.getLastModifiedTimestamp())).zzg("PlayedTime", Long.valueOf(snapshotmetadata.getPlayedTime())).zzg("UniqueName", snapshotmetadata.getUniqueName()).zzg("ChangePending", Boolean.valueOf(snapshotmetadata.hasChangePending())).zzg("ProgressValue", Long.valueOf(snapshotmetadata.getProgressValue())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public SnapshotMetadata freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public float getCoverImageAspectRatio()
    {
        return zzaoI;
    }

    public Uri getCoverImageUri()
    {
        return zzaoB;
    }

    public String getCoverImageUrl()
    {
        return zzaoF;
    }

    public String getDescription()
    {
        return zzadH;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzhu.zzb(zzadH, chararraybuffer);
    }

    public Game getGame()
    {
        return zzalP;
    }

    public long getLastModifiedTimestamp()
    {
        return zzaoG;
    }

    public Player getOwner()
    {
        return zzaoE;
    }

    public long getPlayedTime()
    {
        return zzaoH;
    }

    public long getProgressValue()
    {
        return zzaoL;
    }

    public String getSnapshotId()
    {
        return zzaia;
    }

    public String getTitle()
    {
        return zzWn;
    }

    public String getUniqueName()
    {
        return zzaoJ;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean hasChangePending()
    {
        return zzaoK;
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

    public void writeToParcel(Parcel parcel, int i)
    {
        SnapshotMetadataEntityCreator.zza(this, parcel, i);
    }

    public static final SnapshotMetadataEntityCreator CREATOR = new SnapshotMetadataEntityCreator();
    private final String zzWn;
    private final String zzadH;
    private final String zzaia;
    private final GameEntity zzalP;
    private final Uri zzaoB;
    private final PlayerEntity zzaoE;
    private final String zzaoF;
    private final long zzaoG;
    private final long zzaoH;
    private final float zzaoI;
    private final String zzaoJ;
    private final boolean zzaoK;
    private final long zzaoL;
    private final int zzzH;

}
