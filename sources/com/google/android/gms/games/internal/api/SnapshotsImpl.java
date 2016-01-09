// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.*;

public final class SnapshotsImpl
    implements Snapshots
{
    private static abstract class CommitImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzao(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult zzao(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult(this, status) {

                public SnapshotMetadata getSnapshotMetadata()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final CommitImpl zzall;

            
            {
                zzall = commitimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private CommitImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class DeleteImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzap(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult zzap(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult(this, status) {

                public String getSnapshotId()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final DeleteImpl zzalm;

            
            {
                zzalm = deleteimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private DeleteImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzaq(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult zzaq(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult(this, status) {

                public SnapshotMetadataBuffer getSnapshots()
                {
                    return new SnapshotMetadataBuffer(DataHolder.zzaE(14));
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                public void release()
                {
                }

                final Status zzKj;
                final LoadImpl zzaln;

            
            {
                zzaln = loadimpl;
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

    private static abstract class OpenImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzar(status);
        }

        public com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult zzar(Status status)
        {
            return new com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult(this, status) {

                public String getConflictId()
                {
                    return null;
                }

                public Snapshot getConflictingSnapshot()
                {
                    return null;
                }

                public SnapshotContents getResolutionSnapshotContents()
                {
                    return null;
                }

                public Snapshot getSnapshot()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzKj;
                }

                final Status zzKj;
                final OpenImpl zzalo;

            
            {
                zzalo = openimpl;
                zzKj = status;
                super();
            }
            }
;
        }

        private OpenImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public SnapshotsImpl()
    {
    }

    public PendingResult commitAndClose(GoogleApiClient googleapiclient, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
    {
        return googleapiclient.zzb(new CommitImpl(googleapiclient, snapshot, snapshotmetadatachange) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalf, zzalg);
            }

            final SnapshotsImpl zzalb;
            final Snapshot zzalf;
            final SnapshotMetadataChange zzalg;

            
            {
                zzalb = SnapshotsImpl.this;
                zzalf = snapshot;
                zzalg = snapshotmetadatachange;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult delete(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return googleapiclient.zzb(new DeleteImpl(googleapiclient, snapshotmetadata) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzi(this, zzalh.getSnapshotId());
            }

            final SnapshotsImpl zzalb;
            final SnapshotMetadata zzalh;

            
            {
                zzalb = SnapshotsImpl.this;
                zzalh = snapshotmetadata;
                super(googleapiclient);
            }
        }
);
    }

    public void discardAndClose(GoogleApiClient googleapiclient, Snapshot snapshot)
    {
        Games.zzd(googleapiclient).zza(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqZ();
    }

    public int getMaxDataSize(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzqY();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleapiclient, String s, boolean flag, boolean flag1, int i)
    {
        return Games.zzd(googleapiclient).zza(s, flag, flag1, i);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle bundle)
    {
        if(bundle == null || !bundle.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA"))
            return null;
        else
            return (SnapshotMetadata)bundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA");
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zze(this, zzajt);
            }

            final boolean zzajt;
            final SnapshotsImpl zzalb;

            
            {
                zzalb = SnapshotsImpl.this;
                zzajt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false);
    }

    public PendingResult open(GoogleApiClient googleapiclient, SnapshotMetadata snapshotmetadata, int i)
    {
        return open(googleapiclient, snapshotmetadata.getUniqueName(), false, i);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag)
    {
        return open(googleapiclient, s, flag, -1);
    }

    public PendingResult open(GoogleApiClient googleapiclient, String s, boolean flag, int i)
    {
        return googleapiclient.zzb(new OpenImpl(googleapiclient, s, flag, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzalc, zzald, zzale);
            }

            final SnapshotsImpl zzalb;
            final String zzalc;
            final boolean zzald;
            final int zzale;

            
            {
                zzalb = SnapshotsImpl.this;
                zzalc = s;
                zzald = flag;
                zzale = i;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, Snapshot snapshot)
    {
        SnapshotMetadata snapshotmetadata = snapshot.getMetadata();
        SnapshotMetadataChange snapshotmetadatachange = (new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder()).fromMetadata(snapshotmetadata).build();
        return resolveConflict(googleapiclient, s, snapshotmetadata.getSnapshotId(), snapshotmetadatachange, snapshot.getSnapshotContents());
    }

    public PendingResult resolveConflict(GoogleApiClient googleapiclient, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
    {
        return googleapiclient.zzb(new OpenImpl(googleapiclient, s, s1, snapshotmetadatachange, snapshotcontents) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((GamesClientImpl)zza1);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzali, zzalj, zzalg, zzalk);
            }

            final SnapshotsImpl zzalb;
            final SnapshotMetadataChange zzalg;
            final String zzali;
            final String zzalj;
            final SnapshotContents zzalk;

            
            {
                zzalb = SnapshotsImpl.this;
                zzali = s;
                zzalj = s1;
                zzalg = snapshotmetadatachange;
                zzalk = snapshotcontents;
                super(googleapiclient);
            }
        }
);
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/SnapshotsImpl$6

/* anonymous class */
    class _cls6 extends LoadImpl
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((GamesClientImpl)zza1);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzc(this, zzajv, zzajw, zzajt);
        }

        final boolean zzajt;
        final String zzajv;
        final String zzajw;
    }

}
