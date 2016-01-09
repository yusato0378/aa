// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzgx;

// Referenced classes of package com.google.android.gms.appstate:
//            AppStateBuffer

public final class AppStateManager
{
    public static interface StateConflictResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract String getResolvedVersion();

        public abstract byte[] getServerData();

        public abstract int getStateKey();
    }

    public static interface StateDeletedResult
        extends Result
    {

        public abstract int getStateKey();
    }

    public static interface StateListResult
        extends Result
    {

        public abstract AppStateBuffer getStateBuffer();
    }

    public static interface StateLoadedResult
        extends Releasable, Result
    {

        public abstract byte[] getLocalData();

        public abstract int getStateKey();
    }

    public static interface StateResult
        extends Releasable, Result
    {

        public abstract StateConflictResult getConflictResult();

        public abstract StateLoadedResult getLoadedResult();
    }

    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(AppStateManager.zzKh, googleapiclient);
        }
    }

    private static abstract class zzb extends zza
    {

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zzc extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzf(status);
        }

        public StateListResult zzf(Status status)
        {
            return new StateListResult(this, status) {

                public AppStateBuffer getStateBuffer()
                {
                    return new AppStateBuffer(null);
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final zzc zzKp;

            
            {
                zzKp = zzc1;
                zzKj = status;
                super();
            }
            }
;
        }

        public zzc(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zzd extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zzd(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static abstract class zze extends zza
    {

        public Result createFailedResult(Status status)
        {
            return zzg(status);
        }

        public StateResult zzg(Status status)
        {
            return AppStateManager.zzd(status);
        }

        public zze(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    private AppStateManager()
    {
    }

    public static PendingResult delete(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zzb(new zzb(googleapiclient, i) {

            public Result createFailedResult(Status status)
            {
                return zze(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zza(this, zzKk);
            }

            public StateDeletedResult zze(Status status)
            {
                return new StateDeletedResult(this, status) {

                    public int getStateKey()
                    {
                        return zzKm.zzKk;
                    }

                    public Status getStatus()
                    {
                        return zzKj;
                    }

                    final Status zzKj;
                    final _cls5 zzKm;

            
            {
                zzKm = _pcls5;
                zzKj = status;
                super();
            }
                }
;
            }

            final int zzKk;

            
            {
                zzKk = i;
                super(googleapiclient);
            }
        }
);
    }

    public static int getMaxNumKeys(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient).zzjO();
    }

    public static int getMaxStateSize(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient).zzjN();
    }

    public static PendingResult list(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzc(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zza(this);
            }

        }
);
    }

    public static PendingResult load(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new zze(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zzb(this, zzKk);
            }

            final int zzKk;

            
            {
                zzKk = i;
                super(googleapiclient);
            }
        }
);
    }

    public static PendingResult resolve(GoogleApiClient googleapiclient, int i, String s, byte abyte0[])
    {
        return googleapiclient.zzb(new zze(googleapiclient, i, s, abyte0) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zza(this, zzKk, zzKn, zzKo);
            }

            final int zzKk;
            final String zzKn;
            final byte zzKo[];

            
            {
                zzKk = i;
                zzKn = s;
                zzKo = abyte0;
                super(googleapiclient);
            }
        }
);
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzd(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zzb(this);
            }

        }
);
    }

    public static void update(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        googleapiclient.zzb(new zze(googleapiclient, i, abyte0) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zza(null, zzKk, zzKl);
            }

            final int zzKk;
            final byte zzKl[];

            
            {
                zzKk = i;
                zzKl = abyte0;
                super(googleapiclient);
            }
        }
);
    }

    public static PendingResult updateImmediate(GoogleApiClient googleapiclient, int i, byte abyte0[])
    {
        return googleapiclient.zzb(new zze(googleapiclient, i, abyte0) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzgx)zza1);
            }

            protected void zza(zzgx zzgx1)
                throws RemoteException
            {
                zzgx1.zza(this, zzKk, zzKl);
            }

            final int zzKk;
            final byte zzKl[];

            
            {
                zzKk = i;
                zzKl = abyte0;
                super(googleapiclient);
            }
        }
);
    }

    public static zzgx zza(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if(googleapiclient != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "GoogleApiClient parameter is required.");
        zzv.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        zzv.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return (zzgx)googleapiclient.zza(zzKh);
    }

    private static StateResult zzc(Status status)
    {
        return new StateResult(status) {

            public StateConflictResult getConflictResult()
            {
                return null;
            }

            public StateLoadedResult getLoadedResult()
            {
                return null;
            }

            public Status getStatus()
            {
                return zzKj;
            }

            public void release()
            {
            }

            final Status zzKj;

            
            {
                zzKj = status;
                super();
            }
        }
;
    }

    static StateResult zzd(Status status)
    {
        return zzc(status);
    }

    public static final Api API;
    public static final Scope SCOPE_APP_STATE;
    static final com.google.android.gms.common.api.Api.zzc zzKh;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzb(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzgx zzb(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzgx(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener);
            }

        }
;
        SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");
        API = new Api("AppStateManager.API", zzKi, zzKh, new Scope[] {
            SCOPE_APP_STATE
        });
    }
}
