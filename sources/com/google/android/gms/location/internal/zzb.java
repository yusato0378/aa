// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzn, zzg

public class zzb extends zzi
{

    public zzb(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, zze zze)
    {
        super(context, looper, 23, connectioncallbacks, onconnectionfailedlistener, zze);
        zzaqF = s;
    }

    static void zza(zzb zzb1)
    {
        zzb1.zzlW();
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzbf(ibinder);
    }

    protected zzg zzbf(IBinder ibinder)
    {
        return zzg.zza.zzbh(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    protected Bundle zzka()
    {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", zzaqF);
        return bundle;
    }

    private final String zzaqF;
    protected final zzn zzaqz = new zzn() {

        public void zzlW()
        {
            zzb.zza(zzaqG);
        }

        public IInterface zzlX()
            throws DeadObjectException
        {
            return zzsF();
        }

        public zzg zzsF()
            throws DeadObjectException
        {
            return (zzg)zzaqG.zzlX();
        }

        final zzb zzaqG;

            
            {
                zzaqG = zzb.this;
                super();
            }
    }
;
}
