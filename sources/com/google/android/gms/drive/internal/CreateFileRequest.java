// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzl

public class CreateFileRequest
    implements SafeParcelable
{

    CreateFileRequest(int i, DriveId driveid, MetadataBundle metadatabundle, Contents contents, Integer integer, boolean flag, String s, 
            int j, int k)
    {
        if(contents != null && k != 0)
        {
            boolean flag1;
            if(contents.getRequestId() == k)
                flag1 = true;
            else
                flag1 = false;
            zzv.zzb(flag1, "inconsistent contents reference");
        }
        if((integer == null || integer.intValue() == 0) && contents == null && k == 0)
        {
            throw new IllegalArgumentException("Need a valid contents");
        } else
        {
            zzzH = i;
            zzXy = (DriveId)zzv.zzr(driveid);
            zzXw = (MetadataBundle)zzv.zzr(metadatabundle);
            zzXq = contents;
            zzXx = integer;
            zzWf = s;
            zzXz = j;
            zzXl = flag;
            zzXA = k;
            return;
        }
    }

    public CreateFileRequest(DriveId driveid, MetadataBundle metadatabundle, int i, int j, ExecutionOptions executionoptions)
    {
        this(2, driveid, metadatabundle, null, Integer.valueOf(j), executionoptions.zznw(), executionoptions.zznv(), executionoptions.zznx(), i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final String zzWf;
    final int zzXA;
    final boolean zzXl;
    final Contents zzXq;
    final MetadataBundle zzXw;
    final Integer zzXx;
    final DriveId zzXy;
    final int zzXz;
    final int zzzH;

}
