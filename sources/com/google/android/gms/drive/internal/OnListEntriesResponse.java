// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzbb

public class OnListEntriesResponse extends WriteAwareParcelable
    implements SafeParcelable
{

    OnListEntriesResponse(int i, DataHolder dataholder, boolean flag)
    {
        zzzH = i;
        zzZl = dataholder;
        zzXH = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    protected void zzI(Parcel parcel, int i)
    {
        zzbb.zza(this, parcel, i);
    }

    public DataHolder zzoc()
    {
        return zzZl;
    }

    public boolean zzod()
    {
        return zzXH;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzbb();
    final boolean zzXH;
    final DataHolder zzZl;
    final int zzzH;

}
