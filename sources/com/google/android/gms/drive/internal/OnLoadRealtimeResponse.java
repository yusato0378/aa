// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbe

public class OnLoadRealtimeResponse
    implements SafeParcelable
{

    OnLoadRealtimeResponse(int i, boolean flag)
    {
        zzzH = i;
        zznz = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbe.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbe();
    final boolean zznz;
    final int zzzH;

}
