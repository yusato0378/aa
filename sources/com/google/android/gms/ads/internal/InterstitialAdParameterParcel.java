// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zze

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    InterstitialAdParameterParcel(int i, boolean flag, boolean flag1)
    {
        versionCode = i;
        zznf = flag;
        zznt = flag1;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1)
    {
        versionCode = 1;
        zznf = flag;
        zznt = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public static final zze CREATOR = new zze();
    public final int versionCode;
    public final boolean zznf;
    public final boolean zznt;

}
