// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzj, zzr

public final class zzm extends InputStream
{

    public zzm(InputStream inputstream)
    {
        zzaLK = (InputStream)zzv.zzr(inputstream);
    }

    private int zziI(int i)
        throws ChannelIOException
    {
        if(i == -1)
        {
            zzj zzj1 = zzaLL;
            if(zzj1 != null)
                throw new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj1.zzaLz, zzj1.zzaLA);
        }
        return i;
    }

    public int available()
        throws IOException
    {
        return zzaLK.available();
    }

    public void close()
        throws IOException
    {
        zzaLK.close();
    }

    public void mark(int i)
    {
        zzaLK.mark(i);
    }

    public boolean markSupported()
    {
        return zzaLK.markSupported();
    }

    public int read()
        throws IOException
    {
        return zziI(zzaLK.read());
    }

    public int read(byte abyte0[])
        throws IOException
    {
        return zziI(zzaLK.read(abyte0));
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return zziI(zzaLK.read(abyte0, i, j));
    }

    public void reset()
        throws IOException
    {
        zzaLK.reset();
    }

    public long skip(long l)
        throws IOException
    {
        return zzaLK.skip(l);
    }

    void zza(zzj zzj1)
    {
        zzaLL = (zzj)zzv.zzr(zzj1);
    }

    zzr zzzi()
    {
        return new zzr() {

            public void zzb(zzj zzj1)
            {
                zzaLM.zza(zzj1);
            }

            final zzm zzaLM;

            
            {
                zzaLM = zzm.this;
                super();
            }
        }
;
    }

    private final InputStream zzaLK;
    private volatile zzj zzaLL;
}
