// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzd

public class MessageType
    implements SafeParcelable
{

    MessageType(int i, String s, String s1)
    {
        versionCode = i;
        zzUq = s;
        type = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("namespace=").append(zzUq).append(", type=").append(type).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    public final String type;
    final int versionCode;
    public final String zzUq;

}
