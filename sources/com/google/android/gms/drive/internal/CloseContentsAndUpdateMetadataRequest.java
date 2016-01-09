// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzg

public class CloseContentsAndUpdateMetadataRequest
    implements SafeParcelable
{

    CloseContentsAndUpdateMetadataRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, boolean flag, String s, int j)
    {
        zzzH = i;
        zzXo = driveid;
        zzXp = metadatabundle;
        zzXq = contents;
        zzWg = flag;
        zzWf = s;
        zzXr = j;
    }

    public CloseContentsAndUpdateMetadataRequest(DriveId driveid, MetadataBundle metadatabundle, Contents contents, ExecutionOptions executionoptions)
    {
        this(1, driveid, metadatabundle, contents, executionoptions.zznw(), executionoptions.zznv(), executionoptions.zznx());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    final String zzWf;
    final boolean zzWg;
    final DriveId zzXo;
    final MetadataBundle zzXp;
    final Contents zzXq;
    final int zzXr;
    final int zzzH;

}
