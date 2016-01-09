// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzc, BitmapDescriptor, LatLng, LatLngBounds

public final class GroundOverlayOptions
    implements SafeParcelable
{

    public GroundOverlayOptions()
    {
        zzave = true;
        zzavl = 0.0F;
        zzavm = 0.5F;
        zzavn = 0.5F;
        zzzH = 1;
    }

    GroundOverlayOptions(int i, IBinder ibinder, LatLng latlng, float f, float f1, LatLngBounds latlngbounds, float f2, 
            float f3, boolean flag, float f4, float f5, float f6)
    {
        zzave = true;
        zzavl = 0.0F;
        zzavm = 0.5F;
        zzavn = 0.5F;
        zzzH = i;
        zzavg = new BitmapDescriptor(com.google.android.gms.dynamic.zzd.zza.zzat(ibinder));
        zzavh = latlng;
        zzavi = f;
        zzavj = f1;
        zzavk = latlngbounds;
        zzauW = f2;
        zzavd = f3;
        zzave = flag;
        zzavl = f4;
        zzavm = f5;
        zzavn = f6;
    }

    private GroundOverlayOptions zza(LatLng latlng, float f, float f1)
    {
        zzavh = latlng;
        zzavi = f;
        zzavj = f1;
        return this;
    }

    public GroundOverlayOptions anchor(float f, float f1)
    {
        zzavm = f;
        zzavn = f1;
        return this;
    }

    public GroundOverlayOptions bearing(float f)
    {
        zzauW = (f % 360F + 360F) % 360F;
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public float getAnchorU()
    {
        return zzavm;
    }

    public float getAnchorV()
    {
        return zzavn;
    }

    public float getBearing()
    {
        return zzauW;
    }

    public LatLngBounds getBounds()
    {
        return zzavk;
    }

    public float getHeight()
    {
        return zzavj;
    }

    public BitmapDescriptor getImage()
    {
        return zzavg;
    }

    public LatLng getLocation()
    {
        return zzavh;
    }

    public float getTransparency()
    {
        return zzavl;
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

    public GroundOverlayOptions image(BitmapDescriptor bitmapdescriptor)
    {
        zzavg = bitmapdescriptor;
        return this;
    }

    public boolean isVisible()
    {
        return zzave;
    }

    public GroundOverlayOptions position(LatLng latlng, float f)
    {
        boolean flag1 = true;
        boolean flag;
        if(zzavk == null)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Position has already been set using positionFromBounds");
        if(latlng != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Location must be specified");
        if(f >= 0.0F)
            flag = flag1;
        else
            flag = false;
        zzv.zzb(flag, "Width must be non-negative");
        return zza(latlng, f, -1F);
    }

    public GroundOverlayOptions position(LatLng latlng, float f, float f1)
    {
        boolean flag1 = true;
        boolean flag;
        if(zzavk == null)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Position has already been set using positionFromBounds");
        if(latlng != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Location must be specified");
        if(f >= 0.0F)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Width must be non-negative");
        if(f1 >= 0.0F)
            flag = flag1;
        else
            flag = false;
        zzv.zzb(flag, "Height must be non-negative");
        return zza(latlng, f, f1);
    }

    public GroundOverlayOptions positionFromBounds(LatLngBounds latlngbounds)
    {
        boolean flag;
        if(zzavh == null)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, (new StringBuilder()).append("Position has already been set using position: ").append(zzavh).toString());
        zzavk = latlngbounds;
        return this;
    }

    public GroundOverlayOptions transparency(float f)
    {
        boolean flag;
        if(f >= 0.0F && f <= 1.0F)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Transparency must be in the range [0..1]");
        zzavl = f;
        return this;
    }

    public GroundOverlayOptions visible(boolean flag)
    {
        zzave = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public GroundOverlayOptions zIndex(float f)
    {
        zzavd = f;
        return this;
    }

    IBinder zztR()
    {
        return zzavg.zztp().asBinder();
    }

    public static final zzc CREATOR = new zzc();
    public static final float NO_DIMENSION = -1F;
    private float zzauW;
    private float zzavd;
    private boolean zzave;
    private BitmapDescriptor zzavg;
    private LatLng zzavh;
    private float zzavi;
    private float zzavj;
    private LatLngBounds zzavk;
    private float zzavl;
    private float zzavm;
    private float zzavn;
    private final int zzzH;

}
