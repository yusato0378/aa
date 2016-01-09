// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceRequest, PlaceFilter

public class zze
    implements android.os.Parcelable.Creator
{

    public zze()
    {
    }

    static void zza(PlaceRequest placerequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1000, placerequest.zzzH);
        zzb.zza(parcel, 2, placerequest.zzsS(), i, false);
        zzb.zza(parcel, 3, placerequest.getInterval());
        zzb.zzc(parcel, 4, placerequest.getPriority());
        zzb.zza(parcel, 5, placerequest.getExpirationTime());
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdO(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfS(i);
    }

    public PlaceRequest zzdO(Parcel parcel)
    {
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        PlaceFilter placefilter = null;
        long l2 = PlaceRequest.zzarR;
        int i = 102;
        long l1 = 0x7fffffffffffffffL;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, PlaceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    l2 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;

                case 4: // '\004'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 5: // '\005'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new PlaceRequest(j, placefilter, l2, i, l1);
        while(true);
    }

    public PlaceRequest[] zzfS(int i)
    {
        return new PlaceRequest[i];
    }
}
