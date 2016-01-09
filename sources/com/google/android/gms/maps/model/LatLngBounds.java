// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzd, LatLng

public final class LatLngBounds
    implements SafeParcelable
{
    public static final class Builder
    {

        private boolean zze(double d)
        {
            boolean flag = false;
            if(zzavs <= zzavt)
                return zzavs <= d && d <= zzavt;
            if(zzavs <= d || d <= zzavt)
                flag = true;
            return flag;
        }

        public LatLngBounds build()
        {
            boolean flag;
            if(!Double.isNaN(zzavs))
                flag = true;
            else
                flag = false;
            zzv.zza(flag, "no included points");
            return new LatLngBounds(new LatLng(zzavq, zzavs), new LatLng(zzavr, zzavt));
        }

        public Builder include(LatLng latlng)
        {
            zzavq = Math.min(zzavq, latlng.latitude);
            zzavr = Math.max(zzavr, latlng.latitude);
            double d = latlng.longitude;
            if(Double.isNaN(zzavs))
            {
                zzavs = d;
                zzavt = d;
            } else
            if(!zze(d))
                if(LatLngBounds.zzd(zzavs, d) < LatLngBounds.zze(zzavt, d))
                {
                    zzavs = d;
                    return this;
                } else
                {
                    zzavt = d;
                    return this;
                }
            return this;
        }

        private double zzavq;
        private double zzavr;
        private double zzavs;
        private double zzavt;

        public Builder()
        {
            zzavq = (1.0D / 0.0D);
            zzavr = (-1.0D / 0.0D);
            zzavs = (0.0D / 0.0D);
            zzavt = (0.0D / 0.0D);
        }
    }


    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        zzv.zzb(latlng, "null southwest");
        zzv.zzb(latlng1, "null northeast");
        boolean flag;
        if(latlng1.latitude >= latlng.latitude)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "southern latitude exceeds northern latitude (%s > %s)", new Object[] {
            Double.valueOf(latlng.latitude), Double.valueOf(latlng1.latitude)
        });
        zzzH = i;
        southwest = latlng;
        northeast = latlng1;
    }

    public LatLngBounds(LatLng latlng, LatLng latlng1)
    {
        this(1, latlng, latlng1);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    private static double zzb(double d, double d1)
    {
        return ((d - d1) + 360D) % 360D;
    }

    private static double zzc(double d, double d1)
    {
        return ((d1 - d) + 360D) % 360D;
    }

    static double zzd(double d, double d1)
    {
        return zzb(d, d1);
    }

    private boolean zzd(double d)
    {
        return southwest.latitude <= d && d <= northeast.latitude;
    }

    static double zze(double d, double d1)
    {
        return zzc(d, d1);
    }

    private boolean zze(double d)
    {
        boolean flag = false;
        if(southwest.longitude <= northeast.longitude)
            return southwest.longitude <= d && d <= northeast.longitude;
        if(southwest.longitude <= d || d <= northeast.longitude)
            flag = true;
        return flag;
    }

    public boolean contains(LatLng latlng)
    {
        return zzd(latlng.latitude) && zze(latlng.longitude);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if(this != obj)
        {
            if(!(obj instanceof LatLngBounds))
                return false;
            obj = (LatLngBounds)obj;
            if(!southwest.equals(((LatLngBounds) (obj)).southwest) || !northeast.equals(((LatLngBounds) (obj)).northeast))
                return false;
        }
        return true;
    }

    public LatLng getCenter()
    {
        double d1 = (southwest.latitude + northeast.latitude) / 2D;
        double d = northeast.longitude;
        double d2 = southwest.longitude;
        if(d2 <= d)
            d = (d + d2) / 2D;
        else
            d = (d + 360D + d2) / 2D;
        return new LatLng(d1, d);
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            southwest, northeast
        });
    }

    public LatLngBounds including(LatLng latlng)
    {
        double d3 = Math.min(southwest.latitude, latlng.latitude);
        double d4 = Math.max(northeast.latitude, latlng.latitude);
        double d1 = northeast.longitude;
        double d2 = southwest.longitude;
        double d = latlng.longitude;
        if(!zze(d))
        {
            if(zzb(d2, d) >= zzc(d1, d))
            {
                d1 = d;
                d = d2;
            }
        } else
        {
            d = d2;
        }
        return new LatLngBounds(new LatLng(d3, d), new LatLng(d4, d1));
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("southwest", southwest).zzg("northeast", northeast).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.model.zzd.zza(this, parcel, i);
    }

    public static final zzd CREATOR = new zzd();
    public final LatLng northeast;
    public final LatLng southwest;
    private final int zzzH;

}
