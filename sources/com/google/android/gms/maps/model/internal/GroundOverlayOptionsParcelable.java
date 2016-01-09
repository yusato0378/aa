// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzc, BitmapDescriptorParcelable

public final class GroundOverlayOptionsParcelable
    implements SafeParcelable
{

    public GroundOverlayOptionsParcelable()
    {
        zzzH = 1;
    }

    GroundOverlayOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        zzzH = i;
        zzavS = bitmapdescriptorparcelable;
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
        zzc.zza(this, parcel, i);
    }

    public BitmapDescriptorParcelable zztW()
    {
        return zzavS;
    }

    public static final zzc CREATOR = new zzc();
    private BitmapDescriptorParcelable zzavS;
    private final int zzzH;

}
