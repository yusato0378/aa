// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, zzk

public class QueryResultEventParcelable extends WriteAwareParcelable
    implements DriveEvent
{

    QueryResultEventParcelable(int i, DataHolder dataholder, boolean flag, int j)
    {
        zzzH = i;
        zzPy = dataholder;
        zzXf = flag;
        zzXg = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getType()
    {
        return 3;
    }

    public void zzI(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public DataHolder zznK()
    {
        return zzPy;
    }

    public boolean zznL()
    {
        return zzXf;
    }

    public int zznM()
    {
        return zzXg;
    }

    public static final zzk CREATOR = new zzk();
    final DataHolder zzPy;
    final boolean zzXf;
    final int zzXg;
    final int zzzH;

}
