// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location:
//            LocationSettingsResultCreator, LocationSettingsStates

public final class LocationSettingsResult
    implements Result, SafeParcelable
{

    LocationSettingsResult(int i, Status status, LocationSettingsStates locationsettingsstates)
    {
        zzzH = i;
        zzKr = status;
        zzaqp = locationsettingsstates;
    }

    public LocationSettingsResult(Status status)
    {
        this(1, status, null);
    }

    public int describeContents()
    {
        return 0;
    }

    public LocationSettingsStates getLocationSettingsStates()
    {
        return zzaqp;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationSettingsResultCreator.zza(this, parcel, i);
    }

    public static final LocationSettingsResultCreator CREATOR = new LocationSettingsResultCreator();
    private final Status zzKr;
    private final LocationSettingsStates zzaqp;
    private final int zzzH;

}
