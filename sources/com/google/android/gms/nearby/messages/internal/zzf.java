// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            zzc

class zzf extends zzi
{

    zzf(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze)
    {
        super(context, looper, 62, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzck(ibinder);
    }

    protected zzc zzck(IBinder ibinder)
    {
        return zzc.zza.zzcj(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    public boolean zzlZ()
    {
        return true;
    }
}
