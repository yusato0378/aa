// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzg

public final class TimeInterval
    implements SafeParcelable
{

    TimeInterval()
    {
        zzzH = 1;
    }

    TimeInterval(int i, long l, long l1)
    {
        zzzH = i;
        zzaKt = l;
        zzaKu = l1;
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
        zzg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    long zzaKt;
    long zzaKu;
    private final int zzzH;

}
