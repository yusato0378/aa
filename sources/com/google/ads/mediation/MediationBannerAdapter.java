// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;

// Referenced classes of package com.google.ads.mediation:
//            MediationAdapter, MediationBannerListener, MediationServerParameters, MediationAdRequest, 
//            NetworkExtras

public interface MediationBannerAdapter
    extends MediationAdapter
{

    public abstract View getBannerView();

    public abstract void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras);
}
