// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//            zziq, zzjb, zzjy

public class zzjs
    implements ConfigApi
{
    private static class zza extends zziz.zza
    {

        public void zza(DataTypeResult datatyperesult)
        {
            zzKq.zzj(datatyperesult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzKq = zzb;
        }

    }


    public zzjs()
    {
    }

    public PendingResult createCustomDataType(GoogleApiClient googleapiclient, DataTypeCreateRequest datatypecreaterequest)
    {
        return googleapiclient.zzb(new zziq.zza(googleapiclient, datatypecreaterequest) {

            protected Result createFailedResult(Status status)
            {
                return zzv(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziq)zza1);
            }

            protected void zza(zziq zziq1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zziq1.getContext().getPackageName();
                ((zzjb)zziq1.zzlX()).zza(new DataTypeCreateRequest(zzadX, zza1, s));
            }

            protected DataTypeResult zzv(Status status)
            {
                return DataTypeResult.zzF(status);
            }

            final DataTypeCreateRequest zzadX;
            final zzjs zzadY;

            
            {
                zzadY = zzjs.this;
                zzadX = datatypecreaterequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult disableFit(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zziq.zzc(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziq)zza1);
            }

            protected void zza(zziq zziq1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zziq1.getContext().getPackageName();
                ((zzjb)zziq1.zzlX()).zza(new DisableFitRequest(zzjy1, s));
            }

            final zzjs zzadY;

            
            {
                zzadY = zzjs.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult readDataType(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zziq.zza(googleapiclient, s) {

            protected Result createFailedResult(Status status)
            {
                return zzv(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zziq)zza1);
            }

            protected void zza(zziq zziq1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s1 = zziq1.getContext().getPackageName();
                ((zzjb)zziq1.zzlX()).zza(new DataTypeReadRequest(zzadZ, zza1, s1));
            }

            protected DataTypeResult zzv(Status status)
            {
                return DataTypeResult.zzF(status);
            }

            final zzjs zzadY;
            final String zzadZ;

            
            {
                zzadY = zzjs.this;
                zzadZ = s;
                super(googleapiclient);
            }
        }
);
    }
}
