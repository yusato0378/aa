// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.event;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.event:
//            EventRef, Event

public final class EventBuffer extends AbstractDataBuffer
{

    public EventBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Event get(int i)
    {
        return new EventRef(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
