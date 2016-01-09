// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.drive.query.Filter;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzl, FilterHolder, zzf

public class NotFilter extends AbstractFilter
{

    NotFilter(int i, FilterHolder filterholder)
    {
        zzzH = i;
        zzabb = filterholder;
    }

    public NotFilter(Filter filter)
    {
        this(1, new FilterHolder(filter));
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzs(zzabb.getFilter().zza(zzf1));
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final FilterHolder zzabb;
    final int zzzH;

}
