// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzj, zzc

public final class StopProvidingContentRequest
    implements SafeParcelable
{

    StopProvidingContentRequest()
    {
        versionCode = 1;
    }

    StopProvidingContentRequest(int i, long l, IBinder ibinder)
    {
        versionCode = i;
        zzaye = l;
        zzayf = zzc.zza.zzcn(ibinder);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    IBinder zzve()
    {
        return zzayf.asBinder();
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int versionCode;
    public long zzaye;
    public zzc zzayf;

}
