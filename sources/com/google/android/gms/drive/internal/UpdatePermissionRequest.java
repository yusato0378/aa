// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbw

public class UpdatePermissionRequest
    implements SafeParcelable
{

    UpdatePermissionRequest(int i, DriveId driveid, String s, int j, boolean flag, String s1)
    {
        zzzH = i;
        zzVL = driveid;
        zzWr = s;
        zzZu = j;
        zzXl = flag;
        zzWf = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbw.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbw();
    final DriveId zzVL;
    final String zzWf;
    final String zzWr;
    final boolean zzXl;
    final int zzZu;
    final int zzzH;

}
