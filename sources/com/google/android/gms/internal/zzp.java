// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzn, zznr

class zzp
    implements zzn
{

    public zzp(int i)
    {
        zzlV = i;
        reset();
    }

    public void reset()
    {
        zzlU = new byte[zzlV];
        zzlT = zznr.zzw(zzlU);
    }

    public byte[] zzD()
        throws IOException
    {
        int i = zzlT.zzzN();
        if(i < 0)
            throw new IOException();
        if(i == 0)
        {
            return zzlU;
        } else
        {
            byte abyte0[] = new byte[zzlU.length - i];
            System.arraycopy(zzlU, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zzlT.zzb(i, l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zzlT.zzb(i, s);
    }

    private zznr zzlT;
    private byte zzlU[];
    private final int zzlV;
}
