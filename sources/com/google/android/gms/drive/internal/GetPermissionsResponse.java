// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzaj

public class GetPermissionsResponse
    implements SafeParcelable
{

    GetPermissionsResponse(int i, List list)
    {
        zzzH = i;
        zzYK = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzaj.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzaj();
    final List zzYK;
    final int zzzH;

}
