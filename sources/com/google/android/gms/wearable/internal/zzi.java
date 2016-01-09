// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzf, zzbk

public final class zzi
    implements ChannelApi
{
    static final class zza extends zzf
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
            zzbk1.zza(this, zzaLx, zzaLw);
            zzaLx = null;
        }

        public Status zzb(Status status)
        {
            zzaLx = null;
            return status;
        }

        private final String zzaLw;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaLx;

        zza(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaLx = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzv.zzr(channellistener);
            zzaLw = s;
        }
    }

    static final class zzb
        implements com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    {

        public Channel getChannel()
        {
            return zzaLy;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final Channel zzaLy;

        zzb(Status status, Channel channel)
        {
            zzKr = (Status)zzv.zzr(status);
            zzaLy = channel;
        }
    }

    static final class zzc extends zzf
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
            zzbk1.zzb(this, zzaLx, zzaLw);
            zzaLx = null;
        }

        public Status zzb(Status status)
        {
            zzaLx = null;
            return status;
        }

        private final String zzaLw;
        private com.google.android.gms.wearable.ChannelApi.ChannelListener zzaLx;

        zzc(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener, String s)
        {
            super(googleapiclient);
            zzaLx = (com.google.android.gms.wearable.ChannelApi.ChannelListener)zzv.zzr(channellistener);
            zzaLw = s;
        }
    }


    public zzi()
    {
    }

    public PendingResult addListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zza(googleapiclient, channellistener, null));
    }

    public PendingResult openChannel(GoogleApiClient googleapiclient, String s, String s1)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(s, "nodeId is null");
        zzv.zzb(s1, "path is null");
        return googleapiclient.zzb(new zzf(googleapiclient, s, s1) {

            public Result createFailedResult(Status status)
            {
                return zzaU(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzbk)zza1);
            }

            protected void zza(zzbk zzbk1)
                throws RemoteException
            {
                zzbk1.zze(this, zzaLu, zzoK);
            }

            public com.google.android.gms.wearable.ChannelApi.OpenChannelResult zzaU(Status status)
            {
                return new zzb(status, null);
            }

            final String zzaLu;
            final zzi zzaLv;
            final String zzoK;

            
            {
                zzaLv = zzi.this;
                zzaLu = s;
                zzoK = s1;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeListener(GoogleApiClient googleapiclient, com.google.android.gms.wearable.ChannelApi.ChannelListener channellistener)
    {
        zzv.zzb(googleapiclient, "client is null");
        zzv.zzb(channellistener, "listener is null");
        return googleapiclient.zza(new zzc(googleapiclient, channellistener, null));
    }
}
