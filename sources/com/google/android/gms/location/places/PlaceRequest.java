// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.location.places:
//            zze, PlaceFilter

public final class PlaceRequest
    implements SafeParcelable
{

    public PlaceRequest(int i, PlaceFilter placefilter, long l, int j, long l1)
    {
        zzzH = i;
        zzarS = placefilter;
        zzaqe = l;
        mPriority = j;
        zzapJ = l1;
    }

    public int describeContents()
    {
        zze zze1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof PlaceRequest))
                return false;
            obj = (PlaceRequest)obj;
            if(!zzu.equal(zzarS, ((PlaceRequest) (obj)).zzarS) || zzaqe != ((PlaceRequest) (obj)).zzaqe || mPriority != ((PlaceRequest) (obj)).mPriority || zzapJ != ((PlaceRequest) (obj)).zzapJ)
                return false;
        }
        return true;
    }

    public long getExpirationTime()
    {
        return zzapJ;
    }

    public long getInterval()
    {
        return zzaqe;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzarS, Long.valueOf(zzaqe), Integer.valueOf(mPriority), Long.valueOf(zzapJ)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("filter", zzarS).zzg("interval", Long.valueOf(zzaqe)).zzg("priority", Integer.valueOf(mPriority)).zzg("expireAt", Long.valueOf(zzapJ)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public PlaceFilter zzsS()
    {
        return zzarS;
    }

    public static final zze CREATOR = new zze();
    static final long zzarR;
    private final int mPriority;
    private final long zzapJ;
    private final long zzaqe;
    private final PlaceFilter zzarS;
    final int zzzH;

    static 
    {
        zzarR = TimeUnit.HOURS.toMillis(1L);
    }
}
