// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzbb

public final class zzbd extends zzbc.zza
{

    public zzbd(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzqJ = oncustomrenderedadloadedlistener;
    }

    public void zza(zzbb zzbb)
    {
        zzqJ.onCustomRenderedAdLoaded(new zzba(zzbb));
    }

    private final OnCustomRenderedAdLoadedListener zzqJ;
}
