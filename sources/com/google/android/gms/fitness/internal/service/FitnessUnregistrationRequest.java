// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.fitness.internal.service:
//            zzb

public class FitnessUnregistrationRequest
    implements SafeParcelable
{

    FitnessUnregistrationRequest(int i, DataSource datasource)
    {
        zzzH = i;
        zzacD = datasource;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataSource getDataSource()
    {
        return zzacD;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public String toString()
    {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[] {
            zzacD
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final DataSource zzacD;
    private final int zzzH;

}
