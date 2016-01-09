// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzi, StreetViewPanoramaOrientation

public class StreetViewPanoramaCamera
    implements SafeParcelable
{
    public static final class Builder
    {

        public Builder bearing(float f)
        {
            bearing = f;
            return this;
        }

        public StreetViewPanoramaCamera build()
        {
            return new StreetViewPanoramaCamera(zoom, tilt, bearing);
        }

        public Builder orientation(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            tilt = streetviewpanoramaorientation.tilt;
            bearing = streetviewpanoramaorientation.bearing;
            return this;
        }

        public Builder tilt(float f)
        {
            tilt = f;
            return this;
        }

        public Builder zoom(float f)
        {
            zoom = f;
            return this;
        }

        public float bearing;
        public float tilt;
        public float zoom;

        public Builder()
        {
        }

        public Builder(StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            zoom = streetviewpanoramacamera.zoom;
            bearing = streetviewpanoramacamera.bearing;
            tilt = streetviewpanoramacamera.tilt;
        }
    }


    public StreetViewPanoramaCamera(float f, float f1, float f2)
    {
        this(1, f, f1, f2);
    }

    StreetViewPanoramaCamera(int i, float f, float f1, float f2)
    {
        float f3;
        boolean flag;
        if(-90F <= f1 && f1 <= 90F)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Tilt needs to be between -90 and 90 inclusive");
        zzzH = i;
        f3 = f;
        if((double)f <= 0.0D)
            f3 = 0.0F;
        zoom = f3;
        tilt = f1 + 0.0F;
        if((double)f2 <= 0.0D)
            f = f2 % 360F + 360F;
        else
            f = f2;
        bearing = f % 360F;
        zzavH = (new StreetViewPanoramaOrientation.Builder()).tilt(f1).bearing(f2).build();
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static Builder builder(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        return new Builder(streetviewpanoramacamera);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof StreetViewPanoramaCamera))
                return false;
            obj = (StreetViewPanoramaCamera)obj;
            if(Float.floatToIntBits(zoom) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).zoom) || Float.floatToIntBits(tilt) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).tilt) || Float.floatToIntBits(bearing) != Float.floatToIntBits(((StreetViewPanoramaCamera) (obj)).bearing))
                return false;
        }
        return true;
    }

    public StreetViewPanoramaOrientation getOrientation()
    {
        return zzavH;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Float.valueOf(zoom), Float.valueOf(tilt), Float.valueOf(bearing)
        });
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("zoom", Float.valueOf(zoom)).zzg("tilt", Float.valueOf(tilt)).zzg("bearing", Float.valueOf(bearing)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public static final zzi CREATOR = new zzi();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    private StreetViewPanoramaOrientation zzavH;
    private final int zzzH;

}
