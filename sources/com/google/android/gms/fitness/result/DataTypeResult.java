// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzg

public class DataTypeResult
    implements Result, SafeParcelable
{

    DataTypeResult(int i, Status status, DataType datatype)
    {
        zzzH = i;
        zzKr = status;
        zzacC = datatype;
    }

    public DataTypeResult(Status status, DataType datatype)
    {
        zzzH = 2;
        zzKr = status;
        zzacC = datatype;
    }

    public static DataTypeResult zzF(Status status)
    {
        return new DataTypeResult(status, null);
    }

    private boolean zzb(DataTypeResult datatyperesult)
    {
        return zzKr.equals(datatyperesult.zzKr) && zzu.equal(zzacC, datatyperesult.zzacC);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataTypeResult) && zzb((DataTypeResult)obj);
    }

    public DataType getDataType()
    {
        return zzacC;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKr, zzacC
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", zzKr).zzg("dataType", zzacC).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    private final Status zzKr;
    private final DataType zzacC;
    private final int zzzH;

}
