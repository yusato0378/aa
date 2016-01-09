// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzai

public class GetCloudSyncOptInOutDoneResponse
    implements SafeParcelable
{

    GetCloudSyncOptInOutDoneResponse(int i, int j, boolean flag)
    {
        versionCode = i;
        statusCode = j;
        zzaMg = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzai.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzai();
    public final int statusCode;
    public final int versionCode;
    public final boolean zzaMg;

}
