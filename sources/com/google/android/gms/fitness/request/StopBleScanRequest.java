// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzab, zzn, BleScanCallback

public class StopBleScanRequest
    implements SafeParcelable
{

    StopBleScanRequest(int i, IBinder ibinder, IBinder ibinder1, String s)
    {
        zzzH = i;
        zzafD = zzn.zza.zzaV(ibinder);
        if(ibinder1 == null)
            ibinder = null;
        else
            ibinder = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder1);
        zzaeH = ibinder;
        zzJd = s;
    }

    public StopBleScanRequest(BleScanCallback blescancallback, zzjm zzjm1, String s)
    {
        this(((zzn) (zza.zza.zzpd().zzb(blescancallback))), zzjm1, s);
    }

    public StopBleScanRequest(zzn zzn1, zzjm zzjm1, String s)
    {
        zzzH = 2;
        zzafD = zzn1;
        zzaeH = zzjm1;
        zzJd = s;
    }

    public int describeContents()
    {
        return 0;
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
        zzab.zza(this, parcel, i);
    }

    public IBinder zzpA()
    {
        return zzafD.asBinder();
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    private final String zzJd;
    private final zzjm zzaeH;
    private final zzn zzafD;
    private final int zzzH;

}
