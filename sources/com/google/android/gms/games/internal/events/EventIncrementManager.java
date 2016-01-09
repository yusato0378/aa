// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.events;

import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.games.internal.events:
//            EventIncrementCache

public abstract class EventIncrementManager
{

    public EventIncrementManager()
    {
    }

    public void flush()
    {
        EventIncrementCache eventincrementcache = (EventIncrementCache)zzalN.get();
        if(eventincrementcache != null)
            eventincrementcache.flush();
    }

    public void zzo(String s, int i)
    {
        EventIncrementCache eventincrementcache1 = (EventIncrementCache)zzalN.get();
        EventIncrementCache eventincrementcache = eventincrementcache1;
        if(eventincrementcache1 == null)
        {
            EventIncrementCache eventincrementcache2 = zzrb();
            eventincrementcache = eventincrementcache2;
            if(!zzalN.compareAndSet(null, eventincrementcache2))
                eventincrementcache = (EventIncrementCache)zzalN.get();
        }
        eventincrementcache.zzv(s, i);
    }

    protected abstract EventIncrementCache zzrb();

    private final AtomicReference zzalN = new AtomicReference();
}
