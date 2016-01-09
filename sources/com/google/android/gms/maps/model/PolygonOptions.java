// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzg, LatLng

public final class PolygonOptions
    implements SafeParcelable
{

    public PolygonOptions()
    {
        zzava = 10F;
        zzavb = 0xff000000;
        zzavc = 0;
        zzavd = 0.0F;
        zzave = true;
        zzavF = false;
        zzzH = 1;
        zzavD = new ArrayList();
        zzavE = new ArrayList();
    }

    PolygonOptions(int i, List list, List list1, float f, int j, int k, float f1, 
            boolean flag, boolean flag1)
    {
        zzava = 10F;
        zzavb = 0xff000000;
        zzavc = 0;
        zzavd = 0.0F;
        zzave = true;
        zzavF = false;
        zzzH = i;
        zzavD = list;
        zzavE = list1;
        zzava = f;
        zzavb = j;
        zzavc = k;
        zzavd = f1;
        zzave = flag;
        zzavF = flag1;
    }

    public PolygonOptions add(LatLng latlng)
    {
        zzavD.add(latlng);
        return this;
    }

    public transient PolygonOptions add(LatLng alatlng[])
    {
        zzavD.addAll(Arrays.asList(alatlng));
        return this;
    }

    public PolygonOptions addAll(Iterable iterable)
    {
        LatLng latlng;
        for(iterable = iterable.iterator(); iterable.hasNext(); zzavD.add(latlng))
            latlng = (LatLng)iterable.next();

        return this;
    }

    public PolygonOptions addHole(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for(iterable = iterable.iterator(); iterable.hasNext(); arraylist.add((LatLng)iterable.next()));
        zzavE.add(arraylist);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public PolygonOptions fillColor(int i)
    {
        zzavc = i;
        return this;
    }

    public PolygonOptions geodesic(boolean flag)
    {
        zzavF = flag;
        return this;
    }

    public int getFillColor()
    {
        return zzavc;
    }

    public List getHoles()
    {
        return zzavE;
    }

    public List getPoints()
    {
        return zzavD;
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

    public boolean isGeodesic()
    {
        return zzavF;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public PolygonOptions strokeColor(int i)
    {
        zzavb = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f)
    {
        zzava = f;
        return this;
    }

    public PolygonOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzg.zza(this, parcel, i);
    }

    public PolygonOptions zIndex(float f)
    {
        zzavd = f;
        return this;
    }

    List zztT()
    {
        return zzavE;
    }

    public static final zzg CREATOR = new zzg();
    private final List zzavD;
    private final List zzavE;
    private boolean zzavF;
    private float zzava;
    private int zzavb;
    private int zzavc;
    private float zzavd;
    private boolean zzave;
    private final int zzzH;

}
