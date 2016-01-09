// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.*;
import java.util.List;

public final class TurnBasedMultiplayerImpl
    implements TurnBasedMultiplayer
{
    private static abstract class CancelMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        static String zza(CancelMatchImpl cancelmatchimpl)
        {
            return cancelmatchimpl.zzGM;
        }

        public Result createFailedResult(Status status)
        {
            return zzas(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult zzas(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult(this, status) {

                public String getMatchId()
                {
                    return CancelMatchImpl.zza(zzalx);
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final CancelMatchImpl zzalx;

            
            {
                zzalx = cancelmatchimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private final String zzGM;

        public CancelMatchImpl(String s, GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzGM = s;
        }
    }

    private static abstract class InitiateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzat(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult zzat(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult(this, status) {

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final InitiateMatchImpl zzaly;

            
            {
                zzaly = initiatematchimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private InitiateMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LeaveMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzau(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult zzau(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult(this, status) {

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final LeaveMatchImpl zzalz;

            
            {
                zzalz = leavematchimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LeaveMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzav(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult zzav(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult(this, status) {

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final LoadMatchImpl zzalA;

            
            {
                zzalA = loadmatchimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadMatchesImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaw(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult zzaw(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult(this, status) {

                public LoadMatchesResponse getMatches()
                {
                    return new LoadMatchesResponse(new Bundle());
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadMatchesImpl zzalB;

            
            {
                zzalB = loadmatchesimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadMatchesImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateMatchImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzax(status);
        }

        public com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult zzax(Status status)
        {
            return new com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult(this, status) {

                public TurnBasedMatch getMatch()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final UpdateMatchImpl zzalC;

            
            {
                zzalC = updatematchimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private UpdateMatchImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public TurnBasedMultiplayerImpl()
    {
    }

    public PendingResult acceptInvitation(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzd(this, zzajZ);
            }

            final String zzajZ;
            final TurnBasedMultiplayerImpl zzalq;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzajZ = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult cancelMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new CancelMatchImpl(s, googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzf(this, zzalr);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s1;
                super(s, googleapiclient);
            }
        }
);
    }

    public PendingResult createMatch(GoogleApiClient googleapiclient, TurnBasedMatchConfig turnbasedmatchconfig)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, turnbasedmatchconfig) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalp);
            }

            final TurnBasedMatchConfig zzalp;
            final TurnBasedMultiplayerImpl zzalq;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalp = turnbasedmatchconfig;
                super(googleapiclient);
            }
        }
);
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzq(s, 1);
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzp(s, 1);
    }

    public void dismissMatch(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzct(s);
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s)
    {
        return finishMatch(googleapiclient, s, null, (ParticipantResult[])null);
    }

    public PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], List list)
    {
        if(list == null)
            list = null;
        else
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        return finishMatch(googleapiclient, s, abyte0, ((ParticipantResult []) (list)));
    }

    public transient PendingResult finishMatch(GoogleApiClient googleapiclient, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        return googleapiclient.zzb(new UpdateMatchImpl(googleapiclient, s, abyte0, aparticipantresult) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalr, zzalu, zzalw);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;
            final byte zzalu[];
            final ParticipantResult zzalw[];

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                zzalu = abyte0;
                zzalw = aparticipantresult;
                super(googleapiclient);
            }
        }
);
    }

    public Intent getInboxIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqK();
    }

    public int getMaxMatchDataSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqU();
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j)
    {
        return Games.zzd(googleapiclient).zzb(i, j, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag)
    {
        return Games.zzd(googleapiclient).zzb(i, j, flag);
    }

    public PendingResult leaveMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new LeaveMatchImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zze(this, zzalr);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult leaveMatchDuringTurn(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.zzb(new LeaveMatchImpl(googleapiclient, s, s1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalr, zzalv);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;
            final String zzalv;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                zzalv = s1;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMatch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new LoadMatchImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzg(this, zzalr);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int i, int ai[])
    {
        return googleapiclient.zza(new LoadMatchesImpl(googleapiclient, i, ai) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzals, zzalt);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final int zzals;
            final int zzalt[];

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzals = i;
                zzalt = ai;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult loadMatchesByStatus(GoogleApiClient googleapiclient, int ai[])
    {
        return loadMatchesByStatus(googleapiclient, 0, ai);
    }

    public void registerMatchUpdateListener(GoogleApiClient googleapiclient, OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if(gamesclientimpl != null)
            gamesclientimpl.zzb(googleapiclient.zzl(onturnbasedmatchupdatereceivedlistener));
    }

    public PendingResult rematch(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new InitiateMatchImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzc(this, zzalr);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1)
    {
        return takeTurn(googleapiclient, s, abyte0, s1, (ParticipantResult[])null);
    }

    public PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, List list)
    {
        if(list == null)
            list = null;
        else
            list = (ParticipantResult[])list.toArray(new ParticipantResult[list.size()]);
        return takeTurn(googleapiclient, s, abyte0, s1, ((ParticipantResult []) (list)));
    }

    public transient PendingResult takeTurn(GoogleApiClient googleapiclient, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
    {
        return googleapiclient.zzb(new UpdateMatchImpl(googleapiclient, s, abyte0, s1, aparticipantresult) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalr, zzalu, zzalv, zzalw);
            }

            final TurnBasedMultiplayerImpl zzalq;
            final String zzalr;
            final byte zzalu[];
            final String zzalv;
            final ParticipantResult zzalw[];

            
            {
                zzalq = TurnBasedMultiplayerImpl.this;
                zzalr = s;
                zzalu = abyte0;
                zzalv = s1;
                zzalw = aparticipantresult;
                super(googleapiclient);
            }
        }
);
    }

    public void unregisterMatchUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzqN();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$11

/* anonymous class */
    class _cls11 extends InitiateMatchImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajw, zzalr);
        }

        final String zzajw;
        final String zzalr;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$12

/* anonymous class */
    class _cls12 extends InitiateMatchImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzajw, zzalr);
        }

        final String zzajw;
        final String zzalr;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl$13

/* anonymous class */
    class _cls13 extends LoadMatchesImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzals, zzalt);
        }

        final String zzajw;
        final int zzals;
        final int zzalt[];
    }

}
