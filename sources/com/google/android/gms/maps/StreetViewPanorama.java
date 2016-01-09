// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
    public static interface OnStreetViewPanoramaCameraChangeListener
    {

        public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera);
    }

    public static interface OnStreetViewPanoramaChangeListener
    {

        public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation);
    }

    public static interface OnStreetViewPanoramaClickListener
    {

        public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
    }

    public static interface OnStreetViewPanoramaLongClickListener
    {

        public abstract void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation);
    }


    protected StreetViewPanorama(IStreetViewPanoramaDelegate istreetviewpanoramadelegate)
    {
        zzaum = (IStreetViewPanoramaDelegate)zzv.zzr(istreetviewpanoramadelegate);
    }

    public void animateTo(StreetViewPanoramaCamera streetviewpanoramacamera, long l)
    {
        try
        {
            zzaum.animateTo(streetviewpanoramacamera, l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(StreetViewPanoramaCamera streetviewpanoramacamera)
        {
            throw new RuntimeRemoteException(streetviewpanoramacamera);
        }
    }

    public StreetViewPanoramaLocation getLocation()
    {
        StreetViewPanoramaLocation streetviewpanoramalocation;
        try
        {
            streetviewpanoramalocation = zzaum.getStreetViewPanoramaLocation();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramalocation;
    }

    public StreetViewPanoramaCamera getPanoramaCamera()
    {
        StreetViewPanoramaCamera streetviewpanoramacamera;
        try
        {
            streetviewpanoramacamera = zzaum.getPanoramaCamera();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return streetviewpanoramacamera;
    }

    public boolean isPanningGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaum.isPanningGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isStreetNamesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaum.isStreetNamesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isUserNavigationEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaum.isUserNavigationEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzaum.isZoomGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public Point orientationToPoint(StreetViewPanoramaOrientation streetviewpanoramaorientation)
    {
        try
        {
            streetviewpanoramaorientation = zzaum.orientationToPoint(streetviewpanoramaorientation);
        }
        // Misplaced declaration of an exception variable
        catch(StreetViewPanoramaOrientation streetviewpanoramaorientation)
        {
            throw new RuntimeRemoteException(streetviewpanoramaorientation);
        }
        if(streetviewpanoramaorientation == null)
            return null;
        streetviewpanoramaorientation = (Point)zze.zzg(streetviewpanoramaorientation);
        return streetviewpanoramaorientation;
    }

    public StreetViewPanoramaOrientation pointToOrientation(Point point)
    {
        try
        {
            point = zzaum.pointToOrientation(zze.zzt(point));
        }
        // Misplaced declaration of an exception variable
        catch(Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
    {
        if(onstreetviewpanoramacamerachangelistener == null)
            try
            {
                zzaum.setOnStreetViewPanoramaCameraChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnStreetViewPanoramaCameraChangeListener onstreetviewpanoramacamerachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramacamerachangelistener);
            }
        zzaum.setOnStreetViewPanoramaCameraChangeListener(new com.google.android.gms.maps.internal.zzr.zza(onstreetviewpanoramacamerachangelistener) {

            public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera streetviewpanoramacamera)
            {
                zzaup.onStreetViewPanoramaCameraChange(streetviewpanoramacamera);
            }

            final StreetViewPanorama zzauo;
            final OnStreetViewPanoramaCameraChangeListener zzaup;

            
            {
                zzauo = StreetViewPanorama.this;
                zzaup = onstreetviewpanoramacamerachangelistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
    {
        if(onstreetviewpanoramachangelistener == null)
            try
            {
                zzaum.setOnStreetViewPanoramaChangeListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnStreetViewPanoramaChangeListener onstreetviewpanoramachangelistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramachangelistener);
            }
        zzaum.setOnStreetViewPanoramaChangeListener(new com.google.android.gms.maps.internal.zzs.zza(onstreetviewpanoramachangelistener) {

            public void onStreetViewPanoramaChange(StreetViewPanoramaLocation streetviewpanoramalocation)
            {
                zzaun.onStreetViewPanoramaChange(streetviewpanoramalocation);
            }

            final OnStreetViewPanoramaChangeListener zzaun;
            final StreetViewPanorama zzauo;

            
            {
                zzauo = StreetViewPanorama.this;
                zzaun = onstreetviewpanoramachangelistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
    {
        if(onstreetviewpanoramaclicklistener == null)
            try
            {
                zzaum.setOnStreetViewPanoramaClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnStreetViewPanoramaClickListener onstreetviewpanoramaclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramaclicklistener);
            }
        zzaum.setOnStreetViewPanoramaClickListener(new com.google.android.gms.maps.internal.zzt.zza(onstreetviewpanoramaclicklistener) {

            public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzauq.onStreetViewPanoramaClick(streetviewpanoramaorientation);
            }

            final StreetViewPanorama zzauo;
            final OnStreetViewPanoramaClickListener zzauq;

            
            {
                zzauo = StreetViewPanorama.this;
                zzauq = onstreetviewpanoramaclicklistener;
                super();
            }
        }
);
        return;
    }

    public final void setOnStreetViewPanoramaLongClickListener(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
    {
        if(onstreetviewpanoramalongclicklistener == null)
            try
            {
                zzaum.setOnStreetViewPanoramaLongClickListener(null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(OnStreetViewPanoramaLongClickListener onstreetviewpanoramalongclicklistener)
            {
                throw new RuntimeRemoteException(onstreetviewpanoramalongclicklistener);
            }
        zzaum.setOnStreetViewPanoramaLongClickListener(new com.google.android.gms.maps.internal.zzu.zza(onstreetviewpanoramalongclicklistener) {

            public void onStreetViewPanoramaLongClick(StreetViewPanoramaOrientation streetviewpanoramaorientation)
            {
                zzaur.onStreetViewPanoramaLongClick(streetviewpanoramaorientation);
            }

            final StreetViewPanorama zzauo;
            final OnStreetViewPanoramaLongClickListener zzaur;

            
            {
                zzauo = StreetViewPanorama.this;
                zzaur = onstreetviewpanoramalongclicklistener;
                super();
            }
        }
);
        return;
    }

    public void setPanningGesturesEnabled(boolean flag)
    {
        try
        {
            zzaum.enablePanning(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setPosition(LatLng latlng)
    {
        try
        {
            zzaum.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(LatLng latlng, int i)
    {
        try
        {
            zzaum.setPositionWithRadius(latlng, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setPosition(String s)
    {
        try
        {
            zzaum.setPositionWithID(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setStreetNamesEnabled(boolean flag)
    {
        try
        {
            zzaum.enableStreetNames(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setUserNavigationEnabled(boolean flag)
    {
        try
        {
            zzaum.enableUserNavigation(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomGesturesEnabled(boolean flag)
    {
        try
        {
            zzaum.enableZoom(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    IStreetViewPanoramaDelegate zztF()
    {
        return zzaum;
    }

    private final IStreetViewPanoramaDelegate zzaum;
}
