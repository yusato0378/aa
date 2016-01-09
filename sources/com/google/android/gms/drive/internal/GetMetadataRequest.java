// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzah

public class GetMetadataRequest
    implements SafeParcelable
{

    GetMetadataRequest(int i, DriveId driveid, boolean flag)
    {
        zzzH = i;
        zzXo = driveid;
        zzYJ = flag;
    }

    public GetMetadataRequest(DriveId driveid, boolean flag)
    {
        this(1, driveid, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzah.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzah();
    final DriveId zzXo;
    final boolean zzYJ;
    final int zzzH;

}
