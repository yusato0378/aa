// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            GetLocalNodeResponse, NodeParcelable

public class zzap
    implements android.os.Parcelable.Creator
{

    public zzap()
    {
    }

    static void zza(GetLocalNodeResponse getlocalnoderesponse, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getlocalnoderesponse.versionCode);
        zzb.zzc(parcel, 2, getlocalnoderesponse.statusCode);
        zzb.zza(parcel, 3, getlocalnoderesponse.zzaMm, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzgp(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzja(i);
    }

    public GetLocalNodeResponse zzgp(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        NodeParcelable nodeparcelable = null;
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
                    nodeparcelable = (NodeParcelable)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, l, NodeParcelable.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new GetLocalNodeResponse(i, j, nodeparcelable);
        while(true);
    }

    public GetLocalNodeResponse[] zzja(int i)
    {
        return new GetLocalNodeResponse[i];
    }
}
