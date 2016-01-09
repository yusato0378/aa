// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;

// Referenced classes of package com.google.android.gms.maps:
//            zzb

public final class StreetViewPanoramaOptions
    implements SafeParcelable
{

    public StreetViewPanoramaOptions()
    {
        zzauC = Boolean.valueOf(true);
        zzatS = Boolean.valueOf(true);
        zzauD = Boolean.valueOf(true);
        zzauE = Boolean.valueOf(true);
        zzzH = 1;
    }

    StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetviewpanoramacamera, String s, LatLng latlng, Integer integer, byte byte0, byte byte1, 
            byte byte2, byte byte3, byte byte4)
    {
        zzauC = Boolean.valueOf(true);
        zzatS = Boolean.valueOf(true);
        zzauD = Boolean.valueOf(true);
        zzauE = Boolean.valueOf(true);
        zzzH = i;
        zzauy = streetviewpanoramacamera;
        zzauA = latlng;
        zzauB = integer;
        zzauz = s;
        zzauC = zza.zza(byte0);
        zzatS = zza.zza(byte1);
        zzauD = zza.zza(byte2);
        zzauE = zza.zza(byte3);
        zzatM = zza.zza(byte4);
    }

    public int describeContents()
    {
        return 0;
    }

    public Boolean getPanningGesturesEnabled()
    {
        return zzauD;
    }

    public String getPanoramaId()
    {
        return zzauz;
    }

    public LatLng getPosition()
    {
        return zzauA;
    }

    public Integer getRadius()
    {
        return zzauB;
    }

    public Boolean getStreetNamesEnabled()
    {
        return zzauE;
    }

    public StreetViewPanoramaCamera getStreetViewPanoramaCamera()
    {
        return zzauy;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzatM;
    }

    public Boolean getUserNavigationEnabled()
    {
        return zzauC;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzatS;
    }

    public StreetViewPanoramaOptions panningGesturesEnabled(boolean flag)
    {
        zzauD = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions panoramaCamera(StreetViewPanoramaCamera streetviewpanoramacamera)
    {
        zzauy = streetviewpanoramacamera;
        return this;
    }

    public StreetViewPanoramaOptions panoramaId(String s)
    {
        zzauz = s;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng)
    {
        zzauA = latlng;
        return this;
    }

    public StreetViewPanoramaOptions position(LatLng latlng, Integer integer)
    {
        zzauA = latlng;
        zzauB = integer;
        return this;
    }

    public StreetViewPanoramaOptions streetNamesEnabled(boolean flag)
    {
        zzauE = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions useViewLifecycleInFragment(boolean flag)
    {
        zzatM = Boolean.valueOf(flag);
        return this;
    }

    public StreetViewPanoramaOptions userNavigationEnabled(boolean flag)
    {
        zzauC = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zzb.zza(this, parcel, i);
    }

    public StreetViewPanoramaOptions zoomGesturesEnabled(boolean flag)
    {
        zzatS = Boolean.valueOf(flag);
        return this;
    }

    byte zztH()
    {
        return zza.zzd(zzauC);
    }

    byte zztI()
    {
        return zza.zzd(zzauD);
    }

    byte zztJ()
    {
        return zza.zzd(zzauE);
    }

    byte zztt()
    {
        return zza.zzd(zzatM);
    }

    byte zztx()
    {
        return zza.zzd(zzatS);
    }

    public static final zzb CREATOR = new zzb();
    private Boolean zzatM;
    private Boolean zzatS;
    private LatLng zzauA;
    private Integer zzauB;
    private Boolean zzauC;
    private Boolean zzauD;
    private Boolean zzauE;
    private StreetViewPanoramaCamera zzauy;
    private String zzauz;
    private final int zzzH;

}
