// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.ui;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.*;
import com.google.android.gms.common.internal.safeparcel.zzc;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.internal.PlaceImpl;
import com.google.android.gms.location.places.internal.zzn;
import com.google.android.gms.maps.model.LatLngBounds;

public class PlacePicker
{
    public static class IntentBuilder
    {

        public Intent build(Context context)
            throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException
        {
            GoogleApiAvailability.getInstance().zzN(context);
            return mIntent;
        }

        public IntentBuilder setLatLngBounds(LatLngBounds latlngbounds)
        {
            zzv.zzr(latlngbounds);
            zzc.zza(latlngbounds, mIntent, "latlng_bounds");
            return this;
        }

        private final Intent mIntent = new Intent("com.google.android.gms.location.places.ui.PICK_PLACE");

        public IntentBuilder()
        {
            mIntent.setPackage("com.google.android.gms");
            mIntent.putExtra("gmscore_client_jar_version", 0x6fcd18);
        }
    }


    public PlacePicker()
    {
    }

    public static String getAttributions(Intent intent)
    {
        return intent.getStringExtra("third_party_attributions");
    }

    public static LatLngBounds getLatLngBounds(Intent intent)
    {
        return (LatLngBounds)zzc.zza(intent, "final_latlng_bounds", LatLngBounds.CREATOR);
    }

    public static Place getPlace(Intent intent, Context context)
    {
        zzv.zzb(context, "context must not be null");
        intent = (PlaceImpl)zzc.zza(intent, "selected_place", PlaceImpl.CREATOR);
        intent.zza(zzn.zzag(context));
        return intent;
    }

    public static final int RESULT_ERROR = 2;
}
