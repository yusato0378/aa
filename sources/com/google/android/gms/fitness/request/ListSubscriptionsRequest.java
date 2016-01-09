// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzjh;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzp

public class ListSubscriptionsRequest
    implements SafeParcelable
{

    ListSubscriptionsRequest(int i, DataType datatype, IBinder ibinder, String s)
    {
        zzzH = i;
        zzacC = datatype;
        if(ibinder == null)
            datatype = null;
        else
            datatype = com.google.android.gms.internal.zzjh.zza.zzaN(ibinder);
        zzafh = datatype;
        zzJd = s;
    }

    public ListSubscriptionsRequest(DataType datatype, zzjh zzjh1, String s)
    {
        zzzH = 2;
        zzacC = datatype;
        zzafh = zzjh1;
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataType getDataType()
    {
        return zzacC;
    }

    public String getPackageName()
    {
        return zzJd;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzafh == null)
            return null;
        else
            return zzafh.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    private final String zzJd;
    private final DataType zzacC;
    private final zzjh zzafh;
    private final int zzzH;

}
