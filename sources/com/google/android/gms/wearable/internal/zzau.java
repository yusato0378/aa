// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbl, zzbk, zzat, RemoveListenerRequest, 
//            AddListenerRequest

final class zzau
{
    private static class zza extends zzbj.zzb
    {

        public void zza(Status status)
        {
            Map map;
            Object obj;
            map = (Map)zzaMn.get();
            obj = zzaMo.get();
            if(status.getStatus().isSuccess() || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (zzbl)map.remove(obj);
            if(obj == null)
                break MISSING_BLOCK_LABEL_58;
            ((zzbl) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            zzL(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        private WeakReference zzaMn;
        private WeakReference zzaMo;

        zza(Map map, Object obj, com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
            zzaMn = new WeakReference(map);
            zzaMo = new WeakReference(obj);
        }
    }

    private static class zzb extends zzbj.zzb
    {

        public void zza(Status status)
        {
            Map map;
            Object obj;
            map = (Map)zzaMn.get();
            obj = zzaMo.get();
            if(status.getStatus().getStatusCode() != 4002 || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (zzbl)map.remove(obj);
            if(obj == null)
                break MISSING_BLOCK_LABEL_61;
            ((zzbl) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            zzL(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        private WeakReference zzaMn;
        private WeakReference zzaMo;

        zzb(Map map, Object obj, com.google.android.gms.common.api.zza.zzb zzb1)
        {
            super(zzb1);
            zzaMn = new WeakReference(map);
            zzaMo = new WeakReference(obj);
        }
    }


    zzau()
    {
    }

    public boolean isEmpty()
    {
        boolean flag;
        synchronized(zzadz)
        {
            flag = zzadz.isEmpty();
        }
        return flag;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzbk zzbk1, com.google.android.gms.common.api.zza.zzb zzb1, Object obj)
        throws RemoteException
    {
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        zzbl zzbl1 = (zzbl)zzadz.remove(obj);
        if(zzbl1 != null)
            break MISSING_BLOCK_LABEL_49;
        zzb1.zzj(new Status(4002));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbl1.clear();
        ((zzat)zzbk1.zzlX()).zza(new zzb(zzadz, obj, zzb1), new RemoveListenerRequest(zzbl1));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbk1;
        map;
        JVM INSTR monitorexit ;
        throw zzbk1;
    }

    public void zza(zzbk zzbk1, com.google.android.gms.common.api.zza.zzb zzb1, Object obj, zzbl zzbl1)
        throws RemoteException
    {
label0:
        {
            synchronized(zzadz)
            {
                if(zzadz.get(obj) == null)
                    break label0;
                zzb1.zzj(new Status(4001));
            }
            return;
        }
        zzadz.put(obj, zzbl1);
        ((zzat)zzbk1.zzlX()).zza(new zza(zzadz, obj, zzb1), new AddListenerRequest(zzbl1));
        map;
        JVM INSTR monitorexit ;
        return;
        zzbk1;
        map;
        JVM INSTR monitorexit ;
        throw zzbk1;
        zzbk1;
        zzadz.remove(obj);
        throw zzbk1;
    }

    public void zzb(zzbk zzbk1)
    {
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        zzbj.zzo zzo;
        Iterator iterator;
        zzo = new zzbj.zzo();
        iterator = zzadz.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        zzbl zzbl1;
        do
        {
            if(!iterator.hasNext())
                break MISSING_BLOCK_LABEL_212;
            entry = (java.util.Map.Entry)iterator.next();
            zzbl1 = (zzbl)entry.getValue();
        } while(zzbl1 == null);
        boolean flag;
        zzbl1.clear();
        flag = zzbk1.isConnected();
        if(!flag) goto _L2; else goto _L1
_L1:
        ((zzat)zzbk1.zzlX()).zza(zzo, new RemoveListenerRequest(zzbl1));
        if(Log.isLoggable("WearableClient", 2))
            Log.d("WearableClient", (new StringBuilder()).append("disconnect: removed: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder()).append("disconnect: Didn't remove: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L2
        zzbk1;
        map;
        JVM INSTR monitorexit ;
        throw zzbk1;
        zzadz.clear();
        map;
        JVM INSTR monitorexit ;
    }

    public void zzcV(IBinder ibinder)
    {
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        zzbj.zzo zzo;
        Iterator iterator;
        ibinder = zzat.zza.zzcU(ibinder);
        zzo = new zzbj.zzo();
        iterator = zzadz.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        zzbl zzbl1;
        if(!iterator.hasNext())
            break MISSING_BLOCK_LABEL_190;
        entry = (java.util.Map.Entry)iterator.next();
        zzbl1 = (zzbl)entry.getValue();
        ibinder.zza(zzo, new AddListenerRequest(zzbl1));
        if(Log.isLoggable("WearableClient", 2))
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: added: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: Didn't add: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    private final Map zzadz = new HashMap();
}
