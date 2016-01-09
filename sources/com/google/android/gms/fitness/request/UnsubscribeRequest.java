// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzae

public class UnsubscribeRequest
    implements SafeParcelable
{

    UnsubscribeRequest(int i, DataType datatype, DataSource datasource, IBinder ibinder, String s)
    {
        zzzH = i;
        zzacC = datatype;
        zzacD = datasource;
        if(ibinder == null)
            datatype = null;
        else
            datatype = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = datatype;
        zzJd = s;
    }

    public UnsubscribeRequest(DataType datatype, DataSource datasource, zzjm zzjm1, String s)
    {
        zzzH = 2;
        zzacC = datatype;
        zzacD = datasource;
        zzaeH = zzjm1;
        zzJd = s;
    }

    private boolean zzb(UnsubscribeRequest unsubscriberequest)
    {
        return zzu.equal(zzacD, unsubscriberequest.zzacD) && zzu.equal(zzacC, unsubscriberequest.zzacC);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof UnsubscribeRequest) && zzb((UnsubscribeRequest)obj);
    }

    public DataSource getDataSource()
    {
        return zzacD;
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

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzacD, zzacC
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzae();
    private final String zzJd;
    private final DataType zzacC;
    private final DataSource zzacD;
    private final zzjm zzaeH;
    private final int zzzH;

}
