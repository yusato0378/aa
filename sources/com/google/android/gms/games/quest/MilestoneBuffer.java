// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.AbstractDataBuffer;

// Referenced classes of package com.google.android.gms.games.quest:
//            MilestoneRef, Milestone

public final class MilestoneBuffer extends AbstractDataBuffer
{

    public Milestone get(int i)
    {
        return new MilestoneRef(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
