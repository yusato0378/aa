// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.util.Base64;

public final class zzhr
{

    public static String zzg(byte abyte0[])
    {
        if(abyte0 == null)
            return null;
        else
            return Base64.encodeToString(abyte0, 0);
    }

    public static String zzh(byte abyte0[])
    {
        if(abyte0 == null)
            return null;
        else
            return Base64.encodeToString(abyte0, 10);
    }
}
