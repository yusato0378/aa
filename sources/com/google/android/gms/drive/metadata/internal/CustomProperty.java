// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.metadata.CustomPropertyKey;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzc

public class CustomProperty
    implements SafeParcelable
{

    CustomProperty(int i, CustomPropertyKey custompropertykey, String s)
    {
        zzzH = i;
        zzv.zzb(custompropertykey, "key");
        zzZD = custompropertykey;
        mValue = s;
    }

    public CustomProperty(CustomPropertyKey custompropertykey, String s)
    {
        this(1, custompropertykey, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getValue()
    {
        return mValue;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public CustomPropertyKey zzoi()
    {
        return zzZD;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final String mValue;
    final CustomPropertyKey zzZD;
    final int zzzH;

}
