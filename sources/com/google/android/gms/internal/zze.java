// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.util.Base64;

// Referenced classes of package com.google.android.gms.internal:
//            zzm

class zze
    implements zzm
{

    zze()
    {
    }

    public String zza(byte abyte0[], boolean flag)
    {
        byte byte0;
        if(flag)
            byte0 = 11;
        else
            byte0 = 2;
        return Base64.encodeToString(abyte0, byte0);
    }

    public byte[] zza(String s, boolean flag)
        throws IllegalArgumentException
    {
        byte byte0;
        if(flag)
            byte0 = 11;
        else
            byte0 = 2;
        return Base64.decode(s, byte0);
    }
}
