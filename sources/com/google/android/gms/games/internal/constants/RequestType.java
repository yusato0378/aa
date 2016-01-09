// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType
{

    private RequestType()
    {
    }

    public static String zzeZ(int i)
    {
        switch(i)
        {
        default:
            GamesLog.zzu("RequestType", (new StringBuilder()).append("Unknown request type: ").append(i).toString());
            return "UNKNOWN_TYPE";

        case 1: // '\001'
            return "GIFT";

        case 2: // '\002'
            return "WISH";
        }
    }
}
