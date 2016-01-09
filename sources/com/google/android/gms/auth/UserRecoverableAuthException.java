// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//            GoogleAuthException

public class UserRecoverableAuthException extends GoogleAuthException
{

    public UserRecoverableAuthException(String s, Intent intent)
    {
        super(s);
        mIntent = intent;
    }

    public Intent getIntent()
    {
        if(mIntent == null)
            return null;
        else
            return new Intent(mIntent);
    }

    private final Intent mIntent;
}
