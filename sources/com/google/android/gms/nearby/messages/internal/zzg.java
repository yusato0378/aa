// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.nearby.messages.*;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzf

public class zzg
    implements zzc
{

    public zzg()
    {
    }

    public static final com.google.android.gms.common.api.Api.zzc zzKh = new com.google.android.gms.common.api.Api.zzc();
    public static final com.google.android.gms.common.api.Api.zzb zzKi = new com.google.android.gms.common.api.Api.zzb() {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzm(context, looper, zze, (com.google.android.gms.common.api.Api.ApiOptions.NoOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzf zzm(Context context, Looper looper, zze zze, com.google.android.gms.common.api.Api.ApiOptions.NoOptions nooptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return new zzf(context, looper, connectioncallbacks, onconnectionfailedlistener, zze);
        }

    }
;
    private static final Strategy zzaxN = (new com.google.android.gms.nearby.messages.Strategy.zza()).zzvb();
    private static final MessageFilter zzaxO = (new com.google.android.gms.nearby.messages.MessageFilter.zza()).zzva();

}
