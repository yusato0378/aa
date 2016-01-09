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
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.*;

public final class LeaderboardsImpl
    implements Leaderboards
{
    private static abstract class LoadMetadataImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzV(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult zzV(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult(this, status) {

                public LeaderboardBuffer getLeaderboards()
                {
                    return new LeaderboardBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadMetadataImpl zzakk;

            
            {
                zzakk = loadmetadataimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadMetadataImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadPlayerScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzW(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult zzW(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult(this, status) {

                public LeaderboardScore getScore()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final LoadPlayerScoreImpl zzakl;

            
            {
                zzakl = loadplayerscoreimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadPlayerScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadScoresImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzX(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult zzX(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult(this, status) {

                public Leaderboard getLeaderboard()
                {
                    return null;
                }

                public LeaderboardScoreBuffer getScores()
                {
                    return new LeaderboardScoreBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadScoresImpl zzakm;

            
            {
                zzakm = loadscoresimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadScoresImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    protected static abstract class SubmitScoreImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzY(status);
        }

        public com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult zzY(Status status)
        {
            return new com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult(this, status) {

                public ScoreSubmissionData getScoreData()
                {
                    return new ScoreSubmissionData(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final SubmitScoreImpl zzakn;

            
            {
                zzakn = submitscoreimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        protected SubmitScoreImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public LeaderboardsImpl()
    {
    }

    public Intent getAllLeaderboardsIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqI();
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s)
    {
        return getLeaderboardIntent(googleapiclient, s, -1);
    }

    public Intent getLeaderboardIntent(GoogleApiClient googleapiclient, String s, int i)
    {
        return Games.zzd(googleapiclient).zzn(s, i);
    }

    public PendingResult loadCurrentPlayerLeaderboardScore(GoogleApiClient googleapiclient, String s, int i, int j)
    {
        return googleapiclient.zza(new LoadPlayerScoreImpl(googleapiclient, s, i, j) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, null, zzakc, zzakd, zzake);
            }

            final LeaderboardsImpl zzakb;
            final String zzakc;
            final int zzakd;
            final int zzake;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakc = s;
                zzakd = i;
                zzake = j;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return googleapiclient.zza(new LoadMetadataImpl(googleapiclient, s, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzakc, zzajt);
            }

            final boolean zzajt;
            final LeaderboardsImpl zzakb;
            final String zzakc;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakc = s;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadLeaderboardMetadata(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadMetadataImpl(googleapiclient, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzajt);
            }

            final boolean zzajt;
            final LeaderboardsImpl zzakb;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMoreScores(GoogleApiClient googleapiclient, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, leaderboardscorebuffer, i, j) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzakg, zzakf, zzakh);
            }

            final LeaderboardsImpl zzakb;
            final int zzakf;
            final LeaderboardScoreBuffer zzakg;
            final int zzakh;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakg = leaderboardscorebuffer;
                zzakf = i;
                zzakh = j;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadPlayerCenteredScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadPlayerCenteredScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzakc, zzakd, zzake, zzakf, zzajt);
            }

            final boolean zzajt;
            final LeaderboardsImpl zzakb;
            final String zzakc;
            final int zzakd;
            final int zzake;
            final int zzakf;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakc = s;
                zzakd = i;
                zzake = j;
                zzakf = k;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k)
    {
        return loadTopScores(googleapiclient, s, i, j, k, false);
    }

    public PendingResult loadTopScores(GoogleApiClient googleapiclient, String s, int i, int j, int k, boolean flag)
    {
        return googleapiclient.zza(new LoadScoresImpl(googleapiclient, s, i, j, k, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzakc, zzakd, zzake, zzakf, zzajt);
            }

            final boolean zzajt;
            final LeaderboardsImpl zzakb;
            final String zzakc;
            final int zzakd;
            final int zzake;
            final int zzakf;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakc = s;
                zzakd = i;
                zzake = j;
                zzakf = k;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l)
    {
        submitScore(googleapiclient, s, l, null);
    }

    public void submitScore(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient == null)
            break MISSING_BLOCK_LABEL_19;
        googleapiclient.zza(null, s, l, s1);
        return;
        googleapiclient;
        GamesLog.zzt("LeaderboardsImpl", "service died");
        return;
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l)
    {
        return submitScoreImmediate(googleapiclient, s, l, null);
    }

    public PendingResult submitScoreImmediate(GoogleApiClient googleapiclient, String s, long l, String s1)
    {
        return googleapiclient.zzb(new SubmitScoreImpl(googleapiclient, s, l, s1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzakc, zzaki, zzakj);
            }

            final LeaderboardsImpl zzakb;
            final String zzakc;
            final long zzaki;
            final String zzakj;

            
            {
                zzakb = LeaderboardsImpl.this;
                zzakc = s;
                zzaki = l;
                zzakj = s1;
                super(googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$10

/* anonymous class */
    class _cls10 extends LoadScoresImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakc, zzakd, zzake, zzakf, zzajt);
        }

        final boolean zzajt;
        final String zzajw;
        final String zzakc;
        final int zzakd;
        final int zzake;
        final int zzakf;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$11

/* anonymous class */
    class _cls11 extends LoadScoresImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajw, zzakc, zzakd, zzake, zzakf, zzajt);
        }

        final boolean zzajt;
        final String zzajw;
        final String zzakc;
        final int zzakd;
        final int zzake;
        final int zzakf;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$8

/* anonymous class */
    class _cls8 extends LoadMetadataImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajw, zzajt);
        }

        final boolean zzajt;
        final String zzajw;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/LeaderboardsImpl$9

/* anonymous class */
    class _cls9 extends LoadMetadataImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakc, zzajt);
        }

        final boolean zzajt;
        final String zzajw;
        final String zzakc;
    }

}
