// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg, LocationRequestUpdateData, LocationRequestInternal

public class zzi
{
    private static class zza extends com.google.android.gms.location.zzc.zza
    {

        private void zzb(int i, Object obj)
        {
            if(zzaqX == null)
            {
                Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = i;
                message.obj = obj;
                zzaqX.sendMessage(message);
                return;
            }
        }

        public void onLocationAvailability(LocationAvailability locationavailability)
        {
            zzb(1, locationavailability);
        }

        public void onLocationResult(LocationResult locationresult)
        {
            zzb(0, locationresult);
        }

        public void release()
        {
            zzaqX = null;
        }

        private Handler zzaqX;

        zza(LocationCallback locationcallback, Looper looper)
        {
            Looper looper1 = looper;
            if(looper == null)
            {
                looper1 = Looper.myLooper();
                boolean flag;
                if(looper1 != null)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            zzaqX = new _cls1(this, looper1, locationcallback);
        }
    }

    private static class zzb extends Handler
    {

        public void handleMessage(Message message)
        {
            switch(message.what)
            {
            default:
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
                return;

            case 1: // '\001'
                message = new Location((Location)message.obj);
                break;
            }
            zzaqZ.onLocationChanged(message);
        }

        private final LocationListener zzaqZ;

        public zzb(LocationListener locationlistener)
        {
            zzaqZ = locationlistener;
        }

        public zzb(LocationListener locationlistener, Looper looper)
        {
            super(looper);
            zzaqZ = locationlistener;
        }
    }

    private static class zzc extends com.google.android.gms.location.zzd.zza
    {

        public void onLocationChanged(Location location)
        {
            if(zzaqX == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                zzaqX.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            zzaqX = null;
        }

        private Handler zzaqX;

        zzc(LocationListener locationlistener, Looper looper)
        {
            if(looper == null)
            {
                boolean flag;
                if(Looper.myLooper() != null)
                    flag = true;
                else
                    flag = false;
                zzv.zza(flag, "Can't create handler inside thread that has not called Looper.prepare()");
            }
            if(looper == null)
                locationlistener = new zzb(locationlistener);
            else
                locationlistener = new zzb(locationlistener, looper);
            zzaqX = locationlistener;
        }
    }


    public zzi(Context context, zzn zzn1)
    {
        zzaqU = null;
        zzaqV = false;
        zzadz = new HashMap();
        zzaqW = new HashMap();
        mContext = context;
        zzaqz = zzn1;
    }

    private zza zza(LocationCallback locationcallback, Looper looper)
    {
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        zza zza2 = (zza)zzaqW.get(locationcallback);
        zza zza1;
        zza1 = zza2;
        if(zza2 != null)
            break MISSING_BLOCK_LABEL_42;
        zza1 = new zza(locationcallback, looper);
        zzaqW.put(locationcallback, zza1);
        map;
        JVM INSTR monitorexit ;
        return zza1;
        locationcallback;
        map;
        JVM INSTR monitorexit ;
        throw locationcallback;
    }

