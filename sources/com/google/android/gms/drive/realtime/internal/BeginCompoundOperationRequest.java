// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            zza

public class BeginCompoundOperationRequest
    implements SafeParcelable
{

    BeginCompoundOperationRequest(int i, boolean flag, String s, boolean flag1)
    {
        zzzH = i;
        zzabl = flag;
        mName = s;
        zzabm = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final String mName;
    final boolean zzabl;
    final boolean zzabm;
    final int zzzH;

}
