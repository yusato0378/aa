// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
    implements Events
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzP(status);
        }

        public com.google.android.gms.games.event.Events.LoadEventsResult zzP(Status status)
        {
            return new com.google.android.gms.games.event.Events.LoadEventsResult(this, status) {

                public EventBuffer getEvents()
                {
                    return new EventBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadImpl zzajK;

            
            {
                zzajK = loadimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return new Result(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final UpdateImpl zzajL;

            
            {
                zzajL = updateimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private UpdateImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public EventsImpl()
    {
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        GamesClientImpl gamesclientimpl = Games.zzc(googleapiclient, false);
        if(gamesclientimpl == null)
            return;
        if(gamesclientimpl.isConnected())
        {
            gamesclientimpl.zzo(s, i);
            return;
        } else
        {
            googleapiclient.zzb(new UpdateImpl(googleapiclient, s, i) {

                public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((GamesClientImpl)zza1);
                }

                public void zza(GamesClientImpl gamesclientimpl1)
                {
                    gamesclientimpl1.zzo(zzajI, zzajJ);
                }

                final EventsImpl zzajH;
                final String zzajI;
                final int zzajJ;

            
            {
                zzajH = EventsImpl.this;
                zzajI = s;
                zzajJ = i;
                super(googleapiclient);
            }
            }
);
            return;
        }
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzd(this, zzajt);
            }

            final EventsImpl zzajH;
            final boolean zzajt;

            
            {
                zzajH = EventsImpl.this;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag, as) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajt, zzajG);
            }

            final String zzajG[];
            final EventsImpl zzajH;
            final boolean zzajt;

            
            {
                zzajH = EventsImpl.this;
                zzajt = flag;
                zzajG = as;
                super(googleapiclient);
            }
        }
);
    }
}
