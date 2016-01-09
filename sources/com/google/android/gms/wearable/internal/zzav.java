// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.wearable.MessageApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzav
    implements MessageApi
{
    private static final class zza extends zzf
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzbk)zza1);
        }

        protected void zza(zzbk zzbk1)
            throws RemoteException
        {
            zzbk1.zza(this, zzaMs, zzaLX);
            zzaMs = null;
            zzaLX = null;
        }

        public Status zzb(Status status)
        {
            zzaMs = null;
            zzaLX = null;
            return status;
        }

        private IntentFilter zzaLX[];
        private com.google.android.gms.wearable.MessageApi.MessageListener zzaMs;

        private zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        {
            super(googleapiclient);
            zzaMs = messagelistener;
            zzaLX = aintentfilter;
        }

    }

    public static class zzb
        implements com.google.android.gms.wearable.MessageApi.SendMessageResult
    {

        public int getRequestId()
        {
            return zzVJ;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final int zzVJ;

        public zzb(Status status, int i)
        {
            zzKr = status;
            zzVJ = i;
        }
    }


    public zzav()
    {
    }

    private PendingResult zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
    {
        return googleapiclient.zza(new zza(googleapiclient, messagelistener, aintentfilter));
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return zza(googleapiclient, messagelistener, null);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.MessageApi.MessageListener messagelistener)
    {
        return googleapiclient.zza(new zzf(googleapiclient, messagelistener) {

            public Result createFailedResult(Status status)
            {
                return zzb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaMr);
            }

            public Status zzb(Status status)
            {
                return status;
            }

            final zzav zzaMq;
            final com.google.android.gms.wearable.MessageApi.MessageListener zzaMr;

            
            {
                zzaMq = zzav.this;
                zzaMr = messagelistener;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        return googleapiclient.zza(new zzf(googleapiclient, s, s1, abyte0) {

            protected Result createFailedResult(Status status)
            {
                return zzbb(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zza(this, zzaLu, zzaMp, zzKl);
            }

            protected com.google.android.gms.wearable.MessageApi.SendMessageResult zzbb(Status status)
            {
                return new zzb(status, -1);
            }

            final byte zzKl[];
            final String zzaLu;
            final String zzaMp;
            final zzav zzaMq;

            
            {
                zzaMq = zzav.this;
                zzaLu = s;
                zzaMp = s1;
                zzKl = abyte0;
                super(googleapiclient);
            }
        }
);
    }
}
