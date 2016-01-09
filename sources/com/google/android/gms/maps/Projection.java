// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;

public final class Projection
{

    Projection(IProjectionDelegate iprojectiondelegate)
    {
        zzaul = iprojectiondelegate;
    }

    public LatLng fromScreenLocation(Point point)
    {
        try
        {
            point = zzaul.fromScreenLocation(zze.zzt(point));
        }
        // Misplaced declaration of an exception variable
        catch(Point point)
        {
            throw new RuntimeRemoteException(point);
        }
        return point;
    }

    public VisibleRegion getVisibleRegion()
    {
        VisibleRegion visibleregion;
        try
        {
            visibleregion = zzaul.getVisibleRegion();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return visibleregion;
    }

    public Point toScreenLocation(LatLng latlng)
    {
        try
        {
            latlng = (Point)zze.zzg(zzaul.toScreenLocation(latlng));
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    private final IProjectionDelegate zzaul;
}
