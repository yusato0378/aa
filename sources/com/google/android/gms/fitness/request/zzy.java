// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

// Referenced classes of package com.google.android.gms.fitness.request:
//            SessionStopRequest

public class zzy
    implements android.os.Parcelable.Creator
{

    public zzy()
    {
    }

    static void zza(SessionStopRequest sessionstoprequest, Parcel parcel, int i)
    {
        i = zzb.zzM(parcel);
        zzb.zza(parcel, 1, sessionstoprequest.getName(), false);
        zzb.zzc(parcel, 1000, sessionstoprequest.getVersionCode());
        zzb.zza(parcel, 2, sessionstoprequest.getIdentifier(), false);
        zzb.zza(parcel, 3, sessionstoprequest.zzpf(), false);
        zzb.zza(parcel, 4, sessionstoprequest.getPackageName(), false);
        zzb.zzH(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzcJ(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzeo(i);
    }

    public SessionStopRequest zzcJ(Parcel parcel)
    {
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 1000: 
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 4: // '\004'
                    s = com.google.android.gms.common.internal.safeparcel.zza.zzo(parcel, k);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new SessionStopRequest(i, s2, s1, ibinder, s);
        while(true);
    }

    public SessionStopRequest[] zzeo(int i)
    {
        return new SessionStopRequest[i];
    }
}
