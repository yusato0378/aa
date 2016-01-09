// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.fitness;

import android.content.Intent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.fitness:
//            BleApi, ConfigApi, HistoryApi, RecordingApi, 
//            SensorsApi, SessionsApi

public class Fitness
{

    private Fitness()
    {
    }

    public static long getEndTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.end_time", -1L);
        if(l == -1L)
            return -1L;
        else
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
    }

    public static long getStartTime(Intent intent, TimeUnit timeunit)
    {
        long l = intent.getLongExtra("vnd.google.fitness.start_time", -1L);
        if(l == -1L)
            return -1L;
        else
            return timeunit.convert(l, TimeUnit.MILLISECONDS);
    }

    private static BleApi zzoz()
    {
        if(android.os.Build.VERSION.SDK_INT >= 18)
            return new zzjr();
        else
            return new zzjz();
    }

    public static final String ACTION_TRACK = "vnd.google.fitness.TRACK";
    public static final String ACTION_VIEW = "vnd.google.fitness.VIEW";
    public static final String ACTION_VIEW_GOAL = "vnd.google.fitness.VIEW_GOAL";
    public static final Void API = null;
    public static final Api BLE_API;
    public static final BleApi BleApi = zzoz();
    public static final Api CONFIG_API;
    public static final ConfigApi ConfigApi = new zzjs();
    public static final String EXTRA_END_TIME = "vnd.google.fitness.end_time";
    public static final String EXTRA_START_TIME = "vnd.google.fitness.start_time";
    public static final Api HISTORY_API;
    public static final HistoryApi HistoryApi = new zzjt();
    public static final Api RECORDING_API;
    public static final RecordingApi RecordingApi = new zzjv();
    public static final Scope SCOPE_ACTIVITY_READ = new Scope("https://www.googleapis.com/auth/fitness.activity.read");
    public static final Scope SCOPE_ACTIVITY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.activity.write");
    public static final Scope SCOPE_BODY_READ = new Scope("https://www.googleapis.com/auth/fitness.body.read");
    public static final Scope SCOPE_BODY_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.body.write");
    public static final Scope SCOPE_LOCATION_READ = new Scope("https://www.googleapis.com/auth/fitness.location.read");
    public static final Scope SCOPE_LOCATION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.location.write");
    public static final Scope SCOPE_NUTRITION_READ = new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
    public static final Scope SCOPE_NUTRITION_READ_WRITE = new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
    public static final Api SENSORS_API;
    public static final Api SESSIONS_API;
    public static final SensorsApi SensorsApi = new zzjw();
    public static final SessionsApi SessionsApi = new zzjx();
    public static final Api zzVS;
    public static final zzjp zzacA = new zzju();
    public static final com.google.android.gms.common.api.Api.zzc zzact;
    public static final com.google.android.gms.common.api.Api.zzc zzacu;
    public static final com.google.android.gms.common.api.Api.zzc zzacv;
    public static final com.google.android.gms.common.api.Api.zzc zzacw;
    public static final com.google.android.gms.common.api.Api.zzc zzacx;
    public static final com.google.android.gms.common.api.Api.zzc zzacy;
    public static final com.google.android.gms.common.api.Api.zzc zzacz;

    static 
    {
        zzact = new com.google.android.gms.common.api.Api.zzc();
        zzacu = new com.google.android.gms.common.api.Api.zzc();
        zzacv = new com.google.android.gms.common.api.Api.zzc();
        zzacw = new com.google.android.gms.common.api.Api.zzc();
        zzacx = new com.google.android.gms.common.api.Api.zzc();
        zzacy = new com.google.android.gms.common.api.Api.zzc();
        zzacz = new com.google.android.gms.common.api.Api.zzc();
        SENSORS_API = new Api("Fitness.SENSORS_API", new com.google.android.gms.internal.zziu.zzb(), zzacy, new Scope[0]);
        RECORDING_API = new Api("Fitness.RECORDING_API", new com.google.android.gms.internal.zzit.zzb(), zzacx, new Scope[0]);
        SESSIONS_API = new Api("Fitness.SESSIONS_API", new com.google.android.gms.internal.zziv.zzb(), zzacz, new Scope[0]);
        HISTORY_API = new Api("Fitness.HISTORY_API", new com.google.android.gms.internal.zzir.zzb(), zzacv, new Scope[0]);
        CONFIG_API = new Api("Fitness.CONFIG_API", new com.google.android.gms.internal.zziq.zzb(), zzacu, new Scope[0]);
        BLE_API = new Api("Fitness.BLE_API", new com.google.android.gms.internal.zzip.zzb(), zzact, new Scope[0]);
        zzVS = new Api("Fitness.INTERNAL_API", new com.google.android.gms.internal.zzis.zza(), zzacw, new Scope[0]);
    }
}
