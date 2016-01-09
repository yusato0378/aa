// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzd, OnContentsResponse, zzt, OnDownloadProgressResponse

class zzbj extends zzd
{

    zzbj(com.google.android.gms.common.api.zza.zzb zzb, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        zzKq = zzb;
        zzZp = downloadprogresslistener;
    }

    public void zza(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        Status status;
        if(oncontentsresponse.zznX())
            status = new Status(-1);
        else
            status = Status.zzQU;
        zzKq.zzj(new zzq.zza(status, new zzt(oncontentsresponse.zznW())));
    }

    public void zza(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
        if(zzZp != null)
            zzZp.onProgress(ondownloadprogressresponse.zznZ(), ondownloadprogressresponse.zzoa());
    }

    public void zzm(Status status)
        throws RemoteException
    {
        zzKq.zzj(new zzq.zza(status, null));
    }

    private final com.google.android.gms.common.api.zza.zzb zzKq;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener zzZp;
}
