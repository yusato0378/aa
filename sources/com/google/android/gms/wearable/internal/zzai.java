// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetCloudSyncOptInOutDoneResponse

public class zzai
    implements android.os.Parcelable.Creator
{

    public zzai()
    {
    }

    static void zza(GetCloudSyncOptInOutDoneResponse getcloudsyncoptinoutdoneresponse, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getcloudsyncoptinoutdoneresponse.versionCode);
        zzb.zzc(parcel, 2, getcloudsyncoptinoutdoneresponse.statusCode);
        zzb.zza(parcel, 3, getcloudsyncoptinoutdoneresponse.zzaMg);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgi(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziT(i);
    }

    public GetCloudSyncOptInOutDoneResponse zzgi(Parcel parcel)
    {
        boolean flag = false;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int j = 0;
        int i = 0;
        do
            if(parcel.dataPosition() < k)
            {
                int l = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
                switch(com.google.android.gms.common.internal.safeparcel.zza.zzaV(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l);
                    break;

                case 1: // '\001'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new GetCloudSyncOptInOutDoneResponse(i, j, flag);
        while(true);
    }

    public GetCloudSyncOptInOutDoneResponse[] zziT(int i)
    {
        return new GetCloudSyncOptInOutDoneResponse[i];
    }
}
