// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

// Referenced classes of package com.google.android.gms.games:
//            PlayerEntity, PlayerLevelInfo

public class PlayerEntityCreator
    implements android.os.Parcelable.Creator
{

    public PlayerEntityCreator()
    {
    }

    static void zza(PlayerEntity playerentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, playerentity.getPlayerId(), false);
        zzb.zza(parcel, 2, playerentity.getDisplayName(), false);
        zzb.zza(parcel, 3, playerentity.getIconImageUri(), i, false);
        zzb.zza(parcel, 4, playerentity.getHiResImageUri(), i, false);
        zzb.zza(parcel, 5, playerentity.getRetrievedTimestamp());
        zzb.zzc(parcel, 6, playerentity.zzpT());
        zzb.zza(parcel, 7, playerentity.getLastPlayedWithTimestamp());
        zzb.zza(parcel, 8, playerentity.getIconImageUrl(), false);
        zzb.zza(parcel, 9, playerentity.getHiResImageUrl(), false);
        zzb.zza(parcel, 14, playerentity.getTitle(), false);
        zzb.zza(parcel, 15, playerentity.zzpU(), i, false);
        zzb.zza(parcel, 16, playerentity.getLevelInfo(), i, false);
        zzb.zzc(parcel, 1000, playerentity.getVersionCode());
        zzb.zza(parcel, 19, playerentity.zzpS());
        zzb.zza(parcel, 18, playerentity.isProfileVisible());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzde(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeK(i);
    }

    public PlayerEntity zzde(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        String s4 = null;
        String s3 = null;
        Uri uri1 = null;
        Uri uri = null;
        long l2 = 0L;
        int i = 0;
        long l1 = 0L;
        String s2 = null;
        String s1 = null;
        String s = null;
        MostRecentGameInfoEntity mostrecentgameinfoentity = null;
        PlayerLevelInfo playerlevelinfo = null;
        boolean flag1 = false;
        boolean flag = false;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 7: // '\007'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;

                case 15: // '\017'
                    mostrecentgameinfoentity = (MostRecentGameInfoEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, MostRecentGameInfoEntity.CREATOR);
                    break;

                case 16: // '\020'
                    playerlevelinfo = (PlayerLevelInfo)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, PlayerLevelInfo.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 19: // '\023'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;

                case 18: // '\022'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new PlayerEntity(j, s4, s3, uri1, uri, l2, i, l1, s2, s1, s, mostrecentgameinfoentity, playerlevelinfo, flag1, flag);
        while(true);
    }

    public PlayerEntity[] zzeK(int i)
    {
        return new PlayerEntity[i];
    }
}
