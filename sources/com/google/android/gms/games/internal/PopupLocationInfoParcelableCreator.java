// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupLocationInfoParcelable

public class PopupLocationInfoParcelableCreator
    implements android.os.Parcelable.Creator
{

    public PopupLocationInfoParcelableCreator()
    {
    }

    static void zza(PopupLocationInfoParcelable popuplocationinfoparcelable, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, popuplocationinfoparcelable.zzrl(), false);
        zzb.zzc(parcel, 1000, popuplocationinfoparcelable.getVersionCode());
        zzb.zza(parcel, 2, popuplocationinfoparcelable.getWindowToken(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdm(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeX(i);
    }

    public PopupLocationInfoParcelable zzdm(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        android.os.Bundle bundle = null;
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
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new PopupLocationInfoParcelable(i, bundle, ibinder);
        while(true);
    }

    public PopupLocationInfoParcelable[] zzeX(int i)
    {
        return new PopupLocationInfoParcelable[i];
    }
}
