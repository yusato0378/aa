// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotEntity, SnapshotMetadataEntity, SnapshotContentsEntity

public class SnapshotEntityCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotEntityCreator()
    {
    }

    static void zza(SnapshotEntity snapshotentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, snapshotentity.getMetadata(), i, false);
        zzb.zzc(parcel, 1000, snapshotentity.getVersionCode());
        zzb.zza(parcel, 3, snapshotentity.getSnapshotContents(), i, false);
        zzb.zzH(parcel, j);
    }

    public SnapshotEntity createFromParcel(Parcel parcel)
    {
        SnapshotContentsEntity snapshotcontentsentity = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        do
            if(parcel.dataPosition() < j)
            {
                int k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
                    break;

                case 1: // '\001'
                    snapshotmetadataentity = (SnapshotMetadataEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, SnapshotMetadataEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 3: // '\003'
                    snapshotcontentsentity = (SnapshotContentsEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, SnapshotContentsEntity.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new SnapshotEntity(i, snapshotmetadataentity, snapshotcontentsentity);
        while(true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public SnapshotEntity[] newArray(int i)
    {
        return new SnapshotEntity[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    public static final int CONTENT_DESCRIPTION = 0;
}
