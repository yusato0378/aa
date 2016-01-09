// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.places.PlacesOptions;
import com.google.android.gms.location.places.zzf;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zze

public class zzi extends com.google.android.gms.common.internal.zzi
{
    public static class zza
        implements com.google.android.gms.common.api.Api.zzb
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zzb(context, looper, zze1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzi zzb(Context context, Looper looper, zze zze1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            String s;
            String s1;
            if(zzass != null)
                s = zzass;
            else
                s = context.getPackageName();
            if(zzast != null)
                s1 = zzast;
            else
                s1 = context.getPackageName();
            if(placesoptions == null)
                placesoptions = (new com.google.android.gms.location.places.PlacesOptions.Builder()).build();
            return new zzi(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        private final String zzass;
        private final String zzast;

        public zza(String s, String s1)
        {
            zzass = s;
            zzast = s1;
        }
    }


    public zzi(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 67, connectioncallbacks, onconnectionfailedlistener, zze1);
        context = null;
        if(zze1.getAccount() != null)
            context = zze1.getAccount().name;
        zzasq = new PlacesParams(s, zzasr, context, placesoptions.zzasc, s1);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzbn(ibinder);
    }

    public void zza(zzf zzf, PlaceFilter placefilter)
        throws RemoteException
    {
        PlaceFilter placefilter1 = placefilter;
        if(placefilter == null)
            placefilter1 = PlaceFilter.zzsU();
        ((com.google.android.gms.location.places.internal.zze)zzlX()).zza(placefilter1, zzasq, zzf);
    }

    public void zza(zzf zzf, PlaceReport placereport)
        throws RemoteException
    {
        zzv.zzr(placereport);
        ((com.google.android.gms.location.places.internal.zze)zzlX()).zza(placereport, zzasq, zzf);
    }

    protected com.google.android.gms.location.places.internal.zze zzbn(IBinder ibinder)
    {
        return zze.zza.zzbk(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.location.places.PlaceDetectionApi";
    }

    protected String zzer()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlaceDetectionService";
    }

    private final PlacesParams zzasq;
    private final Locale zzasr = Locale.getDefault();
}
