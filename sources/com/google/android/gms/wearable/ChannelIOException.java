// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable;

import java.io.IOException;

public class ChannelIOException extends IOException
{

    public ChannelIOException(String s, int i, int j)
    {
        super(s);
        zzaKA = i;
        zzaKB = j;
    }

    public int getAppSpecificErrorCode()
    {
        return zzaKB;
    }

    public int getCloseReason()
    {
        return zzaKA;
    }

    private final int zzaKA;
    private final int zzaKB;
}
