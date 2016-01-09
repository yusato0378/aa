// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzo, DataSet, zzs

public final class RawDataSet
    implements SafeParcelable
{

    public RawDataSet(int i, int j, int k, List list, boolean flag)
    {
        zzzH = i;
        zzadC = j;
        zzadE = k;
        zzadF = list;
        zzacS = flag;
    }

    public RawDataSet(DataSet dataset, List list, List list1)
    {
        zzzH = 3;
        zzadF = dataset.zzl(list);
        zzacS = dataset.zzoC();
        zzadC = zzs.zza(dataset.getDataSource(), list);
        zzadE = zzs.zza(dataset.getDataType(), list1);
    }

    private boolean zza(RawDataSet rawdataset)
    {
        return zzadC == rawdataset.zzadC && zzacS == rawdataset.zzacS && zzu.equal(zzadF, rawdataset.zzadF);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataSet) && zza((RawDataSet)obj);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzadC)
        });
    }

    public String toString()
    {
        return String.format("RawDataSet{%s@[%s]}", new Object[] {
            Integer.valueOf(zzadC), zzadF
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    public final boolean zzacS;
    public final int zzadC;
    public final int zzadE;
    public final List zzadF;
    final int zzzH;

}
