// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.*;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzt, zzq, zzd, 
//            zzu, OnDriveIdResponse, zzr, zzs, 
//            CreateFileRequest, zzak, CreateFolderRequest

public class zzw extends zzz
    implements DriveFolder
{
    private static class zza extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzKq.zzj(new zzc(Status.zzQU, new zzu(ondriveidresponse.getDriveId())));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zzc(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zza(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzb extends com.google.android.gms.drive.internal.zzd
    {

        public void zza(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            zzKq.zzj(new zze(Status.zzQU, new zzw(ondriveidresponse.getDriveId())));
        }

        public void zzm(Status status)
            throws RemoteException
        {
            zzKq.zzj(new zze(status, null));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzKq = zzb1;
        }
    }

    private static class zzc
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        public DriveFile getDriveFile()
        {
            return zzYn;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final DriveFile zzYn;

        public zzc(Status status, DriveFile drivefile)
        {
            zzKr = status;
            zzYn = drivefile;
        }
    }

    static abstract class zzd extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzq(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFileResult zzq(Status status)
        {
            return new zzc(status, null);
        }

        zzd(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class zze
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        public DriveFolder getDriveFolder()
        {
            return zzYo;
        }

        public Status getStatus()
        {
            return zzKr;
        }

        private final Status zzKr;
        private final DriveFolder zzYo;

        public zze(Status status, DriveFolder drivefolder)
        {
            zzKr = status;
            zzYo = drivefolder;
        }
    }

    static abstract class zzf extends zzr
    {

        public Result createFailedResult(Status status)
        {
            return zzr(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFolderResult zzr(Status status)
        {
            return new zze(status, null);
        }

        zzf(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public zzw(DriveId driveid)
    {
        super(driveid);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, int i, int j, ExecutionOptions executionoptions)
    {
        ExecutionOptions.zza(googleapiclient, executionoptions);
        return googleapiclient.zzb(new zzd(googleapiclient, metadatachangeset, i, j, executionoptions) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzYi.zznz().setContext(zzs1.getContext());
                CreateFileRequest createfilerequest = new CreateFileRequest(zzYm.getDriveId(), zzYi.zznz(), zzYj, zzYk, zzYl);
                zzs1.zznO().zza(createfilerequest, new zza(this));
            }

            final MetadataChangeSet zzYi;
            final int zzYj;
            final int zzYk;
            final ExecutionOptions zzYl;
            final zzw zzYm;

            
            {
                zzYm = zzw.this;
                zzYi = metadatachangeset;
                zzYj = i;
                zzYk = j;
                zzYl = executionoptions;
                super(googleapiclient);
            }
        }
);
    }

    private PendingResult zza(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        int i;
        if(drivecontents != null)
        {
            if(!(drivecontents instanceof zzt))
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            if(drivecontents.getDriveId() != null)
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            if(drivecontents.zznt())
                throw new IllegalArgumentException("DriveContents are already closed.");
            i = drivecontents.zznr().getRequestId();
            drivecontents.zzns();
        } else
        {
            i = 1;
        }
        if(metadatachangeset == null)
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        if("application/vnd.google-apps.folder".equals(metadatachangeset.getMimeType()))
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        else
            return zza(googleapiclient, metadatachangeset, i, 0, executionoptions);
    }

    private Query zza(Query query)
    {
        com.google.android.gms.drive.query.Query.Builder builder = (new com.google.android.gms.drive.query.Query.Builder()).addFilter(Filters.in(SearchableField.PARENTS, getDriveId()));
        if(query != null)
        {
            if(query.getFilter() != null)
                builder.addFilter(query.getFilter());
            builder.setPageToken(query.getPageToken());
            builder.setSortOrder(query.getSortOrder());
        }
        return builder.build();
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents)
    {
        return createFile(googleapiclient, metadatachangeset, drivecontents, null);
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if(executionoptions == null)
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        if(executionoptions1.zznx() != 0)
            throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
        else
            return zza(googleapiclient, metadatachangeset, drivecontents, executionoptions1);
    }

    public PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if(metadatachangeset == null)
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        if(metadatachangeset.getMimeType() != null && !metadatachangeset.getMimeType().equals("application/vnd.google-apps.folder"))
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        else
            return googleapiclient.zzb(new zzf(googleapiclient, metadatachangeset) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzYi.zznz().setContext(zzs1.getContext());
                    zzs1.zznO().zza(new CreateFolderRequest(zzYm.getDriveId(), zzYi.zznz()), new zzb(this));
                }

                final MetadataChangeSet zzYi;
                final zzw zzYm;

            
            {
                zzYm = zzw.this;
                zzYi = metadatachangeset;
                super(googleapiclient);
            }
            }
);
    }

    public PendingResult listChildren(GoogleApiClient googleapiclient)
    {
        return queryChildren(googleapiclient, null);
    }

    public PendingResult queryChildren(GoogleApiClient googleapiclient, Query query)
    {
        return (new zzq()).query(googleapiclient, zza(query));
    }
}
