// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            BitmapDescriptorParcelable

public class zza
    implements android.os.Parcelable.Creator
{

    public zza()
    {
    }

    static void zza(BitmapDescriptorParcelable bitmapdescriptorparcelable, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, bitmapdescriptorparcelable.getVersionCode());
        zzb.zza(parcel, 2, bitmapdescriptorparcelable.getType());
        zzb.zza(parcel, 3, bitmapdescriptorparcelable.zztV(), false);
        zzb.zza(parcel, 4, bitmapdescriptorparcelable.getBitmap(), i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzet(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgy(i);
    }

    public BitmapDescriptorParcelable zzet(Parcel parcel)
    {
        Bitmap bitmap = null;
        byte byte0 = 0;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        android.os.Bundle bundle = null;
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
                    byte0 = com.google.android.gms.common.internal.safeparcel.zza.zze(parcel, k);
                    break;

                case 3: // '\003'
                    bundle = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, k);
                    break;

                case 4: // '\004'
                    bitmap = (Bitmap)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Bitmap.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new BitmapDescriptorParcelable(i, byte0, bundle, bitmap);
        while(true);
    }

    public BitmapDescriptorParcelable[] zzgy(int i)
    {
        return new BitmapDescriptorParcelable[i];
    }
}
