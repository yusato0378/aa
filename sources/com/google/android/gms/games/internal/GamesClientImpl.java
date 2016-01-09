// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.ExtendedGameBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.signin.internal.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesLog, IGamesService, AbstractGamesCallbacks, 
//            AbstractGamesClient, PopupLocationInfoParcelable

public final class GamesClientImpl extends zzi
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener
{
    private static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            zza(roomstatusupdatelistener, room, zzahU);
        }

        protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        private final ArrayList zzahU = new ArrayList();

        AbstractPeerStatusNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder);
            int i = 0;
            for(int j = as.length; i < j; i++)
                zzahU.add(as[i]);

        }
    }

    private static abstract class AbstractRoomNotifier extends zzb
    {

        protected void zza(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            zza(roomupdatelistener, GamesClientImpl.zzV(dataholder), dataholder.getStatusCode());
        }

        protected abstract void zza(RoomUpdateListener roomupdatelistener, Room room, int i);

        protected volatile void zza(Object obj, DataHolder dataholder)
        {
            zza((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static abstract class AbstractRoomStatusNotifier extends zzb
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            zza(roomstatusupdatelistener, GamesClientImpl.zzV(dataholder));
        }

        protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void zza(Object obj, DataHolder dataholder)
        {
            zza((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        public Quest getQuest()
        {
            return zzahV;
        }

        private final Quest zzahV = null;

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzahV = new QuestEntity((Quest)dataholder.get(0));
_L4:
            dataholder.release();
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzf(int i, String s)
        {
            zzKq.zzj(new UpdateAchievementResultImpl(i, s));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzf(DataHolder dataholder)
        {
            zzKq.zzj(new LoadAchievementsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zza(DataHolder adataholder[])
        {
            zzahW.zzj(new LoadAppContentsResultImpl(adataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzahW;

        public AppContentLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzahW = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class CancelMatchResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        public String getMatchId()
        {
            return zzahX;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzahX;

        CancelMatchResultImpl(Status status, String s)
        {
            zzKr = status;
            zzahX = s;
        }
    }

    private static final class ClaimMilestoneResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
    {

        public Milestone getMilestone()
        {
            return zzahY;
        }

        public Quest getQuest()
        {
            return zzahV;
        }

        private final Quest zzahV;
        private final Milestone zzahY = null;

        ClaimMilestoneResultImpl(DataHolder dataholder, String s)
        {
            int i;
            i = 0;
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            List list;
            int j;
            zzahV = new QuestEntity((Quest)dataholder.get(0));
            list = zzahV.zzsj();
            j = list.size();
_L4:
            if(i >= j)
                break; /* Loop/switch isn't completed */
            if(!((Milestone)list.get(i)).getMilestoneId().equals(s))
                break MISSING_BLOCK_LABEL_111;
            zzahY = (Milestone)list.get(i);
            dataholder.release();
            return;
            i++;
            if(true) goto _L4; else goto _L3
_L3:
_L6:
            dataholder.release();
            return;
_L2:
            zzahY = null;
            zzahV = null;
            if(true) goto _L6; else goto _L5
_L5:
            s;
            dataholder.release();
            throw s;
        }
    }

    private static final class CommitSnapshotResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    {

        public SnapshotMetadata getSnapshotMetadata()
        {
            return zzahZ;
        }

        private final SnapshotMetadata zzahZ = null;

        CommitSnapshotResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new SnapshotMetadataBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzahZ = new SnapshotMetadataEntity(dataholder.get(0));
_L4:
            dataholder.release();
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingLoadResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        ContactSettingLoadResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzG(DataHolder dataholder)
        {
            zzKq.zzj(new ContactSettingLoadResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzeS(int i)
        {
            zzKq.zzj(GamesStatusCodes.zzeJ(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        public String getSnapshotId()
        {
            return zzaia;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzaia;

        DeleteSnapshotResultImpl(int i, String s)
        {
            zzKr = GamesStatusCodes.zzeJ(i);
            zzaia = s;
        }
    }

    private static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class EventsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzg(DataHolder dataholder)
        {
            zzKq.zzj(new LoadEventResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        EventsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class ExtendedGamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzm(DataHolder dataholder)
        {
            zzKq.zzj(new LoadExtendedGamesResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        ExtendedGamesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache
    {

        protected void zzr(String s, int i)
        {
            if(zzahT.isConnected())
            {
                ((IGamesService)zzahT.zzlX()).zzo(s, i);
                return;
            }
            try
            {
                GamesLog.zzu("GamesClientImpl", (new StringBuilder()).append("Unable to increment event ").append(s).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                GamesClientImpl.zza(zzahT, s);
            }
            return;
        }

        final GamesClientImpl zzahT;

        public GameClientEventIncrementCache()
        {
            zzahT = GamesClientImpl.this;
            super(getContext().getMainLooper(), 1000);
        }
    }

    private static final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzn(DataHolder dataholder)
        {
            zzKq.zzj(new LoadGameInstancesResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzaib;
        private final boolean zzaic;

        public GameMuteStatusChangeResultImpl(int i, String s, boolean flag)
        {
            zzKr = GamesStatusCodes.zzeJ(i);
            zzaib = s;
            zzaic = flag;
        }
    }

    private static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        public void zza(int i, String s, boolean flag)
        {
            zzKq.zzj(new GameMuteStatusChangeResultImpl(i, s, flag));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusLoadResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzaib;
        private final boolean zzaic;

        public GameMuteStatusLoadResultImpl(DataHolder dataholder)
        {
            zzKr = GamesStatusCodes.zzeJ(dataholder.getStatusCode());
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzaib = dataholder.zzd("external_game_id", 0, 0);
            zzaic = dataholder.zze("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            zzaib = null;
            zzaic = false;
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzE(DataHolder dataholder)
        {
            zzKq.zzj(new GameMuteStatusLoadResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzo(DataHolder dataholder)
        {
            zzKq.zzj(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static abstract class GamesDataHolderResult extends zzc
    {

        protected GamesDataHolderResult(DataHolder dataholder)
        {
            super(dataholder, GamesStatusCodes.zzeJ(dataholder.getStatusCode()));
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzl(DataHolder dataholder)
        {
            zzKq.zzj(new LoadGamesResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        GamesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final Bundle zzaid;

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            zzKr = status;
            zzaid = bundle;
        }
    }

    private static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzh(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzeJ(i);
            zzKq.zzj(new InboxCountResultImpl(status, bundle));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class InitiateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult
    {

        InitiateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks
    {

        public void onInvitationRemoved(String s)
        {
            zzYe.zza(new InvitationRemovedNotifier(s));
        }

        public void zzq(DataHolder dataholder)
        {
            InvitationBuffer invitationbuffer;
            invitationbuffer = new InvitationBuffer(dataholder);
            dataholder = null;
            if(invitationbuffer.getCount() > 0)
                dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
            invitationbuffer.release();
            if(dataholder != null)
                zzYe.zza(new InvitationReceivedNotifier(dataholder));
            return;
            dataholder;
            invitationbuffer.release();
            throw dataholder;
        }

        private final com.google.android.gms.common.api.zzi zzYe;

        InvitationReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzYe = zzi1;
        }
    }

    private static final class InvitationReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(zzaie);
        }

        public void zzk(Object obj)
        {
            zza((OnInvitationReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final Invitation zzaie;

        InvitationReceivedNotifier(Invitation invitation)
        {
            zzaie = invitation;
        }
    }

    private static final class InvitationRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(zzaif);
        }

        public void zzk(Object obj)
        {
            zza((OnInvitationReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final String zzaif;

        InvitationRemovedNotifier(String s)
        {
            zzaif = s;
        }
    }

    private static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzp(DataHolder dataholder)
        {
            zzKq.zzj(new LoadInvitationsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class JoinedRoomNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onJoinedRoom(i, room);
        }

        public JoinedRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        public LeaderboardBuffer getLeaderboards()
        {
            return zzaig;
        }

        private final LeaderboardBuffer zzaig;

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaig = new LeaderboardBuffer(dataholder);
        }
    }

    private static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zza(DataHolder dataholder, DataHolder dataholder1)
        {
            zzKq.zzj(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzh(DataHolder dataholder)
        {
            zzKq.zzj(new LeaderboardMetadataResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class LeaveMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult
    {

        LeaveMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeftRoomNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(zzOJ, zzaih);
        }

        public void zzk(Object obj)
        {
            zza((RoomUpdateListener)obj);
        }

        public void zzkJ()
        {
        }

        private final int zzOJ;
        private final String zzaih;

        LeftRoomNotifier(int i, String s)
        {
            zzOJ = i;
            zzaih = s;
        }
    }

    private static final class LoadAchievementsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        public AchievementBuffer getAchievements()
        {
            return zzaii;
        }

        private final AchievementBuffer zzaii;

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaii = new AchievementBuffer(dataholder);
        }
    }

    private static final class LoadAclResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        LoadAclResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadAppContentsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult
    {

        private final ArrayList zzaij;

        LoadAppContentsResultImpl(DataHolder adataholder[])
        {
            super(adataholder[0]);
            zzaij = new ArrayList(Arrays.asList(adataholder));
        }
    }

    private static final class LoadEventResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.event.Events.LoadEventsResult
    {

        public EventBuffer getEvents()
        {
            return zzaik;
        }

        private final EventBuffer zzaik;

        LoadEventResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaik = new EventBuffer(dataholder);
        }
    }

    private static final class LoadExtendedGamesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult
    {

        private final ExtendedGameBuffer zzail;

        LoadExtendedGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzail = new ExtendedGameBuffer(dataholder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        private final GameInstanceBuffer zzaim;

        LoadGameInstancesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaim = new GameInstanceBuffer(dataholder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        private final GameSearchSuggestionBuffer zzain;

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzain = new GameSearchSuggestionBuffer(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        public GameBuffer getGames()
        {
            return zzaio;
        }

        private final GameBuffer zzaio;

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaio = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        public InvitationBuffer getInvitations()
        {
            return zzaip;
        }

        private final InvitationBuffer zzaip;

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaip = new InvitationBuffer(dataholder);
        }
    }

    private static final class LoadMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult
    {

        LoadMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadMatchesResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult
    {

        public LoadMatchesResponse getMatches()
        {
            return zzaiq;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            zzaiq.release();
        }

        private final Status zzKr;
        private final LoadMatchesResponse zzaiq;

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            zzKr = status;
            zzaiq = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadPlayerScoreResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        public LeaderboardScore getScore()
        {
            return zzair;
        }

        private final LeaderboardScoreEntity zzair = null;

        LoadPlayerScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new LeaderboardScoreBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzair = (LeaderboardScoreEntity)dataholder.get(0).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class LoadPlayersResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        public PlayerBuffer getPlayers()
        {
            return zzais;
        }

        private final PlayerBuffer zzais;

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzais = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadProfileSettingsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadProfileSettingsResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        public boolean isProfileVisible()
        {
            return zzahH;
        }

        public boolean isVisibilityExplicitlySet()
        {
            return zzait;
        }

        private final boolean zzahH;
        private final boolean zzait;

        LoadProfileSettingsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            int i = dataholder.zzaD(0);
            zzahH = dataholder.zze("profile_visible", 0, i);
            zzait = dataholder.zze("profile_visibility_explicitly_set", 0, i);
_L4:
            dataholder.close();
            return;
_L2:
            zzahH = true;
            zzait = false;
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadQuestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        public QuestBuffer getQuests()
        {
            return new QuestBuffer(zzPy);
        }

        private final DataHolder zzPy;

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzPy = dataholder;
        }
    }

    private static final class LoadRequestSummariesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.LoadRequestSummariesResult
    {

        LoadRequestSummariesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadRequestsResultImpl
        implements com.google.android.gms.games.request.Requests.LoadRequestsResult
    {

        public GameRequestBuffer getRequests(int i)
        {
            String s = RequestType.zzeZ(i);
            if(!zzaiu.containsKey(s))
                return null;
            else
                return new GameRequestBuffer((DataHolder)zzaiu.get(s));
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            Iterator iterator = zzaiu.keySet().iterator();
            do
            {
                if(!iterator.hasNext())
                    break;
                Object obj = (String)iterator.next();
                obj = (DataHolder)zzaiu.getParcelable(((String) (obj)));
                if(obj != null)
                    ((DataHolder) (obj)).close();
            } while(true);
        }

        private final Status zzKr;
        private final Bundle zzaiu;

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            zzKr = status;
            zzaiu = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        public Leaderboard getLeaderboard()
        {
            return zzaiv;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return zzaiw;
        }

        private final LeaderboardEntity zzaiv = null;
        private final LeaderboardScoreBuffer zzaiw;

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzaiv = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            zzaiw = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.release();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(zzPy);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final List zzaix;
        private final Bundle zzaiy;

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            zzKr = status;
            zzaix = bundle.getStringArrayList("game_category_list");
            zzaiy = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer zzaiz;

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaiz = new ExperienceEventBuffer(dataholder);
        }
    }

    private static final class MatchRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(zzaiA);
        }

        public void zzk(Object obj)
        {
            zza((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final String zzaiA;

        MatchRemovedNotifier(String s)
        {
            zzaiA = s;
        }
    }

    private static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        public void onTurnBasedMatchRemoved(String s)
        {
            zzYe.zza(new MatchRemovedNotifier(s));
        }

        public void zzw(DataHolder dataholder)
        {
            TurnBasedMatchBuffer turnbasedmatchbuffer;
            turnbasedmatchbuffer = new TurnBasedMatchBuffer(dataholder);
            dataholder = null;
            if(turnbasedmatchbuffer.getCount() > 0)
                dataholder = (TurnBasedMatch)((TurnBasedMatch)turnbasedmatchbuffer.get(0)).freeze();
            turnbasedmatchbuffer.release();
            if(dataholder != null)
                zzYe.zza(new MatchUpdateReceivedNotifier(dataholder));
            return;
            dataholder;
            turnbasedmatchbuffer.release();
            throw dataholder;
        }

        private final com.google.android.gms.common.api.zzi zzYe;

        MatchUpdateReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzYe = zzi1;
        }
    }

    private static final class MatchUpdateReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(zzaiB);
        }

        public void zzk(Object obj)
        {
            zza((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final TurnBasedMatch zzaiB;

        MatchUpdateReceivedNotifier(TurnBasedMatch turnbasedmatch)
        {
            zzaiB = turnbasedmatch;
        }
    }

    private static final class MessageReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(zzaiC);
        }

        public void zzk(Object obj)
        {
            zza((RealTimeMessageReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final RealTimeMessage zzaiC;

        MessageReceivedNotifier(RealTimeMessage realtimemessage)
        {
            zzaiC = realtimemessage;
        }
    }

    private static final class NearbyPlayerDetectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
        {
            onnearbyplayerdetectedlistener.zza(zzaiD);
        }

        public void zzk(Object obj)
        {
            zza((OnNearbyPlayerDetectedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final Player zzaiD;
    }

    private static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzF(DataHolder dataholder)
        {
            zzKq.zzj(new LoadAclResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzeR(int i)
        {
            zzKq.zzj(GamesStatusCodes.zzeJ(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class OpenSnapshotResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    {

        public String getConflictId()
        {
            return zzaiF;
        }

        public Snapshot getConflictingSnapshot()
        {
            return zzaiG;
        }

        public SnapshotContents getResolutionSnapshotContents()
        {
            return zzaiI;
        }

        public Snapshot getSnapshot()
        {
            return zzaiE;
        }

        private final Snapshot zzaiE;
        private final String zzaiF;
        private final Snapshot zzaiG;
        private final Contents zzaiH;
        private final SnapshotContents zzaiI;

        OpenSnapshotResultImpl(DataHolder dataholder, Contents contents)
        {
            this(dataholder, null, contents, null, null);
        }

        OpenSnapshotResultImpl(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            SnapshotMetadataBuffer snapshotmetadatabuffer;
            boolean flag;
            flag = true;
            super(dataholder);
            snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
            if(snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
            zzaiE = null;
            zzaiG = null;
_L3:
            snapshotmetadatabuffer.release();
            zzaiF = s;
            zzaiH = contents2;
            zzaiI = new SnapshotContentsEntity(contents2);
            return;
_L2:
            if(snapshotmetadatabuffer.getCount() != 1)
                break MISSING_BLOCK_LABEL_144;
            if(dataholder.getStatusCode() == 4004)
                flag = false;
            com.google.android.gms.common.internal.zzb.zzP(flag);
            zzaiE = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            zzaiG = null;
              goto _L3
            dataholder;
            snapshotmetadatabuffer.release();
            throw dataholder;
            zzaiE = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            zzaiG = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContentsEntity(contents1));
              goto _L3
        }
    }

    private static final class P2PConnectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PConnected(zzaiJ);
        }

        public void zzk(Object obj)
        {
            zza((RoomStatusUpdateListener)obj);
        }

        public void zzkJ()
        {
        }

        private final String zzaiJ;

        P2PConnectedNotifier(String s)
        {
            zzaiJ = s;
        }
    }

    private static final class P2PDisconnectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PDisconnected(zzaiJ);
        }

        public void zzk(Object obj)
        {
            zza((RoomStatusUpdateListener)obj);
        }

        public void zzkJ()
        {
        }

        private final String zzaiJ;

        P2PDisconnectedNotifier(String s)
        {
            zzaiJ = s;
        }
    }

    private static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzH(DataHolder dataholder)
        {
            zzKq.zzj(new LoadPlayerScoreResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzg(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzeJ(i);
            zzKq.zzj(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzS(DataHolder dataholder)
        {
            zzKq.zzj(new LoadXpStreamResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzj(DataHolder dataholder)
        {
            zzKq.zzj(new LoadPlayersResultImpl(dataholder));
        }

        public void zzk(DataHolder dataholder)
        {
            zzKq.zzj(new LoadPlayersResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PopupLocationInfoBinderCallbacks extends AbstractGamesClient
    {

        public PopupLocationInfoParcelable zzqz()
        {
            return new PopupLocationInfoParcelable(zzahO.zzrp());
        }

        private final PopupManager zzahO;

        public PopupLocationInfoBinderCallbacks(PopupManager popupmanager)
        {
            zzahO = popupmanager;
        }
    }

    static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzT(DataHolder dataholder)
        {
            zzKq.zzj(new LoadProfileSettingsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        public void zzeT(int i)
        {
            zzKq.zzj(GamesStatusCodes.zzeJ(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzO(DataHolder dataholder)
        {
            zzaiK.zzj(new AcceptQuestResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiK;

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiK = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class QuestCompletedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(QuestUpdateListener questupdatelistener)
        {
            questupdatelistener.onQuestCompleted(zzahV);
        }

        public void zzk(Object obj)
        {
            zza((QuestUpdateListener)obj);
        }

        public void zzkJ()
        {
        }

        private final Quest zzahV;

        QuestCompletedNotifier(Quest quest)
        {
            zzahV = quest;
        }
    }

    private static final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzN(DataHolder dataholder)
        {
            zzaiL.zzj(new ClaimMilestoneResultImpl(dataholder, zzaiM));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiL;
        private final String zzaiM;

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        {
            zzaiL = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
            zzaiM = (String)zzv.zzb(s, "MilestoneId must not be null");
        }
    }

    private static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        private Quest zzW(DataHolder dataholder)
        {
            QuestBuffer questbuffer;
            questbuffer = new QuestBuffer(dataholder);
            dataholder = null;
            if(questbuffer.getCount() > 0)
                dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
            questbuffer.release();
            return dataholder;
            dataholder;
            questbuffer.release();
            throw dataholder;
        }

        public void zzP(DataHolder dataholder)
        {
            dataholder = zzW(dataholder);
            if(dataholder != null)
                zzYe.zza(new QuestCompletedNotifier(dataholder));
        }

        private final com.google.android.gms.common.api.zzi zzYe;

        QuestUpdateBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzYe = zzi1;
        }
    }

    private static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzR(DataHolder dataholder)
        {
            zzaiN.zzj(new LoadQuestsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiN;

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiN = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RealTimeMessageSentNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if(reliablemessagesentcallback != null)
                reliablemessagesentcallback.onRealTimeMessageSent(zzOJ, zzaiP, zzaiO);
        }

        public void zzk(Object obj)
        {
            zza((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        public void zzkJ()
        {
        }

        private final int zzOJ;
        private final String zzaiO;
        private final int zzaiP;

        RealTimeMessageSentNotifier(int i, int j, String s)
        {
            zzOJ = i;
            zzaiP = j;
            zzaiO = s;
        }
    }

    private static final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzb(int i, int j, String s)
        {
            if(zzaiQ != null)
                zzaiQ.zza(new RealTimeMessageSentNotifier(i, j, s));
        }

        final com.google.android.gms.common.api.zzi zzaiQ;

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.common.api.zzi zzi1)
        {
            zzaiQ = zzi1;
        }
    }

    private static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        public void onRequestRemoved(String s)
        {
            zzYe.zza(new RequestRemovedNotifier(s));
        }

        public void zzr(DataHolder dataholder)
        {
            GameRequestBuffer gamerequestbuffer;
            gamerequestbuffer = new GameRequestBuffer(dataholder);
            dataholder = null;
            if(gamerequestbuffer.getCount() > 0)
                dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
            gamerequestbuffer.release();
            if(dataholder != null)
                zzYe.zza(new RequestReceivedNotifier(dataholder));
            return;
            dataholder;
            gamerequestbuffer.release();
            throw dataholder;
        }

        private final com.google.android.gms.common.api.zzi zzYe;

        RequestReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzYe = zzi1;
        }
    }

    private static final class RequestReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(zzaiR);
        }

        public void zzk(Object obj)
        {
            zza((OnRequestReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final GameRequest zzaiR;

        RequestReceivedNotifier(GameRequest gamerequest)
        {
            zzaiR = gamerequest;
        }
    }

    private static final class RequestRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        public void zza(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(zzAu);
        }

        public void zzk(Object obj)
        {
            zza((OnRequestReceivedListener)obj);
        }

        public void zzkJ()
        {
        }

        private final String zzAu;

        RequestRemovedNotifier(String s)
        {
            zzAu = s;
        }
    }

    private static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzJ(DataHolder dataholder)
        {
            zzaiS.zzj(new SendRequestResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiS;

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiS = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzK(DataHolder dataholder)
        {
            zzaiT.zzj(new LoadRequestSummariesResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiT;

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiT = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zze(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzeJ(i);
            zzaiU.zzj(new LoadRequestsResultImpl(status, bundle));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiU;

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiU = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzI(DataHolder dataholder)
        {
            zzaiV.zzj(new UpdateRequestsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiV;

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiV = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        public void onLeftRoom(int i, String s)
        {
            zzaiW.zza(new LeftRoomNotifier(i, s));
        }

        public void onP2PConnected(String s)
        {
            if(zzaiX != null)
                zzaiX.zza(new P2PConnectedNotifier(s));
        }

        public void onP2PDisconnected(String s)
        {
            if(zzaiX != null)
                zzaiX.zza(new P2PDisconnectedNotifier(s));
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            if(zzaiY != null)
                zzaiY.zza(new MessageReceivedNotifier(realtimemessage));
        }

        public void zzA(DataHolder dataholder)
        {
            if(zzaiX != null)
                zzaiX.zza(new RoomAutoMatchingNotifier(dataholder));
        }

        public void zzB(DataHolder dataholder)
        {
            zzaiW.zza(new RoomConnectedNotifier(dataholder));
        }

        public void zzC(DataHolder dataholder)
        {
            if(zzaiX != null)
                zzaiX.zza(new ConnectedToRoomNotifier(dataholder));
        }

        public void zzD(DataHolder dataholder)
        {
            if(zzaiX != null)
                zzaiX.zza(new DisconnectedFromRoomNotifier(dataholder));
        }

        public void zza(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerInvitedToRoomNotifier(dataholder, as));
        }

        public void zzb(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerJoinedRoomNotifier(dataholder, as));
        }

        public void zzc(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerLeftRoomNotifier(dataholder, as));
        }

        public void zzd(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerDeclinedNotifier(dataholder, as));
        }

        public void zze(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerConnectedNotifier(dataholder, as));
        }

        public void zzf(DataHolder dataholder, String as[])
        {
            if(zzaiX != null)
                zzaiX.zza(new PeerDisconnectedNotifier(dataholder, as));
        }

        public void zzx(DataHolder dataholder)
        {
            zzaiW.zza(new RoomCreatedNotifier(dataholder));
        }

        public void zzy(DataHolder dataholder)
        {
            zzaiW.zza(new JoinedRoomNotifier(dataholder));
        }

        public void zzz(DataHolder dataholder)
        {
            if(zzaiX != null)
                zzaiX.zza(new RoomConnectingNotifier(dataholder));
        }

        private final com.google.android.gms.common.api.zzi zzaiW;
        private final com.google.android.gms.common.api.zzi zzaiX;
        private final com.google.android.gms.common.api.zzi zzaiY;

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi1)
        {
            zzaiW = (com.google.android.gms.common.api.zzi)zzv.zzb(zzi1, "Callbacks must not be null");
            zzaiX = null;
            zzaiY = null;
        }

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3)
        {
            zzaiW = (com.google.android.gms.common.api.zzi)zzv.zzb(zzi1, "Callbacks must not be null");
            zzaiX = zzi2;
            zzaiY = zzi3;
        }
    }

    private static final class RoomConnectedNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomConnected(i, room);
        }

        RoomConnectedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomCreatedNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomCreated(i, room);
        }

        public RoomCreatedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class SendRequestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest zzaiR = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzaiR = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzjL()
        {
            Status status = GamesStatusCodes.zzeJ(0);
            zzKq.zzj(status);
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzM(DataHolder dataholder)
        {
            zzaiZ.zzj(new CommitSnapshotResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaiZ;

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaiZ = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzh(int i, String s)
        {
            zzKq.zzj(new DeleteSnapshotResultImpl(i, s));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zza(DataHolder dataholder, Contents contents)
        {
            zzaja.zzj(new OpenSnapshotResultImpl(dataholder, contents));
        }

        public void zza(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            zzaja.zzj(new OpenSnapshotResultImpl(dataholder, s, contents, contents1, contents2));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaja;

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaja = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzL(DataHolder dataholder)
        {
            zzajb.zzj(new LoadSnapshotsResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzajb;

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzajb = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzi(DataHolder dataholder)
        {
            zzKq.zzj(new SubmitScoreResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        public ScoreSubmissionData getScoreData()
        {
            return zzajc;
        }

        private final ScoreSubmissionData zzajc;

        public SubmitScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzajc = new ScoreSubmissionData(dataholder);
            dataholder.close();
            return;
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzg(int i, String s)
        {
            Status status = GamesStatusCodes.zzeJ(i);
            zzajd.zzj(new CancelMatchResultImpl(status, s));
        }

        private final com.google.android.gms.common.api.zza.zzb zzajd;

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzajd = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzt(DataHolder dataholder)
        {
            zzaje.zzj(new InitiateMatchResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaje;

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaje = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzv(DataHolder dataholder)
        {
            zzajf.zzj(new LeaveMatchResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzajf;

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzajf = (com.google.android.gms.common.api.zza.zzb)com.google.android.gms.common.internal.zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzs(DataHolder dataholder)
        {
            zzajg.zzj(new LoadMatchResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzajg;

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzajg = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends GamesDataHolderResult
    {

        public TurnBasedMatch getMatch()
        {
            return zzaiB;
        }

        final TurnBasedMatch zzaiB = null;

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if(dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzaiB = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if(true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzu(DataHolder dataholder)
        {
            zzajh.zzj(new UpdateMatchResultImpl(dataholder));
        }

        private final com.google.android.gms.common.api.zza.zzb zzajh;

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzajh = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        public void zzd(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzeJ(i);
            zzaji.zzj(new LoadMatchesResultImpl(status, bundle));
        }

        private final com.google.android.gms.common.api.zza.zzb zzaji;

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaji = (com.google.android.gms.common.api.zza.zzb)zzv.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class UpdateAchievementResultImpl
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        public String getAchievementId()
        {
            return zzagT;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final String zzagT;

        UpdateAchievementResultImpl(int i, String s)
        {
            zzKr = GamesStatusCodes.zzeJ(i);
            zzagT = s;
        }
    }

    private static final class UpdateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult
    {

        UpdateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class UpdateRequestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        public Set getRequestIds()
        {
            return zzajj.getRequestIds();
        }

        public int getRequestOutcome(String s)
        {
            return zzajj.getRequestOutcome(s);
        }

        private final RequestUpdateOutcomes zzajj;

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzajj = RequestUpdateOutcomes.zzX(dataholder);
        }
    }


    public GamesClientImpl(Context context, Looper looper, zze zze1, com.google.android.gms.games.Games.GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 1, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzahK = new EventIncrementManager() {

            public EventIncrementCache zzrb()
            {
                return zzahT. new GameClientEventIncrementCache();
            }

            final GamesClientImpl zzahT;

            
            {
                zzahT = GamesClientImpl.this;
                super();
            }
        }
;
        zzahP = false;
        zzahL = zze1.zzlJ();
        zzahO = PopupManager.zza(this, zze1.zzlF());
        zzn(zze1.zzlL());
        zzahS = gamesoptions;
        registerConnectionCallbacks(this);
        registerConnectionFailedListener(this);
    }

    private static Room zzU(DataHolder dataholder)
    {
        RoomBuffer roombuffer;
        roombuffer = new RoomBuffer(dataholder);
        dataholder = null;
        if(roombuffer.getCount() > 0)
            dataholder = (Room)((Room)roombuffer.get(0)).freeze();
        roombuffer.release();
        return dataholder;
        dataholder;
        roombuffer.release();
        throw dataholder;
    }

    static Room zzV(DataHolder dataholder)
    {
        return zzU(dataholder);
    }

    static void zza(GamesClientImpl gamesclientimpl, RemoteException remoteexception)
    {
        gamesclientimpl.zzb(remoteexception);
    }

    private void zzb(RemoteException remoteexception)
    {
        com.google.android.gms.games.internal.GamesLog.zzb("GamesClientImpl", "service died", remoteexception);
    }

    private void zzqC()
    {
        zzahM = null;
        zzahN = null;
    }

    public void connect()
    {
        zzqC();
        super.connect();
    }

    public void disconnect()
    {
        zzahP = false;
        if(isConnected())
            try
            {
                IGamesService igamesservice = (IGamesService)zzlX();
                igamesservice.zzra();
                zzahK.flush();
                igamesservice.zzD(zzahR);
            }
            catch(RemoteException remoteexception)
            {
                GamesLog.zzt("GamesClientImpl", "Failed to notify client disconnect.");
            }
        super.disconnect();
    }

    public void onConnected(Bundle bundle)
    {
        if(zzahP)
        {
            zzahO.zzrm();
            zzahP = false;
        }
        if(!zzahS.zzagv)
            zzqD();
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzahP = false;
    }

    public void onConnectionSuspended(int i)
    {
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzaW(ibinder);
    }

    public int zza(com.google.android.gms.common.api.zzi zzi1, byte abyte0[], String s, String s1)
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zza(new RealTimeReliableMessageBinderCallbacks(zzi1), abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
            return -1;
        }
        return i;
    }

    public int zza(byte abyte0[], String s, String as[])
    {
        zzv.zzb(as, "Participant IDs must not be null");
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzb(abyte0, s, as);
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            zzb(abyte0);
            return -1;
        }
        return i;
    }

    public Intent zza(int i, byte abyte0[], int j, Bitmap bitmap, String s)
    {
        try
        {
            abyte0 = ((IGamesService)zzlX()).zza(i, abyte0, j, s);
            zzv.zzb(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            zzb(abyte0);
            return null;
        }
        return abyte0;
    }

    public Intent zza(PlayerEntity playerentity)
    {
        try
        {
            playerentity = ((IGamesService)zzlX()).zza(playerentity);
        }
        // Misplaced declaration of an exception variable
        catch(PlayerEntity playerentity)
        {
            zzb(playerentity);
            return null;
        }
        return playerentity;
    }

    public Intent zza(Room room, int i)
    {
        try
        {
            room = ((IGamesService)zzlX()).zza((RoomEntity)room.freeze(), i);
        }
        // Misplaced declaration of an exception variable
        catch(Room room)
        {
            zzb(room);
            return null;
        }
        return room;
    }

    public Intent zza(String s, boolean flag, boolean flag1, int i)
    {
        try
        {
            s = ((IGamesService)zzlX()).zza(s, flag, flag1, i);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    protected Set zza(Set set)
    {
        Scope scope = new Scope("https://www.googleapis.com/auth/games");
        Scope scope1 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        Iterator iterator = set.iterator();
        boolean flag = false;
        boolean flag1 = false;
        do
        {
            if(!iterator.hasNext())
                break;
            Scope scope2 = (Scope)iterator.next();
            if(scope2.equals(scope))
                flag1 = true;
            else
            if(scope2.equals(scope1))
                flag = true;
        } while(true);
        if(flag)
        {
            if(!flag1)
                flag1 = true;
            else
                flag1 = false;
            zzv.zza(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return set;
        } else
        {
            zzv.zza(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return set;
        }
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        if(i == 0 && bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
            zzahP = bundle.getBoolean("show_welcome_popup");
            zzahM = (PlayerEntity)bundle.getParcelable("com.google.android.gms.games.current_player");
            zzahN = (GameEntity)bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.zza(i, ibinder, bundle);
    }

    public void zza(IBinder ibinder, Bundle bundle)
    {
        if(!isConnected())
            break MISSING_BLOCK_LABEL_21;
        ((IGamesService)zzlX()).zza(ibinder, bundle);
        return;
        ibinder;
        zzb(ibinder);
        return;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, int j, int k)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestsLoadedBinderCallbacks(zzb1), i, j, k);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, int j, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new ExtendedGamesLoadedBinderCallback(zzb1), i, j, flag, flag1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, String as[], boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new AppContentLoadedBinderCallbacks(zzb1), i, s, as, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, int ai[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zzb1), i, ai);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), leaderboardscorebuffer.zzsa().zzsb(), i, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, TurnBasedMatchConfig turnbasedmatchconfig)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.zzsh(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
        throws RemoteException
    {
        SnapshotContents snapshotcontents = snapshot.getSnapshotContents();
        Object obj;
        boolean flag;
        if(!snapshotcontents.isClosed())
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Snapshot already closed");
        obj = snapshotmetadatachange.zzsm();
        if(obj != null)
            ((BitmapTeleporter) (obj)).zzc(getContext().getCacheDir());
        obj = snapshotcontents.zznr();
        snapshotcontents.close();
        ((IGamesService)zzlX()).zza(new SnapshotCommittedBinderCallbacks(zzb1), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        ((IGamesService)zzlX()).zza(zzb1, s, zzahO.zzro(), zzahO.zzrn());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        ((IGamesService)zzlX()).zza(zzb1, s, i, zzahO.zzro(), zzahO.zzrn());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), s, i, j, k, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 156408498 156408498: default 24
    //                   156408498 72;
           goto _L1 _L2
_L2:
        if(s.equals("played_with"))
            byte0 = 0;
_L1:
        switch(byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
            ((IGamesService)zzlX()).zzd(new PlayersLoadedBinderCallback(zzb1), s, i, flag, flag1);
            break;
        }
        return;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new ExtendedGamesLoadedBinderCallback(zzb1), s, i, flag, flag1, flag2, flag3);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int ai[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zzb1), s, i, ai);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, long l, String s1)
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new SubmitScoreBinderCallbacks(zzb1);
        ((IGamesService)zzlX()).zza(zzb1, s, l, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new TurnBasedMatchLeftBinderCallbacks(zzb1), s, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new PlayerLeaderboardScoreLoadedBinderCallback(zzb1), s, s1, i, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestsLoadedBinderCallbacks(zzb1), s, s1, i, j, k);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), s, s1, i, j, k, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1049482625: 128
    //                   156408498: 112
    //                   782949780: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_128;
_L5:
        switch(byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            ((IGamesService)zzlX()).zza(new PlayersLoadedBinderCallback(zzb1), s, s1, i, flag, flag1);
            break;
        }
        break MISSING_BLOCK_LABEL_172;
_L4:
        if(s.equals("circled"))
            byte0 = 0;
          goto _L5
_L3:
        if(s.equals("played_with"))
            byte0 = 1;
          goto _L5
        if(s.equals("nearby"))
            byte0 = 2;
          goto _L5
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
        throws RemoteException
    {
        Object obj;
        boolean flag;
        if(!snapshotcontents.isClosed())
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "SnapshotContents already closed");
        obj = snapshotmetadatachange.zzsm();
        if(obj != null)
            ((BitmapTeleporter) (obj)).zzc(getContext().getCacheDir());
        obj = snapshotcontents.zznr();
        snapshotcontents.close();
        ((IGamesService)zzlX()).zza(new SnapshotOpenedBinderCallbacks(zzb1), s, s1, (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new LeaderboardsLoadedBinderCallback(zzb1), s, s1, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag, String as[])
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new QuestsLoadedBinderCallbacks(zzb1), s, s1, as, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int ai[], int i, boolean flag)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new QuestsLoadedBinderCallbacks(zzb1), s, s1, ai, i, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, String as[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestsUpdatedBinderCallbacks(zzb1), s, s1, as);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzf(new PlayersLoadedBinderCallback(zzb1), s, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new SnapshotOpenedBinderCallbacks(zzb1), s, flag, i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zzb1), s, abyte0, s1, aparticipantresult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zzb1), s, abyte0, aparticipantresult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String as[], int i, byte abyte0[], int j)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestSentBinderCallbacks(zzb1), s, as, i, abyte0, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new PlayersLoadedBinderCallback(zzb1), flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, Bundle bundle)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new ContactSettingsUpdatedBinderCallback(zzb1), flag, bundle);
    }

    public transient void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, String as[])
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new EventsLoadedBinderCallback(zzb1), flag, as);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int ai[], int i, boolean flag)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new QuestsLoadedBinderCallbacks(zzb1), ai, i, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new PlayersLoadedBinderCallback(zzb1), as);
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new InvitationReceivedBinderCallback(zzi1);
            ((IGamesService)zzlX()).zza(zzi1, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3, RoomConfig roomconfig)
    {
        try
        {
            zzi1 = new RoomBinderCallbacks(zzi1, zzi2, zzi3);
            ((IGamesService)zzlX()).zza(zzi1, zzahQ, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), false, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1, String s)
    {
        try
        {
            ((IGamesService)zzlX()).zzc(new RoomBinderCallbacks(zzi1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(Snapshot snapshot)
    {
        snapshot = snapshot.getSnapshotContents();
        Contents contents;
        boolean flag;
        if(!snapshot.isClosed())
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "Snapshot already closed");
        contents = snapshot.zznr();
        snapshot.close();
        try
        {
            ((IGamesService)zzlX()).zza(contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(Snapshot snapshot)
        {
            zzb(snapshot);
        }
    }

    protected IGamesService zzaW(IBinder ibinder)
    {
        return IGamesService.Stub.zzaZ(ibinder);
    }

    public Intent zzb(int i, int j, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzb(i, j, flag);
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzb(int ai[])
    {
        try
        {
            ai = ((IGamesService)zzlX()).zzb(ai);
        }
        // Misplaced declaration of an exception variable
        catch(int ai[])
        {
            zzb(((RemoteException) (ai)));
            return null;
        }
        return ai;
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new SignOutCompleteBinderCallbacks(zzb1));
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        ((IGamesService)zzlX()).zzb(zzb1, s, zzahO.zzro(), zzahO.zzrn());
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        if(zzb1 == null)
            zzb1 = null;
        else
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        ((IGamesService)zzlX()).zzb(zzb1, s, i, zzahO.zzro(), zzahO.zzrn());
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new LeaderboardScoresLoadedBinderCallback(zzb1), s, i, j, k, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new ExtendedGamesLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zzf(new QuestMilestoneClaimBinderCallbacks(zzb1, s1), s, s1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new LeaderboardScoresLoadedBinderCallback(zzb1), s, s1, i, j, k, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new PlayersLoadedBinderCallback(zzb1), s, s1, i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new AchievementsLoadedBinderCallback(zzb1), s, s1, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new LeaderboardsLoadedBinderCallback(zzb1), s, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new LeaderboardsLoadedBinderCallback(zzb1), flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, String as[])
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zza(new QuestsLoadedBinderCallbacks(zzb1), as, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestsUpdatedBinderCallbacks(zzb1), as);
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new MatchUpdateReceivedBinderCallback(zzi1);
            ((IGamesService)zzlX()).zzb(zzi1, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(((RemoteException) (zzi1)));
        }
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3, RoomConfig roomconfig)
    {
        try
        {
            zzi1 = new RoomBinderCallbacks(zzi1, zzi2, zzi3);
            ((IGamesService)zzlX()).zza(zzi1, zzahQ, roomconfig.getInvitationId(), false, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(((RemoteException) (zzi1)));
        }
    }

    public Intent zzc(int i, int j, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzc(i, j, flag);
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new InvitationsLoadedBinderCallback(zzb1), i);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzl(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new PlayerXpStreamLoadedBinderCallback(zzb1), s, i);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zze(new ExtendedGamesLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzd(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s, s1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new SnapshotsLoadedBinderCallbacks(zzb1), s, s1, flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzd(new LeaderboardsLoadedBinderCallback(zzb1), s, flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new AchievementsLoadedBinderCallback(zzb1), flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new RequestsUpdatedBinderCallbacks(zzb1), as);
    }

    public void zzc(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new QuestUpdateBinderCallback(zzi1);
            ((IGamesService)zzlX()).zzd(zzi1, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zzct(String s)
    {
        try
        {
            ((IGamesService)zzlX()).zzcB(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
        }
    }

    public Intent zzcu(String s)
    {
        try
        {
            s = ((IGamesService)zzlX()).zzcu(s);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    public void zzcv(String s)
    {
        try
        {
            ((IGamesService)zzlX()).zza(s, zzahO.zzro(), zzahO.zzrn());
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
        }
    }

    public int zzd(byte abyte0[], String s)
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzb(abyte0, s, null);
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            zzb(abyte0);
            return -1;
        }
        return i;
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zze(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzm(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new PlayerXpStreamLoadedBinderCallback(zzb1), s, i);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzf(new ExtendedGamesLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zze(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s, s1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new GameMuteStatusChangedBinderCallback(zzb1), s, flag);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zzf(new EventsLoadedBinderCallback(zzb1), flag);
    }

    public void zzd(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new RequestReceivedBinderCallback(zzi1);
            ((IGamesService)zzlX()).zzc(zzi1, zzahR);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzo(new TurnBasedMatchLeftBinderCallbacks(zzb1), s);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new InvitationsLoadedBinderCallback(zzb1), s, i, false);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzc(new ExtendedGamesLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzd(new SnapshotsLoadedBinderCallbacks(zzb1), flag);
    }

    public void zzeV(int i)
    {
        zzahO.setGravity(i);
    }

    public void zzeW(int i)
    {
        try
        {
            ((IGamesService)zzlX()).zzeW(i);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    protected String zzeq()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzd(new GamesLoadedBinderCallback(zzb1));
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzn(new TurnBasedMatchCanceledBinderCallbacks(zzb1), s);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zza(new RequestSummariesLoadedBinderCallbacks(zzb1), s, i);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzb(new PlayersLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzg(new ProfileSettingsLoadedBinderCallback(zzb1), flag);
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzh(new NotifyAclLoadedBinderCallback(zzb1));
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzp(new TurnBasedMatchLoadedBinderCallbacks(zzb1), s);
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzh(new ProfileSettingsUpdatedBinderCallback(zzb1), flag);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzt(new InboxCountsLoadedBinderCallback(zzb1), null);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzahK.flush();
        ((IGamesService)zzlX()).zzu(new QuestAcceptedBinderCallbacks(zzb1), s);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zze(new ContactSettingsLoadedBinderCallback(zzb1), flag);
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzr(new SnapshotDeletedBinderCallbacks(zzb1), s);
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zze(new ExtendedGamesLoadedBinderCallback(zzb1), s);
    }

    public boolean zzjM()
    {
        return true;
    }

    public Bundle zzjZ()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)zzlX()).zzjZ();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        if(bundle == null)
            break MISSING_BLOCK_LABEL_26;
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzf(new GameInstancesLoadedBinderCallback(zzb1), s);
    }

    protected Bundle zzka()
    {
        Object obj = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.gms.games.key.gamePackageName", zzahL);
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", zzahS.zzagv);
        bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", zzahS.zzagw);
        bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", zzahS.zzagx);
        bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", zzahS.zzagy);
        bundle.putInt("com.google.android.gms.games.key.sdkVariant", zzahS.zzagz);
        bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", zzahS.zzagA);
        bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", zzahS.zzagB);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", ((String) (obj)));
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(zzahO.zzro()));
        obj = zzlU();
        if(((zze) (obj)).zzlM() != null)
            bundle.putBundle("com.google.android.gms.games.key.signInOptions", com.google.android.gms.signin.internal.zzh.zza(((zze) (obj)).zzlM(), ((zze) (obj)).zzlN(), Executors.newSingleThreadExecutor()));
        return bundle;
    }

    public void zzl(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzq(new GameSearchSuggestionsLoadedBinderCallback(zzb1), s);
    }

    public void zzm(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzs(new PlayerXpForGameCategoriesLoadedBinderCallback(zzb1), s);
    }

    public Intent zzn(String s, int i)
    {
        try
        {
            s = ((IGamesService)zzlX()).zzu(s, i);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    public void zzn(View view)
    {
        zzahO.zzo(view);
    }

    public void zzn(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzk(new InvitationsLoadedBinderCallback(zzb1), s);
    }

    public void zzo(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzj(new NotifyAclUpdatedBinderCallback(zzb1), s);
    }

    public void zzo(String s, int i)
    {
        zzahK.zzo(s, i);
    }

    public void zzp(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zzlX()).zzi(new GameMuteStatusLoadedBinderCallback(zzb1), s);
    }

    public void zzp(String s, int i)
    {
        try
        {
            ((IGamesService)zzlX()).zzp(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
        }
    }

    public void zzq(String s, int i)
    {
        try
        {
            ((IGamesService)zzlX()).zzq(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            zzb(s);
        }
    }

    public void zzqD()
    {
        try
        {
            PopupLocationInfoBinderCallbacks popuplocationinfobindercallbacks = new PopupLocationInfoBinderCallbacks(zzahO);
            ((IGamesService)zzlX()).zza(popuplocationinfobindercallbacks, zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public String zzqE()
    {
        String s;
        try
        {
            s = ((IGamesService)zzlX()).zzqE();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public String zzqF()
    {
        if(zzahM != null)
            return zzahM.getPlayerId();
        String s;
        try
        {
            s = ((IGamesService)zzlX()).zzqF();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public Player zzqG()
    {
        zzlW();
        this;
        JVM INSTR monitorenter ;
        Object obj = zzahM;
        if(obj != null)
            break MISSING_BLOCK_LABEL_63;
        obj = new PlayerBuffer(((IGamesService)zzlX()).zzrc());
        if(((PlayerBuffer) (obj)).getCount() > 0)
            zzahM = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        ((PlayerBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return zzahM;
        Exception exception;
        exception;
        ((PlayerBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        zzb(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Game zzqH()
    {
        zzlW();
        this;
        JVM INSTR monitorenter ;
        Object obj = zzahN;
        if(obj != null)
            break MISSING_BLOCK_LABEL_63;
        obj = new GameBuffer(((IGamesService)zzlX()).zzre());
        if(((GameBuffer) (obj)).getCount() > 0)
            zzahN = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        ((GameBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return zzahN;
        Exception exception;
        exception;
        ((GameBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        zzb(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Intent zzqI()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqI();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzqJ()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqJ();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzqK()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqK();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzqL()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqL();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public void zzqM()
    {
        try
        {
            ((IGamesService)zzlX()).zzE(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzqN()
    {
        try
        {
            ((IGamesService)zzlX()).zzF(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzqO()
    {
        try
        {
            ((IGamesService)zzlX()).zzH(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzqP()
    {
        try
        {
            ((IGamesService)zzlX()).zzG(zzahR);
            return;
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public Intent zzqQ()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqQ();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzqR()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqR();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public int zzqS()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqS();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return 4368;
        }
        return i;
    }

    public String zzqT()
    {
        String s;
        try
        {
            s = ((IGamesService)zzlX()).zzqT();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public int zzqU()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqU();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public Intent zzqV()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zzlX()).zzqV();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public int zzqW()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqW();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzqX()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqX();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzqY()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqY();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzqZ()
    {
        int i;
        try
        {
            i = ((IGamesService)zzlX()).zzqZ();
        }
        catch(RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public void zzra()
    {
        if(!isConnected())
            break MISSING_BLOCK_LABEL_19;
        ((IGamesService)zzlX()).zzra();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb(remoteexception);
        return;
    }

    EventIncrementManager zzahK;
    private final String zzahL;
    private PlayerEntity zzahM;
    private GameEntity zzahN;
    private final PopupManager zzahO;
    private boolean zzahP;
    private final Binder zzahQ = new Binder();
    private final long zzahR = (long)hashCode();
    private final com.google.android.gms.games.Games.GamesOptions zzahS;
}
