// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzo

public final class PaymentMethodToken
    implements SafeParcelable
{

    private PaymentMethodToken()
    {
        zzzH = 1;
    }

    PaymentMethodToken(int i, int j, String s)
    {
        zzzH = i;
        zzaJl = j;
        zzaJm = s;
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
        zzo.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    int zzaJl;
    String zzaJm;
    private final int zzzH;

}
