// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.wallet:
//            PaymentMethodTokenizationParameters

public class zzp
    implements android.os.Parcelable.Creator
{

    public zzp()
    {
    }

    static void zza(PaymentMethodTokenizationParameters paymentmethodtokenizationparameters, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, paymentmethodtokenizationparameters.getVersionCode());
        zzb.zzc(parcel, 2, paymentmethodtokenizationparameters.zzaJl);
        zzb.zza(parcel, 3, paymentmethodtokenizationparameters.zzavQ, false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzfx(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzic(i);
    }

    public PaymentMethodTokenizationParameters zzfx(Parcel parcel)
    {
        int j = 0;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        android.os.Bundle bundle = null;
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
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new PaymentMethodTokenizationParameters(i, j, bundle);
        while(true);
    }

    public PaymentMethodTokenizationParameters[] zzic(int i)
    {
        return new PaymentMethodTokenizationParameters[i];
    }
}
