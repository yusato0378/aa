// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj, LocationRequestInternal

public class zzd
    implements FusedLocationProviderApi
{
    private static abstract class zza extends com.google.android.gms.location.LocationServices.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzd()
    {
    }

    public Location getLastLocation(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.zze(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.getLastLocation();
        }
        // Misplaced declaration of an exception variable
        catch(GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public LocationAvailability getLocationAvailability(GoogleApiClient googleapiclient)
    {
        googleapiclient = LocationServices.zze(googleapiclient);
        try
        {
            googleapiclient = googleapiclient.zzsI();
        }
        // Misplaced declaration of an exception variable
        catch(GoogleApiClient googleapiclient)
        {
            return null;
        }
        return googleapiclient;
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzd(zzaqD);
                setResult(Status.zzQU);
            }

            final PendingIntent zzaqD;
            final zzd zzaqJ;

            
            {
                zzaqJ = zzd.this;
                zzaqD = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationCallback locationcallback)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationcallback) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqN);
                setResult(Status.zzQU);
            }

            final zzd zzaqJ;
            final LocationCallback zzaqN;

            
            {
                zzaqJ = zzd.this;
                zzaqN = locationcallback;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeLocationUpdates(GoogleApiClient googleapiclient, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationlistener) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqI);
                setResult(Status.zzQU);
            }

            final LocationListener zzaqI;
            final zzd zzaqJ;

            
            {
                zzaqJ = zzd.this;
                zzaqI = locationlistener;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzaqH, zzaqD);
                setResult(Status.zzQU);
            }

            final PendingIntent zzaqD;
            final LocationRequest zzaqH;
            final zzd zzaqJ;

            
            {
                zzaqJ = zzd.this;
                zzaqH = locationrequest;
                zzaqD = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationCallback locationcallback, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationcallback, looper) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(LocationRequestInternal.zzb(zzaqH), zzaqN, zzaqM);
                setResult(Status.zzQU);
            }

            final LocationRequest zzaqH;
            final zzd zzaqJ;
            final Looper zzaqM;
            final LocationCallback zzaqN;

            
            {
                zzaqJ = zzd.this;
                zzaqH = locationrequest;
                zzaqN = locationcallback;
                zzaqM = looper;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqH, zzaqI, null);
                setResult(Status.zzQU);
            }

            final LocationRequest zzaqH;
            final LocationListener zzaqI;
            final zzd zzaqJ;

            
            {
                zzaqJ = zzd.this;
                zzaqH = locationrequest;
                zzaqI = locationlistener;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestLocationUpdates(GoogleApiClient googleapiclient, LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        return googleapiclient.zzb(new zza(googleapiclient, locationrequest, locationlistener, looper) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqH, zzaqI, zzaqM);
                setResult(Status.zzQU);
            }

            final LocationRequest zzaqH;
            final LocationListener zzaqI;
            final zzd zzaqJ;
            final Looper zzaqM;

            
            {
                zzaqJ = zzd.this;
                zzaqH = locationrequest;
                zzaqI = locationlistener;
                zzaqM = looper;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult setMockLocation(GoogleApiClient googleapiclient, Location location)
    {
        return googleapiclient.zzb(new zza(googleapiclient, location) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzb(zzaqL);
                setResult(Status.zzQU);
            }

            final zzd zzaqJ;
            final Location zzaqL;

            
            {
                zzaqJ = zzd.this;
                zzaqL = location;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult setMockMode(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zzb(new zza(googleapiclient, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zzX(zzaqK);
                setResult(Status.zzQU);
            }

            final zzd zzaqJ;
            final boolean zzaqK;

            
            {
                zzaqJ = zzd.this;
                zzaqK = flag;
                super(googleapiclient);
            }
        }
);
    }
}
