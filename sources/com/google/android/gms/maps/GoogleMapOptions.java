// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.internal.zza;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            zza

public final class GoogleMapOptions
    implements SafeParcelable
{

    public GoogleMapOptions()
    {
        zzatN = -1;
        zzzH = 1;
    }

    GoogleMapOptions(int i, byte byte0, byte byte1, int j, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9)
    {
        zzatN = -1;
        zzzH = i;
        zzatL = zza.zza(byte0);
        zzatM = zza.zza(byte1);
        zzatN = j;
        zzatO = cameraposition;
        zzatP = zza.zza(byte2);
        zzatQ = zza.zza(byte3);
        zzatR = zza.zza(byte4);
        zzatS = zza.zza(byte5);
        zzatT = zza.zza(byte6);
        zzatU = zza.zza(byte7);
        zzatV = zza.zza(byte8);
        zzatW = zza.zza(byte9);
    }

    public static GoogleMapOptions createFromAttributes(Context context, AttributeSet attributeset)
    {
        if(attributeset == null)
            return null;
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, com.google.android.gms.R.styleable.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_mapType))
            googlemapoptions.mapType(typedarray.getInt(com.google.android.gms.R.styleable.MapAttrs_mapType, -1));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop))
            googlemapoptions.zOrderOnTop(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_zOrderOnTop, false));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle))
            googlemapoptions.useViewLifecycleInFragment(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_useViewLifecycle, false));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiCompass))
            googlemapoptions.compassEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiCompass, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures))
            googlemapoptions.rotateGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiRotateGestures, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures))
            googlemapoptions.scrollGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiScrollGestures, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures))
            googlemapoptions.tiltGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiTiltGestures, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures))
            googlemapoptions.zoomGesturesEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomGestures, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls))
            googlemapoptions.zoomControlsEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiZoomControls, true));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_liteMode))
            googlemapoptions.liteMode(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_liteMode, false));
        if(typedarray.hasValue(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar))
            googlemapoptions.mapToolbarEnabled(typedarray.getBoolean(com.google.android.gms.R.styleable.MapAttrs_uiMapToolbar, true));
        googlemapoptions.camera(CameraPosition.createFromAttributes(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    public GoogleMapOptions camera(CameraPosition cameraposition)
    {
        zzatO = cameraposition;
        return this;
    }

    public GoogleMapOptions compassEnabled(boolean flag)
    {
        zzatQ = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    public CameraPosition getCamera()
    {
        return zzatO;
    }

    public Boolean getCompassEnabled()
    {
        return zzatQ;
    }

    public Boolean getLiteMode()
    {
        return zzatV;
    }

    public Boolean getMapToolbarEnabled()
    {
        return zzatW;
    }

    public int getMapType()
    {
        return zzatN;
    }

    public Boolean getRotateGesturesEnabled()
    {
        return zzatU;
    }

    public Boolean getScrollGesturesEnabled()
    {
        return zzatR;
    }

    public Boolean getTiltGesturesEnabled()
    {
        return zzatT;
    }

    public Boolean getUseViewLifecycleInFragment()
    {
        return zzatM;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public Boolean getZOrderOnTop()
    {
        return zzatL;
    }

    public Boolean getZoomControlsEnabled()
    {
        return zzatP;
    }

    public Boolean getZoomGesturesEnabled()
    {
        return zzatS;
    }

    public GoogleMapOptions liteMode(boolean flag)
    {
        zzatV = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapToolbarEnabled(boolean flag)
    {
        zzatW = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions mapType(int i)
    {
        zzatN = i;
        return this;
    }

    public GoogleMapOptions rotateGesturesEnabled(boolean flag)
    {
        zzatU = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions scrollGesturesEnabled(boolean flag)
    {
        zzatR = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions tiltGesturesEnabled(boolean flag)
    {
        zzatT = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions useViewLifecycleInFragment(boolean flag)
    {
        zzatM = Boolean.valueOf(flag);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.maps.zza.zza(this, parcel, i);
    }

    public GoogleMapOptions zOrderOnTop(boolean flag)
    {
        zzatL = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomControlsEnabled(boolean flag)
    {
        zzatP = Boolean.valueOf(flag);
        return this;
    }

    public GoogleMapOptions zoomGesturesEnabled(boolean flag)
    {
        zzatS = Boolean.valueOf(flag);
        return this;
    }

    byte zztA()
    {
        return zza.zzd(zzatV);
    }

    byte zztB()
    {
        return zza.zzd(zzatW);
    }

    byte zzts()
    {
        return zza.zzd(zzatL);
    }

    byte zztt()
    {
        return zza.zzd(zzatM);
    }

    byte zztu()
    {
        return zza.zzd(zzatP);
    }

    byte zztv()
    {
        return zza.zzd(zzatQ);
    }

    byte zztw()
    {
        return zza.zzd(zzatR);
    }

    byte zztx()
    {
        return zza.zzd(zzatS);
    }

    byte zzty()
    {
        return zza.zzd(zzatT);
    }

    byte zztz()
    {
        return zza.zzd(zzatU);
    }

    public static final com.google.android.gms.maps.zza CREATOR = new com.google.android.gms.maps.zza();
    private Boolean zzatL;
    private Boolean zzatM;
    private int zzatN;
    private CameraPosition zzatO;
    private Boolean zzatP;
    private Boolean zzatQ;
    private Boolean zzatR;
    private Boolean zzatS;
    private Boolean zzatT;
    private Boolean zzatU;
    private Boolean zzatV;
    private Boolean zzatW;
    private final int zzzH;

}
