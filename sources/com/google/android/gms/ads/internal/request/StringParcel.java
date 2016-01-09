// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzm

public class StringParcel
    implements SafeParcelable
{

    StringParcel(int i, String s)
    {
        zzzH = i;
        zzsu = s;
    }

    public StringParcel(String s)
    {
        zzzH = 1;
        zzsu = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public String zzev()
    {
        return zzsu;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    String zzsu;
    final int zzzH;

}
