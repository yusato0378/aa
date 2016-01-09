// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.nearby.sharing.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            zzd

class zze extends zzi
{

    public zze(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.common.internal.zze zze1)
    {
        super(context, looper, 49, connectioncallbacks, onconnectionfailedlistener, zze1);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcp(ibinder);
    }

    protected zzd zzcp(IBinder ibinder)
    {
        return zzd.zza.zzco(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.nearby.sharing.service.NearbySharingService.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.nearby.sharing.internal.INearbySharingService";
    }
}
