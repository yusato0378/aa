// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEventRef, ExperienceEvent

public final class ExperienceEventBuffer extends AbstractDataBuffer
{

    public ExperienceEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object get(int i)
    {
        return zzfa(i);
    }

    public ExperienceEvent zzfa(int i)
    {
        return new ExperienceEventRef(zzPy, i);
    }
}
