// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.*;
import java.util.*;

public final class RequestsImpl
    implements Requests
{
    private static abstract class LoadRequestSummariesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzak(status);
        }

        public com.google.android.gms.games.request.Requests.LoadRequestSummariesResult zzak(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestSummariesResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadRequestSummariesImpl zzakX;

            
            {
                zzakX = loadrequestsummariesimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzal(status);
        }

        public com.google.android.gms.games.request.Requests.LoadRequestsResult zzal(Status status)
        {
            return new com.google.android.gms.games.request.Requests.LoadRequestsResult(this, status) {

                public GameRequestBuffer getRequests(int i)
                {
                    return new GameRequestBuffer(DataHolder.zzaE(zzKj.getStatusCode()));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadRequestsImpl zzakY;

            
            {
                zzakY = loadrequestsimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadRequestsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class SendRequestImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzam(status);
        }

        public com.google.android.gms.games.request.Requests.SendRequestResult zzam(Status status)
        {
            return new com.google.android.gms.games.request.Requests.SendRequestResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final SendRequestImpl zzakZ;

            
            {
                zzakZ = sendrequestimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class UpdateRequestsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzan(status);
        }

        public com.google.android.gms.games.request.Requests.UpdateRequestsResult zzan(Status status)
        {
            return new com.google.android.gms.games.request.Requests.UpdateRequestsResult(this, status) {

                public Set getRequestIds()
                {
                    return null;
                }

                public int getRequestOutcome(String s)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Unknown request ID ").append(s).toString());
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final UpdateRequestsImpl zzala;

            
            {
                zzala = updaterequestsimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private UpdateRequestsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public RequestsImpl()
    {
    }

    public PendingResult acceptRequest(GoogleApiClient googleapiclient, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return acceptRequests(googleapiclient, arraylist);
    }

    public PendingResult acceptRequests(GoogleApiClient googleapiclient, List list)
    {
        if(list == null)
            list = null;
        else
            list = (String[])list.toArray(new String[list.size()]);
        return googleapiclient.zzb(new UpdateRequestsImpl(googleapiclient, list) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzakP);
            }

            final String zzakP[];
            final RequestsImpl zzakQ;

            
            {
                zzakQ = RequestsImpl.this;
                zzakP = as;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult dismissRequest(GoogleApiClient googleapiclient, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(s);
        return dismissRequests(googleapiclient, arraylist);
    }

    public PendingResult dismissRequests(GoogleApiClient googleapiclient, List list)
    {
        if(list == null)
            list = null;
        else
            list = (String[])list.toArray(new String[list.size()]);
        return googleapiclient.zzb(new UpdateRequestsImpl(googleapiclient, list) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzc(this, zzakP);
            }

            final String zzakP[];
            final RequestsImpl zzakQ;

            
            {
                zzakQ = RequestsImpl.this;
                zzakP = as;
                super(googleapiclient);
            }
        }
);
    }

    public ArrayList getGameRequestsFromBundle(Bundle bundle)
    {
        if(bundle == null || !bundle.containsKey("requests"))
            return new ArrayList();
        bundle = (ArrayList)bundle.get("requests");
        ArrayList arraylist = new ArrayList();
        int j = bundle.size();
        for(int i = 0; i < j; i++)
            arraylist.add((GameRequest)bundle.get(i));

        return arraylist;
    }

    public ArrayList getGameRequestsFromInboxResponse(Intent intent)
    {
        if(intent == null)
            return new ArrayList();
        else
            return getGameRequestsFromBundle(intent.getExtras());
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqV();
    }

    public int getMaxLifetimeDays(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqX();
    }

    public int getMaxPayloadSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqW();
    }

    public Intent getSendIntent(GoogleApiClient googleapiclient, int i, byte abyte0[], int j, Bitmap bitmap, String s)
    {
        return Games.zzd(googleapiclient).zza(i, abyte0, j, bitmap, s);
    }

    public PendingResult loadRequests(GoogleApiClient googleapiclient, int i, int j, int k)
    {
        return googleapiclient.zza(new LoadRequestsImpl(googleapiclient, i, j, k) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzakR, zzakS, zzajX);
            }

            final int zzajX;
            final RequestsImpl zzakQ;
            final int zzakR;
            final int zzakS;

            
            {
                zzakQ = RequestsImpl.this;
                zzakR = i;
                zzakS = j;
                zzajX = k;
                super(googleapiclient);
            }
        }
);
    }

    public void registerRequestListener(GoogleApiClient googleapiclient, OnRequestReceivedListener onrequestreceivedlistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if(gamesclientimpl != null)
            gamesclientimpl.zzd(googleapiclient.zzl(onrequestreceivedlistener));
    }

    public void unregisterRequestListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzqP();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$4

/* anonymous class */
    class _cls4 extends SendRequestImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakT, zzakU, zzakV, zzakW);
        }

        final String zzajw;
        final String zzakT[];
        final int zzakU;
        final byte zzakV[];
        final int zzakW;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$5

/* anonymous class */
    class _cls5 extends SendRequestImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakT, zzakU, zzakV, zzakW);
        }

        final String zzajw;
        final String zzakT[];
        final int zzakU;
        final byte zzakV[];
        final int zzakW;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$6

/* anonymous class */
    class _cls6 extends UpdateRequestsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakL, zzakP);
        }

        final String zzajw;
        final String zzakL;
        final String zzakP[];
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$7

/* anonymous class */
    class _cls7 extends LoadRequestsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakL, zzakR, zzakS, zzajX);
        }

        final int zzajX;
        final String zzajw;
        final String zzakL;
        final int zzakR;
        final int zzakS;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/RequestsImpl$8

/* anonymous class */
    class _cls8 extends LoadRequestSummariesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzf(this, zzakL, zzakS);
        }

        final String zzakL;
        final int zzakS;
    }

}
