// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.StorageStats;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnStorageStatsResponse

public class zzbg
    implements android.os.Parcelable.Creator
{

    public zzbg()
    {
    }

    static void zza(OnStorageStatsResponse onstoragestatsresponse, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, onstoragestatsresponse.zzzH);
        zzb.zza(parcel, 2, onstoragestatsresponse.zzZn, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaW(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcv(i);
    }

    public OnStorageStatsResponse zzaW(Parcel parcel)
    {
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        StorageStats storagestats = null;
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
                    break;

                case 2: // '\002'
                    storagestats = (StorageStats)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, StorageStats.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new OnStorageStatsResponse(i, storagestats);
        while(true);
    }

    public OnStorageStatsResponse[] zzcv(int i)
    {
        return new OnStorageStatsResponse[i];
    }
}
