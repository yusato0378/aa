// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.constants;


public final class PlatformType
{

    private PlatformType()
    {
    }

    public static String zzeZ(int i)
    {
        switch(i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown platform type: ").append(i).toString());

        case 0: // '\0'
            return "ANDROID";

        case 1: // '\001'
            return "IOS";

        case 2: // '\002'
            return "WEB_APP";
        }
    }
}
