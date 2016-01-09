// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            zzc

public class PlaceAlias
    implements SafeParcelable
{

    PlaceAlias(int i, String s)
    {
        zzzH = i;
        zzatl = s;
    }

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this == obj)
            return true;
        if(!(obj instanceof PlaceAlias))
        {
            return false;
        } else
        {
            obj = (PlaceAlias)obj;
            return zzu.equal(zzatl, ((PlaceAlias) (obj)).zzatl);
        }
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzatl
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("alias", zzatl).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    public String zztj()
    {
        return zzatl;
    }

    public static final zzc CREATOR = new zzc();
    public static final PlaceAlias zzatj = new PlaceAlias(0, "Home");
    public static final PlaceAlias zzatk = new PlaceAlias(0, "Work");
    private final String zzatl;
    final int zzzH;

}
