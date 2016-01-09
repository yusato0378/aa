// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafetyNetApi;

// Referenced classes of package com.google.android.gms.internal:
//            zzlr, zzls, zzlq, zzlv

public class zzlu
    implements SafetyNetApi
{
    static class zza
        implements com.google.android.gms.safetynet.SafetyNetApi.AttestationResult
    {

        public String getJwsResult()
        {
            if(zzaBo == null)
                return null;
            else
                return zzaBo.getJwsResult();
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final AttestationData zzaBo;

        public zza(Status status, AttestationData attestationdata)
        {
            zzKr = status;
            zzaBo = attestationdata;
        }
    }

    static abstract class zzb extends zzlr
    {

        protected Result createFailedResult(Status status)
        {
            return zzaL(status);
        }

        protected com.google.android.gms.safetynet.SafetyNetApi.AttestationResult zzaL(Status status)
        {
            return new zza(status, null);
        }

        protected zzls zzaBp;

        public zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzaBp = new _cls1(this);
        }
    }


    public zzlu()
    {
    }

    public PendingResult attest(GoogleApiClient googleapiclient, byte abyte0[])
    {
        return googleapiclient.zza(new zzb(googleapiclient, abyte0) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzlv)zza1);
            }

            protected void zza(zzlv zzlv1)
                throws RemoteException
            {
                zzlv1.zza(zzaBp, zzaBm);
            }

            final byte zzaBm[];
            final zzlu zzaBn;

            
            {
                zzaBn = zzlu.this;
                zzaBm = abyte0;
                super(googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/internal/zzlu$zzb$1

/* anonymous class */
    class zzb._cls1 extends zzlq
    {

        public void zza(Status status, AttestationData attestationdata)
        {
            zzaBq.setResult(new zza(status, attestationdata));
        }

        final zzb zzaBq;

            
            {
                zzaBq = zzb1;
                super();
            }
    }

}
