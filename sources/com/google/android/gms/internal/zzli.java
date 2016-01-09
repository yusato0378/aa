// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;

class zzli
    implements com.google.android.gms.panorama.PanoramaApi.PanoramaResult
{

    public zzli(Status status, Intent intent)
    {
        zzKr = (Status)zzv.zzr(status);
        zzaym = intent;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    public Intent getViewerIntent()
    {
        return zzaym;
    }

    private final Status zzKr;
    private final Intent zzaym;
}
