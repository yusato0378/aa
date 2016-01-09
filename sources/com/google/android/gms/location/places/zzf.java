// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.location.places.personalized.zzd;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihoodBuffer, AutocompletePredictionBuffer, PlaceBuffer

public class com.google.android.gms.location.places.zzf extends com.google.android.gms.location.places.internal.zzg.zza
{
    public static abstract class zza extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaA(status);
        }

        protected AutocompletePredictionBuffer zzaA(Status status)
        {
            return new AutocompletePredictionBuffer(DataHolder.zzaE(status.getStatusCode()));
        }

        public zza(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzb extends com.google.android.gms.common.api.zza.zza
    {

        public zzb(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzc extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaB(status);
        }

        protected PlaceBuffer zzaB(Status status)
        {
            return new PlaceBuffer(DataHolder.zzaE(status.getStatusCode()), null);
        }

        public zzc(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zzd extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaC(status);
        }

        protected PlaceLikelihoodBuffer zzaC(Status status)
        {
            return new PlaceLikelihoodBuffer(DataHolder.zzaE(status.getStatusCode()), 100, null);
        }

        public zzd(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }

    public static abstract class zze extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzaD(status);
        }

        protected com.google.android.gms.location.places.personalized.zzd zzaD(Status status)
        {
            return com.google.android.gms.location.places.personalized.zzd.zzaE(status);
        }
    }

    public static abstract class zzf extends zzb
    {

        protected Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        protected Status zzb(Status status)
        {
            return status;
        }

        public zzf(com.google.android.gms.common.api.Api.zzc zzc1, GoogleApiClient googleapiclient)
        {
            super(zzc1, googleapiclient);
        }
    }


    public com.google.android.gms.location.places.zzf(zza zza1)
    {
        zzarX = null;
        zzarY = zza1;
        zzarZ = null;
        zzasa = null;
        zzasb = null;
        mContext = null;
    }

    public com.google.android.gms.location.places.zzf(zzc zzc1, Context context)
    {
        zzarX = null;
        zzarY = null;
        zzarZ = null;
        zzasa = null;
        zzasb = zzc1;
        mContext = context;
    }

    public com.google.android.gms.location.places.zzf(zzd zzd1, Context context)
    {
        zzarX = zzd1;
        zzarY = null;
        zzarZ = null;
        zzasa = null;
        zzasb = null;
        mContext = context;
    }

    public com.google.android.gms.location.places.zzf(zzf zzf1)
    {
        zzarX = null;
        zzarY = null;
        zzarZ = null;
        zzasa = zzf1;
        zzasb = null;
        mContext = null;
    }

    public void zzY(DataHolder dataholder)
        throws RemoteException
    {
        boolean flag;
        if(zzarX != null)
            flag = true;
        else
            flag = false;
        zzv.zza(flag, "placeEstimator cannot be null");
        if(dataholder == null)
        {
            if(Log.isLoggable(TAG, 6))
                Log.e(TAG, (new StringBuilder()).append("onPlaceEstimated received null DataHolder: ").append(zzie.zznn()).toString());
            zzarX.zzk(Status.zzQW);
            return;
        } else
        {
            dataholder = new PlaceLikelihoodBuffer(dataholder, 100, mContext);
            zzarX.setResult(dataholder);
            return;
        }
    }

    public void zzZ(DataHolder dataholder)
        throws RemoteException
    {
        if(dataholder == null)
        {
            if(Log.isLoggable(TAG, 6))
                Log.e(TAG, (new StringBuilder()).append("onAutocompletePrediction received null DataHolder: ").append(zzie.zznn()).toString());
            zzarY.zzk(Status.zzQW);
            return;
        } else
        {
            zzarY.setResult(new AutocompletePredictionBuffer(dataholder));
            return;
        }
    }

    public void zzaa(DataHolder dataholder)
        throws RemoteException
    {
        if(dataholder == null)
        {
            if(Log.isLoggable(TAG, 6))
                Log.e(TAG, (new StringBuilder()).append("onPlaceUserDataFetched received null DataHolder: ").append(zzie.zznn()).toString());
            zzarZ.zzk(Status.zzQW);
            return;
        } else
        {
            zzarZ.setResult(new com.google.android.gms.location.places.personalized.zzd(dataholder));
            return;
        }
    }

    public void zzab(DataHolder dataholder)
        throws RemoteException
    {
        dataholder = new PlaceBuffer(dataholder, mContext);
        zzasb.setResult(dataholder);
    }

    public void zzaz(Status status)
        throws RemoteException
    {
        zzasa.setResult(status);
    }

    private static final String TAG = com/google/android/gms/location/places/zzf.getSimpleName();
    private final Context mContext;
    private final zzd zzarX;
    private final zza zzarY;
    private final zze zzarZ;
    private final zzf zzasa;
    private final zzc zzasb;

}
