// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, BitmapDescriptor, LatLng

public final class Marker
{

    public Marker(zzi zzi1)
    {
        zzavu = (zzi)zzv.zzr(zzi1);
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Marker))
            return false;
        boolean flag;
        try
        {
            flag = zzavu.zzh(((Marker)obj).zzavu);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public float getAlpha()
    {
        float f;
        try
        {
            f = zzavu.getAlpha();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzavu.getId();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public LatLng getPosition()
    {
        LatLng latlng;
        try
        {
            latlng = zzavu.getPosition();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return latlng;
    }

    public float getRotation()
    {
        float f;
        try
        {
            f = zzavu.getRotation();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return f;
    }

    public String getSnippet()
    {
        String s;
        try
        {
            s = zzavu.getSnippet();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public String getTitle()
    {
        String s;
        try
        {
            s = zzavu.getTitle();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzavu.hashCodeRemote();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public void hideInfoWindow()
    {
        try
        {
            zzavu.hideInfoWindow();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean isDraggable()
    {
        boolean flag;
        try
        {
            flag = zzavu.isDraggable();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isFlat()
    {
        boolean flag;
        try
        {
            flag = zzavu.isFlat();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isInfoWindowShown()
    {
        boolean flag;
        try
        {
            flag = zzavu.isInfoWindowShown();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isVisible()
    {
        boolean flag;
        try
        {
            flag = zzavu.isVisible();
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
            zzavu.remove();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAlpha(float f)
    {
        try
        {
            zzavu.setAlpha(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setAnchor(float f, float f1)
    {
        try
        {
            zzavu.setAnchor(f, f1);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setDraggable(boolean flag)
    {
        try
        {
            zzavu.setDraggable(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFlat(boolean flag)
    {
        try
        {
            zzavu.setFlat(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setIcon(BitmapDescriptor bitmapdescriptor)
    {
        try
        {
            zzavu.zzo(bitmapdescriptor.zztp());
            return;
        }
        // Misplaced declaration of an exception variable
        catch(BitmapDescriptor bitmapdescriptor)
        {
            throw new RuntimeRemoteException(bitmapdescriptor);
        }
    }

    public void setInfoWindowAnchor(float f, float f1)
    {
        try
        {
            zzavu.setInfoWindowAnchor(f, f1);
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
            zzavu.setPosition(latlng);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
    }

    public void setRotation(float f)
    {
        try
        {
            zzavu.setRotation(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setSnippet(String s)
    {
        try
        {
            zzavu.setSnippet(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setTitle(String s)
    {
        try
        {
            zzavu.setTitle(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new RuntimeRemoteException(s);
        }
    }

    public void setVisible(boolean flag)
    {
        try
        {
            zzavu.setVisible(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void showInfoWindow()
    {
        try
        {
            zzavu.showInfoWindow();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private final zzi zzavu;
}
