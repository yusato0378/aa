// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzao

public class GetFdForAssetResponse
    implements SafeParcelable
{

    GetFdForAssetResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        versionCode = i;
        statusCode = j;
        zzaMl = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzao.zza(this, parcel, i | 1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzao();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzaMl;

}
