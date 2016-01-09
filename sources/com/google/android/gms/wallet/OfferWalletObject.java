// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

// Referenced classes of package com.google.android.gms.wallet:
//            zzn

public final class OfferWalletObject
    implements SafeParcelable
{

    OfferWalletObject()
    {
        zzzH = 3;
    }

    OfferWalletObject(int i, String s, String s1, CommonWalletObject commonwalletobject)
    {
        zzzH = i;
        zzaJk = s1;
        if(i < 3)
        {
            zzaIm = CommonWalletObject.zzyT().zzex(s).zzyU();
            return;
        } else
        {
            zzaIm = commonwalletobject;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public String getId()
    {
        return zzaIm.getId();
    }

    public String getRedemptionCode()
    {
        return zzaJk;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    CommonWalletObject zzaIm;
    String zzaJk;
    String zzga;
    private final int zzzH;

}
