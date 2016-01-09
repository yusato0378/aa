// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzn, DataPoint, zzs, Value

public final class RawDataPoint
    implements SafeParcelable
{

    public RawDataPoint(int i, long l, long l1, Value avalue[], int j, 
            int k, long l2, long l3)
    {
        zzzH = i;
        zzacT = l;
        zzacU = l1;
        zzadC = j;
        zzadD = k;
        zzacX = l2;
        zzacY = l3;
        zzacV = avalue;
    }

    RawDataPoint(DataPoint datapoint, List list)
    {
        zzzH = 4;
        zzacT = datapoint.getTimestamp(TimeUnit.NANOSECONDS);
        zzacU = datapoint.getStartTime(TimeUnit.NANOSECONDS);
        zzacV = datapoint.zzoF();
        zzadC = zzs.zza(datapoint.getDataSource(), list);
        zzadD = zzs.zza(datapoint.getOriginalDataSource(), list);
        zzacX = datapoint.zzoG();
        zzacY = datapoint.zzoH();
    }

    private boolean zza(RawDataPoint rawdatapoint)
    {
        return zzacT == rawdatapoint.zzacT && zzacU == rawdatapoint.zzacU && Arrays.equals(zzacV, rawdatapoint.zzacV) && zzadC == rawdatapoint.zzadC && zzadD == rawdatapoint.zzadD && zzacX == rawdatapoint.zzacX;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof RawDataPoint) && zza((RawDataPoint)obj);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Long.valueOf(zzacT), Long.valueOf(zzacU)
        });
    }

    public String toString()
    {
        return String.format("RawDataPoint{%s@[%s, %s](%d,%d)}", new Object[] {
            Arrays.toString(zzacV), Long.valueOf(zzacU), Long.valueOf(zzacT), Integer.valueOf(zzadC), Integer.valueOf(zzadD)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzn();
    public final long zzacT;
    public final long zzacU;
    public final Value zzacV[];
    public final long zzacX;
    public final long zzacY;
    public final int zzadC;
    public final int zzadD;
    final int zzzH;

}
