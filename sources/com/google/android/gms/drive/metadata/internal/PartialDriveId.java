// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzm

public class PartialDriveId
    implements SafeParcelable
{

    PartialDriveId(int i, String s, long l, int j)
    {
        zzzH = i;
        zzVV = s;
        zzVW = l;
        zzVX = j;
    }

    public PartialDriveId(String s, long l, int i)
    {
        this(1, s, l, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public DriveId zzC(long l)
    {
        return new DriveId(zzVV, zzVW, l, zzVX);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    final String zzVV;
    final long zzVW;
    final int zzVX;
    final int zzzH;

}
