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
import com.google.android.gms.games.quest.*;

public final class QuestsImpl
    implements Quests
{
    private static abstract class AcceptImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzah(status);
        }

        public com.google.android.gms.games.quest.Quests.AcceptQuestResult zzah(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(this, status) {

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final AcceptImpl zzakM;

            
            {
                zzakM = acceptimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private AcceptImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class ClaimImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzai(status);
        }

        public com.google.android.gms.games.quest.Quests.ClaimMilestoneResult zzai(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(this, status) {

                public Milestone getMilestone()
                {
                    return null;
                }

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final ClaimImpl zzakN;

            
            {
                zzakN = claimimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private ClaimImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaj(status);
        }

        public com.google.android.gms.games.quest.Quests.LoadQuestsResult zzaj(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(this, status) {

                public QuestBuffer getQuests()
                {
                    return new QuestBuffer(DataHolder.zzaE(zzKj.getStatusCode()));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadsImpl zzakO;

            
            {
                zzakO = loadsimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private LoadsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public QuestsImpl()
    {
    }

    public PendingResult accept(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new AcceptImpl(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzh(this, zzakG);
            }

            final String zzakG;
            final QuestsImpl zzakH;

            
            {
                zzakH = QuestsImpl.this;
                zzakG = s;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult claim(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.zzb(new ClaimImpl(googleapiclient, s, s1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzakG, zzakI);
            }

            final String zzakG;
            final QuestsImpl zzakH;
            final String zzakI;

            
            {
                zzakH = QuestsImpl.this;
                zzakG = s;
                zzakI = s1;
                super(googleapiclient);
            }
        }
);
    }

    public Intent getQuestIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.zzd(googleapiclient).zzcu(s);
    }

    public Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[])
    {
        return Games.zzd(googleapiclient).zzb(ai);
    }

    public PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        return googleapiclient.zza(new LoadsImpl(googleapiclient, ai, i, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzakJ, zzajX, zzajt);
            }

            final int zzajX;
            final boolean zzajt;
            final QuestsImpl zzakH;
            final int zzakJ[];

            
            {
                zzakH = QuestsImpl.this;
                zzakJ = ai;
                zzajX = i;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.zza(new LoadsImpl(googleapiclient, flag, as) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzajt, zzakK);
            }

            final boolean zzajt;
            final QuestsImpl zzakH;
            final String zzakK[];

            
            {
                zzakH = QuestsImpl.this;
                zzajt = flag;
                zzakK = as;
                super(googleapiclient);
            }
        }
);
    }

    public void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if(gamesclientimpl != null)
            gamesclientimpl.zzc(googleapiclient.zzl(questupdatelistener));
    }

    public void showStateChangedPopup(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzcv(s);
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzqO();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$5

/* anonymous class */
    class _cls5 extends LoadsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakL, zzakJ, zzajX, zzajt);
        }

        final int zzajX;
        final boolean zzajt;
        final String zzajw;
        final int zzakJ[];
        final String zzakL;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$6

/* anonymous class */
    class _cls6 extends LoadsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajw, zzakL, zzajt, zzakK);
        }

        final boolean zzajt;
        final String zzajw;
        final String zzakK[];
        final String zzakL;
    }

}
