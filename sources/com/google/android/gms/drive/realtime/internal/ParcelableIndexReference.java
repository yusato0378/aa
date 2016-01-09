// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zzq

public class ParcelableIndexReference
    implements SafeParcelable
{

    ParcelableIndexReference(int i, String s, int j, boolean flag, int k)
    {
        zzzH = i;
        zzabr = s;
        mIndex = j;
        zzabs = flag;
        zzabt = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    final int mIndex;
    final String zzabr;
    final boolean zzabs;
    final int zzabt;
    final int zzzH;

}
