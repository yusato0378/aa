// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzf, Cart

public final class FullWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        public FullWalletRequest build()
        {
            return zzaIl;
        }

        public Builder setCart(Cart cart)
        {
            zzaIl.zzaIk = cart;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaIl.zzaHZ = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaIl.zzaIa = s;
            return this;
        }

        final FullWalletRequest zzaIl;

        private Builder()
        {
            zzaIl = FullWalletRequest.this;
            super();
        }

    }


    FullWalletRequest()
    {
        zzzH = 1;
    }

    FullWalletRequest(int i, String s, String s1, Cart cart)
    {
        zzzH = i;
        zzaHZ = s;
        zzaIa = s1;
        zzaIk = cart;
    }

    public static Builder newBuilder()
    {
        FullWalletRequest fullwalletrequest = new FullWalletRequest();
        fullwalletrequest.getClass();
        return fullwalletrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Cart getCart()
    {
        return zzaIk;
    }

    public String getGoogleTransactionId()
    {
        return zzaHZ;
    }

    public String getMerchantTransactionId()
    {
        return zzaIa;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    String zzaHZ;
    String zzaIa;
    Cart zzaIk;
    private final int zzzH;

}
