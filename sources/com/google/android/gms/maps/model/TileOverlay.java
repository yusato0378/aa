// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzk;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class TileOverlay
{

    public TileOverlay(zzk zzk1)
    {
        zzavI = (zzk)zzv.zzr(zzk1);
    }

    public void clearTileCache()
    {
        try
        {
            zzavI.clearTileCache();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof TileOverlay))
            return false;
        boolean flag;
        try
        {
            flag = zzavI.zza(((TileOverlay)obj).zzavI);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public boolean getFadeIn()
    {
        boolean flag;
        try
        {
            flag = zzavI.getFadeIn();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzavI.getId();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public float getZIndex()
    {
        float f;
        try
        {
            f = zzavI.getZIndex();
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
            i = zzavI.hashCodeRemote();
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
            flag = zzavI.isVisible();
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
            zzavI.remove();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFadeIn(boolean flag)
    {
        try
        {
            zzavI.setFadeIn(flag);
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
            zzavI.setVisible(flag);
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
            zzavI.setZIndex(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private final zzk zzavI;
}
