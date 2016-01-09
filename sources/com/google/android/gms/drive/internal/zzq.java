// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.query.Query;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, zzw, zzu, zzr, 
//            zzd, OnDriveIdResponse, zzn, OnMetadataResponse, 
//            zzt, OnContentsResponse, OnListEntriesResponse, QueryRequest, 
//            zzak, CreateContentsRequest, GetMetadataRequest, zzbr

public class zzq
    implements DriveApi
{
    static class zza
        implements com.google.android.gms.drive.DriveApi.DriveContentsResult
    {

        public DriveContents getDriveContents()
        {
            return zzVO;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final DriveContents zzVO;

        public zza(Status status, DriveContents drivecontents)
        {
            zzKr = status;
            zzVO = drivecontents;
        }
    }

    static abstract class zzb extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzn(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveContentsResult zzn(Status status)
        {
            return new zza(status, null);
        }

        zzb(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class zzc extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzKq.zzj(new zzd(Status.zzQU, ondriveidresponse.getDriveId()));
        }

        public void zza(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            zzKq.zzj(new zzd(Status.zzQU, (new zzn(onmetadataresponse.zzof())).getDriveId()));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zzd(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzc(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzd
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        public DriveId getDriveId()
        {
            return zzVL;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final DriveId zzVL;

        public zzd(Status status, DriveId driveid)
        {
            zzKr = status;
            zzVL = driveid;
        }
    }

    static abstract class zze extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzo(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveIdResult zzo(Status status)
        {
            return new zzd(status, null);
        }

        zze(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class zzf
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        public MetadataBuffer getMetadataBuffer()
        {
            return zzXG;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        public void release()
        {
            if(zzXG != null)
                zzXG.release();
        }

        private final Status zzKr;
        private final MetadataBuffer zzXG;
        private final boolean zzXH;

        public zzf(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            zzKr = status;
            zzXG = metadatabuffer;
            zzXH = flag;
        }
    }

    static abstract class zzg extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzp(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult zzp(Status status)
        {
            return new zzf(status, null, false);
        }

        zzg(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class zzh extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            zzKq.zzj(new zza(Status.zzQU, new zzt(oncontentsresponse.zznW())));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zza(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzh(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzi extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.zzoc());
            zzKq.zzj(new zzf(Status.zzQU, metadatabuffer, onlistentriesresponse.zzod()));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zzf(status, null, false));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzi(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    static class zzj extends zzr.zza
    {

        protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
            throws RemoteException
        {
            zza((zzs)zza1);
        }

        protected void zza(zzs zzs1)
        {
        }

        zzj(GoogleApiClient googleapiclient, Status status)
        {
            super(googleapiclient);
            setResult(status);
        }
    }


    public zzq()
    {
    }

    public PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        return ((zzs)googleapiclient.zza(Drive.zzKh)).cancelPendingActions(googleapiclient, list);
    }

    public PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zza(new zze(googleapiclient, s) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new GetMetadataRequest(DriveId.zzbZ(zzXF), false), new zzc(this));
            }

            final zzq zzXD;
            final String zzXF;

            
            {
                zzXD = zzq.this;
                zzXF = s;
                super(googleapiclient);
            }
        }
);
    }

    public DriveFolder getAppFolder(GoogleApiClient googleapiclient)
    {
        if(!googleapiclient.isConnected())
            throw new IllegalStateException("Client must be connected");
        googleapiclient = ((zzs)googleapiclient.zza(Drive.zzKh)).zznQ();
        if(googleapiclient != null)
            return new zzw(googleapiclient);
        else
            return null;
    }

    public DriveFile getFile(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if(driveid == null)
            throw new IllegalArgumentException("Id must be provided.");
        if(!googleapiclient.isConnected())
            throw new IllegalStateException("Client must be connected");
        else
            return new zzu(driveid);
    }

    public DriveFolder getFolder(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if(driveid == null)
            throw new IllegalArgumentException("Id must be provided.");
        if(!googleapiclient.isConnected())
            throw new IllegalStateException("Client must be connected");
        else
            return new zzw(driveid);
    }

    public DriveFolder getRootFolder(GoogleApiClient googleapiclient)
    {
        if(!googleapiclient.isConnected())
            throw new IllegalStateException("Client must be connected");
        else
            return new zzw(((zzs)googleapiclient.zza(Drive.zzKh)).zznP());
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder()
    {
        return new CreateFileActivityBuilder();
    }

    public PendingResult newDriveContents(GoogleApiClient googleapiclient)
    {
        return zza(googleapiclient, 0x20000000);
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder()
    {
        return new OpenFileActivityBuilder();
    }

    public PendingResult query(GoogleApiClient googleapiclient, Query query1)
    {
        if(query1 == null)
            throw new IllegalArgumentException("Query must be provided.");
        else
            return googleapiclient.zza(new zzg(googleapiclient, query1) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new QueryRequest(zzXC), new zzi(this));
                }

                final Query zzXC;
                final zzq zzXD;

            
            {
                zzXD = zzq.this;
                zzXC = query1;
                super(googleapiclient);
            }
            }
);
    }

    public PendingResult requestSync(GoogleApiClient googleapiclient)
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
                zzs1.zznO().zza(new zzbr(this));
            }

            final zzq zzXD;

            
            {
                zzXD = zzq.this;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult zza(GoogleApiClient googleapiclient, int i)
    {
        return googleapiclient.zza(new zzb(googleapiclient, i) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzs1.zznO().zza(new CreateContentsRequest(zzXE), new zzh(this));
            }

            final zzq zzXD;
            final int zzXE;

            
            {
                zzXD = zzq.this;
                zzXE = i;
                super(googleapiclient);
            }
        }
);
    }
}
