// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.HashSet;
import java.util.Set;

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(PersonEntity.PlacesLivedEntity placeslivedentity, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        Set set = placeslivedentity.zzazD;
        if(set.contains(Integer.valueOf(1)))
            zzb.zzc(parcel, 1, placeslivedentity.zzzH);
        if(set.contains(Integer.valueOf(2)))
            zzb.zza(parcel, 2, placeslivedentity.zzaBh);
        if(set.contains(Integer.valueOf(3)))
            zzb.zza(parcel, 3, placeslivedentity.mValue, true);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfc(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzhv(i);
    }

    public PersonEntity.PlacesLivedEntity zzfc(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    hashset.add(Integer.valueOf(3));
                    break;
                }
            } else
            {
                if(parcel.dataPosition() != j)
                    throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
                return new PersonEntity.PlacesLivedEntity(hashset, i, flag, s);
            }
        while(true);
    }

    public PersonEntity.PlacesLivedEntity[] zzhv(int i)
    {
        return new PersonEntity.PlacesLivedEntity[i];
    }
}
