// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.request;

import com.google.android.gms.common.data.AbstractDataBuffer;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestSummaryRef, GameRequestSummary

public final class GameRequestSummaryBuffer extends AbstractDataBuffer
{

    public Object get(int i)
    {
        return zzfp(i);
    }

    public GameRequestSummary zzfp(int i)
    {
        return new GameRequestSummaryRef(zzPy, i);
    }
}
