// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource

public interface DriveFile
    extends DriveResource
{
    public static interface DownloadProgressListener
    {

        public abstract void onProgress(long l, long l1);
    }


    public abstract PendingResult open(GoogleApiClient googleapiclient, int i, DownloadProgressListener downloadprogresslistener);

    public static final int MODE_READ_ONLY = 0x10000000;
    public static final int MODE_READ_WRITE = 0x30000000;
    public static final int MODE_WRITE_ONLY = 0x20000000;
}
