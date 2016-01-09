// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class zzn
{
    private class zza
        implements Runnable
    {

        public void run()
        {
            synchronized(zzn.zzb(zzata))
            {
                Intent intent = new Intent("com.google.android.location.places.METHOD_CALL");
                intent.setPackage("com.google.android.gms");
                intent.putStringArrayListExtra("PLACE_IDS", zzn.zzc(zzata));
                intent.putStringArrayListExtra("METHOD_NAMES", zzn.zzd(zzata));
                zzn.zze(zzata).sendBroadcast(intent);
                zzn.zza(zzata, null);
                zzn.zzb(zzata, null);
            }
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final zzn zzata;

        private zza()
        {
            zzata = zzn.this;
            super();
        }

    }


    private zzn(Context context)
    {
        this((Context)zzv.zzr(context), new Handler(Looper.getMainLooper()));
    }

    zzn(Context context, Handler handler)
    {
        zzasX = new zza();
        zzoe = new Object();
        zzasY = null;
        zzasZ = null;
        mContext = context;
        mHandler = handler;
    }

    static ArrayList zza(zzn zzn1, ArrayList arraylist)
    {
        zzn1.zzasY = arraylist;
        return arraylist;
    }

    public static zzn zzag(Context context)
    {
        com/google/android/gms/location/places/internal/zzn;
        JVM INSTR monitorenter ;
        int i;
        zzv.zzr(context);
        i = android.os.Build.VERSION.SDK_INT;
        if(i >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        com/google/android/gms/location/places/internal/zzn;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if(zzasW == null)
            zzasW = new zzn(context.getApplicationContext());
        context = zzasW;
        if(true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static Object zzb(zzn zzn1)
    {
        return zzn1.zzoe;
    }

    static ArrayList zzb(zzn zzn1, ArrayList arraylist)
    {
        zzn1.zzasZ = arraylist;
        return arraylist;
    }

    static ArrayList zzc(zzn zzn1)
    {
        return zzn1.zzasY;
    }

    static ArrayList zzd(zzn zzn1)
    {
        return zzn1.zzasZ;
    }

    static Context zze(zzn zzn1)
    {
        return zzn1.mContext;
    }

    public void zzz(String s, String s1)
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if(zzasY == null)
        {
            zzasY = new ArrayList();
            zzasZ = new ArrayList();
            mHandler.postDelayed(zzasX, zzasV);
        }
        zzasY.add(s);
        zzasZ.add(s1);
        if(zzasY.size() >= 10000)
        {
            if(Log.isLoggable(TAG, 5))
                Log.w(TAG, "Event buffer full, flushing");
            zzasX.run();
            mHandler.removeCallbacks(zzasX);
            return;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static final String TAG = com/google/android/gms/location/places/internal/zzn.getSimpleName();
    private static final long zzasV;
    private static zzn zzasW;
    private final Context mContext;
    private final Handler mHandler;
    private final Runnable zzasX;
    private ArrayList zzasY;
    private ArrayList zzasZ;
    private final Object zzoe;

    static 
    {
        zzasV = TimeUnit.SECONDS.toMillis(1L);
    }
}
