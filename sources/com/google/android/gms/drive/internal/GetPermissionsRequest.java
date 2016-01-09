// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzai

public class GetPermissionsRequest
    implements SafeParcelable
{

    GetPermissionsRequest(int i, DriveId driveid)
    {
        zzzH = i;
        zzVL = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzai.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzai();
    final DriveId zzVL;
    final int zzzH;

}
