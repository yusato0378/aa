// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentActionEntity, AppContentConditionEntity, AppContentAnnotationEntity

public class AppContentActionEntityCreator
    implements android.os.Parcelable.Creator
{

    public AppContentActionEntityCreator()
    {
    }

    static void zza(AppContentActionEntity appcontentactionentity, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, appcontentactionentity.zzpX(), false);
        zzb.zzc(parcel, 1000, appcontentactionentity.getVersionCode());
        zzb.zza(parcel, 2, appcontentactionentity.zzpY(), false);
        zzb.zza(parcel, 3, appcontentactionentity.getExtras(), false);
        zzb.zza(parcel, 6, appcontentactionentity.getType(), false);
        zzb.zza(parcel, 7, appcontentactionentity.getId(), false);
        zzb.zza(parcel, 8, appcontentactionentity.zzpW(), i, false);
        zzb.zza(parcel, 9, appcontentactionentity.zzpZ(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdf(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeL(i);
    }

    public AppContentActionEntity zzdf(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        AppContentAnnotationEntity appcontentannotationentity = null;
        String s1 = null;
        String s2 = null;
        android.os.Bundle bundle = null;
        String s3 = null;
        java.util.ArrayList arraylist = null;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, AppContentConditionEntity.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 6: // '\006'
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 7: // '\007'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 8: // '\b'
                    appcontentannotationentity = (AppContentAnnotationEntity)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, AppContentAnnotationEntity.CREATOR);
                    break;

                case 9: // '\t'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new AppContentActionEntity(i, arraylist, s3, bundle, s2, s1, appcontentannotationentity, s);
        while(true);
    }

    public AppContentActionEntity[] zzeL(int i)
    {
        return new AppContentActionEntity[i];
    }
}
