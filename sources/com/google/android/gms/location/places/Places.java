// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.location.places.internal.zzc;
import com.google.android.gms.location.places.internal.zzh;

// Referenced classes of package com.google.android.gms.location.places:
//            GeoDataApi, PlaceDetectionApi

public class Places
{

    private Places()
    {
    }

    public static final Api GEO_DATA_API;
    public static final GeoDataApi GeoDataApi = new zzc();
    public static final Api PLACE_DETECTION_API;
    public static final PlaceDetectionApi PlaceDetectionApi = new zzh();
    public static final com.google.android.gms.common.api.Api.zzc zzarV;
    public static final com.google.android.gms.common.api.Api.zzc zzarW;

    static 
    {
        zzarV = new com.google.android.gms.common.api.Api.zzc();
        zzarW = new com.google.android.gms.common.api.Api.zzc();
        GEO_DATA_API = new Api("Places.GEO_DATA_API", new com.google.android.gms.location.places.internal.zzd.zza(null, null), zzarV, new Scope[0]);
        PLACE_DETECTION_API = new Api("Places.PLACE_DETECTION_API", new com.google.android.gms.location.places.internal.zzi.zza(null, null), zzarW, new Scope[0]);
    }
}
