// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zze

public class ReferenceShiftedDetails
    implements SafeParcelable
{

    ReferenceShiftedDetails(int i, String s, String s1, int j, int k)
    {
        zzzH = i;
        zzabO = s;
        zzabP = s1;
        zzabQ = j;
        zzabR = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    final String zzabO;
    final String zzabP;
    final int zzabQ;
    final int zzabR;
    final int zzzH;

}
