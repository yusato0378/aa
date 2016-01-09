// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.*;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.service:
//            FitnessSensorServiceRequest

public abstract class FitnessSensorService extends Service
{
    private static class zza extends com.google.android.gms.fitness.internal.service.zzc.zza
    {

        public void zza(FitnessDataSourcesRequest fitnessdatasourcesrequest, zziy zziy1)
            throws RemoteException
        {
            zzafS.zzpK();
            zziy1.zza(new DataSourcesResult(zzafS.onFindDataSources(fitnessdatasourcesrequest.getDataTypes()), Status.zzQU));
        }

        public void zza(FitnessUnregistrationRequest fitnessunregistrationrequest, zzjm zzjm1)
            throws RemoteException
        {
            zzafS.zzpK();
            if(zzafS.onUnregister(fitnessunregistrationrequest.getDataSource()))
            {
                zzjm1.zzi(Status.zzQU);
                return;
            } else
            {
                zzjm1.zzi(new Status(13));
                return;
            }
        }

        public void zza(FitnessSensorServiceRequest fitnesssensorservicerequest, zzjm zzjm1)
            throws RemoteException
        {
            zzafS.zzpK();
            if(zzafS.onRegister(fitnesssensorservicerequest))
            {
                zzjm1.zzi(Status.zzQU);
                return;
            } else
            {
                zzjm1.zzi(new Status(13));
                return;
            }
        }

        private final FitnessSensorService zzafS;

        private zza(FitnessSensorService fitnesssensorservice)
        {
            zzafS = fitnesssensorservice;
        }

    }


    public FitnessSensorService()
    {
    }

    public final IBinder onBind(Intent intent)
    {
        if("com.google.android.gms.fitness.service.FitnessSensorService".equals(intent.getAction()))
        {
            if(Log.isLoggable("FitnessSensorService", 3))
                Log.d("FitnessSensorService", (new StringBuilder()).append("Intent ").append(intent).append(" received by ").append(getClass().getName()).toString());
            return zzafR.asBinder();
        } else
        {
            return null;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        zzafR = new zza(this);
    }

    public abstract List onFindDataSources(List list);

    public abstract boolean onRegister(FitnessSensorServiceRequest fitnesssensorservicerequest);

    public abstract boolean onUnregister(DataSource datasource);

    protected void zzpK()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if(!zzic.zznk()) goto _L2; else goto _L1
_L1:
        ((AppOpsManager)getSystemService("appops")).checkPackage(i, "com.google.android.gms");
_L4:
        return;
_L2:
label0:
        {
            String as[] = getPackageManager().getPackagesForUid(i);
            if(as == null)
                break label0;
            int j = as.length;
            i = 0;
            do
            {
                if(i >= j)
                    break label0;
                if(as[i].equals("com.google.android.gms"))
                    break;
                i++;
            } while(true);
        }
        if(true) goto _L4; else goto _L3
_L3:
        throw new SecurityException("Unauthorized caller");
    }

    public static final String SERVICE_INTERFACE = "com.google.android.gms.fitness.service.FitnessSensorService";
    private zza zzafR;
}
