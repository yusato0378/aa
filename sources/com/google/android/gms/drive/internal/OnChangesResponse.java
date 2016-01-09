// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzat

public class OnChangesResponse
    implements SafeParcelable
{

    OnChangesResponse(int i, DataHolder dataholder, List list, ChangeSequenceNumber changesequencenumber, boolean flag)
    {
        zzzH = i;
        zzYW = dataholder;
        zzYX = list;
        zzYY = changesequencenumber;
        zzYZ = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzat.zza(this, parcel, i | 1);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzat();
    final DataHolder zzYW;
    final List zzYX;
    final ChangeSequenceNumber zzYY;
    final boolean zzYZ;
    final int zzzH;

}
