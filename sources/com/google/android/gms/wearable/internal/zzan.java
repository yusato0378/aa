// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetDataItemResponse, DataItemParcelable

public class zzan
    implements android.os.Parcelable.Creator
{

    public zzan()
    {
    }

    static void zza(GetDataItemResponse getdataitemresponse, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getdataitemresponse.versionCode);
        zzb.zzc(parcel, 2, getdataitemresponse.statusCode);
        zzb.zza(parcel, 3, getdataitemresponse.zzaMk, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgn(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziY(i);
    }

    public GetDataItemResponse zzgn(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        DataItemParcelable dataitemparcelable = null;
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
                    dataitemparcelable = (DataItemParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, DataItemParcelable.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new GetDataItemResponse(i, j, dataitemparcelable);
        while(true);
    }

    public GetDataItemResponse[] zziY(int i)
    {
        return new GetDataItemResponse[i];
    }
}