    private zzc zza(LocationListener locationlistener, Looper looper)
    {
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        zzc zzc2 = (zzc)zzadz.get(locationlistener);
        zzc zzc1;
        zzc1 = zzc2;
        if(zzc2 != null)
            break MISSING_BLOCK_LABEL_42;
        zzc1 = new zzc(locationlistener, looper);
        zzadz.put(locationlistener, zzc1);
        map;
        JVM INSTR monitorexit ;
        return zzc1;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public Location getLastLocation()
    {
        zzaqz.zzlW();
        Location location;
        try
        {
            location = ((zzg)zzaqz.zzlX()).zzcF(mContext.getPackageName());
        }
        catch(RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void removeAllListeners()
    {
        Object obj = zzadz;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzadz.values().iterator();
_L2:
        Object obj1;
        do
        {
            if(!iterator.hasNext())
                break MISSING_BLOCK_LABEL_84;
            obj1 = (zzc)iterator.next();
        } while(obj1 == null);
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zzb(((com.google.android.gms.location.zzd) (obj1))));
        if(true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch(Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        zzadz.clear();
        exception = zzaqW.values().iterator();
_L3:
        do
        {
            if(!exception.hasNext())
                break MISSING_BLOCK_LABEL_155;
            obj1 = (zza)exception.next();
        } while(obj1 == null);
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zza(((com.google.android.gms.location.zzc) (obj1))));
          goto _L3
        zzaqW.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public void zzX(boolean flag)
        throws RemoteException
    {
        zzaqz.zzlW();
        ((zzg)zzaqz.zzlX()).zzX(flag);
        zzaqV = flag;
    }

    public void zza(LocationCallback locationcallback)
        throws RemoteException
    {
        zzaqz.zzlW();
        zzv.zzb(locationcallback, "Invalid null callback");
        Map map = zzaqW;
        map;
        JVM INSTR monitorenter ;
        locationcallback = (zza)zzaqW.remove(locationcallback);
        if(locationcallback == null)
            break MISSING_BLOCK_LABEL_66;
        locationcallback.release();
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zza(locationcallback));
        map;
        JVM INSTR monitorexit ;
        return;
        locationcallback;
        map;
        JVM INSTR monitorexit ;
        throw locationcallback;
    }

    public void zza(LocationListener locationlistener)
        throws RemoteException
    {
        zzaqz.zzlW();
        zzv.zzb(locationlistener, "Invalid null listener");
        Map map = zzadz;
        map;
        JVM INSTR monitorenter ;
        locationlistener = (zzc)zzadz.remove(locationlistener);
        if(zzaqU != null && zzadz.isEmpty())
        {
            zzaqU.release();
            zzaqU = null;
        }
        if(locationlistener == null)
            break MISSING_BLOCK_LABEL_98;
        locationlistener.release();
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zzb(locationlistener));
        map;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        map;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void zza(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        zzaqz.zzlW();
        locationlistener = zza(locationlistener, looper);
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), locationlistener));
    }

    public void zza(LocationRequestInternal locationrequestinternal, LocationCallback locationcallback, Looper looper)
        throws RemoteException
    {
        zzaqz.zzlW();
        locationcallback = zza(locationcallback, looper);
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zza(locationrequestinternal, locationcallback));
    }

    public void zzb(Location location)
        throws RemoteException
    {
        zzaqz.zzlW();
        ((zzg)zzaqz.zzlX()).zzb(location);
    }

    public void zzb(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        zzaqz.zzlW();
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zzb(LocationRequestInternal.zzb(locationrequest), pendingintent));
    }

    public void zzd(PendingIntent pendingintent)
        throws RemoteException
    {
        zzaqz.zzlW();
        ((zzg)zzaqz.zzlX()).zza(LocationRequestUpdateData.zze(pendingintent));
    }

    public LocationAvailability zzsI()
    {
        zzaqz.zzlW();
        LocationAvailability locationavailability;
        try
        {
            locationavailability = ((zzg)zzaqz.zzlX()).zzcG(mContext.getPackageName());
        }
        catch(RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return locationavailability;
    }

    public void zzsJ()
    {
        if(!zzaqV)
            break MISSING_BLOCK_LABEL_12;
        zzX(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    private final Context mContext;
    private Map zzadz;
    private ContentProviderClient zzaqU;
    private boolean zzaqV;
    private Map zzaqW;
    private final zzn zzaqz;

    // Unreferenced inner class com/google/android/gms/location/internal/zzi$zza$1

/* anonymous class */
    class zza._cls1 extends Handler
    {

        public void handleMessage(Message message)
        {
            switch(message.what)
            {
            default:
                return;

            case 0: // '\0'
                zzaqN.onLocationResult((LocationResult)message.obj);
                return;

            case 1: // '\001'
                zzaqN.onLocationAvailability((LocationAvailability)message.obj);
                break;
            }
        }

        final LocationCallback zzaqN;
        final zza zzaqY;

            
            {
                zzaqY = zza1;
                zzaqN = locationcallback;
                super(looper);
            }
    }

}
