// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzb, LatLng

public final class CircleOptions
    implements SafeParcelable
{

    public CircleOptions()
    {
        zzauY = null;
        zzauZ = 0.0D;
        zzava = 10F;
        zzavb = 0xff000000;
        zzavc = 0;
        zzavd = 0.0F;
        zzave = true;
        zzzH = 1;
    }

    CircleOptions(int i, LatLng latlng, double d, float f, int j, int k, 
            float f1, boolean flag)
    {
        zzauY = null;
        zzauZ = 0.0D;
        zzava = 10F;
        zzavb = 0xff000000;
        zzavc = 0;
        zzavd = 0.0F;
        zzave = true;
        zzzH = i;
        zzauY = latlng;
        zzauZ = d;
        zzava = f;
        zzavb = j;
        zzavc = k;
        zzavd = f1;
        zzave = flag;
    }

    public CircleOptions center(LatLng latlng)
    {
        zzauY = latlng;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CircleOptions fillColor(int i)
    {
        zzavc = i;
        return this;
    }

    public LatLng getCenter()
    {
        return zzauY;
    }

    public int getFillColor()
    {
        return zzavc;
    }

    public double getRadius()
    {
        return zzauZ;
    }

    public int getStrokeColor()
    {
        return zzavb;
    }

    public float getStrokeWidth()
    {
        return zzava;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public float getZIndex()
    {
        return zzavd;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public CircleOptions radius(double d)
    {
        zzauZ = d;
        return this;
    }

    public CircleOptions strokeColor(int i)
    {
        zzavb = i;
        return this;
    }

    public CircleOptions strokeWidth(float f)
    {
        zzava = f;
        return this;
    }

    public CircleOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb.zza(this, parcel, i);
    }

    public CircleOptions zIndex(float f)
    {
        zzavd = f;
        return this;
    }

    public static final zzb CREATOR = new zzb();
    private LatLng zzauY;
    private double zzauZ;
    private float zzava;
    private int zzavb;
    private int zzavc;
    private float zzavd;
    private boolean zzave;
    private final int zzzH;

}
