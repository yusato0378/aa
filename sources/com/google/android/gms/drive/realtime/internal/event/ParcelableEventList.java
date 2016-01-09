// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            zzd

public class ParcelableEventList
    implements SafeParcelable
{

    ParcelableEventList(int i, List list, DataHolder dataholder, boolean flag, List list1)
    {
        zzzH = i;
        zznq = list;
        zzabL = dataholder;
        zzabM = flag;
        zzabN = list1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    final DataHolder zzabL;
    final boolean zzabM;
    final List zzabN;
    final List zznq;
    final int zzzH;

}
