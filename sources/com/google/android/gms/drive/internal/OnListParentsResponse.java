// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbc

public class OnListParentsResponse extends WriteAwareParcelable
    implements SafeParcelable
{

    OnListParentsResponse(int i, DataHolder dataholder)
    {
        zzzH = i;
        zzZm = dataholder;
    }

    public int describeContents()
    {
        return 0;
    }

    protected void zzI(Parcel parcel, int i)
    {
        zzbc.zza(this, parcel, i);
    }

    public DataHolder zzoe()
    {
        return zzZm;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbc();
    final DataHolder zzZm;
    final int zzzH;

}
