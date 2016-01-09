// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            Strategy

public class zzd
    implements android.os.Parcelable.Creator
{

    public zzd()
    {
    }

    static void zza(Strategy strategy, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, strategy.zzaxI);
        zzb.zzc(parcel, 1000, strategy.versionCode);
        zzb.zzc(parcel, 2, strategy.zzaxJ);
        zzb.zzc(parcel, 3, strategy.zzaxK);
        zzb.zza(parcel, 4, strategy.zzaxL);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzez(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgR(i);
    }

    public Strategy zzez(Parcel parcel)
    {
        boolean flag = false;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        do
            if(parcel.dataPosition() < i1)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, j1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, j1);
                    break;
                }
            } else
            if(parcel.dataPosition() != i1)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            else
                return new Strategy(l, k, j, i, flag);
        while(true);
    }

    public Strategy[] zzgR(int i)
    {
        return new Strategy[i];
    }
}
