// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzk

public class CreateFileIntentSenderRequest
    implements SafeParcelable
{

    CreateFileIntentSenderRequest(int i, MetadataBundle metadatabundle, int j, String s, DriveId driveid, Integer integer)
    {
        zzzH = i;
        zzXw = metadatabundle;
        zzVJ = j;
        zzWn = s;
        zzWq = driveid;
        zzXx = integer;
    }

    public CreateFileIntentSenderRequest(MetadataBundle metadatabundle, int i, String s, DriveId driveid, int j)
    {
        this(1, metadatabundle, i, s, driveid, Integer.valueOf(j));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzVJ;
    final String zzWn;
    final DriveId zzWq;
    final MetadataBundle zzXw;
    final Integer zzXx;
    final int zzzH;

}
