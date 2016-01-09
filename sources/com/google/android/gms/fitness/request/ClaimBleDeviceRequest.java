// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.zzjm;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzb

public class ClaimBleDeviceRequest
    implements SafeParcelable
{

    ClaimBleDeviceRequest(int i, String s, BleDevice bledevice, IBinder ibinder, String s1)
    {
        zzzH = i;
        zzaeF = s;
        zzaeG = bledevice;
        if(ibinder == null)
            s = null;
        else
            s = com.google.android.gms.internal.zzjm.zza.zzaS(ibinder);
        zzaeH = s;
        zzJd = s1;
    }

    public ClaimBleDeviceRequest(String s, BleDevice bledevice, zzjm zzjm1, String s1)
    {
        zzzH = 3;
        zzaeF = s;
        zzaeG = bledevice;
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
        return String.format("ClaimBleDeviceRequest{%s %s}", new Object[] {
            zzaeF, zzaeG
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public BleDevice zzpe()
    {
        return zzaeG;
    }

    public IBinder zzpf()
    {
        if(zzaeH == null)
            return null;
        else
            return zzaeH.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    private final String zzJd;
    private final String zzaeF;
    private final BleDevice zzaeG;
    private final zzjm zzaeH;
    private final int zzzH;

}
