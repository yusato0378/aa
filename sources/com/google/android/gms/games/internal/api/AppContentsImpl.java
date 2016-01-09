// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AppContentsImpl
    implements AppContents
{
    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzO(status);
        }

        public com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult zzO(Status status)
        {
            return new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult(this, status) {

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadsImpl zzajF;

            
            {
                zzajF = loadsimpl;
                zzKj = status;
                super();
            }
            }
;
        }
    }


    public AppContentsImpl()
    {
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AppContentsImpl$1

/* anonymous class */
    class _cls1 extends LoadsImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzajC, zzajD, zzajE, zzajt);
        }

        final int zzajC;
        final String zzajD;
        final String zzajE[];
        final boolean zzajt;
    }

}
