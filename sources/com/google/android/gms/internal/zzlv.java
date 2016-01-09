// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.internal:
//            zzlt, zzls

public class zzlv extends zzi
{

    public zzlv(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 45, connectioncallbacks, onconnectionfailedlistener);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcC(ibinder);
    }

    public void zza(zzls zzls, byte abyte0[])
        throws RemoteException
    {
        ((zzlt)zzlX()).zza(zzls, abyte0);
    }

    protected zzlt zzcC(IBinder ibinder)
    {
        return zzlt.zza.zzcB(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.safetynet.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }
}
