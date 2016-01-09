// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.internal.zzb;

// Referenced classes of package com.google.android.gms.location.places:
//            AutocompletePrediction

public class AutocompletePredictionBuffer extends AbstractDataBuffer
    implements Result
{

    public AutocompletePredictionBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public AutocompletePrediction get(int i)
    {
        return new zzb(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public Status getStatus()
    {
        return new Status(zzPy.getStatusCode());
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("status", getStatus()).toString();
    }
}
