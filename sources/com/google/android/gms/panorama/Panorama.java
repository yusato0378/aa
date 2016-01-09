// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.panorama;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.internal.zzlg;
import com.google.android.gms.internal.zzlh;

// Referenced classes of package com.google.android.gms.panorama:
//            PanoramaApi

public final class Panorama
{

    private Panorama()
    {
    }

    public static final Api API;
    public static final PanoramaApi PanoramaApi = new zzlg();
    public static final com.google.android.gms.common.api.Api.zzc zzKh;
    static final com.google.android.gms.common.api.Api.zzb zzKi;

    static 
    {
        zzKh = new com.google.android.gms.common.api.Api.zzc();
        zzKi = new com.google.android.gms.common.api.Api.zzb() {

            public int getPriority()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zzo(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public zzlh zzo(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return new zzlh(context, looper, connectioncallbacks, onconnectionfailedlistener);
            }

        }
;
        API = new Api("Panorama.API", zzKi, zzKh, new Scope[0]);
    }
}
