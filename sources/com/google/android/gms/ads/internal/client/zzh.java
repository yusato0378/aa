// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzh extends zzp.zza
{

    public zzh(AppEventListener appeventlistener)
    {
        zzqb = appeventlistener;
    }

    public void onAppEvent(String s, String s1)
    {
        zzqb.onAppEvent(s, s1);
    }

    private final AppEventListener zzqb;
}
