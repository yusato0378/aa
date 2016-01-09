// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.*;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzir, zzjy, zzjc

public class zzjt
    implements HistoryApi
{
    private static class zza extends zzix.zza
    {

        public void zza(DataReadResult datareadresult)
        {
            this;
            JVM INSTR monitorenter ;
            Log.v("Fitness", "Received batch result");
            if(zzaei != null)
                break MISSING_BLOCK_LABEL_62;
            zzaei = datareadresult;
_L2:
            zzaeh = zzaeh + 1;
            if(zzaeh == zzaei.zzpD())
                zzKq.zzj(zzaei);
            this;
            JVM INSTR monitorexit ;
            return;
            zzaei.zzb(datareadresult);
            if(true) goto _L2; else goto _L1
_L1:
            datareadresult;
            this;
            JVM INSTR monitorexit ;
            throw datareadresult;
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        private int zzaeh;
        private DataReadResult zzaei;

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzaeh = 0;
            zzaei = null;
            zzKq = zzb;
        }

    }


    public zzjt()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, DataSet dataset, boolean flag)
    {
        zzv.zzb(dataset, "Must set the data set");
        boolean flag1;
        if(!dataset.getDataPoints().isEmpty())
            flag1 = true;
        else
            flag1 = false;
        zzv.zza(flag1, "Cannot use an empty data set");
        zzv.zzb(dataset.getDataSource().zzoM(), "Must set the app package name for the data source");
        return googleapiclient.zza(new zzir.zzc(googleapiclient, dataset, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzir)zza1);
            }

            protected void zza(zzir zzir1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzir1.getContext().getPackageName();
                ((zzjc)zzir1.zzlX()).zza(new DataInsertRequest(zzaea, zzjy1, s, zzaeb));
            }

            final DataSet zzaea;
            final boolean zzaeb;
            final zzjt zzaec;

            
            {
                zzaec = zzjt.this;
                zzaea = dataset;
                zzaeb = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult deleteData(GoogleApiClient googleapiclient, DataDeleteRequest datadeleterequest)
    {
        return googleapiclient.zza(new zzir.zzc(googleapiclient, datadeleterequest) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzir)zza1);
            }

            protected void zza(zzir zzir1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzir1.getContext().getPackageName();
                ((zzjc)zzir1.zzlX()).zza(new DataDeleteRequest(zzaed, zzjy1, s));
            }

            final zzjt zzaec;
            final DataDeleteRequest zzaed;

            
            {
                zzaec = zzjt.this;
                zzaed = datadeleterequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult insertData(GoogleApiClient googleapiclient, DataSet dataset)
    {
        return zza(googleapiclient, dataset, false);
    }

    public PendingResult readDailyTotal(GoogleApiClient googleapiclient, DataType datatype)
    {
        return googleapiclient.zza(new zzir.zza(googleapiclient, datatype) {

            protected Result createFailedResult(Status status)
            {
                return zzx(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzir)zza1);
            }

            protected void zza(zzir zzir1)
                throws RemoteException
            {
                Object obj = new zziw.zza(this) {

                    public void zza(DailyTotalResult dailytotalresult)
                        throws RemoteException
                    {
                        zzaeg.setResult(dailytotalresult);
                    }

                    final _cls4 zzaeg;

            
            {
                zzaeg = _pcls4;
                super();
            }
                }
;
                String s = zzir1.getContext().getPackageName();
                obj = new DailyTotalRequest(((zziw) (obj)), zzaef, s);
                ((zzjc)zzir1.zzlX()).zza(((DailyTotalRequest) (obj)));
            }

            protected DailyTotalResult zzx(Status status)
            {
                return DailyTotalResult.zzD(status);
            }

            final zzjt zzaec;
            final DataType zzaef;

            
            {
                zzaec = zzjt.this;
                zzaef = datatype;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult readData(GoogleApiClient googleapiclient, DataReadRequest datareadrequest)
    {
        return googleapiclient.zza(new zzir.zza(googleapiclient, datareadrequest) {

            protected Result createFailedResult(Status status)
            {
                return zzw(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzir)zza1);
            }

            protected void zza(zzir zzir1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzir1.getContext().getPackageName();
                ((zzjc)zzir1.zzlX()).zza(new DataReadRequest(zzaee, zza1, s));
            }

            protected DataReadResult zzw(Status status)
            {
                return DataReadResult.zza(status, zzaee);
            }

            final zzjt zzaec;
            final DataReadRequest zzaee;

            
            {
                zzaec = zzjt.this;
                zzaee = datareadrequest;
                super(googleapiclient);
            }
        }
);
    }
}
