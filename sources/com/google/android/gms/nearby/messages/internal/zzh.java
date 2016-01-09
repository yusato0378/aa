// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            PublishRequest, MessageWrapper

public class zzh
    implements android.os.Parcelable.Creator
{

    public zzh()
    {
    }

    static void zza(PublishRequest publishrequest, Parcel parcel, int i)
    {
        int j = zzb.zzM(parcel);
        zzb.zzc(parcel, 1, publishrequest.versionCode);
        zzb.zza(parcel, 2, publishrequest.zzaxP, i, false);
        zzb.zza(parcel, 3, publishrequest.zzaxQ, i, false);
        zzb.zza(parcel, 4, publishrequest.zzve(), false);
        zzb.zzH(parcel, j);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return zzeC(parcel);
    }

    public Object[] newArray(int i)
    {
        return zzgU(i);
    }

    public PublishRequest zzeC(Parcel parcel)
    {
        android.os.IBinder ibinder;
        Object obj;
        Object obj1;
        int i;
        int j;
        ibinder = null;
        j = com.google.android.gms.common.internal.safeparcel.zza.zzL(parcel);
        i = 0;
        obj1 = null;
        obj = null;
_L7:
        int k;
        if(parcel.dataPosition() >= j)
            break MISSING_BLOCK_LABEL_185;
        k = com.google.android.gms.common.internal.safeparcel.zza.zzK(parcel);
        com.google.android.gms.common.internal.safeparcel.zza.zzaV(k);
        JVM INSTR tableswitch 1 4: default 68
    //                   1 97
    //                   2 118
    //                   3 142
    //                   4 165;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_165;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, k);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L8:
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if(true) goto _L7; else goto _L6
_L6:
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, k);
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
_L3:
        MessageWrapper messagewrapper = (MessageWrapper)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, MessageWrapper.CREATOR);
        obj = obj1;
        obj1 = messagewrapper;
          goto _L8
_L4:
        Strategy strategy = (Strategy)com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, k, Strategy.CREATOR);
        obj1 = obj;
        obj = strategy;
          goto _L8
        ibinder = com.google.android.gms.common.internal.safeparcel.zza.zzp(parcel, k);
        Object obj5 = obj;
        obj = obj1;
        obj1 = obj5;
          goto _L8
        if(parcel.dataPosition() != j)
            throw new com.google.android.gms.common.internal.safeparcel.zza.zza((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        else
            return new PublishRequest(i, ((MessageWrapper) (obj)), ((Strategy) (obj1)), ibinder);
    }

    public PublishRequest[] zzgU(int i)
    {
        return new PublishRequest[i];
    }
}
