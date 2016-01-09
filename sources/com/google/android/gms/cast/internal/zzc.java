// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzd

public abstract class zzc extends zzd
{
    private class zza
        implements Runnable
    {

        public void run()
        {
            zzNu.zzNt = false;
            long l = SystemClock.elapsedRealtime();
            boolean flag = zzNu.zzx(l);
            zzNu.zzM(flag);
        }

        final zzc zzNu;

        private zza()
        {
            zzNu = zzc.this;
            super();
        }

    }


    public zzc(String s, String s1, String s2, long l)
    {
        super(s, s1, s2);
        zzNr = l;
        zzM(false);
    }

    protected final void zzM(boolean flag)
    {
label0:
        {
            if(zzNt != flag)
            {
                zzNt = flag;
                if(!flag)
                    break label0;
                mHandler.postDelayed(zzNs, zzNr);
            }
            return;
        }
        mHandler.removeCallbacks(zzNs);
    }

    public void zzjW()
    {
        zzM(false);
    }

    protected abstract boolean zzx(long l);

    protected final Handler mHandler = new Handler(Looper.getMainLooper());
    protected final long zzNr;
    protected final Runnable zzNs = new zza();
    protected boolean zzNt;
}
