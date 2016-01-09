// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import java.util.concurrent.TimeUnit;

class zzjo
    implements PendingResult
{

    zzjo(Result result)
    {
        zzadQ = result;
    }

    public void addBatchCallback(com.google.android.gms.common.api.PendingResult.BatchCallback batchcallback)
    {
        batchcallback.zzl(zzadQ.getStatus());
    }

    public Result await()
    {
        return zzadQ;
    }

    public Result await(long l, TimeUnit timeunit)
    {
        return zzadQ;
    }

    public void cancel()
    {
    }

    public boolean isCanceled()
    {
        return false;
    }

    public void setResultCallback(ResultCallback resultcallback)
    {
        resultcallback.onResult(zzadQ);
    }

    public void setResultCallback(ResultCallback resultcallback, long l, TimeUnit timeunit)
    {
        resultcallback.onResult(zzadQ);
    }

    private final Result zzadQ;
}
