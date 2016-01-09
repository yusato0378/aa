// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetConfigsResponse

public class zzal
    implements android.os.Parcelable.Creator
{

    public zzal()
    {
    }

    static void zza(GetConfigsResponse getconfigsresponse, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getconfigsresponse.versionCode);
        zzb.zzc(parcel, 2, getconfigsresponse.statusCode);
        zzb.zza(parcel, 3, getconfigsresponse.zzaMi, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgl(parcel);
    }

    public Object[] newArray(int i)
    {
        return zziW(i);
    }

    public GetConfigsResponse zzgl(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        ConnectionConfiguration aconnectionconfiguration[] = null;
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
                    aconnectionconfiguration = (ConnectionConfiguration[])com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, l, ConnectionConfiguration.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new GetConfigsResponse(i, j, aconnectionconfiguration);
        while(true);
    }

    public GetConfigsResponse[] zziW(int i)
    {
        return new GetConfigsResponse[i];
    }
}
