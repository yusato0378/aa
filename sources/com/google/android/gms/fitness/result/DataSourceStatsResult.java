// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzd

public class DataSourceStatsResult
    implements SafeParcelable
{

    DataSourceStatsResult(int i, DataSource datasource, long l, boolean flag, long l1, 
            long l2)
    {
        zzzH = i;
        zzacD = datasource;
        zzKv = l;
        zzafL = flag;
        zzafM = l1;
        zzafN = l2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    public final long zzKv;
    public final DataSource zzacD;
    public final boolean zzafL;
    public final long zzafM;
    public final long zzafN;
    final int zzzH;

}
