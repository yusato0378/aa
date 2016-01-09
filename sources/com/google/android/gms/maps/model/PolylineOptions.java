// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzh, LatLng

public final class PolylineOptions
    implements SafeParcelable
{

    public PolylineOptions()
    {
        zzavi = 10F;
        mColor = 0xff000000;
        zzavd = 0.0F;
        zzave = true;
        zzavF = false;
        zzzH = 1;
        zzavD = new ArrayList();
    }

    PolylineOptions(int i, List list, float f, int j, float f1, boolean flag, boolean flag1)
    {
        zzavi = 10F;
        mColor = 0xff000000;
        zzavd = 0.0F;
        zzave = true;
        zzavF = false;
        zzzH = i;
        zzavD = list;
        zzavi = f;
        mColor = j;
        zzavd = f1;
        zzave = flag;
        zzavF = flag1;
    }

    public PolylineOptions add(LatLng latlng)
    {
        zzavD.add(latlng);
        return this;
    }

    public transient PolylineOptions add(LatLng alatlng[])
    {
        zzavD.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolylineOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for(iterable = iterable.iterator(); iterable.hasNext(); zzavD.add(latlng))
            latlng = (LatLng)iterable.next();

        return this;
    }

    public PolylineOptions color(int i)
    {
        mColor = i;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolylineOptions geodesic(boolean flag)
    {
        zzavF = flag;
        return this;
    }

    public int getColor()
    {
        return mColor;
    }

    public List getPoints()
    {
        return zzavD;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public float getWidth()
    {
        return zzavi;
    }

    public float getZIndex()
    {
        return zzavd;
    }

    public boolean isGeodesic()
    {
        return zzavF;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public PolylineOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public PolylineOptions width(float f)
    {
        zzavi = f;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public PolylineOptions zIndex(float f)
    {
        zzavd = f;
        return this;
    }

    public static final zzh CREATOR = new zzh();
    private int mColor;
    private final List zzavD;
    private boolean zzavF;
    private float zzavd;
    private boolean zzave;
    private float zzavi;
    private final int zzzH;

}
