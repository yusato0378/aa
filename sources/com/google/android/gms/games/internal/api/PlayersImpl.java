// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.*;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
    implements Players
{
    private static abstract class LoadPlayersImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzad(status);
        }

        public com.google.android.gms.games.Players.LoadPlayersResult zzad(Status status)
        {
            return new com.google.android.gms.games.Players.LoadPlayersResult(this, status) {

                public PlayerBuffer getPlayers()
                {
                    return new PlayerBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadPlayersImpl zzakC;

            
            {
                zzakC = loadplayersimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadPlayersImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected Result createFailedResult(Status status)
        {
            return zzae(status);
        }

        protected com.google.android.gms.games.Players.LoadProfileSettingsResult zzae(Status status)
        {
            return new com.google.android.gms.games.Players.LoadProfileSettingsResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public boolean isProfileVisible()
                {
                    return true;
                }

                public boolean isVisibilityExplicitlySet()
                {
                    return false;
                }

                final Status zzKj;
                final LoadProfileSettingsResultImpl zzakD;

            
            {
                zzakD = loadprofilesettingsresultimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaf(status);
        }

        public com.google.android.gms.games.Players.LoadXpForGameCategoriesResult zzaf(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final LoadXpForGameCategoriesResultImpl zzakE;

            
            {
                zzakE = loadxpforgamecategoriesresultimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadXpStreamResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzag(status);
        }

        public com.google.android.gms.games.Players.LoadXpStreamResult zzag(Status status)
        {
            return new com.google.android.gms.games.Players.LoadXpStreamResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final LoadXpStreamResultImpl zzakF;

            
            {
                zzakF = loadxpstreamresultimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }
    }


    public PlayersImpl()
    {
    }

    public Intent getCompareProfileIntent(GoogleApiClient googleapiclient, Player player)
    {
        return Games.zzd(googleapiclient).zza(new PlayerEntity(player));
    }

    public Player getCurrentPlayer(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqG();
    }

    public String getCurrentPlayerId(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqF();
    }

    public Intent getPlayerSearchIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqQ();
    }

    public PendingResult loadConnectedPlayers(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajt);
            }

            final boolean zzajt;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadInvitablePlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajO, false, zzajt);
            }

            final int zzajO;
            final boolean zzajt;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajO = i;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMoreInvitablePlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajO, true, false);
            }

            final int zzajO;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajO = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, "played_with", zzajO, true, false);
            }

            final int zzajO;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajO = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadPlayer(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajv, false);
            }

            final String zzajv;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajv = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadPlayer(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, s, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajv, zzajt);
            }

            final boolean zzajt;
            final String zzajv;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajv = s;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i, boolean flag)
    {
        return googleapiclient.zza(new LoadPlayersImpl(googleapiclient, i, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, "played_with", zzajO, false, zzajt);
            }

            final int zzajO;
            final boolean zzajt;
            final PlayersImpl zzakw;

            
            {
                zzakw = PlayersImpl.this;
                zzajO = i;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$10

/* anonymous class */
    class _cls10 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "nearby", zzajw, zzajO, true, false);
        }

        final int zzajO;
        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$11

/* anonymous class */
    class _cls11 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "played_with", zzajw, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$12

/* anonymous class */
    class _cls12 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "played_with", zzajw, zzajO, true, false);
        }

        final int zzajO;
        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$13

/* anonymous class */
    class _cls13 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$14

/* anonymous class */
    class _cls14 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajO, true, false);
        }

        final int zzajO;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$15

/* anonymous class */
    class _cls15 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$16

/* anonymous class */
    class _cls16 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajO, true, false);
        }

        final int zzajO;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$17

/* anonymous class */
    class _cls17 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$18

/* anonymous class */
    class _cls18 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzajO, true, false);
        }

        final int zzajO;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$19

/* anonymous class */
    class _cls19 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzf(this, zzajQ, zzajO, false, zzajt);
        }

        final int zzajO;
        final String zzajQ;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$20

/* anonymous class */
    class _cls20 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzf(this, zzajQ, zzajO, true, false);
        }

        final int zzajO;
        final String zzajQ;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$21

/* anonymous class */
    class _cls21 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzakx, zzako, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
        final String zzako;
        final String zzakx;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$22

/* anonymous class */
    class _cls22 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzakx, zzako, zzajO, true, false);
        }

        final int zzajO;
        final String zzako;
        final String zzakx;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$23

/* anonymous class */
    class _cls23 extends LoadXpForGameCategoriesResultImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzm(this, zzaky);
        }

        final String zzaky;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$24

/* anonymous class */
    class _cls24 extends LoadXpStreamResultImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzaky, zzakz);
        }

        final String zzaky;
        final int zzakz;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$25

/* anonymous class */
    class _cls25 extends LoadXpStreamResultImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzaky, zzakz);
        }

        final String zzaky;
        final int zzakz;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$26

/* anonymous class */
    class _cls26 extends LoadProfileSettingsResultImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzf(this, zzajt);
        }

        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$27

/* anonymous class */
    class _cls27 extends UpdateProfileSettingsResultImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzg(this, zzakA);
        }

        final boolean zzakA;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$3

/* anonymous class */
    class _cls3 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzakB);
        }

        final String zzakB[];
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/PlayersImpl$9

/* anonymous class */
    class _cls9 extends LoadPlayersImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, "nearby", zzajw, zzajO, false, false);
        }

        final int zzajO;
        final String zzajw;
    }

}
