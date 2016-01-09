// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.panorama;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.*;

public interface PanoramaApi
{
    public static interface PanoramaResult
        extends Result
    {

        public abstract Intent getViewerIntent();
    }


    public abstract PendingResult loadPanoramaInfo(GoogleApiClient googleapiclient, Uri uri);

    public abstract PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient googleapiclient, Uri uri);
}
