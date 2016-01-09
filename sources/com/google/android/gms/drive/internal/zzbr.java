// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzd

public class zzbr extends zzd
{

    public zzbr(com.google.android.gms.common.api.zza.zzb zzb)
    {
        zzKq = zzb;
    }

    public void onSuccess()
        throws RemoteException
    {
        zzKq.zzj(Status.zzQU);
    }

    public void zzm(Status status)
        throws RemoteException
    {
        zzKq.zzj(status);
    }

    private final com.google.android.gms.common.api.zza.zzb zzKq;
}
