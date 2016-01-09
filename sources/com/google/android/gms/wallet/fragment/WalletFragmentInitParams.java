// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.wallet.fragment:
//            zza

public final class WalletFragmentInitParams
    implements SafeParcelable
{
    public final class Builder
    {

        public WalletFragmentInitParams build()
        {
            boolean flag1 = true;
            boolean flag;
            if(WalletFragmentInitParams.zza(zzaJV) != null && WalletFragmentInitParams.zzb(zzaJV) == null || WalletFragmentInitParams.zza(zzaJV) == null && WalletFragmentInitParams.zzb(zzaJV) != null)
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "Exactly one of MaskedWallet or MaskedWalletRequest is required");
            if(WalletFragmentInitParams.zzc(zzaJV) >= 0)
                flag = flag1;
            else
                flag = false;
            zzv.zza(flag, "masked wallet request code is required and must be non-negative");
            return zzaJV;
        }

        public Builder setAccountName(String s)
        {
            WalletFragmentInitParams.zza(zzaJV, s);
            return this;
        }

        public Builder setMaskedWallet(MaskedWallet maskedwallet)
        {
            WalletFragmentInitParams.zza(zzaJV, maskedwallet);
            return this;
        }

        public Builder setMaskedWalletRequest(MaskedWalletRequest maskedwalletrequest)
        {
            WalletFragmentInitParams.zza(zzaJV, maskedwalletrequest);
            return this;
        }

        public Builder setMaskedWalletRequestCode(int i)
        {
            WalletFragmentInitParams.zza(zzaJV, i);
            return this;
        }

        final WalletFragmentInitParams zzaJV;

        private Builder()
        {
            zzaJV = WalletFragmentInitParams.this;
            super();
        }

    }


    private WalletFragmentInitParams()
    {
        zzzH = 1;
        zzaJU = -1;
    }

    WalletFragmentInitParams(int i, String s, MaskedWalletRequest maskedwalletrequest, int j, MaskedWallet maskedwallet)
    {
        zzzH = i;
        zzKw = s;
        zzaJG = maskedwalletrequest;
        zzaJU = j;
        zzaJH = maskedwallet;
    }

    public static Builder newBuilder()
    {
        WalletFragmentInitParams walletfragmentinitparams = new WalletFragmentInitParams();
        walletfragmentinitparams.getClass();
        return walletfragmentinitparams. new Builder();
    }

    static int zza(WalletFragmentInitParams walletfragmentinitparams, int i)
    {
        walletfragmentinitparams.zzaJU = i;
        return i;
    }

    static MaskedWallet zza(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaJH;
    }

    static MaskedWallet zza(WalletFragmentInitParams walletfragmentinitparams, MaskedWallet maskedwallet)
    {
        walletfragmentinitparams.zzaJH = maskedwallet;
        return maskedwallet;
    }

    static MaskedWalletRequest zza(WalletFragmentInitParams walletfragmentinitparams, MaskedWalletRequest maskedwalletrequest)
    {
        walletfragmentinitparams.zzaJG = maskedwalletrequest;
        return maskedwalletrequest;
    }

    static String zza(WalletFragmentInitParams walletfragmentinitparams, String s)
    {
        walletfragmentinitparams.zzKw = s;
        return s;
    }

    static MaskedWalletRequest zzb(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaJG;
    }

    static int zzc(WalletFragmentInitParams walletfragmentinitparams)
    {
        return walletfragmentinitparams.zzaJU;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccountName()
    {
        return zzKw;
    }

    public MaskedWallet getMaskedWallet()
    {
        return zzaJH;
    }

    public MaskedWalletRequest getMaskedWalletRequest()
    {
        return zzaJG;
    }

    public int getMaskedWalletRequestCode()
    {
        return zzaJU;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wallet.fragment.zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private String zzKw;
    private MaskedWalletRequest zzaJG;
    private MaskedWallet zzaJH;
    private int zzaJU;
    final int zzzH;

}
