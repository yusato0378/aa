// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzak

public class GetConfigResponse
    implements SafeParcelable
{

    GetConfigResponse(int i, int j, ConnectionConfiguration connectionconfiguration)
    {
        versionCode = i;
        statusCode = j;
        zzaMh = connectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzak.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzak();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration zzaMh;

}
