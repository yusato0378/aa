// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchBuffer

public final class LoadMatchesResponse
{

    public LoadMatchesResponse(Bundle bundle)
    {
        DataHolder dataholder = zza(bundle, 0);
        if(dataholder != null)
            zzanP = new InvitationBuffer(dataholder);
        else
            zzanP = null;
        dataholder = zza(bundle, 1);
        if(dataholder != null)
            zzanQ = new TurnBasedMatchBuffer(dataholder);
        else
            zzanQ = null;
        dataholder = zza(bundle, 2);
        if(dataholder != null)
            zzanR = new TurnBasedMatchBuffer(dataholder);
        else
            zzanR = null;
        bundle = zza(bundle, 3);
        if(bundle != null)
        {
            zzanS = new TurnBasedMatchBuffer(bundle);
            return;
        } else
        {
            zzanS = null;
            return;
        }
    }

    private static DataHolder zza(Bundle bundle, int i)
    {
        String s = TurnBasedMatchTurnStatus.zzeZ(i);
        if(!bundle.containsKey(s))
            return null;
        else
            return (DataHolder)bundle.getParcelable(s);
    }

    public void close()
    {
        release();
    }

    public TurnBasedMatchBuffer getCompletedMatches()
    {
        return zzanS;
    }

    public InvitationBuffer getInvitations()
    {
        return zzanP;
    }

    public TurnBasedMatchBuffer getMyTurnMatches()
    {
        return zzanQ;
    }

    public TurnBasedMatchBuffer getTheirTurnMatches()
    {
        return zzanR;
    }

    public boolean hasData()
    {
        while(zzanP != null && zzanP.getCount() > 0 || zzanQ != null && zzanQ.getCount() > 0 || zzanR != null && zzanR.getCount() > 0 || zzanS != null && zzanS.getCount() > 0) 
            return true;
        return false;
    }

    public void release()
    {
        if(zzanP != null)
            zzanP.release();
        if(zzanQ != null)
            zzanQ.release();
        if(zzanR != null)
            zzanR.release();
        if(zzanS != null)
            zzanS.release();
    }

    private final InvitationBuffer zzanP;
    private final TurnBasedMatchBuffer zzanQ;
    private final TurnBasedMatchBuffer zzanR;
    private final TurnBasedMatchBuffer zzanS;
}
