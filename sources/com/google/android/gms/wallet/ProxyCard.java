// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzq

public final class ProxyCard
    implements SafeParcelable
{

    ProxyCard(int i, String s, String s1, int j, int k)
    {
        zzzH = i;
        zzaJn = s;
        zzaJo = s1;
        zzaJp = j;
        zzaJq = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCvn()
    {
        return zzaJo;
    }

    public int getExpirationMonth()
    {
        return zzaJp;
    }

    public int getExpirationYear()
    {
        return zzaJq;
    }

    public String getPan()
    {
        return zzaJn;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    String zzaJn;
    String zzaJo;
    int zzaJp;
    int zzaJq;
    private final int zzzH;

}
