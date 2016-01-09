// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzz, zzs, OpenContentsRequest, zzbj, 
//            zzak, DriveServiceResponse

public class zzu extends zzz
    implements DriveFile
{
    private static class zza
        implements com.google.android.gms.drive.DriveFile.DownloadProgressListener
    {

        public void onProgress(long l, long l1)
        {
            zzYe.zza(new com.google.android.gms.common.api.zzi.zzb(this, l, l1) {

                public void zza(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
                {
                    downloadprogresslistener.onProgress(zzYf, zzYg);
                }

                public void zzk(Object obj)
                {
                    zza((com.google.android.gms.drive.DriveFile.DownloadProgressListener)obj);
                }

                public void zzkJ()
                {
                }

                final long zzYf;
                final long zzYg;
                final zza zzYh;

            
            {
                zzYh = zza1;
                zzYf = l;
                zzYg = l1;
                super();
            }
            }
);
        }

        private final zzi zzYe;

        public zza(zzi zzi1)
        {
            zzYe = zzi1;
        }
    }


    public zzu(DriveId driveid)
    {
        super(driveid);
    }

    private static com.google.android.gms.drive.DriveFile.DownloadProgressListener zza(GoogleApiClient googleapiclient, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if(downloadprogresslistener == null)
            return null;
        else
            return new zza(googleapiclient.zzl(downloadprogresslistener));
    }

    public PendingResult open(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if(i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
            throw new IllegalArgumentException("Invalid mode provided.");
        else
            return googleapiclient.zza(new zzq.zzb(googleapiclient, i, zza(googleapiclient, downloadprogresslistener)) {

                protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                    throws RemoteException
                {
                    zza((zzs)zza1);
                }

                protected void zza(zzs zzs1)
                    throws RemoteException
                {
                    setCancelToken(zzs1.zznO().zza(new OpenContentsRequest(zzYd.getDriveId(), zzXE, 0), new zzbj(this, zzYc)).zznS());
                }

                final int zzXE;
                final com.google.android.gms.drive.DriveFile.DownloadProgressListener zzYc;
                final zzu zzYd;

            
            {
                zzYd = zzu.this;
                zzXE = i;
                zzYc = downloadprogresslistener;
                super(googleapiclient);
            }
            }
);
    }
}
