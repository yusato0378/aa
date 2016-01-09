// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.data;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.request.OnDataPointListener;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.fitness.data:
//            DataPoint

public class zzk extends zzj.zza
{
    public static class zza
    {

        public static zza zzoS()
        {
            return zzady;
        }

        public zzk zza(OnDataPointListener ondatapointlistener)
        {
            Map map = zzadz;
            map;
            JVM INSTR monitorenter ;
            zzk zzk2 = (zzk)zzadz.get(ondatapointlistener);
            zzk zzk1;
            zzk1 = zzk2;
            if(zzk2 != null)
                break MISSING_BLOCK_LABEL_51;
            zzk1 = new zzk(ondatapointlistener);
            zzadz.put(ondatapointlistener, zzk1);
            map;
            JVM INSTR monitorexit ;
            return zzk1;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        public zzk zzb(OnDataPointListener ondatapointlistener)
        {
            synchronized(zzadz)
            {
                ondatapointlistener = (zzk)zzadz.get(ondatapointlistener);
            }
            return ondatapointlistener;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        public zzk zzc(OnDataPointListener ondatapointlistener)
        {
            Map map = zzadz;
            map;
            JVM INSTR monitorenter ;
            zzk zzk1 = (zzk)zzadz.remove(ondatapointlistener);
            if(zzk1 == null)
                break MISSING_BLOCK_LABEL_29;
            map;
            JVM INSTR monitorexit ;
            return zzk1;
            ondatapointlistener = new zzk(ondatapointlistener);
            map;
            JVM INSTR monitorexit ;
            return ondatapointlistener;
            ondatapointlistener;
            map;
            JVM INSTR monitorexit ;
            throw ondatapointlistener;
        }

        private static final zza zzady = new zza();
        private final Map zzadz = new HashMap();


        private zza()
        {
        }
    }


    private zzk(OnDataPointListener ondatapointlistener)
    {
        zzadx = (OnDataPointListener)zzv.zzr(ondatapointlistener);
    }


    public void zzc(DataPoint datapoint)
        throws RemoteException
    {
        zzadx.onDataPoint(datapoint);
    }

    private final OnDataPointListener zzadx;
}
