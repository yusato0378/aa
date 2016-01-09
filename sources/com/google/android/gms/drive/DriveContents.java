// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive:
//            MetadataChangeSet, ExecutionOptions, DriveId, Contents

public interface DriveContents
{

    public abstract PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset);

    public abstract PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions);

    public abstract void discard(GoogleApiClient googleapiclient);

    public abstract DriveId getDriveId();

    public abstract InputStream getInputStream();

    public abstract int getMode();

    public abstract OutputStream getOutputStream();

    public abstract ParcelFileDescriptor getParcelFileDescriptor();

    public abstract PendingResult reopenForWrite(GoogleApiClient googleapiclient);

    public abstract Contents zznr();

    public abstract void zzns();

    public abstract boolean zznt();
}
