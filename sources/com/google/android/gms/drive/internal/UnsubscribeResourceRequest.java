// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbt

public class UnsubscribeResourceRequest
    implements SafeParcelable
{

    UnsubscribeResourceRequest(int i, DriveId driveid)
    {
        zzzH = i;
        zzXo = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbt.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbt();
    final DriveId zzXo;
    final int zzzH;

}
