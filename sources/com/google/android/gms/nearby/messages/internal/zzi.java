// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            SubscribeRequest

public class zzi
    implements android.os.Parcelable.Creator
{

    public zzi()
    {
    }

    static void zza(SubscribeRequest subscriberequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, subscriberequest.versionCode);
        zzb.zza(parcel, 2, subscriberequest.zzvf(), false);
        zzb.zza(parcel, 3, subscriberequest.zzaxQ, i, false);
        zzb.zza(parcel, 4, subscriberequest.zzve(), false);
        zzb.zza(parcel, 5, subscriberequest.zzaxT, i, false);
        zzb.zza(parcel, 6, subscriberequest.zzaxU, i, false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeD(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgV(i);
    }

    public SubscribeRequest zzeD(Parcel parcel)
    {
        PendingIntent pendingintent = null;
        int j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        int i = 0;
        MessageFilter messagefilter = null;
        android.os.IBinder ibinder = null;
        Strategy strategy = null;
        android.os.IBinder ibinder1 = null;
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
                    ibinder1 = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 3: // '\003'
                    strategy = (Strategy)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
                    break;

                case 5: // '\005'
                    messagefilter = (MessageFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, MessageFilter.CREATOR);
                    break;

                case 6: // '\006'
                    pendingintent = (PendingIntent)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, PendingIntent.CREATOR);
                    break;
                }
            } else
            if(parcel.dataPosition() != j)
                throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            else
                return new SubscribeRequest(i, ibinder1, strategy, ibinder, messagefilter, pendingintent);
        while(true);
    }

    public SubscribeRequest[] zzgV(int i)
    {
        return new SubscribeRequest[i];
    }
}
