// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate

public final class CameraUpdateFactory
{

    private CameraUpdateFactory()
    {
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraposition)
    {
        try
        {
            cameraposition = new CameraUpdate(zztq().newCameraPosition(cameraposition));
        }
        // Misplaced declaration of an exception variable
        catch(CameraPosition cameraposition)
        {
            throw new RuntimeRemoteException(cameraposition);
        }
        return cameraposition;
    }

    public static CameraUpdate newLatLng(LatLng latlng)
    {
        try
        {
            latlng = new CameraUpdate(zztq().newLatLng(latlng));
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new CameraUpdate(zztq().newLatLngBounds(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch(LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latlngbounds, int i, int j, int k)
    {
        try
        {
            latlngbounds = new CameraUpdate(zztq().newLatLngBoundsWithSize(latlngbounds, i, j, k));
        }
        // Misplaced declaration of an exception variable
        catch(LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    public static CameraUpdate newLatLngZoom(LatLng latlng, float f)
    {
        try
        {
            latlng = new CameraUpdate(zztq().newLatLngZoom(latlng, f));
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    public static CameraUpdate scrollBy(float f, float f1)
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(zztq().scrollBy(f, f1));
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static CameraUpdate zoomBy(float f)
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(zztq().zoomBy(f));
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static CameraUpdate zoomBy(float f, Point point)
    {
        try
        {
            point = new CameraUpdate(zztq().zoomByWithFocus(f, point.x, point.y));
        }
        // Misplaced declaration of an exception variable
        catch(Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public static CameraUpdate zoomIn()
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(zztq().zoomIn());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static CameraUpdate zoomOut()
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(zztq().zoomOut());
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static CameraUpdate zoomTo(float f)
    {
        CameraUpdate cameraupdate;
        try
        {
            cameraupdate = new CameraUpdate(zztq().zoomTo(f));
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return cameraupdate;
    }

    public static void zza(ICameraUpdateFactoryDelegate icameraupdatefactorydelegate)
    {
        zzatr = (ICameraUpdateFactoryDelegate)zzv.zzr(icameraupdatefactorydelegate);
    }

    private static ICameraUpdateFactoryDelegate zztq()
    {
        return (ICameraUpdateFactoryDelegate)zzv.zzb(zzatr, "CameraUpdateFactory is not initialized");
    }

    private static ICameraUpdateFactoryDelegate zzatr;
}
