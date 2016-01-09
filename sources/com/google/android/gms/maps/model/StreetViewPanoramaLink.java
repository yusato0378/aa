// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzj

public class StreetViewPanoramaLink
    implements SafeParcelable
{

    StreetViewPanoramaLink(int i, String s, float f)
    {
        zzzH = i;
        panoId = s;
        float f1 = f;
        if((double)f <= 0.0D)
            f1 = f % 360F + 360F;
        bearing = f1 % 360F;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof StreetViewPanoramaLink))
                return false;
            obj = (StreetViewPanoramaLink)obj;
            if(!panoId.equals(((StreetViewPanoramaLink) (obj)).panoId) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaLink) (obj)).bearing))
                return false;
        }
        return true;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            panoId, Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("panoId", panoId).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public static final zzj CREATOR = new zzj();
    public final float bearing;
    public final String panoId;
    private final int zzzH;

}
