// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.drive.*;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzs, OpenContentsRequest, zzbj, zzak, 
//            CloseContentsAndUpdateMetadataRequest, zzbr, zzx, CloseContentsRequest

public class zzt
    implements DriveContents
{

    public zzt(Contents contents)
    {
        mClosed = false;
        zzXX = false;
        zzXY = false;
        zzXW = (Contents)zzv.zzr(contents);
    }

    static Contents zza(zzt zzt1)
    {
        return zzt1.zzXW;
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        return commit(googleapiclient, metadatachangeset, null);
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if(executionoptions == null)
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        if(zzXW.getMode() == 0x10000000)
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        if(ExecutionOptions.zzbr(executionoptions1.zznx()) && !zzXW.zznp())
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        ExecutionOptions.zza(googleapiclient, executionoptions1);
        if(zznt())
            throw new IllegalStateException("DriveContents already closed.");
        if(getDriveId() == null)
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        if(metadatachangeset == null)
            metadatachangeset = MetadataChangeSet.zzWk;
        zzns();
        return googleapiclient.zzb(new zzr.zza(googleapiclient, metadatachangeset, executionoptions1) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzs)zza1);
            }

            protected void zza(zzs zzs1)
                throws RemoteException
            {
                zzYa.zznz().setContext(zzs1.getContext());
                zzs1.zznO().zza(new CloseContentsAndUpdateMetadataRequest(zzt.zza(zzXZ).getDriveId(), zzYa.zznz(), zzt.zza(zzXZ), zzYb), new zzbr(this));
            }

            final zzt zzXZ;
            final MetadataChangeSet zzYa;
            final ExecutionOptions zzYb;

            
            {
                zzXZ = zzt.this;
                zzYa = metadatachangeset;
                zzYb = executionoptions;
                super(googleapiclient);
            }
        }
);
    }

    public void discard(GoogleApiClient googleapiclient)
    {
        if(zznt())
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            zzns();
            ((_cls4)googleapiclient.zzb(new zzr.zza(googleapiclient) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new CloseContentsRequest(zzt.zza(zzXZ), false), new zzbr(this));
                }

                final zzt zzXZ;

            
            {
                zzXZ = zzt.this;
                super(googleapiclient);
            }
            }
)).setResultCallback(new ResultCallback() {

                public void onResult(Result result)
                {
                    zzi((Status)result);
                }

                public void zzi(Status status)
                {
                    if(!status.isSuccess())
                    {
                        zzx.zzu("DriveContentsImpl", "Error discarding contents");
                        return;
                    } else
                    {
                        zzx.zzs("DriveContentsImpl", "Contents discarded");
                        return;
                    }
                }

                final zzt zzXZ;

            
            {
                zzXZ = zzt.this;
                super();
            }
            }
);
            return;
        }
    }

    public DriveId getDriveId()
    {
        return zzXW.getDriveId();
    }

    public InputStream getInputStream()
    {
        if(zznt())
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        if(zzXW.getMode() != 0x10000000)
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        if(zzXX)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            zzXX = true;
            return zzXW.getInputStream();
        }
    }

    public int getMode()
    {
        return zzXW.getMode();
    }

    public OutputStream getOutputStream()
    {
        if(zznt())
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        if(zzXW.getMode() != 0x20000000)
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        if(zzXY)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            zzXY = true;
            return zzXW.getOutputStream();
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if(zznt())
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        else
            return zzXW.getParcelFileDescriptor();
    }

    public PendingResult reopenForWrite(GoogleApiClient googleapiclient)
    {
        if(zznt())
            throw new IllegalStateException("DriveContents already closed.");
        if(zzXW.getMode() != 0x10000000)
        {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else
        {
            zzns();
            return googleapiclient.zza(new zzq.zzb(googleapiclient) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    zzs1.zznO().zza(new OpenContentsRequest(zzXZ.getDriveId(), 0x20000000, zzt.zza(zzXZ).getRequestId()), new zzbj(this, null));
                }

                final zzt zzXZ;

            
            {
                zzXZ = zzt.this;
                super(googleapiclient);
            }
            }
);
        }
    }

    public Contents zznr()
    {
        return zzXW;
    }

    public void zzns()
    {
        mClosed = true;
    }

    public boolean zznt()
    {
        return mClosed;
    }

    private boolean mClosed;
    private final Contents zzXW;
    private boolean zzXX;
    private boolean zzXY;
}
