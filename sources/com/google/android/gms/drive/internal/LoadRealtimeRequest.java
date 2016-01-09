// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzap

public class LoadRealtimeRequest
    implements SafeParcelable
{

    LoadRealtimeRequest(int i, DriveId driveid, boolean flag, List list, boolean flag1, DataHolder dataholder)
    {
        zzzH = i;
        zzVL = driveid;
        zzYM = flag;
        zzYN = list;
        zzYO = flag1;
        zzYP = dataholder;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzap.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzap();
    final DriveId zzVL;
    final boolean zzYM;
    final List zzYN;
    final boolean zzYO;
    final DataHolder zzYP;
    final int zzzH;

}
