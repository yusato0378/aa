// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            zzc

public final class VersionInfoParcel
    implements SafeParcelable
{

    public VersionInfoParcel(int i, int j, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("afma-sdk-a-v").append(i).append(".").append(j).append(".");
        String s;
        if(flag)
            s = "0";
        else
            s = "1";
        this(1, stringbuilder.append(s).toString(), i, j, flag);
    }

    VersionInfoParcel(int i, String s, int j, int k, boolean flag)
    {
        versionCode = i;
        zzCI = s;
        zzCJ = j;
        zzCK = k;
        zzCL = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public static final zzc CREATOR = new zzc();
    public final int versionCode;
    public String zzCI;
    public int zzCJ;
    public int zzCK;
    public boolean zzCL;

}
