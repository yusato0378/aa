// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.location.places:
//            zzc, PlaceFilter

public final class NearbyAlertRequest
    implements SafeParcelable
{

    NearbyAlertRequest(int i, int j, int k, PlaceFilter placefilter)
    {
        zzzH = i;
        zzapI = j;
        zzarD = k;
        zzarE = placefilter;
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof NearbyAlertRequest))
                return false;
            obj = (NearbyAlertRequest)obj;
            if(zzapI != ((NearbyAlertRequest) (obj)).zzapI || zzarD != ((NearbyAlertRequest) (obj)).zzarD || !zzarE.equals(((NearbyAlertRequest) (obj)).zzarE))
                return false;
        }
        return true;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzapI), Integer.valueOf(zzarD)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("transitionTypes", Integer.valueOf(zzapI)).zzg("loiteringTimeMillis", Integer.valueOf(zzarD)).zzg("placeFilter", zzarE).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public int zzsO()
    {
        return zzapI;
    }

    public int zzsR()
    {
        return zzarD;
    }

    public PlaceFilter zzsS()
    {
        return zzarE;
    }

    public static final zzc CREATOR = new zzc();
    private final int zzapI;
    private final int zzarD;
    private final PlaceFilter zzarE;
    private final int zzzH;

}
