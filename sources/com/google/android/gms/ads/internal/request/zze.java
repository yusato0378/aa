// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzi

public class zze extends zzi
{

    public zze(Context context, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, int i)
    {
        super(context, context.getMainLooper(), 8, connectioncallbacks, onconnectionfailedlistener);
        zzyU = i;
    }

    protected com.google.android.gms.ads.internal.request.zzi zzC(IBinder ibinder)
    {
        return zzi.zza.zzE(ibinder);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzC(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public com.google.android.gms.ads.internal.request.zzi zzes()
        throws DeadObjectException
    {
        return (com.google.android.gms.ads.internal.request.zzi)super.zzlX();
    }

    final int zzyU;
}
