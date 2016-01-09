// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast:
//            ApplicationMetadata, LaunchOptions, CastDevice

public final class Cast
{
    public static interface ApplicationConnectionResult
        extends Result
    {

        public abstract ApplicationMetadata getApplicationMetadata();

        public abstract String getApplicationStatus();

        public abstract String getSessionId();

        public abstract boolean getWasLaunched();
    }

    public static interface CastApi
    {

        public abstract int getActiveInputState(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract String getApplicationStatus(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract int getStandbyState(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract double getVolume(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract boolean isMute(GoogleApiClient googleapiclient)
            throws IllegalStateException;

        public abstract PendingResult joinApplication(GoogleApiClient googleapiclient);

        public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s);

        public abstract PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1);

        public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s);

        public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions);

        public abstract PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag);

        public abstract PendingResult leaveApplication(GoogleApiClient googleapiclient);

        public abstract void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
            throws IOException, IllegalArgumentException;

        public abstract void requestStatus(GoogleApiClient googleapiclient)
            throws IOException, IllegalStateException;

        public abstract PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1);

        public abstract void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException;

        public abstract void setMute(GoogleApiClient googleapiclient, boolean flag)
            throws IOException, IllegalStateException;

        public abstract void setVolume(GoogleApiClient googleapiclient, double d)
            throws IOException, IllegalArgumentException, IllegalStateException;

        public abstract PendingResult stopApplication(GoogleApiClient googleapiclient);

        public abstract PendingResult stopApplication(GoogleApiClient googleapiclient, String s);
    }

    public static final class CastApi.zza
        implements CastApi
    {

        public int getActiveInputState(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).zzkd();
        }

        public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).getApplicationMetadata();
        }

        public String getApplicationStatus(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).getApplicationStatus();
        }

        public int getStandbyState(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).zzke();
        }

        public double getVolume(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).zzkc();
        }

        public boolean isMute(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            return ((zze)googleapiclient.zza(zzk.zzKh)).isMute();
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.zzb(new zza(this, googleapiclient) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zzb(null, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;

            
            {
                zzLK = zza1;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new zza(this, googleapiclient, s) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zzb(zzLL, null, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;
                final String zzLL;

            
            {
                zzLK = zza1;
                zzLL = s;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult joinApplication(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.zzb(new zza(this, googleapiclient, s, s1) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zzb(zzLL, zzLN, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;
                final String zzLL;
                final String zzLN;

            
            {
                zzLK = zza1;
                zzLL = s;
                zzLN = s1;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new zza(this, googleapiclient, s) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zza(zzLL, false, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;
                final String zzLL;

            
            {
                zzLK = zza1;
                zzLL = s;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
        {
            return googleapiclient.zzb(new zza(this, googleapiclient, s, launchoptions) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zza(zzLL, zzLM, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;
                final String zzLL;
                final LaunchOptions zzLM;

            
            {
                zzLK = zza1;
                zzLL = s;
                zzLM = launchoptions;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult launchApplication(GoogleApiClient googleapiclient, String s, boolean flag)
        {
            return launchApplication(googleapiclient, s, (new LaunchOptions.Builder()).setRelaunchIfRunning(flag).build());
        }

        public PendingResult leaveApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.zzb(new zzh(this, googleapiclient) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zzd(this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;

            
            {
                zzLK = zza1;
                super(googleapiclient);
            }
            }
);
        }

        public void removeMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s)
            throws IOException, IllegalArgumentException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzKh)).zzbn(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public void requestStatus(GoogleApiClient googleapiclient)
            throws IOException, IllegalStateException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzKh)).zzkb();
                return;
            }
            // Misplaced declaration of an exception variable
            catch(GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public PendingResult sendMessage(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.zzb(new zzh(this, googleapiclient, s, s1) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zza(zzLI, zzLJ, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1) { }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1) { }
                    zzal(2001);
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final String zzLI;
                final String zzLJ;
                final CastApi.zza zzLK;

            
            {
                zzLK = zza1;
                zzLI = s;
                zzLJ = s1;
                super(googleapiclient);
            }
            }
);
        }

        public void setMessageReceivedCallbacks(GoogleApiClient googleapiclient, String s, MessageReceivedCallback messagereceivedcallback)
            throws IOException, IllegalStateException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzKh)).zza(s, messagereceivedcallback);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public void setMute(GoogleApiClient googleapiclient, boolean flag)
            throws IOException, IllegalStateException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzKh)).zzN(flag);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public void setVolume(GoogleApiClient googleapiclient, double d)
            throws IOException, IllegalArgumentException, IllegalStateException
        {
            try
            {
                ((zze)googleapiclient.zza(zzk.zzKh)).zzb(d);
                return;
            }
            // Misplaced declaration of an exception variable
            catch(GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient)
        {
            return googleapiclient.zzb(new zzh(this, googleapiclient) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    try
                    {
                        zze1.zza("", this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;

            
            {
                zzLK = zza1;
                super(googleapiclient);
            }
            }
);
        }

        public PendingResult stopApplication(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new zzh(this, googleapiclient, s) {

                protected void zza(zze zze1)
                    throws RemoteException
                {
                    if(TextUtils.isEmpty(zzLN))
                    {
                        zzd(2001, "IllegalArgument: sessionId cannot be null or empty");
                        return;
                    }
                    try
                    {
                        zze1.zza(zzLN, this);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch(zze zze1)
                    {
                        zzal(2001);
                    }
                }

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zze)zza1);
                }

                final CastApi.zza zzLK;
                final String zzLN;

            
            {
                zzLK = zza1;
                zzLN = s;
                super(googleapiclient);
            }
            }
);
        }

        public CastApi.zza()
        {
        }
    }

    public static final class CastOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.HasOptions
    {

        public static Builder builder(CastDevice castdevice, Listener listener)
        {
            return new Builder(castdevice, listener);
        }

        static int zza(CastOptions castoptions)
        {
            return castoptions.zzLQ;
        }

        final CastDevice zzLO;
        final Listener zzLP;
        private final int zzLQ;

        private CastOptions(Builder builder1)
        {
            zzLO = builder1.zzLR;
            zzLP = builder1.zzLS;
            zzLQ = Builder.zza(builder1);
        }

    }

    public static final class CastOptions.Builder
    {

        static int zza(CastOptions.Builder builder)
        {
            return builder.zzLT;
        }

        public CastOptions build()
        {
            return new CastOptions(this);
        }

        public CastOptions.Builder setVerboseLoggingEnabled(boolean flag)
        {
            if(flag)
            {
                zzLT = zzLT | 1;
                return this;
            } else
            {
                zzLT = zzLT & -2;
                return this;
            }
        }

        CastDevice zzLR;
        Listener zzLS;
        private int zzLT;

        private CastOptions.Builder(CastDevice castdevice, Listener listener)
        {
            zzv.zzb(castdevice, "CastDevice parameter cannot be null");
            zzv.zzb(listener, "CastListener parameter cannot be null");
            zzLR = castdevice;
            zzLS = listener;
            zzLT = 0;
        }

    }

    public static class Listener
    {

        public void onActiveInputStateChanged(int i)
        {
        }

        public void onApplicationDisconnected(int i)
        {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationmetadata)
        {
        }

        public void onApplicationStatusChanged()
        {
        }

        public void onStandbyStateChanged(int i)
        {
        }

        public void onVolumeChanged()
        {
        }

        public Listener()
        {
        }
    }

    public static interface MessageReceivedCallback
    {

        public abstract void onMessageReceived(CastDevice castdevice, String s, String s1);
    }

    private static abstract class zza extends zzb
    {

        public Result createFailedResult(Status status)
        {
            return zzh(status);
        }

        public ApplicationConnectionResult zzh(Status status)
        {
            return new ApplicationConnectionResult(this, status) {

                public ApplicationMetadata getApplicationMetadata()
                {
                    return null;
                }

                public String getApplicationStatus()
                {
                    return null;
                }

                public String getSessionId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public boolean getWasLaunched()
                {
                    return false;
                }

                final Status zzKj;
                final zza zzLU;

            
            {
                zzLU = zza1;
                zzKj = status;
                super();
            }
            }
;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    private Cast()
    {
    }

    public static final int ACTIVE_INPUT_STATE_NO = 0;
    public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
    public static final int ACTIVE_INPUT_STATE_YES = 1;
    public static final Api API;
    public static final CastApi CastApi = new CastApi.zza();
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 0x10000;
    public static final int MAX_NAMESPACE_LENGTH = 128;
    public static final int STANDBY_STATE_NO = 0;
    public static final int STANDBY_STATE_UNKNOWN = -1;
    public static final int STANDBY_STATE_YES = 1;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;

    static 
    {
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public zze zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, CastOptions castoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                zzv.zzb(castoptions, "Setting the API options is required.");
                return new zze(context, looper, castoptions.zzLO, CastOptions.zza(castoptions), castoptions.zzLP, connectioncallbacks, onconnectionfailedlistener);
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze1, (CastOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

        }
;
        API = new Api("Cast.API", zzKi, zzk.zzKh, new Scope[0]);
    }
}
