// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbh

public class OnSyncMoreResponse
    implements SafeParcelable
{

    OnSyncMoreResponse(int i, boolean flag)
    {
        zzzH = i;
        zzXH = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbh();
    final boolean zzXH;
    final int zzzH;

}
