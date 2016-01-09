// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzka;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzo

public class ListClaimedBleDevicesRequest
    implements SafeParcelable
{

    ListClaimedBleDevicesRequest(int i, IBinder ibinder, String s)
    {
        zzzH = i;
        zzafg = com.google.android.gms.internal.zzka.zza.zzaU(ibinder);
        zzJd = s;
    }

    public ListClaimedBleDevicesRequest(zzka zzka1, String s)
    {
        zzzH = 1;
        zzafg = zzka1;
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

    public String toString()
    {
        return String.format("ListClaimedBleDevicesRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public IBinder zzpf()
    {
        return zzafg.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    private final String zzJd;
    private final zzka zzafg;
    private final int zzzH;

}
