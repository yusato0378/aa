// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.*;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            zzip, zzjy, zzja

public class zzjr
    implements BleApi
{
    private static class zza extends zzka.zza
    {

        public void zza(BleDevicesResult bledevicesresult)
        {
            zzKq.zzj(bledevicesresult);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        private zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzKq = zzb;
        }

    }


    public zzjr()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return googleapiclient.zzb(new zzip.zzc(googleapiclient, bledevice) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new ClaimBleDeviceRequest(zzadW.getAddress(), zzadW, zzjy1, s));
            }

            final zzjr zzadT;
            final BleDevice zzadW;

            
            {
                zzadT = zzjr.this;
                zzadW = bledevice;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzip.zzc(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s1 = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new ClaimBleDeviceRequest(zzadV, null, zzjy1, s1));
            }

            final zzjr zzadT;
            final String zzadV;

            
            {
                zzadT = zzjr.this;
                zzadV = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzip.zza(googleapiclient) {

            protected Result createFailedResult(Status status)
            {
                return zzu(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zza zza1 = new zza(this);
                String s = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new ListClaimedBleDevicesRequest(zza1, s));
            }

            protected BleDevicesResult zzu(Status status)
            {
                return BleDevicesResult.zzC(status);
            }

            final zzjr zzadT;

            
            {
                zzadT = zzjr.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return googleapiclient.zza(new zzip.zzc(googleapiclient, startblescanrequest) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new StartBleScanRequest(zzadS, zzjy1, s));
            }

            final StartBleScanRequest zzadS;
            final zzjr zzadT;

            
            {
                zzadT = zzjr.this;
                zzadS = startblescanrequest;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return googleapiclient.zza(new zzip.zzc(googleapiclient, blescancallback) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new StopBleScanRequest(zzadU, zzjy1, s));
            }

            final zzjr zzadT;
            final BleScanCallback zzadU;

            
            {
                zzadT = zzjr.this;
                zzadU = blescancallback;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return unclaimBleDevice(googleapiclient, bledevice.getAddress());
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzip.zzc(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzip)zza1);
            }

            protected void zza(zzip zzip1)
                throws RemoteException
            {
                zzjy zzjy1 = new zzjy(this);
                String s1 = zzip1.getContext().getPackageName();
                ((zzja)zzip1.zzlX()).zza(new UnclaimBleDeviceRequest(zzadV, zzjy1, s1));
            }

            final zzjr zzadT;
            final String zzadV;

            
            {
                zzadT = zzjr.this;
                zzadV = s;
                super(googleapiclient);
            }
        }
);
    }
}
