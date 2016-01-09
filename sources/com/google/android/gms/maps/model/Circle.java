// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zze;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, LatLng

public final class Circle
{

    public Circle(zze zze1)
    {
        zzauX = (zze)zzv.zzr(zze1);
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Circle))
            return false;
        boolean flag;
        try
        {
            flag = zzauX.zza(((Circle)obj).zzauX);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public LatLng getCenter()
    {
        LatLng latlng;
        try
        {
            latlng = zzauX.getCenter();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public int getFillColor()
    {
        int i;
        try
        {
            i = zzauX.getFillColor();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzauX.getId();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public double getRadius()
    {
        double d;
        try
        {
            d = zzauX.getRadius();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return d;
    }

    public int getStrokeColor()
    {
        int i;
        try
        {
            i = zzauX.getStrokeColor();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public float getStrokeWidth()
    {
        float f;
        try
        {
            f = zzauX.getStrokeWidth();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public float getZIndex()
    {
        float f;
        try
        {
            f = zzauX.getZIndex();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzauX.hashCodeRemote();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = zzauX.isVisible();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void remove()
    {
        try
        {
            zzauX.remove();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setCenter(LatLng latlng)
    {
        try
        {
            zzauX.setCenter(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setFillColor(int i)
    {
        try
        {
            zzauX.setFillColor(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setRadius(double d)
    {
        try
        {
            zzauX.setRadius(d);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setStrokeColor(int i)
    {
        try
        {
            zzauX.setStrokeColor(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setStrokeWidth(float f)
    {
        try
        {
            zzauX.setStrokeWidth(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            zzauX.setVisible(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZIndex(float f)
    {
        try
        {
            zzauX.setZIndex(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private final zze zzauX;
}
