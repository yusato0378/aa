// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzmg, zzmf

public class zzmh
{
    public static interface zza
    {

        public abstract void zzaI();
    }


    zzmh(Context context, TagManager tagmanager)
    {
        zzaGJ = null;
        mContext = context;
        zzaGJ = tagmanager;
    }

    static Context zza(zzmh zzmh1)
    {
        return zzmh1.mContext;
    }

    static zzmg zza(zzmh zzmh1, zzmg zzmg1)
    {
        zzmh1.zznw = zzmg1;
        return zzmg1;
    }

    public static zzmh zzat(Context context)
    {
        zzv.zzr(context);
        if(zzaGH != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorenter ;
        if(zzaGH == null)
            zzaGH = new zzmh(context, TagManager.getInstance(context.getApplicationContext()));
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorexit ;
_L2:
        return zzaGH;
        context;
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(zzmh zzmh1)
    {
        zzmh1.zzfm();
    }

    private void zzfm()
    {
        this;
        JVM INSTR monitorenter ;
        for(Iterator iterator = zzaGI.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzaI());
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void start()
        throws IllegalStateException
    {
        this;
        JVM INSTR monitorenter ;
        if(mStarted)
            throw new IllegalStateException("Method start() has already been called");
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if(zznw == null)
            throw new IllegalStateException("No settings configured");
        mStarted = true;
        zzaGJ.zzc(zznw.zzxZ(), -1, "admob").setResultCallback(new ResultCallback() {

            public void onResult(Result result)
            {
                zza((ContainerHolder)result);
            }

            public void zza(ContainerHolder containerholder)
            {
                if(containerholder.getStatus().isSuccess())
                    containerholder = containerholder.getContainer();
                else
                    containerholder = null;
                containerholder = new zzmf(zzmh.zza(zzaGK), containerholder, zzaGK.zzyd());
                zzmh.zza(zzaGK, containerholder.zzxX());
                zzmh.zzb(zzaGK);
            }

            final zzmh zzaGK;

            
            {
                zzaGK = zzmh.this;
                super();
            }
        }
);
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zzmg zzmg1)
    {
        this;
        JVM INSTR monitorenter ;
        if(mStarted)
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        break MISSING_BLOCK_LABEL_24;
        zzmg1;
        this;
        JVM INSTR monitorexit ;
        throw zzmg1;
        zznw = zzmg1;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaGI.add(zza1);
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        this;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public zzmg zzyd()
    {
        this;
        JVM INSTR monitorenter ;
        zzmg zzmg1 = zznw;
        this;
        JVM INSTR monitorexit ;
        return zzmg1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static zzmh zzaGH;
    private Context mContext;
    private boolean mStarted;
    private final Set zzaGI = new HashSet();
    private TagManager zzaGJ;
    private zzmg zznw;
}
