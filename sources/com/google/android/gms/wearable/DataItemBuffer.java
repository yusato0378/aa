// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzac;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem

public class DataItemBuffer extends zzf
    implements Result
{

    public DataItemBuffer(DataHolder dataholder)
    {
        super(dataholder);
        zzKr = new Status(dataholder.getStatusCode());
    }

    public Status getStatus()
    {
        return zzKr;
    }

    protected Object zzh(int i, int j)
    {
        return zzu(i, j);
    }

    protected String zzlt()
    {
        return "path";
    }

    protected DataItem zzu(int i, int j)
    {
        return new zzac(zzPy, i, j);
    }

    private final Status zzKr;
}
