// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participatable, Participant

public interface Invitation
    extends Parcelable, Freezable, Participatable
{

    public abstract int getAvailableAutoMatchSlots();

    public abstract long getCreationTimestamp();

    public abstract Game getGame();

    public abstract String getInvitationId();

    public abstract int getInvitationType();

    public abstract Participant getInviter();

    public abstract int getVariant();

    public static final int INVITATION_TYPE_REAL_TIME = 0;
    public static final int INVITATION_TYPE_TURN_BASED = 1;
}
