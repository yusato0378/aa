// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class zzaf
{

    public zzaf()
    {
        zzoe = new Object();
    }

    protected MessageDigest zzbE()
    {
        int i;
label0:
        {
            MessageDigest messagedigest;
            synchronized(zzoe)
            {
                if(zzpw == null)
                    break label0;
                messagedigest = zzpw;
            }
            return messagedigest;
        }
        i = 0;
_L3:
        if(i >= 2) goto _L2; else goto _L1
_L1:
        MessageDigest messagedigest1;
        try
        {
            zzpw = MessageDigest.getInstance("MD5");
        }
        catch(NoSuchAlgorithmException nosuchalgorithmexception) { }
        i++;
          goto _L3
_L2:
        messagedigest1 = zzpw;
        obj;
        JVM INSTR monitorexit ;
        return messagedigest1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    abstract byte[] zzn(String s);

    private static MessageDigest zzpw = null;
    protected Object zzoe;

}
