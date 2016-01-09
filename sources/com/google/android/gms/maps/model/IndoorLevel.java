// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzh;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class IndoorLevel
{

    public IndoorLevel(zzh zzh1)
    {
        zzavp = (zzh)zzv.zzr(zzh1);
    }

    public void activate()
    {
        try
        {
            zzavp.activate();
            return;
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof IndoorLevel))
            return false;
        boolean flag;
        try
        {
            flag = zzavp.zza(((IndoorLevel)obj).zzavp);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public String getName()
    {
        String s;
        try
        {
            s = zzavp.getName();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return s;
    }

    public String getShortName()
    {
        String s;
        try
        {
            s = zzavp.getShortName();
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
            i = zzavp.hashCodeRemote();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    private final zzh zzavp;
}
