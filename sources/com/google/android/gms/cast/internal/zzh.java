// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzb

public abstract class zzh extends zzb
{

    public zzh(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    public Result createFailedResult(Status status)
    {
        return zzb(status);
    }

    public Status zzb(Status status)
    {
        return status;
    }
}
