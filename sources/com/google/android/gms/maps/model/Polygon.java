// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzj;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class Polygon
{

    public Polygon(zzj zzj1)
    {
        zzavC = (zzj)zzv.zzr(zzj1);
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof Polygon))
            return false;
        boolean flag;
        try
        {
            flag = zzavC.zza(((Polygon)obj).zzavC);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int getFillColor()
    {
        int i;
        try
        {
            i = zzavC.getFillColor();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public List getHoles()
    {
        List list;
        try
        {
            list = zzavC.getHoles();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return list;
    }

    public String getId()
    {
        String s;
        try
        {
            s = zzavC.getId();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public List getPoints()
    {
        List list;
        try
        {
            list = zzavC.getPoints();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return list;
    }

    public int getStrokeColor()
    {
        int i;
        try
        {
            i = zzavC.getStrokeColor();
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
            f = zzavC.getStrokeWidth();
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
            f = zzavC.getZIndex();
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
            i = zzavC.hashCodeRemote();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isGeodesic()
    {
        boolean flag;
        try
        {
            flag = zzavC.isGeodesic();
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
            flag = zzavC.isVisible();
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
            zzavC.remove();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setFillColor(int i)
    {
        try
        {
            zzavC.setFillColor(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setGeodesic(boolean flag)
    {
        try
        {
            zzavC.setGeodesic(flag);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public void setHoles(List list)
    {
        try
        {
            zzavC.setHoles(list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new RuntimeRemoteException(list);
        }
    }

    public void setPoints(List list)
    {
        try
        {
            zzavC.setPoints(list);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(List list)
        {
            throw new RuntimeRemoteException(list);
        }
    }

    public void setStrokeColor(int i)
    {
        try
        {
            zzavC.setStrokeColor(i);
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
            zzavC.setStrokeWidth(f);
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
            zzavC.setVisible(flag);
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
            zzavC.setZIndex(f);
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    private final zzj zzavC;
}
