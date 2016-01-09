// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

public final class AdMobExtras
    implements NetworkExtras
{

    public AdMobExtras(Bundle bundle)
    {
        if(bundle != null)
            bundle = new Bundle(bundle);
        else
            bundle = null;
        mExtras = bundle;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    private final Bundle mExtras;
}
