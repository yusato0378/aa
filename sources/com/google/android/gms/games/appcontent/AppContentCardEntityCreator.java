// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCardEntity, AppContentActionEntity, AppContentAnnotationEntity, AppContentConditionEntity

public class AppContentCardEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentCardEntityCreator()
    {
    }

    static void zza(AppContentCardEntity appcontentcardentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, appcontentcardentity.getActions(), false);
        zzb.zzc(parcel, 1000, appcontentcardentity.getVersionCode());
        zzb.zzc(parcel, 2, appcontentcardentity.zzqi(), false);
        zzb.zzc(parcel, 3, appcontentcardentity.zzpX(), false);
        zzb.zza(parcel, 4, appcontentcardentity.zzpY(), false);
        zzb.zzc(parcel, 5, appcontentcardentity.zzqj());
        zzb.zza(parcel, 6, appcontentcardentity.getDescription(), false);
        zzb.zza(parcel, 7, appcontentcardentity.getExtras(), false);
        zzb.zza(parcel, 10, appcontentcardentity.zzqk(), false);
        zzb.zza(parcel, 11, appcontentcardentity.getTitle(), false);
        zzb.zzc(parcel, 12, appcontentcardentity.zzql());
        zzb.zza(parcel, 13, appcontentcardentity.getType(), false);
        zzb.zza(parcel, 14, appcontentcardentity.getId(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdh(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeN(i);
    }

    public AppContentCardEntity zzdh(Parcel parcel)
    {
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist = null;
        String s5 = null;
        int j = 0;
        String s4 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        String s2 = null;
        int i = 0;
        String s1 = null;
        String s = null;
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, AppContentAnnotationEntity.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, i1, AppContentConditionEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 5: // '\005'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 6: // '\006'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, i1);
                    break;

                case 10: // '\n'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 11: // '\013'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 12: // '\f'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 13: // '\r'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;

                case 14: // '\016'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, i1);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new AppContentCardEntity(k, arraylist2, arraylist1, arraylist, s5, j, s4, bundle, s3, s2, i, s1, s);
        while(true);
    }

    public AppContentCardEntity[] zzeN(int i)
    {
        return new AppContentCardEntity[i];
    }
}
