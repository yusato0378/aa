// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.snapshot;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.snapshot:
//            SnapshotMetadataChangeEntity

public class SnapshotMetadataChangeCreator
    implements android.os.Parcelable.Creator
{

    public SnapshotMetadataChangeCreator()
    {
    }

    static void zza(SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, snapshotmetadatachangeentity.getDescription(), false);
        zzb.zzc(parcel, 1000, snapshotmetadatachangeentity.getVersionCode());
        zzb.zza(parcel, 2, snapshotmetadatachangeentity.getPlayedTimeMillis(), false);
        zzb.zza(parcel, 4, snapshotmetadatachangeentity.getCoverImageUri(), i, false);
        zzb.zza(parcel, 5, snapshotmetadatachangeentity.zzsm(), i, false);
        zzb.zza(parcel, 6, snapshotmetadatachangeentity.getProgressValue(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdx(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfr(i);
    }

    public SnapshotMetadataChangeEntity zzdx(Parcel parcel)
    {
        Long long1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        Uri uri = null;
        BitmapTeleporter bitmapteleporter = null;
        Long long2 = null;
        String s = null;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    long2 = com.google.android.gms.common.internal.safeparcel.zza.zzj(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    bitmapteleporter = (BitmapTeleporter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, BitmapTeleporter.CREATOR);
                    break;

                case 6: // '\006'
                    long1 = com.google.android.gms.common.internal.safeparcel.zza.zzj(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new SnapshotMetadataChangeEntity(i, s, long2, bitmapteleporter, uri, long1);
        while(true);
    }

    public SnapshotMetadataChangeEntity[] zzfr(int i)
    {
        return new SnapshotMetadataChangeEntity[i];
    }
}
