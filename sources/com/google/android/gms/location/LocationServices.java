// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.internal.zzd;
import com.google.android.gms.location.internal.zze;
import com.google.android.gms.location.internal.zzj;
import com.google.android.gms.location.internal.zzo;

// Referenced classes of package com.google.android.gms.location:
//            FusedLocationProviderApi, GeofencingApi, SettingsApi

public class LocationServices
{
    public static abstract class zza extends com.google.android.gms.common.api.zza.zza
    {

        public zza(GoogleApiClient googleapiclient)
        {
            super(LocationServices.zzsy(), googleapiclient);
        }
    }


    private LocationServices()
    {
    }

    public static zzj zze(GoogleApiClient googleapiclient)
    {
        boolean flag1 = true;
        boolean flag;
        if(googleapiclient != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "GoogleApiClient parameter is required.");
        googleapiclient = (zzj)googleapiclient.zza(zzKh);
        if(googleapiclient != null)
            flag = flag1;
        else
            flag = false;
        zzv.zza(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    static com.google.android.gms.common.api.Api.zzc zzsy()
    {
        return zzKh;
    }

    public static final Api API;
    public static FusedLocationProviderApi FusedLocationApi = new zzd();
    public static GeofencingApi GeofencingApi = new zze();
    public static SettingsApi SettingsApi = new zzo();
    private static final com.google.android.gms.common.api.Api.zzc zzKh;
    private static final com.google.android.gms.common.api.Api.zzb zzKi;

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzk(context, looper, zze1, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzj zzk(Context context, Looper looper, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzj(context, looper, connectioncallbacks, onconnectionfailedlistener, "locationServices", zze1);
            }

        }
;
        API = new Api("LocationServices.API", zzKi, zzKh, new Scope[0]);
    }
}
