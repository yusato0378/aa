// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.places.*;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzd

public class zzc
    implements GeoDataApi
{

    public zzc()
    {
    }

    public PendingResult addPlace(GoogleApiClient googleapiclient, AddPlaceRequest addplacerequest)
    {
        return googleapiclient.zzb(new com.google.android.gms.location.places.zzf.zzc(Places.zzarV, googleapiclient, addplacerequest) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzd)zza1);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzf(this, zzd1.getContext()), zzasl);
            }

            final AddPlaceRequest zzasl;
            final zzc zzasm;

            
            {
                zzasm = zzc.this;
                zzasl = addplacerequest;
                super(zzc2, googleapiclient);
            }
        }
);
    }

    public PendingResult getAutocompletePredictions(GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
    {
        return googleapiclient.zza(new com.google.android.gms.location.places.zzf.zza(Places.zzarV, googleapiclient, s, latlngbounds, autocompletefilter) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzd)zza1);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                zzd1.zza(new zzf(this), zzajQ, zzaso, zzasp);
            }

            final String zzajQ;
            final zzc zzasm;
            final LatLngBounds zzaso;
            final AutocompleteFilter zzasp;

            
            {
                zzasm = zzc.this;
                zzajQ = s;
                zzaso = latlngbounds;
                zzasp = autocompletefilter;
                super(zzc2, googleapiclient);
            }
        }
);
    }

    public transient PendingResult getPlaceById(GoogleApiClient googleapiclient, String as[])
    {
        boolean flag = true;
        if(as == null || as.length < 1)
            flag = false;
        zzv.zzQ(flag);
        return googleapiclient.zza(new com.google.android.gms.location.places.zzf.zzc(Places.zzarV, googleapiclient, as) {

            protected volatile void zza(com.google.android.gms.common.api.Api.zza zza1)
                throws RemoteException
            {
                zza((zzd)zza1);
            }

            protected void zza(zzd zzd1)
                throws RemoteException
            {
                java.util.List list = Arrays.asList(zzasn);
                zzd1.zza(new zzf(this, zzd1.getContext()), list);
            }

            final zzc zzasm;
            final String zzasn[];

            
            {
                zzasm = zzc.this;
                zzasn = as;
                super(zzc2, googleapiclient);
            }
        }
);
    }
}
