// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.auth;

import android.content.Intent;

// Referenced classes of package com.google.android.gms.auth:
//            UserRecoverableAuthException

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException
{

    GooglePlayServicesAvailabilityException(int i, String s, Intent intent)
    {
        super(s, intent);
        zzKC = i;
    }

    public int getConnectionStatusCode()
    {
        return zzKC;
    }

    private final int zzKC;
}
