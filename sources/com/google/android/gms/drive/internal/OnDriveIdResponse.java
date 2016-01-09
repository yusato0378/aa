// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzax

public class OnDriveIdResponse
    implements SafeParcelable
{

    OnDriveIdResponse(int i, DriveId driveid)
    {
        zzzH = i;
        zzXo = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return zzXo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzax.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzax();
    DriveId zzXo;
    final int zzzH;

}
