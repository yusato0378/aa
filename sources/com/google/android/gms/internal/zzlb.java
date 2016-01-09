// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.Connections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzla

public final class zzlb
    implements Connections
{
    private static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(zzlb.zzKh, googleapiclient);
        }
    }

    private static abstract class zzb extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzaF(status);
        }

        public com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult zzaF(Status status)
        {
            return new com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult(this, status) {

                public String getLocalEndpointName()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final zzb zzaxF;

            
            {
                zzaxF = zzb1;
                zzKj = status;
                super();
            }
            }
;
        }

        private zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class zzc extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public zzlb()
    {
    }

    public static zzla zzd(GoogleApiClient googleapiclient, boolean flag)
    {
        boolean flag1;
        if(googleapiclient != null)
            flag1 = true;
        else
            flag1 = false;
        zzv.zzb(flag1, "GoogleApiClient parameter is required.");
        zzv.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return zze(googleapiclient, flag);
    }

    public static zzla zze(GoogleApiClient googleapiclient, boolean flag)
    {
        zzv.zza(googleapiclient.zza(Nearby.CONNECTIONS_API), "GoogleApiClient is not configured to use the Nearby Connections Api. Pass Nearby.CONNECTIONS_API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean flag1 = googleapiclient.hasConnectedApi(Nearby.CONNECTIONS_API);
        if(flag && !flag1)
            throw new IllegalStateException("GoogleApiClient has an optional Nearby.CONNECTIONS_API and is not connected to Nearby Connections. Use GoogleApiClient.hasConnectedApi(Nearby.CONNECTIONS_API) to guard this call.");
        if(flag1)
            return (zzla)googleapiclient.zza(zzKh);
        else
            return null;
    }

    public PendingResult acceptConnectionRequest(GoogleApiClient googleapiclient, String s, byte abyte0[], com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s, abyte0, googleapiclient.zzl(messagelistener)) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzla)zza1);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                zzla1.zza(this, zzaxk, zzakV, zzaxE);
            }

            final byte zzakV[];
            final zzlb zzaxB;
            final zzi zzaxE;
            final String zzaxk;

            
            {
                zzaxB = zzlb.this;
                zzaxk = s;
                zzakV = abyte0;
                zzaxE = zzi;
                super(googleapiclient);
            }
        }
);
    }

    public void disconnectFromEndpoint(GoogleApiClient googleapiclient, String s)
    {
        zzd(googleapiclient, false).zzdk(s);
    }

    public String getLocalDeviceId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient, true).zzuV();
    }

    public String getLocalEndpointId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient, true).zzuU();
    }

    public PendingResult rejectConnectionRequest(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzla)zza1);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                zzla1.zzq(this, zzaxk);
            }

            final zzlb zzaxB;
            final String zzaxk;

            
            {
                zzaxB = zzlb.this;
                zzaxk = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult sendConnectionRequest(final GoogleApiClient final_googleapiclient, String s, String s1, byte abyte0[], com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionresponsecallback, com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
    {
        return final_googleapiclient.zzb(new zzc(s, s1, abyte0, final_googleapiclient.zzl(connectionresponsecallback), final_googleapiclient.zzl(messagelistener)) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzla)zza1);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                zzla1.zza(this, name, zzaxk, zzakV, zzaxD, zzaxE);
            }

            final String val$name;
            final byte zzakV[];
            final zzlb zzaxB;
            final zzi zzaxD;
            final zzi zzaxE;
            final String zzaxk;

            
            {
                zzaxB = zzlb.this;
                name = s;
                zzaxk = s1;
                zzakV = abyte0;
                zzaxD = zzi;
                zzaxE = zzi1;
                super(final_googleapiclient);
            }
        }
);
    }

    public void sendReliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[])
    {
        zzd(googleapiclient, false).zza(new String[] {
            s
        }, abyte0);
    }

    public void sendReliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[])
    {
        zzd(googleapiclient, false).zza((String[])list.toArray(new String[list.size()]), abyte0);
    }

    public void sendUnreliableMessage(GoogleApiClient googleapiclient, String s, byte abyte0[])
    {
        zzd(googleapiclient, false).zzb(new String[] {
            s
        }, abyte0);
    }

    public void sendUnreliableMessage(GoogleApiClient googleapiclient, List list, byte abyte0[])
    {
        zzd(googleapiclient, false).zzb((String[])list.toArray(new String[list.size()]), abyte0);
    }

    public PendingResult startAdvertising(final GoogleApiClient final_googleapiclient, String s, AppMetadata appmetadata, long l, com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionrequestlistener)
    {
        return final_googleapiclient.zzb(new zzb(s, appmetadata, l, final_googleapiclient.zzl(connectionrequestlistener)) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzla)zza1);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                zzla1.zza(this, name, zzaxy, zzaxz, zzaxA);
            }

            final String val$name;
            final zzi zzaxA;
            final zzlb zzaxB;
            final AppMetadata zzaxy;
            final long zzaxz;

            
            {
                zzaxB = zzlb.this;
                name = s;
                zzaxy = appmetadata;
                zzaxz = l;
                zzaxA = zzi;
                super(final_googleapiclient);
            }
        }
);
    }

    public PendingResult startDiscovery(GoogleApiClient googleapiclient, String s, long l, com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
    {
        return googleapiclient.zzb(new zzc(googleapiclient, s, l, googleapiclient.zzl(endpointdiscoverylistener)) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzla)zza1);
            }

            protected void zza(zzla zzla1)
                throws RemoteException
            {
                zzla1.zza(this, zzaxw, zzaxz, zzaxC);
            }

            final zzlb zzaxB;
            final zzi zzaxC;
            final String zzaxw;
            final long zzaxz;

            
            {
                zzaxB = zzlb.this;
                zzaxw = s;
                zzaxz = l;
                zzaxC = zzi;
                super(googleapiclient);
            }
        }
);
    }

    public void stopAdvertising(GoogleApiClient googleapiclient)
    {
        zzd(googleapiclient, false).zzuW();
    }

    public void stopAllEndpoints(GoogleApiClient googleapiclient)
    {
        zzd(googleapiclient, false).zzuX();
    }

    public void stopDiscovery(GoogleApiClient googleapiclient, String s)
    {
        zzd(googleapiclient, false).zzdj(s);
    }

    public static final com.google.android.gms.common.api.Api.zzc zzKh = new com.google.android.gms.common.api.Api.zzc();
    public static final com.google.android.gms.common.api.Api.zzb zzKi = new com.google.android.gms.common.api.Api.zzb() {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzl(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzla zzl(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzla(context, looper, connectioncallbacks, onconnectionfailedlistener);
        }

    }
;

}
