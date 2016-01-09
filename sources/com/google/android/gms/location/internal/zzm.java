// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.location.internal:
//            ParcelableGeofence

public class zzm
    implements android.os.Parcelable.Creator
{

    public zzm()
    {
    }

    static void zza(ParcelableGeofence parcelablegeofence, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, parcelablegeofence.getRequestId(), false);
        zzb.zzc(parcel, 1000, parcelablegeofence.getVersionCode());
        zzb.zza(parcel, 2, parcelablegeofence.getExpirationTime());
        zzb.zza(parcel, 3, parcelablegeofence.zzsM());
        zzb.zza(parcel, 4, parcelablegeofence.getLatitude());
        zzb.zza(parcel, 5, parcelablegeofence.getLongitude());
        zzb.zza(parcel, 6, parcelablegeofence.zzsN());
        zzb.zzc(parcel, 7, parcelablegeofence.zzsO());
        zzb.zzc(parcel, 8, parcelablegeofence.getNotificationResponsiveness());
        zzb.zzc(parcel, 9, parcelablegeofence.zzsP());
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzdJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzfM(i);
    }

    public ParcelableGeofence zzdJ(Parcel parcel)
    {
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int l = 0;
        String s = null;
        int k = 0;
        short word0 = 0;
        double d1 = 0.0D;
        double d = 0.0D;
        float f = 0.0F;
        long l1 = 0L;
        int j = 0;
        int i = -1;
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
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, j1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    l1 = com.google.android.gms.common.internal.safeparcel.zza.zzi(parcel, j1);
                    break;

                case 3: // '\003'
                    word0 = com.google.android.gms.common.internal.safeparcel.zza.zzf(parcel, j1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, j1);
                    break;

                case 5: // '\005'
                    d = com.google.android.gms.common.internal.safeparcel.zza.zzm(parcel, j1);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, j1);
                    break;

                case 7: // '\007'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 8: // '\b'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if(parcel.dataPosition() != i1)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            else
                return new ParcelableGeofence(l, s, k, word0, d1, d, f, l1, j, i);
        while(true);
    }

    public ParcelableGeofence[] zzfM(int i)
    {
        return new ParcelableGeofence[i];
    }
}
