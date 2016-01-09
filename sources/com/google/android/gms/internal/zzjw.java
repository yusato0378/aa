// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.zzj;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DataSourcesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzjo, zziu, zzjf, zzjy

public class zzjw
    implements SensorsApi
{
    private static interface zza
    {

        public abstract void zzpc();
    }

    private static class zzb extends zziy.zza
    {

        public void zza(DataSourcesResult datasourcesresult)
        {
            zzKq.zzj(datasourcesresult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }

    }

    private static class zzc extends zzjm.zza
    {

        public void zzi(Status status)
        {
            if(zzaev != null && status.isSuccess())
                zzaev.zzpc();
            zzKq.zzj(status);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        private final zza zzaev;

        private zzc(com.google.android.gms.common.api.zza.zzb zzb1, zza zza1)
        {
            zzKq = zzb1;
            zzaev = zza1;
        }

    }


    public zzjw()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, zzj zzj, PendingIntent pendingintent, zza zza1)
    {
        return googleapiclient.zzb(new zziu.zzc(googleapiclient, zza1, zzj, pendingintent) {

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza2)
                throws RemoteException
            {
                zza((zziu)zza2);
            }

            protected void zza(zziu zziu1)
                throws RemoteException
            {
                zzc zzc1 = new zzc(this, zzaes);
                String s = zziu1.getContext().getPackageName();
                ((zzjf)zziu1.zzlX()).zza(new SensorUnregistrationRequest(zzaet, zzaeu, zzc1, s));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            final zzjw zzaen;
            final zza zzaes;
            final zzj zzaet;
            final PendingIntent zzaeu;

            
            {
                zzaen = zzjw.this;
                zzaes = zza1;
                zzaet = zzj;
                zzaeu = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, SensorRequest sensorrequest, zzj zzj, PendingIntent pendingintent)
    {
        return googleapiclient.zza(new zziu.zzc(googleapiclient, sensorrequest, zzj, pendingintent) {

            protected Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziu)zza1);
            }

            protected void zza(zziu zziu1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziu1.getContext().getPackageName();
                ((zzjf)zziu1.zzlX()).zza(new SensorRegistrationRequest(zzaeo, zzaep, zzaeq, zzjy1, s));
            }

            protected Status zzb(Status status)
            {
                return status;
            }

            final zzjw zzaen;
            final SensorRequest zzaeo;
            final zzj zzaep;
            final PendingIntent zzaeq;

            
            {
                zzaen = zzjw.this;
                zzaeo = sensorrequest;
                zzaep = zzj;
                zzaeq = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, PendingIntent pendingintent)
    {
        return zza(googleapiclient, sensorrequest, ((zzj) (null)), pendingintent);
    }

    public PendingResult add(GoogleApiClient googleapiclient, SensorRequest sensorrequest, OnDataPointListener ondatapointlistener)
    {
        return zza(googleapiclient, sensorrequest, com.google.android.gms.fitness.data.zzk.zza.zzoS().zza(ondatapointlistener), ((PendingIntent) (null)));
    }

    public PendingResult findDataSources(GoogleApiClient googleapiclient, DataSourcesRequest datasourcesrequest)
    {
        return googleapiclient.zza(new zziu.zza(googleapiclient, datasourcesrequest) {

            protected Result createFailedResult(Status status)
            {
                return zzz(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziu)zza1);
            }

            protected void zza(zziu zziu1)
                throws RemoteException
            {
                zzb zzb1 = new zzb(this);
                String s = zziu1.getContext().getPackageName();
                ((zzjf)zziu1.zzlX()).zza(new DataSourcesRequest(zzaem, zzb1, s));
            }

            protected DataSourcesResult zzz(Status status)
            {
                return DataSourcesResult.zzE(status);
            }

            final DataSourcesRequest zzaem;
            final zzjw zzaen;

            
            {
                zzaen = zzjw.this;
                zzaem = datasourcesrequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult remove(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return zza(googleapiclient, ((zzj) (null)), pendingintent, ((zza) (null)));
    }

    public PendingResult remove(GoogleApiClient googleapiclient, OnDataPointListener ondatapointlistener)
    {
        com.google.android.gms.fitness.data.zzk zzk = com.google.android.gms.fitness.data.zzk.zza.zzoS().zzb(ondatapointlistener);
        if(zzk == null)
            return new zzjo(Status.zzQU);
        else
            return zza(googleapiclient, zzk, ((PendingIntent) (null)), new zza(ondatapointlistener) {

                public void zzpc()
                {
                    com.google.android.gms.fitness.data.zzk.zza.zzoS().zzc(zzaer);
                }

                final zzjw zzaen;
                final OnDataPointListener zzaer;

            
            {
                zzaen = zzjw.this;
                zzaer = ondatapointlistener;
                super();
            }
            }
);
    }
}
