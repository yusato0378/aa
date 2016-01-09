// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.*;

// Referenced classes of package com.google.android.gms.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventBannerListener, CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza
        implements CustomEventBannerListener
    {

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdClicked.");
            zzg.onAdClicked(zzDK);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdClosed.");
            zzg.onAdClosed(zzDK);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdFailedToLoad.");
            zzg.onAdFailedToLoad(zzDK, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdLeftApplication.");
            zzg.onAdLeftApplication(zzDK);
        }

        public void onAdLoaded(View view)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdLoaded.");
            CustomEventAdapter.zza(zzDK, view);
            zzg.onAdLoaded(zzDK);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdOpened.");
            zzg.onAdOpened(zzDK);
        }

        private final CustomEventAdapter zzDK;
        private final MediationBannerListener zzg;

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            zzDK = customeventadapter;
            zzg = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        public void onAdClicked()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdClicked.");
            zzh.onAdClicked(zzDK);
        }

        public void onAdClosed()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdClosed.");
            zzh.onAdClosed(zzDK);
        }

        public void onAdFailedToLoad(int i)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzh.onAdFailedToLoad(zzDK, i);
        }

        public void onAdLeftApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdLeftApplication.");
            zzh.onAdLeftApplication(zzDK);
        }

        public void onAdLoaded()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onReceivedAd.");
            zzh.onAdLoaded(zzDL);
        }

        public void onAdOpened()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onAdOpened.");
            zzh.onAdOpened(zzDK);
        }

        private final CustomEventAdapter zzDK;
        final CustomEventAdapter zzDL;
        private final MediationInterstitialListener zzh;

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzDL = CustomEventAdapter.this;
            super();
            zzDK = customeventadapter1;
            zzh = mediationinterstitiallistener;
        }
    }


    public CustomEventAdapter()
    {
    }

    private static Object zza(String s)
    {
        Object obj;
        try
        {
            obj = Class.forName(s).newInstance();
        }
        catch(Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan((new StringBuilder()).append("Could not instantiate custom event adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
            return null;
        }
        return obj;
    }

    private void zza(View view)
    {
        zzn = view;
    }

    static void zza(CustomEventAdapter customeventadapter, View view)
    {
        customeventadapter.zza(view);
    }

    public View getBannerView()
    {
        return zzn;
    }

    public void onDestroy()
    {
        if(zzDI != null)
            zzDI.onDestroy();
        if(zzDJ != null)
            zzDJ.onDestroy();
    }

    public void onPause()
    {
        if(zzDI != null)
            zzDI.onPause();
        if(zzDJ != null)
            zzDJ.onPause();
    }

    public void onResume()
    {
        if(zzDI != null)
            zzDI.onResume();
        if(zzDJ != null)
            zzDJ.onResume();
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationbannerlistener, Bundle bundle, AdSize adsize, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzDI = (CustomEventBanner)zza(bundle.getString("class_name"));
        if(zzDI == null)
        {
            mediationbannerlistener.onAdFailedToLoad(this, 0);
            return;
        }
        if(bundle1 == null)
            bundle1 = null;
        else
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        zzDI.requestBannerAd(context, new zza(this, mediationbannerlistener), bundle.getString("parameter"), adsize, mediationadrequest, bundle1);
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationinterstitiallistener, Bundle bundle, MediationAdRequest mediationadrequest, Bundle bundle1)
    {
        zzDJ = (CustomEventInterstitial)zza(bundle.getString("class_name"));
        if(zzDJ == null)
        {
            mediationinterstitiallistener.onAdFailedToLoad(this, 0);
            return;
        }
        if(bundle1 == null)
            bundle1 = null;
        else
            bundle1 = bundle1.getBundle(bundle.getString("class_name"));
        zzDJ.requestInterstitialAd(context, zza(mediationinterstitiallistener), bundle.getString("parameter"), mediationadrequest, bundle1);
    }

    public void showInterstitial()
    {
        zzDJ.showInterstitial();
    }

    zzb zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }

    CustomEventBanner zzDI;
    CustomEventInterstitial zzDJ;
    private View zzn;
}
