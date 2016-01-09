// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzm

public final class PlaceLocalization
    implements SafeParcelable
{

    public PlaceLocalization(int i, String s, String s1, String s2, String s3, List list)
    {
        versionCode = i;
        name = s;
        zzasR = s1;
        zzasS = s2;
        zzasT = s3;
        zzasU = list;
    }

    public static PlaceLocalization zza(String s, String s1, String s2, String s3, List list)
    {
        return new PlaceLocalization(0, s, s1, s2, s3, list);
    }

    public int describeContents()
    {
        zzm zzm1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof PlaceLocalization))
                return false;
            obj = (PlaceLocalization)obj;
            if(!zzu.equal(name, ((PlaceLocalization) (obj)).name) || !zzu.equal(zzasR, ((PlaceLocalization) (obj)).zzasR) || !zzu.equal(zzasS, ((PlaceLocalization) (obj)).zzasS) || !zzu.equal(zzasT, ((PlaceLocalization) (obj)).zzasT) || !zzu.equal(zzasU, ((PlaceLocalization) (obj)).zzasU))
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            name, zzasR, zzasS, zzasT
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", name).zzg("address", zzasR).zzg("internationalPhoneNumber", zzasS).zzg("regularOpenHours", zzasT).zzg("attributions", zzasU).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm zzm1 = CREATOR;
        zzm.zza(this, parcel, i);
    }

    public static final zzm CREATOR = new zzm();
    public final String name;
    public final int versionCode;
    public final String zzasR;
    public final String zzasS;
    public final String zzasT;
    public final List zzasU;

}
