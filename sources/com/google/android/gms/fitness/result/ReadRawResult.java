// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzi

public class ReadRawResult
    implements Result, SafeParcelable
{

    ReadRawResult(int i, DataHolder dataholder)
    {
        zzzH = i;
        zzPy = dataholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public Status getStatus()
    {
        return new Status(zzPy.getStatusCode());
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    DataHolder zznK()
    {
        return zzPy;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    private final DataHolder zzPy;
    private final int zzzH;

}
