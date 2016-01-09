// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.moments.zzc;

// Referenced classes of package com.google.android.gms.plus.model.moments:
//            Moment

public final class MomentBuffer extends AbstractDataBuffer
{

    public MomentBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Moment get(int i)
    {
        return new zzc(zzPy, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
