// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzf

public class TextDeletedDetails
    implements SafeParcelable
{

    TextDeletedDetails(int i, int j, int k)
    {
        zzzH = i;
        mIndex = j;
        zzabS = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    final int mIndex;
    final int zzabS;
    final int zzzH;

}
