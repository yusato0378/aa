// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.location.internal:
//            LocationRequestInternal, ClientIdentity

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(LocationRequestInternal locationrequestinternal, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zza(parcel, 1, locationrequestinternal.zzaft, i, false);
        zzb.zzc(parcel, 1000, locationrequestinternal.getVersionCode());
        zzb.zza(parcel, 2, locationrequestinternal.zzark);
        zzb.zza(parcel, 3, locationrequestinternal.zzarl);
        zzb.zza(parcel, 4, locationrequestinternal.zzarm);
        zzb.zzc(parcel, 5, locationrequestinternal.zzarn, false);
        zzb.zza(parcel, 6, locationrequestinternal.mTag, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdH(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfI(i);
    }

    public LocationRequestInternal zzdH(Parcel parcel)
    {
        String s = null;
        boolean flag = true;
        boolean flag2 = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        Object obj = LocationRequestInternal.zzarj;
        boolean flag1 = true;
        LocationRequest locationrequest = null;
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
                    locationrequest = (LocationRequest)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, LocationRequest.CREATOR);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    flag2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;

                case 5: // '\005'
                    obj = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k, ClientIdentity.CREATOR);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new LocationRequestInternal(i, locationrequest, flag2, flag1, flag, ((java.util.List) (obj)), s);
        while(true);
    }

    public LocationRequestInternal[] zzfI(int i)
    {
        return new LocationRequestInternal[i];
    }
}
