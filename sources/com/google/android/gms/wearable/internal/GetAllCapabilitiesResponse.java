// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzae

public class GetAllCapabilitiesResponse
    implements SafeParcelable
{

    GetAllCapabilitiesResponse(int i, int j, List list)
    {
        versionCode = i;
        statusCode = j;
        zzaMd = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzae.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzae();
    public final int statusCode;
    public final int versionCode;
    final List zzaMd;

}
