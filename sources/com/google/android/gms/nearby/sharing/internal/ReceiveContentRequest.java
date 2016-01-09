// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzg, zzc, zza

public final class ReceiveContentRequest
    implements SafeParcelable
{

    ReceiveContentRequest()
    {
        versionCode = 1;
    }

    ReceiveContentRequest(int i, IBinder ibinder, IBinder ibinder1, String s, IBinder ibinder2)
    {
        versionCode = i;
        zzayb = ibinder;
        zzayg = zza.zza.zzcl(ibinder1);
        packageName = s;
        zzayf = zzc.zza.zzcn(ibinder2);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzayf.asBinder();
    }

    IBinder zzvn()
    {
        if(zzayg == null)
            return null;
        else
            return zzayg.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    public String packageName;
    final int versionCode;
    public IBinder zzayb;
    public zzc zzayf;
    public zza zzayg;

}
