// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.common.api:
//            zzk, Result, Status, PendingResult, 
//            AbstractPendingResult

public final class PendingResults
{
    private static final class zza extends AbstractPendingResult
    {

        protected Result createFailedResult(Status status)
        {
            if(status.getStatusCode() != zzQS.getStatus().getStatusCode())
                throw new UnsupportedOperationException("Creating failed results is not supported");
            else
                return zzQS;
        }

        private final Result zzQS;

        public zza(Result result)
        {
            super(Looper.getMainLooper());
            zzQS = result;
        }
    }

    private static final class zzb extends AbstractPendingResult
    {

        protected Result createFailedResult(Status status)
        {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }

        public zzb()
        {
            super(Looper.getMainLooper());
        }
    }


    private PendingResults()
    {
    }

    public static PendingResult canceledPendingResult()
    {
        zzk zzk1 = new zzk(Looper.getMainLooper());
        zzk1.cancel();
        return zzk1;
    }

    public static PendingResult canceledPendingResult(Result result)
    {
        zzv.zzb(result, "Result must not be null");
        boolean flag;
        if(result.getStatus().getStatusCode() == 16)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "Status code must be CommonStatusCodes.CANCELED");
        result = new zza(result);
        result.cancel();
        return result;
    }

    public static PendingResult immediatePendingResult(Result result)
    {
        zzv.zzb(result, "Result must not be null");
        zzb zzb1 = new zzb();
        zzb1.setResult(result);
        return zzb1;
    }

    public static PendingResult immediatePendingResult(Status status)
    {
        zzv.zzb(status, "Result must not be null");
        zzk zzk1 = new zzk(Looper.getMainLooper());
        zzk1.setResult(status);
        return zzk1;
    }
}
