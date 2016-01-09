// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzi

public class ValuesAddedDetails
    implements SafeParcelable
{

    ValuesAddedDetails(int i, int j, int k, int l, String s, int i1)
    {
        zzzH = i;
        mIndex = j;
        zzabv = k;
        zzabw = l;
        zzabT = s;
        zzabU = i1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int mIndex;
    final String zzabT;
    final int zzabU;
    final int zzabv;
    final int zzabw;
    final int zzzH;

}
