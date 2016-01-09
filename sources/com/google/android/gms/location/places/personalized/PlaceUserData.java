// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zze

public class PlaceUserData
    implements SafeParcelable
{

    PlaceUserData(int i, String s, String s1, List list, List list1, List list2)
    {
        zzzH = i;
        zzKw = s;
        zzarP = s1;
        zzatm = list;
        zzatn = list1;
        zzato = list2;
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
            if(!(obj instanceof PlaceUserData))
                return false;
            obj = (PlaceUserData)obj;
            if(!zzKw.equals(((PlaceUserData) (obj)).zzKw) || !zzarP.equals(((PlaceUserData) (obj)).zzarP) || !zzatm.equals(((PlaceUserData) (obj)).zzatm) || !zzatn.equals(((PlaceUserData) (obj)).zzatn) || !zzato.equals(((PlaceUserData) (obj)).zzato))
                return false;
        }
        return true;
    }

    public String getPlaceId()
    {
        return zzarP;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzKw, zzarP, zzatm, zzatn, zzato
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("accountName", zzKw).zzg("placeId", zzarP).zzg("testDataImpls", zzatm).zzg("placeAliases", zzatn).zzg("hereContents", zzato).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze zze1 = CREATOR;
        zze.zza(this, parcel, i);
    }

    public String zztk()
    {
        return zzKw;
    }

    public List zztl()
    {
        return zzatn;
    }

    public List zztm()
    {
        return zzato;
    }

    public List zztn()
    {
        return zzatm;
    }

    public static final zze CREATOR = new zze();
    private final String zzKw;
    private final String zzarP;
    private final List zzatm;
    private final List zzatn;
    private final List zzato;
    final int zzzH;

}
