// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzc

public class AuthorizeAccessRequest
    implements SafeParcelable
{

    AuthorizeAccessRequest(int i, long l, DriveId driveid)
    {
        zzzH = i;
        zzXm = l;
        zzVL = driveid;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final DriveId zzVL;
    final long zzXm;
    final int zzzH;

}
