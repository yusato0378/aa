// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception
{

    public UserRecoverableException(String s, Intent intent)
    {
        super(s);
        mIntent = intent;
    }

    public Intent getIntent()
    {
        return new Intent(mIntent);
    }

    private final Intent mIntent;
}
