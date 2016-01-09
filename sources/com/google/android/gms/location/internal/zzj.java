// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.copresence.internal.CopresenceApiOptions;
import com.google.android.gms.location.copresence.internal.zzb;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzb, zzi, zzg, LocationRequestInternal

public class zzj extends com.google.android.gms.location.internal.zzb
{
    private final class zza extends com.google.android.gms.common.internal.zzi.zzc
    {

        protected void zza(com.google.android.gms.location.zze.zza zza1)
        {
            if(zza1 != null)
                zza1.zza(zzOJ, zzarc);
        }

        protected void zzmb()
        {
        }

        protected void zzo(Object obj)
        {
            zza((com.google.android.gms.location.zze.zza)obj);
        }

        private final int zzOJ;
        private final String zzarc[];
        final zzj zzard;

        public zza(com.google.android.gms.location.zze.zza zza1, int i, String as[])
        {
            zzard = zzj.this;
            super(zzj.this, zza1);
            zzOJ = LocationStatusCodes.zzfE(i);
            zzarc = as;
        }
    }

    private static final class zzb extends zzf.zza
    {

        public void zza(int i, PendingIntent pendingintent)
        {
            if(zzarg == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
                return;
            } else
            {
                zzj zzj1 = zzarg;
                zzj zzj2 = zzarg;
                zzj2.getClass();
                zzj1.zza(zzj2. new zzc(1, zzarf, i, pendingintent));
                zzarg = null;
                zzare = null;
                zzarf = null;
                return;
            }
        }

        public void zza(int i, String as[])
            throws RemoteException
        {
            if(zzarg == null)
            {
                Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
                return;
            } else
            {
                zzj zzj1 = zzarg;
                zzj zzj2 = zzarg;
                zzj2.getClass();
                zzj1.zza(zzj2. new zza(zzare, i, as));
                zzarg = null;
                zzare = null;
                zzarf = null;
                return;
            }
        }

        public void zzb(int i, String as[])
        {
            if(zzarg == null)
            {
                Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
                return;
            } else
            {
                zzj zzj1 = zzarg;
                zzj zzj2 = zzarg;
                zzj2.getClass();
                zzj1.zza(zzj2. new zzc(2, zzarf, i, as));
                zzarg = null;
                zzare = null;
                zzarf = null;
                return;
            }
        }

        private com.google.android.gms.location.zze.zza zzare;
        private com.google.android.gms.location.zze.zzb zzarf;
        private zzj zzarg;

        public zzb(com.google.android.gms.location.zze.zza zza1, zzj zzj1)
        {
            zzare = zza1;
            zzarf = null;
            zzarg = zzj1;
        }

        public zzb(com.google.android.gms.location.zze.zzb zzb1, zzj zzj1)
        {
            zzarf = zzb1;
            zzare = null;
            zzarg = zzj1;
        }
    }

    private final class zzc extends com.google.android.gms.common.internal.zzi.zzc
    {

        protected void zza(com.google.android.gms.location.zze.zzb zzb1)
        {
label0:
            {
label1:
                {
                    if(zzb1 != null)
                        switch(zzarh)
                        {
                        default:
                            Log.wtf("LocationClientImpl", (new StringBuilder()).append("Unsupported action: ").append(zzarh).toString());
                            break;

                        case 1: // '\001'
                            break label1;

                        case 2: // '\002'
                            break label0;
                        }
                    return;
                }
                zzb1.zza(zzOJ, mPendingIntent);
                return;
            }
            zzb1.zzb(zzOJ, zzarc);
        }

        protected void zzmb()
        {
        }

        protected void zzo(Object obj)
        {
            zza((com.google.android.gms.location.zze.zzb)obj);
        }

        private final PendingIntent mPendingIntent;
        private final int zzOJ;
        private final String zzarc[];
        final zzj zzard;
        private final int zzarh;

        public zzc(int i, com.google.android.gms.location.zze.zzb zzb1, int j, PendingIntent pendingintent)
        {
            boolean flag = true;
            zzard = zzj.this;
            super(zzj.this, zzb1);
            if(i != 1)
                flag = false;
            com.google.android.gms.common.internal.zzb.zzP(flag);
            zzarh = i;
            zzOJ = LocationStatusCodes.zzfE(j);
            mPendingIntent = pendingintent;
            zzarc = null;
        }

        public zzc(int i, com.google.android.gms.location.zze.zzb zzb1, int j, String as[])
        {
            zzard = zzj.this;
            super(zzj.this, zzb1);
            boolean flag;
            if(i == 2)
                flag = true;
            else
                flag = false;
            com.google.android.gms.common.internal.zzb.zzP(flag);
            zzarh = i;
            zzOJ = LocationStatusCodes.zzfE(j);
            zzarc = as;
            mPendingIntent = null;
        }
    }

    private static final class zzd extends zzh.zza
    {

        public void zza(LocationSettingsResult locationsettingsresult)
            throws RemoteException
        {
            zzari.zzj(locationsettingsresult);
            zzari = null;
        }

        private com.google.android.gms.common.api.zza.zzb zzari;

