// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            zzc

public final class GetBuyFlowInitializationTokenResponse
    implements SafeParcelable
{

    GetBuyFlowInitializationTokenResponse()
    {
        this(1, new byte[0]);
    }

    GetBuyFlowInitializationTokenResponse(int i, byte abyte0[])
    {
        zzzH = i;
        zzaJw = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    byte zzaJw[];
    private final int zzzH;

}
