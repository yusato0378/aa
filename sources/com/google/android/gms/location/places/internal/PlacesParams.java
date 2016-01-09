// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzp

public class PlacesParams
    implements SafeParcelable
{

    public PlacesParams(int i, String s, String s1, String s2, String s3, String s4, int j)
    {
        versionCode = i;
        zzatc = s;
        zzatd = s1;
        zzate = s2;
        zzasc = s3;
        zzatf = s4;
        zzatg = j;
    }

    public PlacesParams(String s, Locale locale, String s1)
    {
        this(1, s, locale.toString(), s1, null, null, 0x6fcd18);
    }

    public PlacesParams(String s, Locale locale, String s1, String s2, String s3)
    {
        this(1, s, locale.toString(), s1, s2, s3, 0x6fcd18);
    }

    public int describeContents()
    {
        zzp zzp1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(obj == null || !(obj instanceof PlacesParams))
                return false;
            obj = (PlacesParams)obj;
            if(!zzatd.equals(((PlacesParams) (obj)).zzatd) || !zzatc.equals(((PlacesParams) (obj)).zzatc) || !zzu.equal(zzate, ((PlacesParams) (obj)).zzate) || !zzu.equal(zzasc, ((PlacesParams) (obj)).zzasc) || !zzu.equal(zzatf, ((PlacesParams) (obj)).zzatf))
                return false;
        }
        return true;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            zzatc, zzatd, zzate, zzasc, zzatf
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("clientPackageName", zzatc).zzg("locale", zzatd).zzg("accountName", zzate).zzg("gCoreClientName", zzasc).zzg("chargedPackageName", zzatf).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzp zzp1 = CREATOR;
        zzp.zza(this, parcel, i);
    }

    public static final zzp CREATOR = new zzp();
    public static final PlacesParams zzatb = new PlacesParams("com.google.android.gms", Locale.getDefault(), null);
    public final int versionCode;
    public final String zzasc;
    public final String zzatc;
    public final String zzatd;
    public final String zzate;
    public final String zzatf;
    public final int zzatg;

}
