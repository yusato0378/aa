// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.Container;

// Referenced classes of package com.google.android.gms.internal:
//            zzmg, zzko, zzkv

class zzmf
{
    static class zza
        implements zzko.zza
    {

        public void zza(zzkv zzkv1)
        {
            zzEt.setScreenName(zzkv1.zzuL());
            com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            screenviewbuilder.set("&a", String.valueOf(zzkv1.zzaJ()));
            zzEt.send(screenviewbuilder.build());
        }

        public void zza(zzkv zzkv1, Activity activity)
        {
        }

        private final Tracker zzEt;

        zza(Tracker tracker)
        {
            zzEt = tracker;
        }
    }


    public zzmf(Context context, Container container, zzmg zzmg1)
    {
        mContext = context;
        zznw = zza(container, zzmg1);
        zzxY();
    }

    static zzmg zza(Container container, zzmg zzmg1)
    {
        if(container == null || container.isDefault())
        {
            return zzmg1;
        } else
        {
            zzmg1 = new zzmg.zza(zzmg1.zzxZ());
            zzmg1.zzek(container.getString("trackingId")).zzak(container.getBoolean("trackScreenViews")).zzal(container.getBoolean("collectAdIdentifiers"));
            return zzmg1.zzyc();
        }
    }

    private void zzxY()
    {
        if(zznw.zzya() && !TextUtils.isEmpty(zznw.zzjs()))
        {
            Tracker tracker = zzej(zznw.zzjs());
            tracker.enableAdvertisingIdCollection(zznw.zzyb());
            zzb(new zza(tracker));
        }
    }

    void zzb(zzko.zza zza1)
    {
        zzv.zzr(zza1);
        zzko zzko1 = zzko.zzal(mContext);
        zzko1.zzaa(true);
        zzko1.zza(zza1);
    }

    Tracker zzej(String s)
    {
        return GoogleAnalytics.getInstance(mContext).newTracker(s);
    }

    public zzmg zzxX()
    {
        return zznw;
    }

    private final Context mContext;
    private final zzmg zznw;
}
