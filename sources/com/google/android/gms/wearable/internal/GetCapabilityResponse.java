// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzaf, CapabilityInfoParcelable

public class GetCapabilityResponse
    implements SafeParcelable
{

    GetCapabilityResponse(int i, int j, CapabilityInfoParcelable capabilityinfoparcelable)
    {
        versionCode = i;
        statusCode = j;
        zzaMe = capabilityinfoparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaf.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaf();
    public final int statusCode;
    public final int versionCode;
    public final CapabilityInfoParcelable zzaMe;

}
