// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.*;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzj

public class zzo
    implements SettingsApi
{

    public zzo()
    {
    }

    public PendingResult checkLocationSettings(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest)
    {
        return zza(googleapiclient, locationsettingsrequest, null);
    }

    public PendingResult zza(GoogleApiClient googleapiclient, LocationSettingsRequest locationsettingsrequest, String s)
    {
        return googleapiclient.zza(new com.google.android.gms.location.LocationServices.zza(googleapiclient, locationsettingsrequest, s) {

            public Result createFailedResult(Status status)
            {
                return zzay(status);
            }

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzj)zza1);
            }

            protected void zza(zzj zzj1)
                throws RemoteException
            {
                zzj1.zza(zzart, this, zzaru);
            }

            public LocationSettingsResult zzay(Status status)
            {
                return new LocationSettingsResult(status);
            }

            final LocationSettingsRequest zzart;
            final String zzaru;
            final zzo zzarv;

            
            {
                zzarv = zzo.this;
                zzart = locationsettingsrequest;
                zzaru = s;
                super(googleapiclient);
            }
        }
);
    }
}
