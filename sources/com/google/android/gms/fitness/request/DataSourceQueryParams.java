// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzg

public class DataSourceQueryParams
    implements SafeParcelable
{

    DataSourceQueryParams(int i, DataSource datasource, long l, long l1, long l2, int j, int k)
    {
        zzzH = i;
        zzacD = datasource;
        zzKv = l;
        zzacU = l1;
        zzaeX = l2;
        zzaeS = j;
        zzaeY = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    public final long zzKv;
    public final DataSource zzacD;
    public final long zzacU;
    public final int zzaeS;
    public final long zzaeX;
    public final int zzaeY;
    final int zzzH;

}
