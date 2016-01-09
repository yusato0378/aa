// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.fitness.zza;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzin

public abstract class zzio extends zzi
{

    protected zzio(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze)
    {
        super(context, looper, i, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected Set zza(Set set)
    {
        return com.google.android.gms.fitness.zza.zzd(set);
    }

    public boolean zzjM()
    {
        return !zzin.zzZ(getContext());
    }

    public boolean zzlZ()
    {
        return true;
    }
}
