// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.internal:
//            zzhj, zzhh, zzhm, zzho

public final class zzhk
    implements zzhj
{
    private static class zza extends zzhh
    {

        public void zzaW(int i)
            throws RemoteException
        {
            zzKq.zzj(new Status(i));
        }

        private final com.google.android.gms.common.api.zza.zzb zzKq;

        public zza(com.google.android.gms.common.api.zza.zzb zzb)
        {
            zzKq = zzb;
        }
    }


    public zzhk()
    {
    }

    public PendingResult zzc(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new zzhl.zza(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzhm)zza1);
            }

            protected void zza(zzhm zzhm1)
                throws RemoteException
            {
                ((zzho)zzhm1.zzlX()).zza(new zza(this));
            }

            final zzhk zzUi;

            
            {
                zzUi = zzhk.this;
                super(googleapiclient);
            }
        }
);
    }
}
