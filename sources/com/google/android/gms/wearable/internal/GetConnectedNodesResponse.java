// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzam

public class GetConnectedNodesResponse
    implements SafeParcelable
{

    GetConnectedNodesResponse(int i, int j, List list)
    {
        versionCode = i;
        statusCode = j;
        zzaMj = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzam.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzam();
    public final int statusCode;
    public final int versionCode;
    public final List zzaMj;

}
