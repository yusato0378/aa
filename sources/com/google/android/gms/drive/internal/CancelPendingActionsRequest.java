// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zze

public class CancelPendingActionsRequest
    implements SafeParcelable
{

    CancelPendingActionsRequest(int i, List list)
    {
        zzzH = i;
        zzWT = list;
    }

    public CancelPendingActionsRequest(List list)
    {
        this(1, list);
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
    final List zzWT;
    final int zzzH;

}
