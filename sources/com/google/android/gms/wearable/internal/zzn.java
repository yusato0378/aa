// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.ChannelIOException;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzj, zzr

public final class zzn extends OutputStream
{

    public zzn(OutputStream outputstream)
    {
        zzaLN = (OutputStream)zzv.zzr(outputstream);
    }

    private IOException zza(IOException ioexception)
    {
        zzj zzj1 = zzaLL;
        Object obj = ioexception;
        if(zzj1 != null)
        {
            if(Log.isLoggable("ChannelOutputStream", 2))
                Log.v("ChannelOutputStream", "Caught IOException, but channel has been closed. Translating to ChannelIOException.", ioexception);
            obj = new ChannelIOException("Channel closed unexpectedly before stream was finished", zzj1.zzaLz, zzj1.zzaLA);
        }
        return ((IOException) (obj));
    }

    public void close()
        throws IOException
    {
        try
        {
            zzaLN.close();
            return;
        }
        catch(IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void flush()
        throws IOException
    {
        try
        {
            zzaLN.flush();
            return;
        }
        catch(IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void write(int i)
        throws IOException
    {
        try
        {
            zzaLN.write(i);
            return;
        }
        catch(IOException ioexception)
        {
            throw zza(ioexception);
        }
    }

    public void write(byte abyte0[])
        throws IOException
    {
        try
        {
            zzaLN.write(abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            throw zza(abyte0);
        }
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        try
        {
            zzaLN.write(abyte0, i, j);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            throw zza(abyte0);
        }
    }

    void zzc(zzj zzj1)
    {
        zzaLL = zzj1;
    }

    zzr zzzi()
    {
        return new zzr() {

            public void zzb(zzj zzj1)
            {
                zzaLO.zzc(zzj1);
            }

            final zzn zzaLO;

            
            {
                zzaLO = zzn.this;
                super();
            }
        }
;
    }

    private volatile zzj zzaLL;
    private final OutputStream zzaLN;
}
