// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
    implements Achievements
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzJ(status);
        }

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult zzJ(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadImpl zzajz;

            
            {
                zzajz = loadimpl;
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

        static String zza(UpdateImpl updateimpl)
        {
            return updateimpl.zzGM;
        }

        public Result createFailedResult(Status status)
        {
            return zzK(status);
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult zzK(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                public String getAchievementId()
                {
                    return UpdateImpl.zza(zzajA);
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final UpdateImpl zzajA;

            
            {
                zzajA = updateimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private final String zzGM;

        public UpdateImpl(String s, GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzGM = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqJ();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(null, zzajx, zzajy);
            }

            final AchievementsImpl zzaju;
            final String zzajx;
            final int zzajy;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                zzajy = i;
                super(s, googleapiclient);
            }
        }
);
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajx, zzajy);
            }

            final AchievementsImpl zzaju;
            final String zzajx;
            final int zzajy;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                zzajy = i;
                super(s, googleapiclient);
            }
        }
);
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
                gamesclientimpl.zzc(this, zzajt);
            }

            final boolean zzajt;
            final AchievementsImpl zzaju;

            
            {
                zzaju = AchievementsImpl.this;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(null, zzajx);
            }

            final AchievementsImpl zzaju;
            final String zzajx;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                super(s, googleapiclient);
            }
        }
);
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzajx);
            }

            final AchievementsImpl zzaju;
            final String zzajx;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                super(s, googleapiclient);
            }
        }
);
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(null, zzajx, zzajy);
            }

            final AchievementsImpl zzaju;
            final String zzajx;
            final int zzajy;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                zzajy = i;
                super(s, googleapiclient);
            }
        }
);
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzajx, zzajy);
            }

            final AchievementsImpl zzaju;
            final String zzajx;
            final int zzajy;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                zzajy = i;
                super(s, googleapiclient);
            }
        }
);
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(null, zzajx);
            }

            final AchievementsImpl zzaju;
            final String zzajx;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                super(s, googleapiclient);
            }
        }
);
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzajx);
            }

            final AchievementsImpl zzaju;
            final String zzajx;

            
            {
                zzaju = AchievementsImpl.this;
                zzajx = s1;
                super(s, googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        public volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        public void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzajv, zzajw, zzajt);
        }

        final boolean zzajt;
        final String zzajv;
        final String zzajw;
    }

}
