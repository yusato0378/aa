// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentSectionEntity, AppContentActionEntity, AppContentCardEntity, AppContentAnnotationEntity

public class AppContentSectionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentSectionEntityCreator()
    {
    }

    static void zza(AppContentSectionEntity appcontentsectionentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, appcontentsectionentity.getActions(), false);
        zzb.zzc(parcel, 1000, appcontentsectionentity.getVersionCode());
        zzb.zzc(parcel, 3, appcontentsectionentity.zzqs(), false);
        zzb.zza(parcel, 4, appcontentsectionentity.zzpY(), false);
        zzb.zza(parcel, 5, appcontentsectionentity.getExtras(), false);
        zzb.zza(parcel, 6, appcontentsectionentity.zzqk(), false);
        zzb.zza(parcel, 7, appcontentsectionentity.getTitle(), false);
        zzb.zza(parcel, 8, appcontentsectionentity.getType(), false);
        zzb.zza(parcel, 9, appcontentsectionentity.getId(), false);
        zzb.zza(parcel, 10, appcontentsectionentity.zzqt(), false);
        zzb.zzc(parcel, 14, appcontentsectionentity.zzqi(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdj(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeP(i);
    }

    public AppContentSectionEntity zzdj(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        android.os.Bundle bundle = null;
        String s5 = null;
        java.util.ArrayList arraylist1 = null;
        java.util.ArrayList arraylist2 = null;
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
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, AppContentActionEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 3: // '\003'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, AppContentCardEntity.CREATOR);
                    break;

                case 4: // '\004'
                    s5 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 6: // '\006'
                    s4 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 9: // '\t'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 10: // '\n'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 14: // '\016'
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, AppContentAnnotationEntity.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new AppContentSectionEntity(i, arraylist2, arraylist1, s5, bundle, s4, s3, s2, s1, s, arraylist);
        while(true);
    }

    public AppContentSectionEntity[] zzeP(int i)
    {
        return new AppContentSectionEntity[i];
    }
}
