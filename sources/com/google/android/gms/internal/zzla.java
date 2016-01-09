// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.nearby.connection.AppMetadata;

// Referenced classes of package com.google.android.gms.internal:
//            zzld, zzkz

public final class zzla extends zzi
{
    private static final class zza extends zzb
    {

        public void zzgN(int i)
            throws RemoteException
        {
            zzKq.zzj(new Status(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zza(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            super(zzi1);
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzr(zzb1);
        }
    }

    private static class zzb extends zzkz
    {

        public void onDisconnected(String s)
            throws RemoteException
        {
            zzaxj.zza(new com.google.android.gms.common.api.zzi.zzb(this, s) {

                public void zza(com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
                {
                    messagelistener.onDisconnected(zzaxk);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.MessageListener)obj);
                }

                public void zzkJ()
                {
                }

                final String zzaxk;
                final zzb zzaxm;

            
            {
                zzaxm = zzb1;
                zzaxk = s;
                super();
            }
            }
);
        }

        public void onMessageReceived(String s, byte abyte0[], boolean flag)
            throws RemoteException
        {
            zzaxj.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, abyte0, flag) {

                public void zza(com.google.android.gms.nearby.connection.Connections.MessageListener messagelistener)
                {
                    messagelistener.onMessageReceived(zzaxk, zzakV, zzaxl);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.MessageListener)obj);
                }

                public void zzkJ()
                {
                }

                final byte zzakV[];
                final String zzaxk;
                final boolean zzaxl;
                final zzb zzaxm;

            
            {
                zzaxm = zzb1;
                zzaxk = s;
                zzakV = abyte0;
                zzaxl = flag;
                super();
            }
            }
);
        }

        private final com.google.android.gms.common.api.zzi zzaxj;

        zzb(com.google.android.gms.common.api.zzi zzi1)
        {
            zzaxj = zzi1;
        }
    }

    private static final class zzc extends zzb
    {

        public void zza(String s, int i, byte abyte0[])
            throws RemoteException
        {
            zzaxn.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, i, abyte0) {

                public void zza(com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback connectionresponsecallback)
                {
                    connectionresponsecallback.onConnectionResponse(zzaxk, new Status(zzOa), zzakV);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.ConnectionResponseCallback)obj);
                }

                public void zzkJ()
                {
                }

                final int zzOa;
                final byte zzakV[];
                final String zzaxk;
                final zzc zzaxo;

            
            {
                zzaxo = zzc1;
                zzaxk = s;
                zzOa = i;
                zzakV = abyte0;
                super();
            }
            }
);
        }

        public void zzgM(int i)
            throws RemoteException
        {
            zzKq.zzj(new Status(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        private final com.google.android.gms.common.api.zzi zzaxn;

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2)
        {
            super(zzi2);
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzr(zzb1);
            zzaxn = (com.google.android.gms.common.api.zzi)zzv.zzr(zzi1);
        }
    }

    private static final class zzd extends zzkz
    {

        public void onConnectionRequest(String s, String s1, String s2, byte abyte0[])
            throws RemoteException
        {
            zzaxp.zza(new com.google.android.gms.common.api.zzi.zzb(this, s, s1, s2, abyte0) {

                public void zza(com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener connectionrequestlistener)
                {
                    connectionrequestlistener.onConnectionRequest(zzaxk, zzaxq, zzaxr, zzakV);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener)obj);
                }

                public void zzkJ()
                {
                }

                final byte zzakV[];
                final String zzaxk;
                final String zzaxq;
                final String zzaxr;
                final zzd zzaxs;

            
            {
                zzaxs = zzd1;
                zzaxk = s;
                zzaxq = s1;
                zzaxr = s2;
                zzakV = abyte0;
                super();
            }
            }
);
        }

        public void zzi(int i, String s)
            throws RemoteException
        {
            zzKq.zzj(new zze(new Status(i), s));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        private final com.google.android.gms.common.api.zzi zzaxp;

        zzd(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzr(zzb1);
            zzaxp = (com.google.android.gms.common.api.zzi)zzv.zzr(zzi1);
        }
    }

    private static final class zze
        implements com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    {

        public String getLocalEndpointName()
        {
            return zzaxt;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzaxt;

        zze(Status status, String s)
        {
            zzKr = status;
            zzaxt = s;
        }
    }

    private static final class zzf extends zzkz
    {

        public void onEndpointFound(String s, String s1, String s2, String s3)
            throws RemoteException
        {
            zzaxp.zza(new com.google.android.gms.common.api.zzi.zzb(s, s1, s2, s3) {

                public void zza(com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
                {
                    endpointdiscoverylistener.onEndpointFound(zzaxu, zzaxv, zzaxw, name);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener)obj);
                }

                public void zzkJ()
                {
                }

                final String val$name;
                final String zzaxu;
                final String zzaxv;
                final String zzaxw;
                final zzf zzaxx;

            
            {
                zzaxx = final_zzf1;
                zzaxu = s;
                zzaxv = s1;
                zzaxw = s2;
                name = s3;
                super();
            }
            }
);
        }

        public void onEndpointLost(String s)
            throws RemoteException
        {
            zzaxp.zza(new com.google.android.gms.common.api.zzi.zzb(this, s) {

                public void zza(com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener endpointdiscoverylistener)
                {
                    endpointdiscoverylistener.onEndpointLost(zzaxu);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener)obj);
                }

                public void zzkJ()
                {
                }

                final String zzaxu;
                final zzf zzaxx;

            
            {
                zzaxx = zzf1;
                zzaxu = s;
                super();
            }
            }
);
        }

        public void zzgK(int i)
            throws RemoteException
        {
            zzKq.zzj(new Status(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;
        private final com.google.android.gms.common.api.zzi zzaxp;

        zzf(com.google.android.gms.common.api.zza.zzb zzb1, com.google.android.gms.common.api.zzi zzi1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzr(zzb1);
            zzaxp = (com.google.android.gms.common.api.zzi)zzv.zzr(zzi1);
        }
    }


    public zzla(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 54, connectioncallbacks, onconnectionfailedlistener);
    }

    public void disconnect()
    {
        if(isConnected())
            try
            {
                ((zzld)zzlX()).zzD(zzahR);
            }
            catch(RemoteException remoteexception)
            {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", remoteexception);
            }
        super.disconnect();
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzce(ibinder);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, long l, com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzld)zzlX()).zza(new zzf(zzb1, zzi1), s, l, zzahR);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, AppMetadata appmetadata, long l, com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzld)zzlX()).zza(new zzd(zzb1, zzi1), s, appmetadata, l, zzahR);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, byte abyte0[], com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2)
        throws RemoteException
    {
        ((zzld)zzlX()).zza(new zzc(zzb1, zzi1, zzi2), s, s1, abyte0, zzahR);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], com.google.android.gms.common.api.zzi zzi1)
        throws RemoteException
    {
        ((zzld)zzlX()).zza(new zza(zzb1, zzi1), s, abyte0, zzahR);
    }

    public void zza(String as[], byte abyte0[])
    {
        try
        {
            ((zzld)zzlX()).zza(as, abyte0, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String as[])
        {
            Log.w("NearbyConnectionsClient", "Couldn't send reliable message", as);
        }
    }

    public void zzb(String as[], byte abyte0[])
    {
        try
        {
            ((zzld)zzlX()).zzb(as, abyte0, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String as[])
        {
            Log.w("NearbyConnectionsClient", "Couldn't send unreliable message", as);
        }
    }

    protected zzld zzce(IBinder ibinder)
    {
        return zzld.zza.zzcg(ibinder);
    }

    public void zzdj(String s)
    {
        try
        {
            ((zzld)zzlX()).zzd(s, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop discovery", s);
        }
    }

    public void zzdk(String s)
    {
        try
        {
            ((zzld)zzlX()).zze(s, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Log.w("NearbyConnectionsClient", "Couldn't disconnect from endpoint", s);
        }
    }

    protected String zzeq()
    {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    public void zzq(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((zzld)zzlX()).zza(new zzkz(zzb1) {

            public void zzgO(int i)
                throws RemoteException
            {
                zzaxh.zzj(new Status(i));
            }

            final com.google.android.gms.common.api.zza.zzb zzaxh;
            final zzla zzaxi;

            
            {
                zzaxi = zzla.this;
                zzaxh = zzb1;
                super();
            }
        }
, s, zzahR);
    }

    public String zzuU()
    {
        String s;
        try
        {
            s = ((zzld)zzlX()).zzP(zzahR);
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
        return s;
    }

    public String zzuV()
    {
        String s;
        try
        {
            s = ((zzld)zzlX()).zzuV();
        }
        catch(RemoteException remoteexception)
        {
            throw new RuntimeException(remoteexception);
        }
        return s;
    }

    public void zzuW()
    {
        try
        {
            ((zzld)zzlX()).zzM(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop advertising", remoteexception);
        }
    }

    public void zzuX()
    {
        try
        {
            ((zzld)zzlX()).zzO(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            Log.w("NearbyConnectionsClient", "Couldn't stop all endpoints", remoteexception);
        }
    }

    private final long zzahR = (long)hashCode();
}
