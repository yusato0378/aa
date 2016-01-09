// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbd

public class OnMetadataResponse
    implements SafeParcelable
{

    OnMetadataResponse(int i, MetadataBundle metadatabundle)
    {
        zzzH = i;
        zzXw = metadatabundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbd.zza(this, parcel, i);
    }

    public MetadataBundle zzof()
    {
        return zzXw;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbd();
    final MetadataBundle zzXw;
    final int zzzH;

}
