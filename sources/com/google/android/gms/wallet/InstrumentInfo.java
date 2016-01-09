// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzh

public final class InstrumentInfo
    implements SafeParcelable
{

    InstrumentInfo(int i, String s, String s1)
    {
        zzzH = i;
        zzaIt = s;
        zzaIu = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getInstrumentDetails()
    {
        return zzaIu;
    }

    public String getInstrumentType()
    {
        return zzaIt;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    private String zzaIt;
    private String zzaIu;
    private final int zzzH;

}
