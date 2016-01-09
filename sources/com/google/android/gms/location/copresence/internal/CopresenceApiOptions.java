// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            zza

public final class CopresenceApiOptions
    implements SafeParcelable
{

    CopresenceApiOptions(int i, boolean flag)
    {
        zzzH = i;
        zzaqy = flag;
    }

    public CopresenceApiOptions(boolean flag)
    {
        this(1, flag);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final CopresenceApiOptions zzaqx = new CopresenceApiOptions(true);
    public final boolean zzaqy;
    final int zzzH;

}
