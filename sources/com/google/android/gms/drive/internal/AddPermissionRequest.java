// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.Permission;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzb

public class AddPermissionRequest
    implements SafeParcelable
{

    AddPermissionRequest(int i, DriveId driveid, Permission permission, boolean flag, String s, boolean flag1, String s1)
    {
        zzzH = i;
        zzVL = driveid;
        zzXi = permission;
        zzXj = flag;
        zzXk = s;
        zzXl = flag1;
        zzWf = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final DriveId zzVL;
    final String zzWf;
    final Permission zzXi;
    final boolean zzXj;
    final String zzXk;
    final boolean zzXl;
    final int zzzH;

}
