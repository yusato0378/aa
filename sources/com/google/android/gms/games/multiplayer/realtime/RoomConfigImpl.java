// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RoomUpdateListener, RoomStatusUpdateListener, RealTimeMessageReceivedListener

public final class RoomConfigImpl extends RoomConfig
{

    RoomConfigImpl(RoomConfig.Builder builder)
    {
        zzanF = builder.zzanF;
        zzanG = builder.zzanG;
        zzanH = builder.zzanH;
        zzaif = builder.zzanI;
        zzanu = builder.zzanu;
        zzanK = builder.zzanK;
        int i = builder.zzanJ.size();
        zzanL = (String[])builder.zzanJ.toArray(new String[i]);
        zzv.zzb(zzanH, "Must specify a message listener");
    }

    public Bundle getAutoMatchCriteria()
    {
        return zzanK;
    }

    public String getInvitationId()
    {
        return zzaif;
    }

    public String[] getInvitedPlayerIds()
    {
        return zzanL;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener()
    {
        return zzanH;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener()
    {
        return zzanG;
    }

    public RoomUpdateListener getRoomUpdateListener()
    {
        return zzanF;
    }

    public int getVariant()
    {
        return zzanu;
    }

    private final String zzaif;
    private final RoomUpdateListener zzanF;
    private final RoomStatusUpdateListener zzanG;
    private final RealTimeMessageReceivedListener zzanH;
    private final Bundle zzanK;
    private final String zzanL[];
    private final int zzanu;
}
