// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.location:
//            LocationAvailabilityCreator

public final class LocationAvailability
    implements SafeParcelable
{

    LocationAvailability(int i, int j, int k, int l, long l1)
    {
        zzzH = i;
        zzaqd = j;
        zzaqa = k;
        zzaqb = l;
        zzaqc = l1;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent)
    {
        if(!hasLocationAvailability(intent))
            return null;
        else
            return (LocationAvailability)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public static boolean hasLocationAvailability(Intent intent)
    {
        if(intent == null)
            return false;
        else
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof LocationAvailability)
            if(zzaqd == ((LocationAvailability) (obj = (LocationAvailability)obj)).zzaqd && zzaqa == ((LocationAvailability) (obj)).zzaqa && zzaqb == ((LocationAvailability) (obj)).zzaqb && zzaqc == ((LocationAvailability) (obj)).zzaqc)
                return true;
        return false;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzaqd), Integer.valueOf(zzaqa), Integer.valueOf(zzaqb), Long.valueOf(zzaqc)
        });
    }

    public boolean isLocationAvailable()
    {
        return zzaqd < 1000;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationAvailability[isLocationAvailable: ").append(isLocationAvailable()).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationAvailabilityCreator.zza(this, parcel, i);
    }

    public static final LocationAvailabilityCreator CREATOR = new LocationAvailabilityCreator();
    int zzaqa;
    int zzaqb;
    long zzaqc;
    int zzaqd;
    private final int zzzH;

}
