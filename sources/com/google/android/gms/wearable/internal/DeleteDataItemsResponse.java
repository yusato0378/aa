// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzad

public class DeleteDataItemsResponse
    implements SafeParcelable
{

    DeleteDataItemsResponse(int i, int j, int k)
    {
        versionCode = i;
        statusCode = j;
        zzaMc = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzad();
    public final int statusCode;
    public final int versionCode;
    public final int zzaMc;

}
