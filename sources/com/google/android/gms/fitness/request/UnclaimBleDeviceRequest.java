// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzad

public class UnclaimBleDeviceRequest
    implements SafeParcelable
{

    UnclaimBleDeviceRequest(int i, String s, IBinder ibinder, String s1)
    {
        zzzH = i;
        zzaeF = s;
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = s;
        zzJd = s1;
    }

    public UnclaimBleDeviceRequest(String s, zzjm zzjm1, String s1)
    {
        zzzH = 4;
        zzaeF = s;
        zzaeH = zzjm1;
        zzJd = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDeviceAddress()
    {
        return zzaeF;
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
        return String.format("UnclaimBleDeviceRequest{%s}", new Object[] {
            zzaeF
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzad();
    private final String zzJd;
    private final String zzaeF;
    private final zzjm zzaeH;
    private final int zzzH;

}
