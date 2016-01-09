// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzk

public class ValuesSetDetails
    implements SafeParcelable
{

    ValuesSetDetails(int i, int j, int k, int l)
    {
        zzzH = i;
        mIndex = j;
        zzabv = k;
        zzabw = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int mIndex;
    final int zzabv;
    final int zzabw;
    final int zzzH;

}
