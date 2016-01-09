// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.internal.zzj;
import com.google.android.gms.drive.internal.zzt;
import com.google.android.gms.internal.zzhy;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveContents, Contents, DriveId, 
//            MetadataChangeSet

public class CreateFileActivityBuilder
{

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        zzv.zzb(Boolean.valueOf(zzVP), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        zzv.zza(googleapiclient.isConnected(), "Client must be connected");
        boolean flag;
        if(googleapiclient.zza(Drive.SCOPE_FILE) || googleapiclient.zza(Drive.zzVQ))
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "The apiClient must have suitable scope to create files");
        if(zzVO != null)
        {
            zzhy.zza(zzVO.getParcelFileDescriptor());
            zzVO.zzns();
        }
        return zzVN.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        zzVN.zza(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        zzVN.zzcc(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents drivecontents)
    {
        if(drivecontents != null)
        {
            if(!(drivecontents instanceof zzt))
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            if(drivecontents.getDriveId() != null)
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            if(drivecontents.zznt())
                throw new IllegalArgumentException("DriveContents are already closed.");
            zzVN.zzbO(drivecontents.zznr().getRequestId());
            zzVO = drivecontents;
        } else
        {
            zzVN.zzbO(1);
        }
        zzVP = true;
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        zzVN.zza(metadatachangeset);
        return this;
    }

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final zzj zzVN = new zzj(0);
    private DriveContents zzVO;
    private boolean zzVP;
}
