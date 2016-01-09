// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl
    implements Notifications
{
    private static abstract class ContactSettingLoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzab(status);
        }

        public com.google.android.gms.games.Notifications.ContactSettingLoadResult zzab(Status status)
        {
            return new com.google.android.gms.games.Notifications.ContactSettingLoadResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final ContactSettingLoadImpl zzaku;

            
            {
                zzaku = contactsettingloadimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }

    private static abstract class ContactSettingUpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }
    }

    private static abstract class InboxCountImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzac(status);
        }

        public com.google.android.gms.games.Notifications.InboxCountResult zzac(Status status)
        {
            return new com.google.android.gms.games.Notifications.InboxCountResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final InboxCountImpl zzakv;

            
            {
                zzakv = inboxcountimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }


    public NotificationsImpl()
    {
    }

    public void clear(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if(googleapiclient != null)
            googleapiclient.zzeW(i);
    }

    public void clearAll(GoogleApiClient googleapiclient)
    {
        clear(googleapiclient, 31);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$1

/* anonymous class */
    class _cls1 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzZ(status);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult zzZ(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final _cls1 zzakp;

            
            {
                zzakp = _pcls1;
                zzKj = status;
                super();
            }
            }
;
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzako, true);
        }

        final String zzako;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$2

/* anonymous class */
    class _cls2 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzZ(status);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusChangeResult zzZ(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusChangeResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final _cls2 zzakq;

            
            {
                zzakq = _pcls2;
                zzKj = status;
                super();
            }
            }
;
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzd(this, zzako, false);
        }

        final String zzako;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$3

/* anonymous class */
    class _cls3 extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaa(status);
        }

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzp(this, zzako);
        }

        public com.google.android.gms.games.Notifications.GameMuteStatusLoadResult zzaa(Status status)
        {
            return new com.google.android.gms.games.Notifications.GameMuteStatusLoadResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final _cls3 zzakr;

            
            {
                zzakr = _pcls3;
                zzKj = status;
                super();
            }
            }
;
        }

        final String zzako;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$4

/* anonymous class */
    class _cls4 extends ContactSettingLoadImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzh(this, zzajt);
        }

        final boolean zzajt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$5

/* anonymous class */
    class _cls5 extends ContactSettingUpdateImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaks, zzakt);
        }

        final boolean zzaks;
        final Bundle zzakt;
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/NotificationsImpl$6

/* anonymous class */
    class _cls6 extends InboxCountImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzh(this);
        }
    }

}
