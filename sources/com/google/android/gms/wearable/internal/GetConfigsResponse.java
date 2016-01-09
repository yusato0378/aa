// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzal

public class GetConfigsResponse
    implements SafeParcelable
{

    GetConfigsResponse(int i, int j, ConnectionConfiguration aconnectionconfiguration[])
    {
        versionCode = i;
        statusCode = j;
        zzaMi = aconnectionconfiguration;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzal.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzal();
    public final int statusCode;
    public final int versionCode;
    public final ConnectionConfiguration zzaMi[];

}
