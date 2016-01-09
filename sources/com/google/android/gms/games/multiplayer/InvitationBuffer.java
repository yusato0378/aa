// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationRef, Invitation

public final class InvitationBuffer extends zzf
{

    public InvitationBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    protected Object zzh(int i, int j)
    {
        return zzn(i, j);
    }

    protected String zzlt()
    {
        return "external_invitation_id";
    }

    protected Invitation zzn(int i, int j)
    {
        return new InvitationRef(zzPy, i, j);
    }
}
