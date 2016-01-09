// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zze

public class DataInsertRequest
    implements SafeParcelable
{

    DataInsertRequest(int i, DataSet dataset, IBinder ibinder, String s, boolean flag)
    {
        zzzH = i;
        zzadJ = dataset;
        if(ibinder == null)
            dataset = null;
        else
            dataset = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = dataset;
        zzJd = s;
        zzaeN = flag;
    }

    public DataInsertRequest(DataSet dataset, zzjm zzjm1, String s, boolean flag)
    {
        zzzH = 3;
        zzadJ = dataset;
        zzaeH = zzjm1;
        zzJd = s;
        zzaeN = flag;
    }

    private boolean zzb(DataInsertRequest datainsertrequest)
    {
        return zzu.equal(zzadJ, datainsertrequest.zzadJ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataInsertRequest) && zzb((DataInsertRequest)obj);
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
            zzadJ
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("dataSet", zzadJ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public DataSet zzoV()
    {
        return zzadJ;
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public boolean zzpj()
    {
        return zzaeN;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    private final String zzJd;
    private final DataSet zzadJ;
    private final zzjm zzaeH;
    private final boolean zzaeN;
    private final int zzzH;

}
