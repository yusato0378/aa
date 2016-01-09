// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzh, zzb, MessageWrapper

public final class PublishRequest
    implements SafeParcelable
{

    PublishRequest()
    {
        versionCode = 1;
    }

    PublishRequest(int i, MessageWrapper messagewrapper, Strategy strategy, IBinder ibinder)
    {
        versionCode = i;
        zzaxP = messagewrapper;
        zzaxQ = strategy;
        zzaxR = zzb.zza.zzci(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzaxR.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int versionCode;
    public MessageWrapper zzaxP;
    public Strategy zzaxQ;
    public zzb zzaxR;

}
