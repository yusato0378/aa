// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.request;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.BleDevice;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.request:
//            BleScanCallback

public class com.google.android.gms.fitness.request.zza extends zzn.zza
{
    public static class zza
    {

        public static zza zzpd()
        {
            return zzaeD;
        }

        public com.google.android.gms.fitness.request.zza zza(BleScanCallback blescancallback)
        {
            Map map = zzaeE;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.zza zza2 = (com.google.android.gms.fitness.request.zza)zzaeE.get(blescancallback);
            com.google.android.gms.fitness.request.zza zza1;
            zza1 = zza2;
            if(zza2 != null)
                break MISSING_BLOCK_LABEL_51;
            zza1 = new com.google.android.gms.fitness.request.zza(blescancallback);
            zzaeE.put(blescancallback, zza1);
            map;
            JVM INSTR monitorexit ;
            return zza1;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }

        public com.google.android.gms.fitness.request.zza zzb(BleScanCallback blescancallback)
        {
            Map map = zzaeE;
            map;
            JVM INSTR monitorenter ;
            com.google.android.gms.fitness.request.zza zza1 = (com.google.android.gms.fitness.request.zza)zzaeE.get(blescancallback);
            if(zza1 == null)
                break MISSING_BLOCK_LABEL_29;
            map;
            JVM INSTR monitorexit ;
            return zza1;
            blescancallback = new com.google.android.gms.fitness.request.zza(blescancallback);
            map;
            JVM INSTR monitorexit ;
            return blescancallback;
            blescancallback;
            map;
            JVM INSTR monitorexit ;
            throw blescancallback;
        }

        private static final zza zzaeD = new zza();
        private final Map zzaeE = new HashMap();


        private zza()
        {
        }
    }


    private com.google.android.gms.fitness.request.zza(BleScanCallback blescancallback)
    {
        zzaeC = (BleScanCallback)zzv.zzr(blescancallback);
    }


    public void onDeviceFound(BleDevice bledevice)
        throws RemoteException
    {
        zzaeC.onDeviceFound(bledevice);
    }

    public void onScanStopped()
        throws RemoteException
    {
        zzaeC.onScanStopped();
    }

    private final BleScanCallback zzaeC;
}
