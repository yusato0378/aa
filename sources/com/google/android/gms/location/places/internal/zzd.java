// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.*;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.location.places.*;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            PlacesParams, zzf

public class zzd extends zzi
{
    public static class zza
        implements com.google.android.gms.common.api.Api.zzb
    {

        public int getPriority()
        {
            return 0x7fffffff;
        }

        public volatile com.google.android.gms.common.api.Api.zza zza(Context context, Looper looper, zze zze1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            return zza(context, looper, zze1, (PlacesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
        }

        public zzd zza(Context context, Looper looper, zze zze1, PlacesOptions placesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
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
            return new zzd(context, looper, zze1, connectioncallbacks, onconnectionfailedlistener, s, s1, placesoptions);
        }

        private final String zzass;
        private final String zzast;

        public zza(String s, String s1)
        {
            zzass = s;
            zzast = s1;
        }
    }


    public zzd(Context context, Looper looper, zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s, String s1, 
            PlacesOptions placesoptions)
    {
        super(context, looper, 65, connectioncallbacks, onconnectionfailedlistener, zze1);
        context = null;
        if(zze1.getAccount() != null)
            context = zze1.getAccount().name;
        zzasq = new PlacesParams(s, zzasr, context, placesoptions.zzasc, s1);
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzbj(ibinder);
    }

    public void zza(zzf zzf1, AddPlaceRequest addplacerequest)
        throws RemoteException
    {
        zzv.zzb(addplacerequest, "userAddedPlace == null");
        ((com.google.android.gms.location.places.internal.zzf)zzlX()).zza(addplacerequest, zzasq, zzf1);
    }

    public void zza(zzf zzf1, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter)
        throws RemoteException
    {
        zzv.zzb(s, "query == null");
        zzv.zzb(latlngbounds, "bounds == null");
        zzv.zzb(zzf1, "callback == null");
        if(autocompletefilter == null)
            autocompletefilter = AutocompleteFilter.create(null);
        ((com.google.android.gms.location.places.internal.zzf)zzlX()).zza(s, latlngbounds, autocompletefilter, zzasq, zzf1);
    }

    public void zza(zzf zzf1, List list)
        throws RemoteException
    {
        ((com.google.android.gms.location.places.internal.zzf)zzlX()).zzb(list, zzasq, zzf1);
    }

    protected com.google.android.gms.location.places.internal.zzf zzbj(IBinder ibinder)
    {
        return zzf.zza.zzbl(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.location.places.GeoDataApi";
    }

    protected String zzer()
    {
        return "com.google.android.gms.location.places.internal.IGooglePlacesService";
    }

    private final PlacesParams zzasq;
    private final Locale zzasr = Locale.getDefault();
}
