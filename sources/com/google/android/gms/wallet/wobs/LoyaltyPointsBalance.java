// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzd

public final class LoyaltyPointsBalance
    implements SafeParcelable
{

    LoyaltyPointsBalance()
    {
        zzzH = 1;
        zzaKr = -1;
        zzaKn = -1;
        zzaKp = -1D;
    }

    LoyaltyPointsBalance(int i, int j, String s, double d, String s1, long l, int k)
    {
        zzzH = i;
        zzaKn = j;
        zzaKo = s;
        zzaKp = d;
        zzaIq = s1;
        zzaKq = l;
        zzaKr = k;
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
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    String zzaIq;
    int zzaKn;
    String zzaKo;
    double zzaKp;
    long zzaKq;
    int zzaKr;
    private final int zzzH;

}
