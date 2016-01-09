// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places:
//            zza

public class AddPlaceRequest
    implements SafeParcelable
{

    AddPlaceRequest(int i, String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
        zzzH = i;
        mName = zzv.zzbS(s);
        zzarw = (LatLng)zzv.zzr(latlng);
        zzacM = s1;
        zzarx = new ArrayList(list);
        boolean flag;
        if(!TextUtils.isEmpty(s2) || uri != null)
            flag = true;
        else
            flag = false;
        zzv.zzb(flag, "One of phone number or URI should be provided.");
        zzary = s2;
        zzarz = uri;
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, Uri uri)
    {
        this(s, latlng, s1, list, null, (Uri)zzv.zzr(uri));
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, String s2)
    {
        this(s, latlng, s1, list, zzv.zzbS(s2), null);
    }

    public AddPlaceRequest(String s, LatLng latlng, String s1, List list, String s2, Uri uri)
    {
        this(0, s, latlng, s1, list, s2, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAddress()
    {
        return zzacM;
    }

    public LatLng getLatLng()
    {
        return zzarw;
    }

    public String getName()
    {
        return mName;
    }

    public String getPhoneNumber()
    {
        return zzary;
    }

    public List getPlaceTypes()
    {
        return zzarx;
    }

    public Uri getWebsiteUri()
    {
        return zzarz;
    }

    public String toString()
    {
        return zzu.zzq(this).zzg("name", mName).zzg("latLng", zzarw).zzg("address", zzacM).zzg("placeTypes", zzarx).zzg("phoneNumer", zzary).zzg("websiteUri", zzarz).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private final String mName;
    private final String zzacM;
    private final LatLng zzarw;
    private final List zzarx;
    private final String zzary;
    private final Uri zzarz;
    final int zzzH;

}
