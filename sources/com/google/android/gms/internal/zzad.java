// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

public class zzad
    implements android.app.Application.ActivityLifecycleCallbacks
{

    public zzad(Application application, Activity activity)
    {
        application.registerActivityLifecycleCallbacks(this);
        setActivity(activity);
        mContext = application.getApplicationContext();
    }

    private void setActivity(Activity activity)
    {
        synchronized(zzoe)
        {
            if(!activity.getClass().getName().startsWith("com.google.android.gms.ads"))
                zzpf = activity;
        }
        return;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
    }

    public Activity getActivity()
    {
        return zzpf;
    }

    public Context getContext()
    {
        return mContext;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
label0:
        {
            synchronized(zzoe)
            {
                if(zzpf != null)
                    break label0;
            }
            return;
        }
        if(zzpf.equals(activity))
            zzpf = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        activity;
        obj;
        JVM INSTR monitorexit ;
        throw activity;
    }

    public void onActivityPaused(Activity activity)
    {
        setActivity(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        setActivity(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        setActivity(activity);
    }

    public void onActivityStopped(Activity activity)
    {
    }

    private Context mContext;
    private final Object zzoe = new Object();
    private Activity zzpf;
}
