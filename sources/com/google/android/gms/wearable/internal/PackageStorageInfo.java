// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzba

public class PackageStorageInfo
    implements SafeParcelable
{

    PackageStorageInfo(int i, String s, String s1, long l)
    {
        versionCode = i;
        packageName = s;
        label = s1;
        zzaMA = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzba.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzba();
    public final String label;
    public final String packageName;
    public final int versionCode;
    public final long zzaMA;

}
