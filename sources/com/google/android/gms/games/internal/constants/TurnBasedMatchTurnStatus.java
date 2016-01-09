// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class TurnBasedMatchTurnStatus
{

    public TurnBasedMatchTurnStatus()
    {
    }

    public static String zzeZ(int i)
    {
        switch(i)
        {
        default:
            GamesLog.zzu("MatchTurnStatus", (new StringBuilder()).append("Unknown match turn status: ").append(i).toString());
            return "TURN_STATUS_UNKNOWN";

        case 0: // '\0'
            return "TURN_STATUS_INVITED";

        case 1: // '\001'
            return "TURN_STATUS_MY_TURN";

        case 2: // '\002'
            return "TURN_STATUS_THEIR_TURN";

        case 3: // '\003'
            return "TURN_STATUS_COMPLETE";
        }
    }
}
