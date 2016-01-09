// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.ActivityRecognitionApi;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class com.google.android.gms.location.internal.zza
    implements ActivityRecognitionApi
{
    private static abstract class zza extends com.google.android.gms.location.ActivityRecognition.zza
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        public zza(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public com.google.android.gms.location.internal.zza()
    {
    }

    public PendingResult removeActivityUpdates(GoogleApiClient googleapiclient, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqD);
                setResult(Status.zzQU);
            }

            final PendingIntent zzaqD;
            final com.google.android.gms.location.internal.zza zzaqE;

            
            {
                zzaqE = com.google.android.gms.location.internal.zza.this;
                zzaqD = pendingintent;
                super(googleapiclient);
            }
        }
);
    }

    public PendingResult requestActivityUpdates(GoogleApiClient googleapiclient, long l, PendingIntent pendingintent)
    {
        return googleapiclient.zzb(new zza(googleapiclient, l, pendingintent) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzaqC, zzaqD);
                setResult(Status.zzQU);
            }

            final long zzaqC;
            final PendingIntent zzaqD;
            final com.google.android.gms.location.internal.zza zzaqE;

            
            {
                zzaqE = com.google.android.gms.location.internal.zza.this;
                zzaqC = l;
                zzaqD = pendingintent;
                super(googleapiclient);
            }
        }
);
    }
}
