// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzj, zzb, MessageWrapper

public final class UnpublishRequest
    implements SafeParcelable
{

    UnpublishRequest()
    {
        versionCode = 1;
    }

    UnpublishRequest(int i, MessageWrapper messagewrapper, IBinder ibinder)
    {
        versionCode = i;
        zzaxP = messagewrapper;
        zzaxR = zzb.zza.zzci(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzaxR.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int versionCode;
    public MessageWrapper zzaxP;
    public zzb zzaxR;

}
