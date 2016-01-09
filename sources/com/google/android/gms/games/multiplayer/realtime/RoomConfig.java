// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomUpdateListener, RealTimeMessageReceivedListener, RoomStatusUpdateListener, RoomConfigImpl

public abstract class RoomConfig
{
    public static final class Builder
    {

        public Builder addPlayersToInvite(ArrayList arraylist)
        {
            zzv.zzr(arraylist);
            zzanJ.addAll(arraylist);
            return this;
        }

        public transient Builder addPlayersToInvite(String as[])
        {
            zzv.zzr(as);
            zzanJ.addAll(Arrays.asList(as));
            return this;
        }

        public RoomConfig build()
        {
            return new RoomConfigImpl(this);
        }

        public Builder setAutoMatchCriteria(Bundle bundle)
        {
            zzanK = bundle;
            return this;
        }

        public Builder setInvitationIdToAccept(String s)
        {
            zzv.zzr(s);
            zzanI = s;
            return this;
        }

        public Builder setMessageReceivedListener(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            zzanH = realtimemessagereceivedlistener;
            return this;
        }

        public Builder setRoomStatusUpdateListener(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            zzanG = roomstatusupdatelistener;
            return this;
        }

        public Builder setVariant(int i)
        {
            boolean flag;
            if(i == -1 || i > 0)
                flag = true;
            else
                flag = false;
            zzv.zzb(flag, "Variant must be a positive integer or Room.ROOM_VARIANT_ANY");
            zzanu = i;
            return this;
        }

        final RoomUpdateListener zzanF;
        RoomStatusUpdateListener zzanG;
        RealTimeMessageReceivedListener zzanH;
        String zzanI;
        ArrayList zzanJ;
        Bundle zzanK;
        int zzanu;

        private Builder(RoomUpdateListener roomupdatelistener)
        {
            zzanI = null;
            zzanu = -1;
            zzanJ = new ArrayList();
            zzanF = (RoomUpdateListener)zzv.zzb(roomupdatelistener, "Must provide a RoomUpdateListener");
        }

    }


    protected RoomConfig()
    {
    }

    public static Builder builder(RoomUpdateListener roomupdatelistener)
    {
        return new Builder(roomupdatelistener);
    }

    public static Bundle createAutoMatchCriteria(int i, int j, long l)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("min_automatch_players", i);
        bundle.putInt("max_automatch_players", j);
        bundle.putLong("exclusive_bit_mask", l);
        return bundle;
    }

    public abstract Bundle getAutoMatchCriteria();

    public abstract String getInvitationId();

    public abstract String[] getInvitedPlayerIds();

    public abstract RealTimeMessageReceivedListener getMessageReceivedListener();

    public abstract RoomStatusUpdateListener getRoomStatusUpdateListener();

    public abstract RoomUpdateListener getRoomUpdateListener();

    public abstract int getVariant();
}
