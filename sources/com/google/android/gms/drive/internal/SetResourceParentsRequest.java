// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbq

public class SetResourceParentsRequest
    implements SafeParcelable
{

    SetResourceParentsRequest(int i, DriveId driveid, List list)
    {
        zzzH = i;
        zzZs = driveid;
        zzZt = list;
    }

    public SetResourceParentsRequest(DriveId driveid, List list)
    {
        this(1, driveid, list);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzbq.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbq();
    final DriveId zzZs;
    final List zzZt;
    final int zzzH;

}
