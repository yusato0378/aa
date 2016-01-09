// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            StartBleScanRequest

public class zzaa
    implements android.os.Parcelable.Creator
{

    public zzaa()
    {
    }

    static void zza(StartBleScanRequest startblescanrequest, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, startblescanrequest.getDataTypes(), false);
        zzb.zzc(parcel, 1000, startblescanrequest.getVersionCode());
        zzb.zza(parcel, 2, startblescanrequest.zzpA(), false);
        zzb.zzc(parcel, 3, startblescanrequest.getTimeoutSecs());
        zzb.zza(parcel, 4, startblescanrequest.zzpf(), false);
        zzb.zza(parcel, 5, startblescanrequest.getPackageName(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcL(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeq(i);
    }

    public StartBleScanRequest zzcL(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int k = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
        java.util.ArrayList arraylist = null;
        int j = 0;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.zza.zzc(parcel, l, DataType.CREATOR);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 2: // '\002'
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, l);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, l);
                    break;

                case 4: // '\004'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, l);
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, l);
                    break;
                }
            } else
            if(parcel.dataPosition() != k)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(k).toString(), parcel);
            else
                return new StartBleScanRequest(j, arraylist, ibinder1, i, ibinder, s);
        while(true);
    }

    public StartBleScanRequest[] zzeq(int i)
    {
        return new StartBleScanRequest[i];
    }
}
