// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, zzd, OnListParentsResponse, zzn, 
//            OnMetadataResponse, zzr, GetMetadataRequest, zzak, 
//            ListParentsRequest, SetResourceParentsRequest, zzbr, UpdateMetadataRequest, 
//            TrashResourceRequest, UntrashResourceRequest

public class zzz
    implements DriveResource
{
    private static class zza extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.zzoe());
            zzKq.zzj(new zzq.zzf(Status.zzQU, onlistparentsresponse, false));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zzq.zzf(status, null, false));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzb extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            zzKq.zzj(new zzc(Status.zzQU, new zzn(onmetadataresponse.zzof())));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zzc(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzc
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        public Metadata getMetadata()
        {
            return zzYw;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final Metadata zzYw;

        public zzc(Status status, Metadata metadata)
        {
            zzKr = status;
            zzYw = metadata;
        }
    }

    private abstract class zzd extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzt(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult zzt(Status status)
        {
            return new zzc(status, null);
        }

        final zzz zzYu;

        private zzd(GoogleApiClient googleapiclient)
        {
            zzYu = zzz.this;
            super(googleapiclient);
        }

    }


    protected zzz(DriveId driveid)
    {
        zzVL = driveid;
    }

    private PendingResult zza(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new zzd(googleapiclient, flag) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new GetMetadataRequest(zzYu.zzVL, zzYt), new zzb(this));
            }

            final boolean zzYt;
            final zzz zzYu;

            
            {
                zzYu = zzz.this;
                zzYt = flag;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((zzs)googleapiclient.zza(Drive.zzKh)).zza(googleapiclient, zzVL, changelistener);
    }

    public PendingResult addChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((zzs)googleapiclient.zza(Drive.zzKh)).zza(googleapiclient, zzVL);
    }

    public DriveId getDriveId()
    {
        return zzVL;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient, false);
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zza(new zzq.zzg(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new ListParentsRequest(zzYu.zzVL), new zza(this));
            }

            final zzz zzYu;

            
            {
                zzYu = zzz.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((zzs)googleapiclient.zza(Drive.zzKh)).zzb(googleapiclient, zzVL, changelistener);
    }

    public PendingResult removeChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((zzs)googleapiclient.zza(Drive.zzKh)).zzb(googleapiclient, zzVL);
    }

    public PendingResult setParents(GoogleApiClient googleapiclient, Set set)
    {
        if(set == null)
            throw new IllegalArgumentException("ParentIds must be provided.");
        if(set.isEmpty())
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        else
            return googleapiclient.zzb(new zzr.zza(googleapiclient, new ArrayList(set)) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new SetResourceParentsRequest(zzYu.zzVL, zzYv), new zzbr(this));
                }

                final zzz zzYu;
                final List zzYv;

            
            {
                zzYu = zzz.this;
                zzYv = list;
                super(googleapiclient);
            }
            }
);
    }

    public PendingResult trash(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new TrashResourceRequest(zzYu.zzVL), new zzbr(this));
            }

            final zzz zzYu;

            
            {
                zzYu = zzz.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult untrash(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzr.zza(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new UntrashResourceRequest(zzYu.zzVL), new zzbr(this));
            }

            final zzz zzYu;

            
            {
                zzYu = zzz.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if(metadatachangeset == null)
            throw new IllegalArgumentException("ChangeSet must be provided.");
        else
            return googleapiclient.zzb(new zzd(googleapiclient, metadatachangeset) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzYi.zznz().setContext(zzs1.getContext());
                    zzs1.zznO().zza(new UpdateMetadataRequest(zzYu.zzVL, zzYi.zznz()), new zzb(this));
                }

                final MetadataChangeSet zzYi;
                final zzz zzYu;

            
            {
                zzYu = zzz.this;
                zzYi = metadatachangeset;
                super(googleapiclient);
            }
            }
);
    }

    protected final DriveId zzVL;
}
