// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            NearbyAlertRequest, PlaceFilter

public class zzc
    implements android.os.Parcelable.Creator
{

    public zzc()
    {
    }

    static void zza(NearbyAlertRequest nearbyalertrequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, nearbyalertrequest.zzsO());
        zzb.zzc(parcel, 1000, nearbyalertrequest.getVersionCode());
        zzb.zzc(parcel, 2, nearbyalertrequest.zzsR());
        zzb.zza(parcel, 3, nearbyalertrequest.zzsS(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdM(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfP(i);
    }

    public NearbyAlertRequest zzdM(Parcel parcel)
    {
        int j = 0;
        int l = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int k = -1;
        PlaceFilter placefilter = null;
        int i = 0;
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
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 2: // '\002'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, i1);
                    break;

                case 3: // '\003'
                    placefilter = (PlaceFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, i1, PlaceFilter.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != l)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(l).toString(), parcel);
            else
                return new NearbyAlertRequest(i, j, k, placefilter);
        while(true);
    }

    public NearbyAlertRequest[] zzfP(int i)
    {
        return new NearbyAlertRequest[i];
    }
}
