// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzah

public class GetChannelOutputStreamResponse
    implements SafeParcelable
{

    GetChannelOutputStreamResponse(int i, int j, ParcelFileDescriptor parcelfiledescriptor)
    {
        versionCode = i;
        statusCode = j;
        zzaMf = parcelfiledescriptor;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzah.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzah();
    public final int statusCode;
    public final int versionCode;
    public final ParcelFileDescriptor zzaMf;

}
