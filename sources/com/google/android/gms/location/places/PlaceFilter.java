// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.places:
//            zzd, Place

public final class PlaceFilter
    implements SafeParcelable
{
    public static final class zza
    {

        public PlaceFilter zzsV()
        {
            List list = null;
            ArrayList arraylist;
            ArrayList arraylist1;
            if(zzarL != null)
                arraylist = new ArrayList(zzarL);
            else
                arraylist = null;
            if(zzarM != null)
                arraylist1 = new ArrayList(zzarM);
            else
                arraylist1 = null;
            if(zzarN != null)
                list = Arrays.asList(zzarN);
            return new PlaceFilter(arraylist, zzarG, list, arraylist1);
        }

        private boolean zzarG;
        private Collection zzarL;
        private Collection zzarM;
        private String zzarN[];

        private zza()
        {
            zzarL = null;
            zzarG = false;
            zzarM = null;
            zzarN = null;
        }

    }


    public PlaceFilter()
    {
        this(false, null);
    }

    PlaceFilter(int i, List list, boolean flag, List list1, List list2)
    {
        zzzH = i;
        if(list == null)
            list = Collections.emptyList();
        else
            list = Collections.unmodifiableList(list);
        zzarB = list;
        zzarG = flag;
        if(list2 == null)
            list = Collections.emptyList();
        else
            list = Collections.unmodifiableList(list2);
        zzarH = list;
        if(list1 == null)
            list = Collections.emptyList();
        else
            list = Collections.unmodifiableList(list1);
        zzarI = list;
        zzarC = zzm(zzarB);
        zzarJ = zzm(zzarH);
        zzarK = zzm(zzarI);
    }

    public PlaceFilter(Collection collection, boolean flag, Collection collection1, Collection collection2)
    {
        this(0, zzb(collection), flag, zzb(collection1), zzb(collection2));
    }

    public PlaceFilter(boolean flag, Collection collection)
    {
        this(null, flag, collection, null);
    }

    private static List zzb(Collection collection)
    {
        if(collection == null || collection.isEmpty())
            return Collections.emptyList();
        else
            return new ArrayList(collection);
    }

    private static Set zzm(List list)
    {
        if(list == null || list.isEmpty())
            return Collections.emptySet();
        else
            return Collections.unmodifiableSet(new HashSet(list));
    }

    public static PlaceFilter zzsU()
    {
        return (new zza()).zzsV();
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof PlaceFilter))
                return false;
            obj = (PlaceFilter)obj;
            if(!zzarC.equals(((PlaceFilter) (obj)).zzarC) || zzarG != ((PlaceFilter) (obj)).zzarG || !zzarJ.equals(((PlaceFilter) (obj)).zzarJ) || !zzarK.equals(((PlaceFilter) (obj)).zzarK))
                return false;
        }
        return true;
    }

    public Set getPlaceIds()
    {
        return zzarK;
    }

    public Set getPlaceTypes()
    {
        return zzarC;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzarC, Boolean.valueOf(zzarG), zzarJ, zzarK
        });
    }

    public boolean isRestrictedToPlacesOpenNow()
    {
        return zzarG;
    }

    public boolean matches(Place place)
    {
        Set set;
        boolean flag;
        if(isRestrictedToPlacesOpenNow() && place.zzsT())
            return false;
        set = getPlaceTypes();
        if(set.isEmpty())
        {
            flag = true;
            break MISSING_BLOCK_LABEL_35;
        }
        iterator = place.getPlaceTypes().iterator();
_L4:
        if(!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if(!set.contains((Integer)iterator.next())) goto _L4; else goto _L3
_L3:
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        Iterator iterator;
        if(!flag)
            return false;
        set = getPlaceIds();
        if(set.isEmpty() || set.contains(place.getId()))
            flag = true;
        else
            flag = false;
        return flag;
_L2:
        flag = false;
        if(true) goto _L6; else goto _L5
_L5:
    }

    public String toString()
    {
        com.google.android.gms.common.internal.zzu.zza zza1 = zzu.zzq(this);
        if(!zzarC.isEmpty())
            zza1.zzg("types", zzarC);
        zza1.zzg("requireOpenNow", Boolean.valueOf(zzarG));
        if(!zzarK.isEmpty())
            zza1.zzg("placeIds", zzarK);
        if(!zzarJ.isEmpty())
            zza1.zzg("requestedUserDataTypes", zzarJ);
        return zza1.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public static final zzd CREATOR = new zzd();
    final List zzarB;
    private final Set zzarC;
    final boolean zzarG;
    final List zzarH;
    final List zzarI;
    private final Set zzarJ;
    private final Set zzarK;
    final int zzzH;

}
