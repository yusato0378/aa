// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.internal:
//            GetDriveIdFromUniqueIdentifierRequest

public class zzag
    implements android.os.Parcelable.Creator
{

    public zzag()
    {
    }

    static void zza(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, getdriveidfromuniqueidentifierrequest.zzzH);
        zzb.zza(parcel, 2, getdriveidfromuniqueidentifierrequest.zzYH, false);
        zzb.zza(parcel, 3, getdriveidfromuniqueidentifierrequest.zzYI);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzaD(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzcc(i);
    }

    public GetDriveIdFromUniqueIdentifierRequest zzaD(Parcel parcel)
    {
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        String s = null;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    flag = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new GetDriveIdFromUniqueIdentifierRequest(i, s, flag);
        while(true);
    }

    public GetDriveIdFromUniqueIdentifierRequest[] zzcc(int i)
    {
        return new GetDriveIdFromUniqueIdentifierRequest[i];
    }
}
