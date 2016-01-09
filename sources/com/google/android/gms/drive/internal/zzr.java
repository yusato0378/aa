// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.Drive;

public abstract class zzr extends com.google.android.gms.common.api.zza.zza
{
    public static abstract class zza extends zzr
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzr(GoogleApiClient googleapiclient)
    {
        super(Drive.zzKh, googleapiclient);
    }
}
