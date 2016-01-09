// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzlf

public class zzlh extends zzi
{

    public zzlh(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 3, connectioncallbacks, onconnectionfailedlistener);
    }

    public IInterface zzD(IBinder ibinder)
    {
        return zzcs(ibinder);
    }

    public zzlf zzcs(IBinder ibinder)
    {
        return zzlf.zza.zzcr(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.panorama.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.panorama.internal.IPanoramaService";
    }
}
