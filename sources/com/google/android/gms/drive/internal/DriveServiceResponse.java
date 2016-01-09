// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzab

public class DriveServiceResponse
    implements SafeParcelable
{

    DriveServiceResponse(int i, IBinder ibinder)
    {
        zzzH = i;
        zzYx = ibinder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzab.zza(this, parcel, i);
    }

    public ICancelToken zznS()
    {
        return com.google.android.gms.common.internal.ICancelToken.zza.zzR(zzYx);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzab();
    final IBinder zzYx;
    final int zzzH;

}
