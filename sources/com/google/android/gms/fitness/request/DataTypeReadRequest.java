// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zziz;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzj

public class DataTypeReadRequest
    implements SafeParcelable
{

    DataTypeReadRequest(int i, String s, IBinder ibinder, String s1)
    {
        zzzH = i;
        mName = s;
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zziz.zza.zzaF(ibinder);
        zzafe = s;
        zzJd = s1;
    }

    public DataTypeReadRequest(String s, zziz zziz1, String s1)
    {
        zzzH = 2;
        mName = s;
        zzafe = zziz1;
        zzJd = s1;
    }

    private boolean zzb(DataTypeReadRequest datatypereadrequest)
    {
        return zzu.equal(mName, datatypereadrequest.mName);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof DataTypeReadRequest) && zzb((DataTypeReadRequest)obj);
    }

    public String getName()
    {
        return mName;
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
            mName
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", mName).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzafe.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final String mName;
    private final String zzJd;
    private final zziz zzafe;
    private final int zzzH;

}
