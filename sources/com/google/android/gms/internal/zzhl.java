// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzhi

abstract class zzhl extends com.google.android.gms.common.api.zza.zza
{
    static abstract class zza extends zzhl
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzhl(GoogleApiClient googleapiclient)
    {
        super(zzhi.zzKh, googleapiclient);
    }
}
