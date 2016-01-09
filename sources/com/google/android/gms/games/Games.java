// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.zza.zza
    {

        public BaseGamesApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(Games.zzKh, googleapiclient);
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public static Builder builder()
        {
            return new Builder();
        }

        public final String zzagA;
        public final ArrayList zzagB;
        public final boolean zzagv;
        public final boolean zzagw;
        public final int zzagx;
        public final boolean zzagy;
        public final int zzagz;

        private GamesOptions()
        {
            zzagv = false;
            zzagw = true;
            zzagx = 17;
            zzagy = false;
            zzagz = 4368;
            zzagA = null;
            zzagB = new ArrayList();
        }


        private GamesOptions(Builder builder1)
        {
            zzagv = builder1.zzagv;
            zzagw = builder1.zzagw;
            zzagx = builder1.zzagx;
            zzagy = builder1.zzagy;
            zzagz = builder1.zzagz;
            zzagA = builder1.zzagA;
            zzagB = builder1.zzagB;
        }

    }

    public static final class GamesOptions.Builder
    {

        public GamesOptions build()
        {
            return new GamesOptions(this);
        }

        public GamesOptions.Builder setSdkVariant(int i)
        {
            zzagz = i;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag)
        {
            zzagw = flag;
            zzagx = 17;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag, int i)
        {
            zzagw = flag;
            zzagx = i;
            return this;
        }

        String zzagA;
        ArrayList zzagB;
        boolean zzagv;
        boolean zzagw;
        int zzagx;
        boolean zzagy;
        int zzagz;

        private GamesOptions.Builder()
        {
            zzagv = false;
            zzagw = true;
            zzagx = 17;
            zzagy = false;
            zzagz = 4368;
            zzagA = null;
            zzagB = new ArrayList();
        }

    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private SignOutImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    private Games()
    {
    }

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzqT();
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzqE();
    }

    public static int getSdkVariant(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzqS();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzqR();
    }

    public static void setGravityForPopups(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient = zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzeV(i);
    }

    public static void setViewForPopups(GoogleApiClient googleapiclient, View view)
    {
        zzv.zzr(view);
        googleapiclient = zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzn(view);
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new SignOutImpl(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this);
            }

        }
);
    }

    public static GamesClientImpl zzb(GoogleApiClient googleapiclient, boolean flag)
    {
        boolean flag1;
        if(googleapiclient != null)
            flag1 = true;
        else
            flag1 = false;
        zzv.zzb(flag1, "GoogleApiClient parameter is required.");
        zzv.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return zzc(googleapiclient, flag);
    }

    public static GamesClientImpl zzc(GoogleApiClient googleapiclient, boolean flag)
    {
        zzv.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean flag1 = googleapiclient.hasConnectedApi(API);
        if(flag && !flag1)
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        if(flag1)
            return (GamesClientImpl)googleapiclient.zza(zzKh);
        else
            return null;
    }

    public static GamesClientImpl zzd(GoogleApiClient googleapiclient)
    {
        return zzb(googleapiclient, true);
    }

    public static final Api API;
    public static final Achievements Achievements = new AchievementsImpl();
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    static final com.google.android.gms.common.api.Api.zzc zzKh;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;
    public static final Scope zzagq;
    public static final Api zzagr;
    public static final AppContents zzags = new AppContentsImpl();
    public static final Multiplayer zzagt = new MultiplayerImpl();
    public static final Acls zzagu = new AclsImpl();

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 1;
            }

            public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (GamesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public GamesClientImpl zza(Context context, Looper looper, zze zze, GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if(gamesoptions == null)
                    gamesoptions = new GamesOptions();
                return new GamesClientImpl(context, looper, zze, gamesoptions, connectioncallbacks, onconnectionfailedlistener);
            }

        }
;
        SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        API = new Api("Games.API", zzKi, zzKh, new Scope[] {
            SCOPE_GAMES
        });
        zzagq = new Scope("https://www.googleapis.com/auth/games.firstparty");
        zzagr = new Api("Games.API_1P", zzKi, zzKh, new Scope[] {
            zzagq
        });
    }
}
