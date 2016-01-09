// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzk, zzc

public final class TrustedDevicesRequest
    implements SafeParcelable
{

    TrustedDevicesRequest(int i, String s, byte abyte0[], IBinder ibinder)
    {
        versionCode = i;
        zzayh = (String)zzv.zzr(s);
        zzayi = (byte[])zzv.zzr(abyte0);
        zzayf = zzc.zza.zzcn(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzayf.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int versionCode;
    public zzc zzayf;
    public String zzayh;
    public byte zzayi[];

}
