// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.game;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            ExtendedGameEntity, GameBadgeEntity

public class ExtendedGameEntityCreator
    implements android.os.Parcelable.Creator
{

    public ExtendedGameEntityCreator()
    {
    }

    static void zza(ExtendedGameEntity extendedgameentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, extendedgameentity.zzrB(), i, false);
        zzb.zzc(parcel, 1000, extendedgameentity.getVersionCode());
        zzb.zzc(parcel, 2, extendedgameentity.zzrs());
        zzb.zza(parcel, 3, extendedgameentity.zzrt());
        zzb.zzc(parcel, 4, extendedgameentity.zzru());
        zzb.zza(parcel, 5, extendedgameentity.zzrv());
        zzb.zza(parcel, 6, extendedgameentity.zzrw());
        zzb.zza(parcel, 7, extendedgameentity.zzrx(), false);
        zzb.zza(parcel, 8, extendedgameentity.zzry());
        zzb.zza(parcel, 9, extendedgameentity.zzrz(), false);
        zzb.zzc(parcel, 10, extendedgameentity.zzrr(), false);
        zzb.zza(parcel, 11, extendedgameentity.zzrA(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdn(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfb(i);
    }

    public ExtendedGameEntity zzdn(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int k = 0;
        GameEntity gameentity = null;
        int j = 0;
        boolean flag = false;
        int i = 0;
        long l3 = 0L;
        long l2 = 0L;
        String s1 = null;
        long l1 = 0L;
        String s = null;
        java.util.ArrayList arraylist = null;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        do
            if(parcel.dataPosition() < l)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, i1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 5: // '\005'
                    l3 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 6: // '\006'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, i1);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, GameBadgeEntity.CREATOR);
                    break;

                case 11: // '\013'
                    snapshotmetadataentity = (SnapshotMetadataEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, SnapshotMetadataEntity.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new ExtendedGameEntity(k, gameentity, j, flag, i, l3, l2, s1, l1, s, arraylist, snapshotmetadataentity);
        while(true);
    }

    public ExtendedGameEntity[] zzfb(int i)
    {
        return new ExtendedGameEntity[i];
    }
}
