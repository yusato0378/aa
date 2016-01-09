// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

// Referenced classes of package com.google.android.gms.wallet:
//            zze, ProxyCard, Address, InstrumentInfo, 
//            PaymentMethodToken

public final class FullWallet
    implements SafeParcelable
{

    private FullWallet()
    {
        zzzH = 1;
    }

    FullWallet(int i, String s, String s1, ProxyCard proxycard, String s2, Address address, Address address1, 
            String as[], UserAddress useraddress, UserAddress useraddress1, InstrumentInfo ainstrumentinfo[], PaymentMethodToken paymentmethodtoken)
    {
        zzzH = i;
        zzaHZ = s;
        zzaIa = s1;
        zzaIb = proxycard;
        zzaIc = s2;
        zzaId = address;
        zzaIe = address1;
        zzaIf = as;
        zzaIg = useraddress;
        zzaIh = useraddress1;
        zzaIi = ainstrumentinfo;
        zzaIj = paymentmethodtoken;
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

    public String getMerchantTransactionId()
    {
        return zzaIa;
    }

    public String[] getPaymentDescriptions()
    {
        return zzaIf;
    }

    public ProxyCard getProxyCard()
    {
        return zzaIb;
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
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    String zzaHZ;
    String zzaIa;
    ProxyCard zzaIb;
    String zzaIc;
    Address zzaId;
    Address zzaIe;
    String zzaIf[];
    UserAddress zzaIg;
    UserAddress zzaIh;
    InstrumentInfo zzaIi[];
    PaymentMethodToken zzaIj;
    private final int zzzH;

}
