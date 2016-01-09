// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzk, PlaceImpl

public class PlaceLikelihoodEntity
    implements SafeParcelable, PlaceLikelihood
{

    PlaceLikelihoodEntity(int i, PlaceImpl placeimpl, float f)
    {
        zzzH = i;
        zzasP = placeimpl;
        zzasQ = f;
    }

    public static PlaceLikelihoodEntity zza(PlaceImpl placeimpl, float f)
    {
        return new PlaceLikelihoodEntity(0, (PlaceImpl)zzv.zzr(placeimpl), f);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof PlaceLikelihoodEntity))
                return false;
            obj = (PlaceLikelihoodEntity)obj;
            if(!zzasP.equals(((PlaceLikelihoodEntity) (obj)).zzasP) || zzasQ != ((PlaceLikelihoodEntity) (obj)).zzasQ)
                return false;
        }
        return true;
    }

    public Object freeze()
    {
        return zzti();
    }

    public float getLikelihood()
    {
        return zzasQ;
    }

    public Place getPlace()
    {
        return zzasP;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzasP, Float.valueOf(zzasQ)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("place", zzasP).zzg("likelihood", Float.valueOf(zzasQ)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public PlaceLikelihood zzti()
    {
        return this;
    }

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final PlaceImpl zzasP;
    final float zzasQ;
    final int zzzH;

}
