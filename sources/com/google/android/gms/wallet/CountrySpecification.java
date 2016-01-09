// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzc

public class CountrySpecification
    implements SafeParcelable
{

    CountrySpecification(int i, String s)
    {
        zzzH = i;
        zzBc = s;
    }

    public CountrySpecification(String s)
    {
        zzzH = 1;
        zzBc = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCountryCode()
    {
        return zzBc;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    String zzBc;
    private final int zzzH;

}
