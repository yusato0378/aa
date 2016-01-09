// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzm, BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements SafeParcelable
{

    public MarkerOptionsParcelable()
    {
        zzzH = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        zzzH = i;
        zzavT = bitmapdescriptorparcelable;
    }

    public int describeContents()
    {
        return 0;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public BitmapDescriptorParcelable zztY()
    {
        return zzavT;
    }

    public static final zzm CREATOR = new zzm();
    private BitmapDescriptorParcelable zzavT;
    private final int zzzH;

}
