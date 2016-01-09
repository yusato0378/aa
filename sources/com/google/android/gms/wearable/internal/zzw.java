// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzac, zzv

public final class zzw extends zzc
    implements DataEvent
{

    public zzw(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzahA = j;
    }

    public Object freeze()
    {
        return zzzj();
    }

    public DataItem getDataItem()
    {
        return new zzac(zzPy, zzRw, zzahA);
    }

    public int getType()
    {
        return getInteger("event_type");
    }

    public DataEvent zzzj()
    {
        return new zzv(this);
    }

    private final int zzahA;
}
