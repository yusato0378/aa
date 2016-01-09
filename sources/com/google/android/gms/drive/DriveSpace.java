// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive:
//            zzg

public class DriveSpace
    implements SafeParcelable
{

    DriveSpace(int i, String s)
    {
        zzzH = i;
        mName = (String)zzv.zzr(s);
    }

    private DriveSpace(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj == null || obj.getClass() != com/google/android/gms/drive/DriveSpace)
            return false;
        else
            return mName.equals(((DriveSpace)obj).mName);
    }

    public String getName()
    {
        return mName;
    }

    public int hashCode()
    {
        return 0x4a54c0de ^ mName.hashCode();
    }

    public String toString()
    {
        return mName;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzg();
    public static final DriveSpace zzWa;
    public static final DriveSpace zzWb;
    public static final DriveSpace zzWc;
    public static final Set zzWd;
    public static final String zzWe;
    private final String mName;
    final int zzzH;

    static 
    {
        zzWa = new DriveSpace("DRIVE");
        zzWb = new DriveSpace("APP_DATA_FOLDER");
        zzWc = new DriveSpace("PHOTOS");
        zzWd = Collections.unmodifiableSet(new HashSet(Arrays.asList(new DriveSpace[] {
            zzWa, zzWb, zzWc
        })));
        zzWe = TextUtils.join(",", zzWd.toArray());
    }
}
