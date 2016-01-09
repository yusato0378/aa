// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzk, zzf

public class MatchAllFilter extends AbstractFilter
{

    public MatchAllFilter()
    {
        this(1);
    }

    MatchAllFilter(int i)
    {
        zzzH = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzos();
    }

    public static final zzk CREATOR = new zzk();
    final int zzzH;

}
