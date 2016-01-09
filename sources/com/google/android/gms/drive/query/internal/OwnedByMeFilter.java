// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzn, zzf

public class OwnedByMeFilter extends AbstractFilter
{

    public OwnedByMeFilter()
    {
        this(1);
    }

    OwnedByMeFilter(int i)
    {
        zzzH = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzn.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzor();
    }

    public static final zzn CREATOR = new zzn();
    final int zzzH;

}
