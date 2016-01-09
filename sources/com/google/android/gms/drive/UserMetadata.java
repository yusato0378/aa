// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive:
//            zzk

public class UserMetadata
    implements SafeParcelable
{

    UserMetadata(int i, String s, String s1, String s2, boolean flag, String s3)
    {
        zzzH = i;
        zzWE = s;
        zzWF = s1;
        zzWG = s2;
        zzWH = flag;
        zzWI = s3;
    }

    public UserMetadata(String s, String s1, String s2, boolean flag, String s3)
    {
        this(1, s, s1, s2, flag, s3);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", new Object[] {
            zzWE, zzWF, zzWG, Boolean.valueOf(zzWH), zzWI
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final String zzWE;
    final String zzWF;
    final String zzWG;
    final boolean zzWH;
    final String zzWI;
    final int zzzH;

}
