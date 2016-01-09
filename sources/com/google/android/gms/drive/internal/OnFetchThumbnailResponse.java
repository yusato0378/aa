// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzba

public class OnFetchThumbnailResponse
    implements SafeParcelable
{

    OnFetchThumbnailResponse(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        zzzH = i;
        zzZk = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzba.zza(this, parcel, i | 1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzba();
    final ParcelFileDescriptor zzZk;
    final int zzzH;

}
