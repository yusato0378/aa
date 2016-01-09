// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzp

public final class PaymentMethodTokenizationParameters
    implements SafeParcelable
{

    private PaymentMethodTokenizationParameters()
    {
        zzavQ = new Bundle();
        zzzH = 1;
    }

    PaymentMethodTokenizationParameters(int i, int j, Bundle bundle)
    {
        zzavQ = new Bundle();
        zzzH = i;
        zzaJl = j;
        zzavQ = bundle;
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
        zzp.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    int zzaJl;
    Bundle zzavQ;
    private final int zzzH;

}
