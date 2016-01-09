// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.places.*;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzi

public class zzh
    implements PlaceDetectionApi
{

    public zzh()
    {
    }

    public PendingResult getCurrentPlace(GoogleApiClient googleapiclient, PlaceFilter placefilter)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzf.zzd(Places.zzarW, googleapiclient, placefilter) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzi)zza1);
            }

            protected void zza(zzi zzi1)
                throws RemoteException
            {
                zzi1.zza(new zzf(this, zzi1.getContext()), zzasu);
            }

            final PlaceFilter zzasu;
            final zzh zzasv;

            
            {
                zzasv = zzh.this;
                zzasu = placefilter;
                super(zzc, googleapiclient);
            }
        }
);
    }

    public PendingResult reportDeviceAtPlace(GoogleApiClient googleapiclient, PlaceReport placereport)
    {
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzf.zzf(Places.zzarW, googleapiclient, placereport) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzi)zza1);
            }

            protected void zza(zzi zzi1)
                throws RemoteException
            {
                zzi1.zza(new zzf(this), zzasw);
            }

            final zzh zzasv;
            final PlaceReport zzasw;

            
            {
                zzasv = zzh.this;
                zzasw = placereport;
                super(zzc, googleapiclient);
            }
        }
);
    }
}
