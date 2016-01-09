// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzag

public class GetDriveIdFromUniqueIdentifierRequest
    implements SafeParcelable
{

    GetDriveIdFromUniqueIdentifierRequest(int i, String s, boolean flag)
    {
        zzzH = i;
        zzYH = s;
        zzYI = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzag.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzag();
    final String zzYH;
    final boolean zzYI;
    final int zzzH;

}
