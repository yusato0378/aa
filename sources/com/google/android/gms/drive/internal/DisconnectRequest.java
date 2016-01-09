// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzp

public class DisconnectRequest
    implements SafeParcelable
{

    public DisconnectRequest()
    {
        this(1);
    }

    DisconnectRequest(int i)
    {
        zzzH = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzp();
    final int zzzH;

}
