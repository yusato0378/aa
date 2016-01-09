// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbf

public class OnResourceIdSetResponse
    implements SafeParcelable
{

    OnResourceIdSetResponse(int i, List list)
    {
        zzzH = i;
        zzXn = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbf.zza(this, parcel, i);
    }

    public List zznN()
    {
        return zzXn;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbf();
    private final List zzXn;
    private final int zzzH;

}
