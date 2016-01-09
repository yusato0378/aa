// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;


public final class GooglePlayServicesNotAvailableException extends Exception
{

    public GooglePlayServicesNotAvailableException(int i)
    {
        errorCode = i;
    }

    public final int errorCode;
}
