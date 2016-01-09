// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbi

public class OpenContentsRequest
    implements SafeParcelable
{

    OpenContentsRequest(int i, DriveId driveid, int j, int k)
    {
        zzzH = i;
        zzXo = driveid;
        zzVK = j;
        zzZo = k;
    }

    public OpenContentsRequest(DriveId driveid, int i, int j)
    {
        this(1, driveid, i, j);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbi();
    final int zzVK;
    final DriveId zzXo;
    final int zzZo;
    final int zzzH;

}
