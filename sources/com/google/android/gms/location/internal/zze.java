// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zze
    implements GeofencingApi
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


    public zze()
    {
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, GeofencingRequest geofencingrequest, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, geofencingrequest, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                com.google.android.gms.location.zza zza1 = new com.google.android.gms.location.zza(this) {

                    public void zza(int i, String as[])
                    {
                        zzaqQ.setResult(LocationStatusCodes.zzfF(i));
                    }

                    final _cls1 zzaqQ;

            
            {
                zzaqQ = _pcls1;
                super();
            }
                }
;
                zzj1.zza(zzaqO, zzaeu, zza1);
            }

            final PendingIntent zzaeu;
            final GeofencingRequest zzaqO;
            final zze zzaqP;

            
            {
                zzaqP = zze.this;
                zzaqO = geofencingrequest;
                zzaeu = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent)
    {
        com.google.android.gms.location.GeofencingRequest.Builder builder = new com.google.android.gms.location.GeofencingRequest.Builder();
        builder.addGeofences(list);
        builder.setInitialTrigger(5);
        return addGeofences(googleapiclient, builder.build(), pendingintent);
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent)
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
                com.google.android.gms.location.zzb zzb = new com.google.android.gms.location.zzb(this) {

                    public void zza(int i, PendingIntent pendingintent)
                    {
                        zzaqR.setResult(LocationStatusCodes.zzfF(i));
                    }

                    public void zzb(int i, String as[])
                    {
                        Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
                    }

                    final _cls2 zzaqR;

            
            {
                zzaqR = _pcls2;
                super();
            }
                }
;
                zzj1.zza(zzaeu, zzb);
            }

            final PendingIntent zzaeu;
            final zze zzaqP;

            
            {
                zzaqP = zze.this;
                zzaeu = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeGeofences(GoogleApiClient googleapiclient, List list)
    {
        return googleapiclient.zzb(new zza(googleapiclient, list) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                com.google.android.gms.location.zzb zzb = new com.google.android.gms.location.zzb(this) {

                    public void zza(int i, PendingIntent pendingintent)
                    {
                        Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
                    }

                    public void zzb(int i, String as[])
                    {
                        zzaqT.setResult(LocationStatusCodes.zzfF(i));
                    }

                    final _cls3 zzaqT;

            
            {
                zzaqT = _pcls3;
                super();
            }
                }
;
                zzj1.zza(zzaqS, zzb);
            }

            final zze zzaqP;
            final List zzaqS;

            
            {
                zzaqP = zze.this;
                zzaqS = list;
                super(googleapiclient);
            }
        }
);
    }
}
