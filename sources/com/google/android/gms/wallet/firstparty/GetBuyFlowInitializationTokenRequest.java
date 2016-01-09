// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            zzb

public final class GetBuyFlowInitializationTokenRequest
    implements SafeParcelable
{

    GetBuyFlowInitializationTokenRequest()
    {
        this(1, null);
    }

    GetBuyFlowInitializationTokenRequest(int i, byte abyte0[])
    {
        zzzH = i;
        zzaJv = abyte0;
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
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    byte zzaJv[];
    private final int zzzH;

}
