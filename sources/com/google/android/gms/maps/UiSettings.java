// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.RuntimeRemoteException;

public final class UiSettings
{

    UiSettings(IUiSettingsDelegate iuisettingsdelegate)
    {
        zzauO = iuisettingsdelegate;
    }

    public boolean isCompassEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isCompassEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isIndoorLevelPickerEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isIndoorLevelPickerEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isMapToolbarEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isMapToolbarEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isMyLocationButtonEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isMyLocationButtonEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isRotateGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isRotateGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isScrollGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isScrollGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isTiltGesturesEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isTiltGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public boolean isZoomControlsEnabled()
    {
        boolean flag;
        try
        {
            flag = zzauO.isZoomControlsEnabled();
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
            flag = zzauO.isZoomGesturesEnabled();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public void setAllGesturesEnabled(boolean flag)
    {
        try
        {
            zzauO.setAllGesturesEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setCompassEnabled(boolean flag)
    {
        try
        {
            zzauO.setCompassEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setIndoorLevelPickerEnabled(boolean flag)
    {
        try
        {
            zzauO.setIndoorLevelPickerEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setMapToolbarEnabled(boolean flag)
    {
        try
        {
            zzauO.setMapToolbarEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setMyLocationButtonEnabled(boolean flag)
    {
        try
        {
            zzauO.setMyLocationButtonEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setRotateGesturesEnabled(boolean flag)
    {
        try
        {
            zzauO.setRotateGesturesEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setScrollGesturesEnabled(boolean flag)
    {
        try
        {
            zzauO.setScrollGesturesEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setTiltGesturesEnabled(boolean flag)
    {
        try
        {
            zzauO.setTiltGesturesEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setZoomControlsEnabled(boolean flag)
    {
        try
        {
            zzauO.setZoomControlsEnabled(flag);
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
            zzauO.setZoomGesturesEnabled(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private final IUiSettingsDelegate zzauO;
}
