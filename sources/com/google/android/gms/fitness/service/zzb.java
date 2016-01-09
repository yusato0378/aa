// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.zzj;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.service:
//            SensorEventDispatcher

class zzb
    implements SensorEventDispatcher
{

    zzb(zzj zzj1)
    {
        zzafl = (zzj)zzv.zzr(zzj1);
    }

    public void publish(DataPoint datapoint)
        throws RemoteException
    {
        datapoint.zzoI();
        zzafl.zzc(datapoint);
    }

    public void publish(List list)
        throws RemoteException
    {
        for(list = list.iterator(); list.hasNext(); publish((DataPoint)list.next()));
    }

    private final zzj zzafl;
}
