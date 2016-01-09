// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.location:
//            LocationResultCreator

public final class LocationResult
    implements SafeParcelable
{

    LocationResult(int i, List list)
    {
        zzzH = i;
        zzaqk = list;
    }

    public static LocationResult create(List list)
    {
        List list1 = list;
        if(list == null)
            list1 = zzaqj;
        return new LocationResult(2, list1);
    }

    public static LocationResult extractResult(Intent intent)
    {
        if(!hasResult(intent))
            return null;
        else
            return (LocationResult)intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public static boolean hasResult(Intent intent)
    {
        if(intent == null)
            return false;
        else
            return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof LocationResult))
            return false;
        obj = (LocationResult)obj;
        if(((LocationResult) (obj)).zzaqk.size() != zzaqk.size())
            return false;
        obj = ((LocationResult) (obj)).zzaqk.iterator();
        Iterator iterator = zzaqk.iterator();
        while(((Iterator) (obj)).hasNext()) 
        {
            Location location = (Location)iterator.next();
            Location location1 = (Location)((Iterator) (obj)).next();
            if(location.getTime() != location1.getTime())
                return false;
        }
        return true;
    }

    public Location getLastLocation()
    {
        int i = zzaqk.size();
        if(i == 0)
            return null;
        else
            return (Location)zzaqk.get(i - 1);
    }

    public List getLocations()
    {
        return zzaqk;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        Iterator iterator = zzaqk.iterator();
        int i;
        long l;
        for(i = 17; iterator.hasNext(); i = (int)(l ^ l >>> 32) + i * 31)
            l = ((Location)iterator.next()).getTime();

        return i;
    }

    public String toString()
    {
        return (new StringBuilder()).append("LocationResult[locations: ").append(zzaqk).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LocationResultCreator.zza(this, parcel, i);
    }

    public static final LocationResultCreator CREATOR = new LocationResultCreator();
    static final List zzaqj = Collections.emptyList();
    private final List zzaqk;
    private final int zzzH;

}
