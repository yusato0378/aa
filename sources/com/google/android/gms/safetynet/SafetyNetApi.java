// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.safetynet;

import com.google.android.gms.common.api.*;

public interface SafetyNetApi
{
    public static interface AttestationResult
        extends Result
    {

        public abstract String getJwsResult();
    }


    public abstract PendingResult attest(GoogleApiClient googleapiclient, byte abyte0[]);
}
