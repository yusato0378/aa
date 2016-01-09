// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.common.api:
//            Releasable, Result, Status

public abstract class zzc
    implements Releasable, Result
{

    protected zzc(DataHolder dataholder)
    {
        this(dataholder, new Status(dataholder.getStatusCode()));
    }

    protected zzc(DataHolder dataholder, Status status)
    {
        zzKr = status;
        zzPy = dataholder;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public void release()
    {
        if(zzPy != null)
            zzPy.close();
    }

    protected final Status zzKr;
    protected final DataHolder zzPy;
}
