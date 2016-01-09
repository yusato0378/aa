// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.wallet:
//            zzl, Cart, CountrySpecification, PaymentMethodTokenizationParameters

public final class MaskedWalletRequest
    implements SafeParcelable
{
    public final class Builder
    {

        public Builder addAllowedCountrySpecificationForShipping(CountrySpecification countryspecification)
        {
            if(zzaJh.zzaJf == null)
                zzaJh.zzaJf = new ArrayList();
            zzaJh.zzaJf.add(countryspecification);
            return this;
        }

        public Builder addAllowedCountrySpecificationsForShipping(Collection collection)
        {
            if(collection != null)
            {
                if(zzaJh.zzaJf == null)
                    zzaJh.zzaJf = new ArrayList();
                zzaJh.zzaJf.addAll(collection);
            }
            return this;
        }

        public MaskedWalletRequest build()
        {
            return zzaJh;
        }

        public Builder setAllowDebitCard(boolean flag)
        {
            zzaJh.zzaJe = flag;
            return this;
        }

        public Builder setAllowPrepaidCard(boolean flag)
        {
            zzaJh.zzaJd = flag;
            return this;
        }

        public Builder setCart(Cart cart)
        {
            zzaJh.zzaIk = cart;
            return this;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaJh.zzaHT = s;
            return this;
        }

        public Builder setEstimatedTotalPrice(String s)
        {
            zzaJh.zzaIY = s;
            return this;
        }

        public Builder setIsBillingAgreement(boolean flag)
        {
            zzaJh.zzaJb = flag;
            return this;
        }

        public Builder setMerchantName(String s)
        {
            zzaJh.zzaIZ = s;
            return this;
        }

        public Builder setMerchantTransactionId(String s)
        {
            zzaJh.zzaIa = s;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean flag)
        {
            zzaJh.zzaIV = flag;
            return this;
        }

        public Builder setShippingAddressRequired(boolean flag)
        {
            zzaJh.zzaIW = flag;
            return this;
        }

        public Builder setShouldRetrieveWalletObjects(boolean flag)
        {
            zzaJh.zzaJa = flag;
            return this;
        }

        public Builder setUseMinimalBillingAddress(boolean flag)
        {
            zzaJh.zzaIX = flag;
            return this;
        }

        final MaskedWalletRequest zzaJh;

        private Builder()
        {
            zzaJh = MaskedWalletRequest.this;
            super();
        }

    }


    MaskedWalletRequest()
    {
        zzzH = 3;
        zzaJd = true;
        zzaJe = true;
    }

    MaskedWalletRequest(int i, String s, boolean flag, boolean flag1, boolean flag2, String s1, String s2, 
            String s3, Cart cart, boolean flag3, boolean flag4, com.google.android.gms.wallet.CountrySpecification acountryspecification[], boolean flag5, boolean flag6, 
            ArrayList arraylist, PaymentMethodTokenizationParameters paymentmethodtokenizationparameters)
    {
        zzzH = i;
        zzaIa = s;
        zzaIV = flag;
        zzaIW = flag1;
        zzaIX = flag2;
        zzaIY = s1;
        zzaHT = s2;
        zzaIZ = s3;
        zzaIk = cart;
        zzaJa = flag3;
        zzaJb = flag4;
        zzaJc = acountryspecification;
        zzaJd = flag5;
        zzaJe = flag6;
        zzaJf = arraylist;
        zzaJg = paymentmethodtokenizationparameters;
    }

    public static Builder newBuilder()
    {
        MaskedWalletRequest maskedwalletrequest = new MaskedWalletRequest();
        maskedwalletrequest.getClass();
        return maskedwalletrequest. new Builder();
    }

    public boolean allowDebitCard()
    {
        return zzaJe;
    }

    public boolean allowPrepaidCard()
    {
        return zzaJd;
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getAllowedCountrySpecificationsForShipping()
    {
        return zzaJf;
    }

    public com.google.android.gms.wallet.CountrySpecification[] getAllowedShippingCountrySpecifications()
    {
        return zzaJc;
    }

    public Cart getCart()
    {
        return zzaIk;
    }

    public String getCurrencyCode()
    {
        return zzaHT;
    }

    public String getEstimatedTotalPrice()
    {
        return zzaIY;
    }

    public String getMerchantName()
    {
        return zzaIZ;
    }

    public String getMerchantTransactionId()
    {
        return zzaIa;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public boolean isBillingAgreement()
    {
        return zzaJb;
    }

    public boolean isPhoneNumberRequired()
    {
        return zzaIV;
    }

    public boolean isShippingAddressRequired()
    {
        return zzaIW;
    }

    public boolean shouldRetrieveWalletObjects()
    {
        return zzaJa;
    }

    public boolean useMinimalBillingAddress()
    {
        return zzaIX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    String zzaHT;
    boolean zzaIV;
    boolean zzaIW;
    boolean zzaIX;
    String zzaIY;
    String zzaIZ;
    String zzaIa;
    Cart zzaIk;
    boolean zzaJa;
    boolean zzaJb;
    com.google.android.gms.wallet.CountrySpecification zzaJc[];
    boolean zzaJd;
    boolean zzaJe;
    ArrayList zzaJf;
    PaymentMethodTokenizationParameters zzaJg;
    private final int zzzH;

}
