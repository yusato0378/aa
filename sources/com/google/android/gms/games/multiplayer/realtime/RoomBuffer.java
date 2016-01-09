// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomRef, Room

public final class RoomBuffer extends zzf
{

    public RoomBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzo(i, j);
    }

    protected String zzlt()
    {
        return "external_match_id";
    }

    protected Room zzo(int i, int j)
    {
        return new RoomRef(zzPy, i, j);
    }
}
