// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.maps.internal;


public final class zza
{

    public static Boolean zza(byte byte0)
    {
        switch(byte0)
        {
        default:
            return null;

        case 1: // '\001'
            return Boolean.TRUE;

        case 0: // '\0'
            return Boolean.FALSE;
        }
    }

    public static byte zzd(Boolean boolean1)
    {
        if(boolean1 != null)
            return ((byte)(!boolean1.booleanValue() ? 0 : 1));
        else
            return -1;
    }
}
