// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ValuesSetDetails

public class zzk
    implements android.os.Parcelable.Creator
{

    public zzk()
    {
    }

    static void zza(ValuesSetDetails valuessetdetails, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, valuessetdetails.zzzH);
        zzb.zzc(parcel, 2, valuessetdetails.mIndex);
        zzb.zzc(parcel, 3, valuessetdetails.zzabv);
        zzb.zzc(parcel, 4, valuessetdetails.zzabw);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzbT(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzdt(i);
    }

    public ValuesSetDetails zzbT(Parcel parcel)
    {
        int l = 0;
        int i1 = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int k = 0;
        int j = 0;
        int i = 0;
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
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 2: // '\002'
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 3: // '\003'
                    k = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;

                case 4: // '\004'
                    l = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, j1);
                    break;
                }
            } else
            if(parcel.dataPosition() != i1)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(i1).toString(), parcel);
            else
                return new ValuesSetDetails(i, j, k, l);
        while(true);
    }

    public ValuesSetDetails[] zzdt(int i)
    {
        return new ValuesSetDetails[i];
    }
}
