// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEX extends ByteArrayOutputStream
{

    public ByteArrayOutputStreamEX()
    {
    }

    public void write(String s)
    {
        if(s == null)
        {
            return;
        } else
        {
            super.write(s.getBytes(), 0, s.getBytes().length);
            return;
        }
    }

    public void write(byte abyte0[])
    {
        if(abyte0 == null)
        {
            return;
        } else
        {
            super.write(abyte0, 0, abyte0.length);
            return;
        }
    }
}
