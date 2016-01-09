// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.game.Acls;

public final class AclsImpl
    implements Acls
{
    private static abstract class LoadNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzN(status);
        }

        public com.google.android.gms.games.internal.game.Acls.LoadAclResult zzN(Status status)
        {
            return AclsImpl.zzM(status);
        }
    }

    private static abstract class UpdateNotifyAclImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
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


    public AclsImpl()
    {
    }

    private static com.google.android.gms.games.internal.game.Acls.LoadAclResult zzL(Status status)
    {
        return new com.google.android.gms.games.internal.game.Acls.LoadAclResult(status) {

            public Status getStatus()
            {
                return zzKj;
            }

            public void release()
            {
            }

            final Status zzKj;

            
            {
                zzKj = status;
                super();
            }
        }
;
    }

    static com.google.android.gms.games.internal.game.Acls.LoadAclResult zzM(Status status)
    {
        return zzL(status);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$2

/* anonymous class */
    class _cls2 extends LoadNotifyAclImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzg(this);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/AclsImpl$3

/* anonymous class */
    class _cls3 extends UpdateNotifyAclImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzo(this, zzajB);
        }

        final String zzajB;
    }

}
