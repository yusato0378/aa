// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.Contents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzh

public class CloseContentsRequest
    implements SafeParcelable
{

    CloseContentsRequest(int i, Contents contents, Boolean boolean1)
    {
        zzzH = i;
        zzXq = contents;
        zzXs = boolean1;
    }

    public CloseContentsRequest(Contents contents, boolean flag)
    {
        this(1, contents, Boolean.valueOf(flag));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final Contents zzXq;
    final Boolean zzXs;
    final int zzzH;

}
