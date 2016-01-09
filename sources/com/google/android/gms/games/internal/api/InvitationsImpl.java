// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.*;

public final class InvitationsImpl
    implements Invitations
{
    private static abstract class LoadInvitationsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzU(status);
        }

        public com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult zzU(Status status)
        {
            return new com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult(this, status) {

                public InvitationBuffer getInvitations()
                {
                    return new InvitationBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadInvitationsImpl zzaka;

            
            {
                zzaka = loadinvitationsimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadInvitationsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public InvitationsImpl()
    {
    }

    public Intent getInvitationInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqL();
    }

    public PendingResult loadInvitations(GoogleApiClient googleapiclient)
    {
        return loadInvitations(googleapiclient, 0);
    }

    public PendingResult loadInvitations(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new LoadInvitationsImpl(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzc(this, zzajX);
            }

            final int zzajX;
            final InvitationsImpl zzajY;

            
            {
                zzajY = InvitationsImpl.this;
                zzajX = i;
                super(googleapiclient);
            }
        }
);
    }

    public void registerInvitationListener(GoogleApiClient googleapiclient, OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if(gamesclientimpl != null)
            gamesclientimpl.zza(googleapiclient.zzl(oninvitationreceivedlistener));
    }

    public void unregisterInvitationListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzqM();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/InvitationsImpl$2

/* anonymous class */
    class _cls2 extends LoadInvitationsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zze(this, zzajw, zzajX);
        }

        final int zzajX;
        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/InvitationsImpl$3

/* anonymous class */
    class _cls3 extends LoadInvitationsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzn(this, zzajZ);
        }

        final String zzajZ;
    }

}
