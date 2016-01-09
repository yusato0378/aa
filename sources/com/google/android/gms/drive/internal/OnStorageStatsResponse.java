// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.StorageStats;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbg

public class OnStorageStatsResponse
    implements SafeParcelable
{

    OnStorageStatsResponse(int i, StorageStats storagestats)
    {
        zzzH = i;
        zzZn = storagestats;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbg();
    StorageStats zzZn;
    final int zzzH;

}
