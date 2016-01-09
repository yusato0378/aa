// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            zzb

public final class CameraUpdateParcelable
    implements SafeParcelable
{

    CameraUpdateParcelable(int i, int j, Bundle bundle)
    {
        zzzH = i;
        type = j;
        zzavQ = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getType()
    {
        return type;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public Bundle zztV()
    {
        return zzavQ;
    }

    public static final zzb CREATOR = new zzb();
    private int type;
    private Bundle zzavQ;
    private final int zzzH;

}
