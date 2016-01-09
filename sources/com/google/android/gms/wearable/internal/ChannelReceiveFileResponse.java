// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzo

public class ChannelReceiveFileResponse
    implements SafeParcelable
{

    ChannelReceiveFileResponse(int i, int j)
    {
        versionCode = i;
        statusCode = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzo();
    public final int statusCode;
    public final int versionCode;

}
