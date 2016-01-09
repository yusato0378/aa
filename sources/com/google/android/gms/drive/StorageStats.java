// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            zzj

public class StorageStats
    implements SafeParcelable
{

    StorageStats(int i, long l, long l1, long l2, 
            long l3, int j)
    {
        zzzH = i;
        zzWz = l;
        zzWA = l1;
        zzWB = l2;
        zzWC = l3;
        zzWD = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final long zzWA;
    final long zzWB;
    final long zzWC;
    final int zzWD;
    final long zzWz;
    final int zzzH;

}
