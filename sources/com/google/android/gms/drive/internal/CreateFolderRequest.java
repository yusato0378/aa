// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzm

public class CreateFolderRequest
    implements SafeParcelable
{

    CreateFolderRequest(int i, DriveId driveid, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzXy = (DriveId)zzv.zzr(driveid);
        zzXw = (MetadataBundle)zzv.zzr(metadatabundle);
    }

    public CreateFolderRequest(DriveId driveid, MetadataBundle metadatabundle)
    {
        this(1, driveid, metadatabundle);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    final MetadataBundle zzXw;
    final DriveId zzXy;
    final int zzzH;

}
