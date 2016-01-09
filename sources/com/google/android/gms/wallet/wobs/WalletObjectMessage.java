// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzi, TimeInterval, UriData

public final class WalletObjectMessage
    implements SafeParcelable
{

    WalletObjectMessage()
    {
        zzzH = 1;
    }

    WalletObjectMessage(int i, String s, String s1, TimeInterval timeinterval, UriData uridata, UriData uridata1)
    {
        zzzH = i;
        zzaKs = s;
        zzzr = s1;
        zzaKv = timeinterval;
        zzaKw = uridata;
        zzaKx = uridata1;
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
        zzi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String zzaKs;
    TimeInterval zzaKv;
    UriData zzaKw;
    UriData zzaKx;
    private final int zzzH;
    String zzzr;

}
