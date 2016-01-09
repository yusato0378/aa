// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive:
//            zzi

public class RealtimeDocumentSyncRequest
    implements SafeParcelable
{

    RealtimeDocumentSyncRequest(int i, List list, List list1)
    {
        zzzH = i;
        zzWx = (List)zzv.zzr(list);
        zzWy = (List)zzv.zzr(list1);
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
    final List zzWx;
    final List zzWy;
    final int zzzH;

}
