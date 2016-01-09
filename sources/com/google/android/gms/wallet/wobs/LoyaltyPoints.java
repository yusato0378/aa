// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zze, TimeInterval, LoyaltyPointsBalance

public final class LoyaltyPoints
    implements SafeParcelable
{

    LoyaltyPoints()
    {
        zzzH = 1;
    }

    LoyaltyPoints(int i, String s, LoyaltyPointsBalance loyaltypointsbalance, String s1, TimeInterval timeinterval)
    {
        zzzH = i;
        label = s;
        zzaKm = loyaltypointsbalance;
        type = s1;
        zzaII = timeinterval;
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
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    String label;
    String type;
    TimeInterval zzaII;
    LoyaltyPointsBalance zzaKm;
    private final int zzzH;

}
