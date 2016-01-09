// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;
import com.google.ads.mediation.*;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventBanner, CustomEventInterstitial, CustomEventServerParameters, CustomEventBannerListener, 
//            CustomEventInterstitialListener

public final class CustomEventAdapter
    implements MediationBannerAdapter, MediationInterstitialAdapter
{
    static final class zza
        implements CustomEventBannerListener
    {

        public void onClick()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzr.onClick(zzq);
        }

        public void onDismissScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzr.onDismissScreen(zzq);
        }

        public void onFailedToReceiveAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzr.onFailedToReceiveAd(zzq, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzr.onLeaveApplication(zzq);
        }

        public void onPresentScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzr.onPresentScreen(zzq);
        }

        public void onReceivedAd(View view)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onReceivedAd.");
            CustomEventAdapter.zza(zzq, view);
            zzr.onReceivedAd(zzq);
        }

        private final CustomEventAdapter zzq;
        private final MediationBannerListener zzr;

        public zza(CustomEventAdapter customeventadapter, MediationBannerListener mediationbannerlistener)
        {
            zzq = customeventadapter;
            zzr = mediationbannerlistener;
        }
    }

    class zzb
        implements CustomEventInterstitialListener
    {

        public void onDismissScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onDismissScreen.");
            zzs.onDismissScreen(zzq);
        }

        public void onFailedToReceiveAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onFailedToReceiveAd.");
            zzs.onFailedToReceiveAd(zzq, com.google.ads.AdRequest.ErrorCode.NO_FILL);
        }

        public void onLeaveApplication()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onLeaveApplication.");
            zzs.onLeaveApplication(zzq);
        }

        public void onPresentScreen()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onPresentScreen.");
            zzs.onPresentScreen(zzq);
        }

        public void onReceivedAd()
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaj("Custom event adapter called onReceivedAd.");
            zzs.onReceivedAd(zzt);
        }

        private final CustomEventAdapter zzq;
        private final MediationInterstitialListener zzs;
        final CustomEventAdapter zzt;

        public zzb(CustomEventAdapter customeventadapter1, MediationInterstitialListener mediationinterstitiallistener)
        {
            zzt = CustomEventAdapter.this;
            super();
            zzq = customeventadapter1;
            zzs = mediationinterstitiallistener;
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

    public void destroy()
    {
        if(zzo != null)
            zzo.destroy();
        if(zzp != null)
            zzp.destroy();
    }

    public Class getAdditionalParametersType()
    {
        return com/google/android/gms/ads/mediation/customevent/CustomEventExtras;
    }

    public View getBannerView()
    {
        return zzn;
    }

    public Class getServerParametersType()
    {
        return com/google/ads/mediation/customevent/CustomEventServerParameters;
    }

    public volatile void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, MediationServerParameters mediationserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestBannerAd(mediationbannerlistener, activity, (CustomEventServerParameters)mediationserverparameters, adsize, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestBannerAd(MediationBannerListener mediationbannerlistener, Activity activity, CustomEventServerParameters customeventserverparameters, AdSize adsize, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        zzo = (CustomEventBanner)zza(customeventserverparameters.className);
        if(zzo == null)
        {
            mediationbannerlistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if(customeventextras == null)
            customeventextras = null;
        else
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        zzo.requestBannerAd(new zza(this, mediationbannerlistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, adsize, mediationadrequest, customeventextras);
    }

    public volatile void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, MediationServerParameters mediationserverparameters, MediationAdRequest mediationadrequest, NetworkExtras networkextras)
    {
        requestInterstitialAd(mediationinterstitiallistener, activity, (CustomEventServerParameters)mediationserverparameters, mediationadrequest, (CustomEventExtras)networkextras);
    }

    public void requestInterstitialAd(MediationInterstitialListener mediationinterstitiallistener, Activity activity, CustomEventServerParameters customeventserverparameters, MediationAdRequest mediationadrequest, CustomEventExtras customeventextras)
    {
        zzp = (CustomEventInterstitial)zza(customeventserverparameters.className);
        if(zzp == null)
        {
            mediationinterstitiallistener.onFailedToReceiveAd(this, com.google.ads.AdRequest.ErrorCode.INTERNAL_ERROR);
            return;
        }
        if(customeventextras == null)
            customeventextras = null;
        else
            customeventextras = ((CustomEventExtras) (customeventextras.getExtra(customeventserverparameters.label)));
        zzp.requestInterstitialAd(zza(mediationinterstitiallistener), activity, customeventserverparameters.label, customeventserverparameters.parameter, mediationadrequest, customeventextras);
    }

    public void showInterstitial()
    {
        zzp.showInterstitial();
    }

    zzb zza(MediationInterstitialListener mediationinterstitiallistener)
    {
        return new zzb(this, mediationinterstitiallistener);
    }

    private View zzn;
    CustomEventBanner zzo;
    CustomEventInterstitial zzp;
}
