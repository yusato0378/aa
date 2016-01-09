// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.*;

// Referenced classes of package com.google.android.gms.drive:
//            zzb, DriveId

public class Contents
    implements SafeParcelable
{

    Contents(int i, ParcelFileDescriptor parcelfiledescriptor, int j, int k, DriveId driveid, boolean flag)
    {
        zzzH = i;
        zzSd = parcelfiledescriptor;
        zzVJ = j;
        zzVK = k;
        zzVL = driveid;
        zzVM = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public DriveId getDriveId()
    {
        return zzVL;
    }

    public InputStream getInputStream()
    {
        return new FileInputStream(zzSd.getFileDescriptor());
    }

    public int getMode()
    {
        return zzVK;
    }

    public OutputStream getOutputStream()
    {
        return new FileOutputStream(zzSd.getFileDescriptor());
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        return zzSd;
    }

    public int getRequestId()
    {
        return zzVJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public boolean zznp()
    {
        return zzVM;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzb();
    final ParcelFileDescriptor zzSd;
    final int zzVJ;
    final int zzVK;
    final DriveId zzVL;
    final boolean zzVM;
    final int zzzH;

}
