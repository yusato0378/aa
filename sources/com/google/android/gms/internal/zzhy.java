// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import java.io.*;

public final class zzhy
{

    public static long zza(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        return zza(inputstream, outputstream, false);
    }

    public static long zza(InputStream inputstream, OutputStream outputstream, boolean flag)
        throws IOException
    {
        return zza(inputstream, outputstream, flag, 1024);
    }

    public static long zza(InputStream inputstream, OutputStream outputstream, boolean flag, int i)
        throws IOException
    {
        byte abyte0[];
        long l;
        abyte0 = new byte[i];
        l = 0L;
_L1:
        i = inputstream.read(abyte0, 0, abyte0.length);
        if(i == -1)
            break MISSING_BLOCK_LABEL_59;
        l += i;
        outputstream.write(abyte0, 0, i);
          goto _L1
        Exception exception;
        exception;
        if(flag)
        {
            zzb(inputstream);
            zzb(outputstream);
        }
        throw exception;
        if(flag)
        {
            zzb(inputstream);
            zzb(outputstream);
        }
        return l;
    }

    public static void zza(ParcelFileDescriptor parcelfiledescriptor)
    {
        if(parcelfiledescriptor == null)
            break MISSING_BLOCK_LABEL_8;
        parcelfiledescriptor.close();
        return;
        parcelfiledescriptor;
    }

    public static byte[] zza(InputStream inputstream, boolean flag)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zza(inputstream, ((OutputStream) (bytearrayoutputstream)), flag);
        return bytearrayoutputstream.toByteArray();
    }

    public static void zzb(Closeable closeable)
    {
        if(closeable == null)
            break MISSING_BLOCK_LABEL_10;
        closeable.close();
        return;
        closeable;
    }

    public static byte[] zzd(InputStream inputstream)
        throws IOException
    {
        return zza(inputstream, true);
    }
}
