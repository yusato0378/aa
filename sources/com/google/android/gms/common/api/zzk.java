// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.api;

import android.os.Looper;

// Referenced classes of package com.google.android.gms.common.api:
//            AbstractPendingResult, Status, Result

public class zzk extends AbstractPendingResult
{

    public zzk(Looper looper)
    {
        super(looper);
    }

    protected Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    protected Status zzb(Status status)
    {
        return status;
    }
}
