// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.RecordingApi;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzit, zzje, zzjy

public class zzjv
    implements RecordingApi
{
    private static class zza extends zzjh.zza
    {

        public void zza(ListSubscriptionsResult listsubscriptionsresult)
        {
            zzKq.zzj(listsubscriptionsresult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzKq = zzb;
        }

    }


    public zzjv()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, Subscription subscription)
    {
        return googleapiclient.zza(new zzit.zzc(googleapiclient, subscription) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzit)zza1);
            }

            protected void zza(zzit zzit1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzit1.getContext().getPackageName();
                ((zzje)zzit1.zzlX()).zza(new SubscribeRequest(zzaek, false, zzjy1, s));
            }

            final zzjv zzaej;
            final Subscription zzaek;

            
            {
                zzaej = zzjv.this;
                zzaek = subscription;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzit.zza(googleapiclient) {

            protected Result createFailedResult(Status status)
            {
                return zzy(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzit)zza1);
            }

            protected void zza(zzit zzit1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzit1.getContext().getPackageName();
                ((zzje)zzit1.zzlX()).zza(new ListSubscriptionsRequest(null, zza1, s));
            }

            protected ListSubscriptionsResult zzy(Status status)
            {
                return ListSubscriptionsResult.zzG(status);
            }

            final zzjv zzaej;

            
            {
                zzaej = zzjv.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult listSubscriptions(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zza(new zzit.zza(googleapiclient, datatype) {

            protected Result createFailedResult(Status status)
            {
                return zzy(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzit)zza1);
            }

            protected void zza(zzit zzit1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzit1.getContext().getPackageName();
                ((zzje)zzit1.zzlX()).zza(new ListSubscriptionsRequest(zzaef, zza1, s));
            }

            protected ListSubscriptionsResult zzy(Status status)
            {
                return ListSubscriptionsResult.zzG(status);
            }

            final DataType zzaef;
            final zzjv zzaej;

            
            {
                zzaej = zzjv.this;
                zzaef = datatype;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzb(datasource).zzoY());
    }

    public PendingResult subscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return zza(googleapiclient, (new com.google.android.gms.fitness.data.Subscription.zza()).zzb(datatype).zzoY());
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataSource datasource)
    {
        return googleapiclient.zzb(new zzit.zzc(googleapiclient, datasource) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzit)zza1);
            }

            protected void zza(zzit zzit1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzit1.getContext().getPackageName();
                ((zzje)zzit1.zzlX()).zza(new UnsubscribeRequest(null, zzael, zzjy1, s));
            }

            final zzjv zzaej;
            final DataSource zzael;

            
            {
                zzaej = zzjv.this;
                zzael = datasource;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zzb(new zzit.zzc(googleapiclient, datatype) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzit)zza1);
            }

            protected void zza(zzit zzit1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzit1.getContext().getPackageName();
                ((zzje)zzit1.zzlX()).zza(new UnsubscribeRequest(zzaef, null, zzjy1, s));
            }

            final DataType zzaef;
            final zzjv zzaej;

            
            {
                zzaej = zzjv.this;
                zzaef = datatype;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult unsubscribe(GoogleApiClient googleapiclient, Subscription subscription)
    {
        if(subscription.getDataType() == null)
            return unsubscribe(googleapiclient, subscription.getDataSource());
        else
            return unsubscribe(googleapiclient, subscription.getDataType());
    }
}
