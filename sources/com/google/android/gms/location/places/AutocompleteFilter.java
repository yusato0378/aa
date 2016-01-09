// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.places:
//            zzb

public class AutocompleteFilter
    implements SafeParcelable
{

    AutocompleteFilter(int i, boolean flag, Collection collection)
    {
        zzzH = i;
        zzarA = flag;
        if(collection == null)
            collection = Collections.emptyList();
        else
            collection = new ArrayList(collection);
        zzarB = collection;
        if(zzarB.isEmpty())
        {
            zzarC = Collections.emptySet();
            return;
        } else
        {
            zzarC = Collections.unmodifiableSet(new HashSet(zzarB));
            return;
        }
    }

    public static AutocompleteFilter create(Collection collection)
    {
        return zza(true, collection);
    }

    public static AutocompleteFilter zza(boolean flag, Collection collection)
    {
        return new AutocompleteFilter(0, flag, collection);
    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof AutocompleteFilter))
                return false;
            obj = (AutocompleteFilter)obj;
            if(!zzarC.equals(((AutocompleteFilter) (obj)).zzarC) || zzarA != ((AutocompleteFilter) (obj)).zzarA)
                return false;
        }
        return true;
    }

    public Set getPlaceTypes()
    {
        return zzarC;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Boolean.valueOf(zzarA), zzarC
        });
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(this);
        if(!zzarA)
            zza1.zzg("restrictedToPlaces", Boolean.valueOf(zzarA));
        zza1.zzg("placeTypes", zzarC);
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

    public boolean zzsQ()
    {
        return zzarA;
    }

    public static final zzb CREATOR = new zzb();
    final boolean zzarA;
    final List zzarB;
    private final Set zzarC;
    final int zzzH;

}
