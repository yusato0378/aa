// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zziw;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzc

public class DailyTotalRequest
    implements SafeParcelable
{

    DailyTotalRequest(int i, IBinder ibinder, DataType datatype, String s)
    {
        zzzH = i;
        zzaeI = com.google.android.gms.internal.zziw.zza.zzaC(ibinder);
        zzacC = datatype;
        zzJd = s;
    }

    public DailyTotalRequest(zziw zziw1, DataType datatype, String s)
    {
        zzzH = 1;
        zzaeI = zziw1;
        zzacC = datatype;
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

    public String toString()
    {
        return String.format("DailyTotalRequest{%s}", new Object[] {
            zzacC.zzoO()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzaeI.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final String zzJd;
    private final DataType zzacC;
    private final zziw zzaeI;
    private final int zzzH;

}
