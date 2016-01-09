// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.internal.zzg;
import java.util.*;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException, IndoorLevel

public final class IndoorBuilding
{

    public IndoorBuilding(zzg zzg1)
    {
        zzavo = (zzg)zzv.zzr(zzg1);
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof IndoorBuilding))
            return false;
        boolean flag;
        try
        {
            flag = zzavo.zzb(((IndoorBuilding)obj).zzavo);
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int getActiveLevelIndex()
    {
        int i;
        try
        {
            i = zzavo.getActiveLevelIndex();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public int getDefaultLevelIndex()
    {
        int i;
        try
        {
            i = zzavo.getActiveLevelIndex();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public List getLevels()
    {
        Object obj;
        try
        {
            Object obj1 = zzavo.getLevels();
            obj = new ArrayList(((List) (obj1)).size());
            for(obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new IndoorLevel(com.google.android.gms.maps.model.internal.zzh.zza.zzbY((IBinder)((Iterator) (obj1)).next()))));
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return ((List) (obj));
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = zzavo.hashCodeRemote();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }

    public boolean isUnderground()
    {
        boolean flag;
        try
        {
            flag = zzavo.isUnderground();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return flag;
    }

    private final zzg zzavo;
}
