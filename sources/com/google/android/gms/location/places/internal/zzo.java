// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.*;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzq, zzn, PlaceImpl

public class zzo extends zzq
    implements Place
{

    public zzo(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        if(context != null)
            dataholder = zzn.zzag(context);
        else
            dataholder = null;
        zzasM = dataholder;
        zzasJ = zzh("place_is_logging_enabled", false);
    }

    private void zzcJ(String s)
    {
        if(zzasJ && zzasM != null)
            zzasM.zzz(zzarP, s);
    }

    public Object freeze()
    {
        return zztg();
    }

    public CharSequence getAddress()
    {
        zzcJ("getAddress");
        return zzA("place_address", "");
    }

    public String getId()
    {
        zzcJ("getId");
        return zzarP;
    }

    public LatLng getLatLng()
    {
        zzcJ("getLatLng");
        return (LatLng)zza("place_lat_lng", LatLng.CREATOR);
    }

    public Locale getLocale()
    {
        zzcJ("getLocale");
        String s = zzA("place_locale", "");
        if(!TextUtils.isEmpty(s))
            return new Locale(s);
        else
            return Locale.getDefault();
    }

    public CharSequence getName()
    {
        zzcJ("getName");
        return zzA("place_name", "");
    }

    public CharSequence getPhoneNumber()
    {
        zzcJ("getPhoneNumber");
        return zzA("place_phone_number", "");
    }

    public List getPlaceTypes()
    {
        zzcJ("getPlaceTypes");
        return zza("place_types", Collections.emptyList());
    }

    public int getPriceLevel()
    {
        zzcJ("getPriceLevel");
        return zzy("place_price_level", -1);
    }

    public float getRating()
    {
        zzcJ("getRating");
        return zzb("place_rating", -1F);
    }

    public LatLngBounds getViewport()
    {
        zzcJ("getViewport");
        return (LatLngBounds)zza("place_viewport", LatLngBounds.CREATOR);
    }

    public Uri getWebsiteUri()
    {
        zzcJ("getWebsiteUri");
        String s = zzA("place_website_uri", null);
        if(s == null)
            return null;
        else
            return Uri.parse(s);
    }

    public boolean zzsT()
    {
        zzcJ("isPermanentlyClosed");
        return zzh("place_is_permanently_closed", false);
    }

    public float zzsZ()
    {
        zzcJ("getLevelNumber");
        return zzb("place_level_number", 0.0F);
    }

    public Place zztg()
    {
        Object obj = (new PlaceImpl.zza()).zzZ(zzasJ);
        zzasJ = false;
        obj = ((PlaceImpl.zza) (obj)).zzcM(getAddress().toString()).zzo(zzb("place_attributions", Collections.emptyList())).zzcK(getId()).zzY(zzsT()).zza(getLatLng()).zzf(zzsZ()).zzcL(getName().toString()).zzcN(getPhoneNumber().toString()).zzfV(getPriceLevel()).zzg(getRating()).zzn(getPlaceTypes()).zza(getViewport()).zzk(getWebsiteUri()).zzth();
        ((PlaceImpl) (obj)).setLocale(getLocale());
        ((PlaceImpl) (obj)).zza(zzasM);
        return ((Place) (obj));
    }

    private final String zzarP = zzA("place_id", "");
    private boolean zzasJ;
    private final zzn zzasM;
}