        public zzd(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            boolean flag;
            if(zzb1 != null)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "listener can't be null.");
            zzari = zzb1;
        }
    }


    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s)
    {
        this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).zzkK());
    }

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze1)
    {
        this(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zze1, CopresenceApiOptions.zzaqx);
    }

    public zzj(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze1, CopresenceApiOptions copresenceapioptions)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s, zze1);
        zzara = new zzi(context, zzaqz);
        zzarb = com.google.android.gms.location.copresence.internal.zzb.zza(context, zze1.getAccountName(), zze1.zzlJ(), zzaqz, copresenceapioptions);
    }

    public void disconnect()
    {
        zzi zzi1 = zzara;
        zzi1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if(!flag)
            break MISSING_BLOCK_LABEL_30;
        zzara.removeAllListeners();
        zzara.zzsJ();
_L1:
        super.disconnect();
        zzi1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        zzi1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Location getLastLocation()
    {
        return zzara.getLastLocation();
    }

    public void zzX(boolean flag)
        throws RemoteException
    {
        zzara.zzX(flag);
    }

    public void zza(long l, PendingIntent pendingintent)
        throws RemoteException
    {
        zzlW();
        zzv.zzr(pendingintent);
        boolean flag;
        if(l >= 0L)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "detectionIntervalMillis must be >= 0");
        ((zzg)zzlX()).zza(l, true, pendingintent);
    }

    public void zza(PendingIntent pendingintent)
        throws RemoteException
    {
        zzlW();
        zzv.zzr(pendingintent);
        ((zzg)zzlX()).zza(pendingintent);
    }

    public void zza(PendingIntent pendingintent, com.google.android.gms.location.zze.zzb zzb1)
        throws RemoteException
    {
        zzlW();
        zzv.zzb(pendingintent, "PendingIntent must be specified.");
        zzv.zzb(zzb1, "OnRemoveGeofencesResultListener not provided.");
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new zzb(zzb1, this);
        ((zzg)zzlX()).zza(pendingintent, zzb1, getContext().getPackageName());
    }

    public void zza(GeofencingRequest geofencingrequest, PendingIntent pendingintent, com.google.android.gms.location.zze.zza zza1)
        throws RemoteException
    {
        zzlW();
        zzv.zzb(geofencingrequest, "geofencingRequest can't be null.");
        zzv.zzb(pendingintent, "PendingIntent must be specified.");
        zzv.zzb(zza1, "OnAddGeofencesResultListener not provided.");
        if(zza1 == null)
            zza1 = null;
        else
            zza1 = new zzb(zza1, this);
        ((zzg)zzlX()).zza(geofencingrequest, pendingintent, zza1);
    }

    public void zza(LocationCallback locationcallback)
        throws RemoteException
    {
        zzara.zza(locationcallback);
    }

    public void zza(LocationListener locationlistener)
        throws RemoteException
    {
        zzara.zza(locationlistener);
    }

    public void zza(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
        throws RemoteException
    {
        synchronized(zzara)
        {
            zzara.zza(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        zzi1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void zza(LocationSettingsRequest locationsettingsrequest, com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        boolean flag1 = true;
        zzlW();
        boolean flag;
        if(locationsettingsrequest != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "locationSettingsRequest can't be null nor empty.");
        if(zzb1 != null)
            flag = flag1;
        else
            flag = false;
        zzv.zzb(flag, "listener can't be null.");
        zzb1 = new zzd(zzb1);
        ((zzg)zzlX()).zza(locationsettingsrequest, zzb1, s);
    }

    public void zza(LocationRequestInternal locationrequestinternal, LocationCallback locationcallback, Looper looper)
        throws RemoteException
    {
        synchronized(zzara)
        {
            zzara.zza(locationrequestinternal, locationcallback, looper);
        }
        return;
        locationrequestinternal;
        zzi1;
        JVM INSTR monitorexit ;
        throw locationrequestinternal;
    }

    public void zza(List list, com.google.android.gms.location.zze.zzb zzb1)
        throws RemoteException
    {
        zzlW();
        String as[];
        boolean flag;
        if(list != null && list.size() > 0)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "geofenceRequestIds can't be null nor empty.");
        zzv.zzb(zzb1, "OnRemoveGeofencesResultListener not provided.");
        as = (String[])list.toArray(new String[0]);
        if(zzb1 == null)
            list = null;
        else
            list = new zzb(zzb1, this);
        ((zzg)zzlX()).zza(as, list, getContext().getPackageName());
    }

    public void zzb(Location location)
        throws RemoteException
    {
        zzara.zzb(location);
    }

    public void zzb(LocationRequest locationrequest, PendingIntent pendingintent)
        throws RemoteException
    {
        zzara.zzb(locationrequest, pendingintent);
    }

    public void zzd(PendingIntent pendingintent)
        throws RemoteException
    {
        zzara.zzd(pendingintent);
    }

    public boolean zzlZ()
    {
        return true;
    }

    public LocationAvailability zzsI()
    {
        return zzara.zzsI();
    }

    private final zzi zzara;
    private final com.google.android.gms.location.copresence.internal.zzb zzarb;
}
