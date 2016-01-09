// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaw

public class OnDownloadProgressResponse
    implements SafeParcelable
{

    OnDownloadProgressResponse(int i, long l, long l1)
    {
        zzzH = i;
        zzZc = l;
        zzZd = l1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaw.zza(this, parcel, i);
    }

    public long zznZ()
    {
        return zzZc;
    }

    public long zzoa()
    {
        return zzZd;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaw();
    final long zzZc;
    final long zzZd;
    final int zzzH;

}
