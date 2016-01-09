// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource, MetadataChangeSet, DriveContents, ExecutionOptions, 
//            DriveFile

public interface DriveFolder
    extends DriveResource
{
    public static interface DriveFileResult
        extends Result
    {

        public abstract DriveFile getDriveFile();
    }

    public static interface DriveFolderResult
        extends Result
    {

        public abstract DriveFolder getDriveFolder();
    }


    public abstract PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents);

    public abstract PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions);

    public abstract PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset);

    public abstract PendingResult listChildren(GoogleApiClient googleapiclient);

    public abstract PendingResult queryChildren(GoogleApiClient googleapiclient, Query query);

    public static final String MIME_TYPE = "application/vnd.google-apps.folder";
}
