// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            zzk, LoyaltyWalletObject, OfferWalletObject, Address, 
//            InstrumentInfo

public final class MaskedWallet
    implements SafeParcelable
{
    public final class Builder
    {

        public MaskedWallet build()
        {
            return zzaIU;
        }

        public Builder setBillingAddress(Address address)
        {
            zzaIU.zzaId = address;
            return this;
        }

        public Builder setBuyerBillingAddress(UserAddress useraddress)
        {
            zzaIU.zzaIg = useraddress;
            return this;
        }

        public Builder setBuyerShippingAddress(UserAddress useraddress)
        {
            zzaIU.zzaIh = useraddress;
            return this;
        }

        public Builder setEmail(String s)
        {
            zzaIU.zzaIc = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            zzaIU.zzaHZ = s;
            return this;
        }

        public Builder setInstrumentInfos(InstrumentInfo ainstrumentinfo[])
        {
            zzaIU.zzaIi = ainstrumentinfo;
            return this;
        }

        public Builder setLoyaltyWalletObjects(LoyaltyWalletObject aloyaltywalletobject[])
        {
            zzaIU.zzaIS = aloyaltywalletobject;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaIU.zzaIa = s;
            return this;
        }

        public Builder setOfferWalletObjects(OfferWalletObject aofferwalletobject[])
        {
            zzaIU.zzaIT = aofferwalletobject;
            return this;
        }

        public Builder setPaymentDescriptions(String as[])
        {
            zzaIU.zzaIf = as;
            return this;
        }

        public Builder setShippingAddress(Address address)
        {
            zzaIU.zzaIe = address;
            return this;
        }

        final MaskedWallet zzaIU;

        private Builder()
        {
            zzaIU = MaskedWallet.this;
            super();
        }

    }


    private MaskedWallet()
    {
        zzzH = 2;
    }

    MaskedWallet(int i, String s, String s1, String as[], String s2, Address address, Address address1, 
            LoyaltyWalletObject aloyaltywalletobject[], OfferWalletObject aofferwalletobject[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[])
    {
        zzzH = i;
        zzaHZ = s;
        zzaIa = s1;
        zzaIf = as;
        zzaIc = s2;
        zzaId = address;
        zzaIe = address1;
        zzaIS = aloyaltywalletobject;
        zzaIT = aofferwalletobject;
        zzaIg = useraddress;
        zzaIh = useraddress1;
        zzaIi = ainstrumentinfo;
    }

    public static Builder newBuilderFrom(MaskedWallet maskedwallet)
    {
        zzv.zzr(maskedwallet);
        return zzyP().setGoogleTransactionId(maskedwallet.getGoogleTransactionId()).setMerchantTransactionId(maskedwallet.getMerchantTransactionId()).setPaymentDescriptions(maskedwallet.getPaymentDescriptions()).setInstrumentInfos(maskedwallet.getInstrumentInfos()).setEmail(maskedwallet.getEmail()).setLoyaltyWalletObjects(maskedwallet.getLoyaltyWalletObjects()).setOfferWalletObjects(maskedwallet.getOfferWalletObjects()).setBuyerBillingAddress(maskedwallet.getBuyerBillingAddress()).setBuyerShippingAddress(maskedwallet.getBuyerShippingAddress());
    }

    public static Builder zzyP()
    {
        MaskedWallet maskedwallet = new MaskedWallet();
        maskedwallet.getClass();
        return maskedwallet. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public Address getBillingAddress()
    {
        return zzaId;
    }

    public UserAddress getBuyerBillingAddress()
    {
        return zzaIg;
    }

    public UserAddress getBuyerShippingAddress()
    {
        return zzaIh;
    }

    public String getEmail()
    {
        return zzaIc;
    }

    public String getGoogleTransactionId()
    {
        return zzaHZ;
    }

    public InstrumentInfo[] getInstrumentInfos()
    {
        return zzaIi;
    }

    public LoyaltyWalletObject[] getLoyaltyWalletObjects()
    {
        return zzaIS;
    }

    public String getMerchantTransactionId()
    {
        return zzaIa;
    }

    public OfferWalletObject[] getOfferWalletObjects()
    {
        return zzaIT;
    }

    public String[] getPaymentDescriptions()
    {
        return zzaIf;
    }

    public Address getShippingAddress()
    {
        return zzaIe;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    String zzaHZ;
    LoyaltyWalletObject zzaIS[];
    OfferWalletObject zzaIT[];
    String zzaIa;
    String zzaIc;
    Address zzaId;
    Address zzaIe;
    String zzaIf[];
    UserAddress zzaIg;
    UserAddress zzaIh;
    InstrumentInfo zzaIi[];
    private final int zzzH;

}
