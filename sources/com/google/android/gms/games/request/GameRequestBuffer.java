// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestRef, GameRequest

public final class GameRequestBuffer extends zzf
{

    public GameRequestBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzr(i, j);
    }

    protected String zzlt()
    {
        return "external_request_id";
    }

    protected GameRequest zzr(int i, int j)
    {
        return new GameRequestRef(zzPy, i, j);
    }
}
