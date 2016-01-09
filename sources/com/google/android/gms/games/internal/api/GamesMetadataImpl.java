// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.*;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl
    implements GamesMetadata
{
    private static abstract class LoadExtendedGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzQ(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult zzQ(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadExtendedGamesImpl zzajT;

            
            {
                zzajT = loadextendedgamesimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadGameInstancesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzR(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult zzR(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadGameInstancesImpl zzajU;

            
            {
                zzajU = loadgameinstancesimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadGameSearchSuggestionsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzS(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult zzS(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadGameSearchSuggestionsImpl zzajV;

            
            {
                zzajV = loadgamesearchsuggestionsimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class LoadGamesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzT(status);
        }

        public com.google.android.gms.games.GamesMetadata.LoadGamesResult zzT(Status status)
        {
            return new com.google.android.gms.games.GamesMetadata.LoadGamesResult(this, status) {

                public GameBuffer getGames()
                {
                    return new GameBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadGamesImpl zzajW;

            
            {
                zzajW = loadgamesimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadGamesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public GamesMetadataImpl()
    {
    }

    public Game getCurrentGame(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqH();
    }

    public PendingResult loadGame(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new LoadGamesImpl(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzf(this);
            }

            final GamesMetadataImpl zzajM;

            
            {
                zzajM = GamesMetadataImpl.this;
                super(googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$10

/* anonymous class */
    class _cls10 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajN, zzajO, false, true, false, zzajP);
        }

        final String zzajN;
        final int zzajO;
        final boolean zzajP;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$11

/* anonymous class */
    class _cls11 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajv, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$12

/* anonymous class */
    class _cls12 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajv, zzajO, true, false);
        }

        final int zzajO;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$13

/* anonymous class */
    class _cls13 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzajv, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$14

/* anonymous class */
    class _cls14 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzajv, zzajO, true, false);
        }

        final int zzajO;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$15

/* anonymous class */
    class _cls15 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajN, zzajO, true, false, zzajt, zzajP);
        }

        final String zzajN;
        final int zzajO;
        final boolean zzajP;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$16

/* anonymous class */
    class _cls16 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajN, zzajO, true, true, false, zzajP);
        }

        final String zzajN;
        final int zzajO;
        final boolean zzajP;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$17

/* anonymous class */
    class _cls17 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zze(this, zzajQ, zzajO, false, zzajt);
        }

        final int zzajO;
        final String zzajQ;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$18

/* anonymous class */
    class _cls18 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zze(this, zzajQ, zzajO, true, false);
        }

        final int zzajO;
        final String zzajQ;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$19

/* anonymous class */
    class _cls19 extends LoadGameSearchSuggestionsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzl(this, zzajQ);
        }

        final String zzajQ;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$2

/* anonymous class */
    class _cls2 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzj(this, zzajw);
        }

        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$3

/* anonymous class */
    class _cls3 extends LoadGameInstancesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzk(this, zzajw);
        }

        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$4

/* anonymous class */
    class _cls4 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, null, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$5

/* anonymous class */
    class _cls5 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, null, zzajO, true, false);
        }

        final int zzajO;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$6

/* anonymous class */
    class _cls6 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajv, zzajO, false, zzajt);
        }

        final int zzajO;
        final boolean zzajt;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$7

/* anonymous class */
    class _cls7 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajv, zzajO, true, false);
        }

        final int zzajO;
        final String zzajv;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$8

/* anonymous class */
    class _cls8 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajO, zzajR, zzajS, zzajt);
        }

        final int zzajO;
        final int zzajR;
        final boolean zzajS;
        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/GamesMetadataImpl$9

/* anonymous class */
    class _cls9 extends LoadExtendedGamesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajN, zzajO, false, false, zzajt, zzajP);
        }

        final String zzajN;
        final int zzajO;
        final boolean zzajP;
        final boolean zzajt;
    }

}
