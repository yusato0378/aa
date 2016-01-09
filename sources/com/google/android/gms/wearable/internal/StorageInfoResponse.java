// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbh

public class StorageInfoResponse
    implements SafeParcelable
{

    StorageInfoResponse(int i, int j, long l, List list)
    {
        versionCode = i;
        statusCode = j;
        zzaMA = l;
        zzaMD = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbh();
    public final int statusCode;
    public final int versionCode;
    public final long zzaMA;
    public final List zzaMD;

}
