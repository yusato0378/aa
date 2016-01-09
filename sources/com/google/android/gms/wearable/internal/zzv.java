// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzv
    implements DataEvent
{

    public zzv(DataEvent dataevent)
    {
        zzMG = dataevent.getType();
        zzaLY = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return zzzj();
    }

    public DataItem getDataItem()
    {
        return zzaLY;
    }

    public int getType()
    {
        return zzMG;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataEvent zzzj()
    {
        return this;
    }

    private int zzMG;
    private DataItem zzaLY;
}
