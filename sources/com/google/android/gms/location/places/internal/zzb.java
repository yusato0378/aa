// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzq, AutocompletePredictionEntity

public class zzb extends zzq
    implements AutocompletePrediction
{

    public zzb(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzsW();
    }

    public String getDescription()
    {
        return zzA("ap_description", "");
    }

    public List getMatchedSubstrings()
    {
        return zza("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    public String getPlaceId()
    {
        return zzA("ap_place_id", null);
    }

    public List getPlaceTypes()
    {
        return zza("ap_place_types", Collections.emptyList());
    }

    public AutocompletePrediction zzsW()
    {
        return AutocompletePredictionEntity.zza(getDescription(), getPlaceId(), getPlaceTypes(), getMatchedSubstrings(), zzsX());
    }

    public int zzsX()
    {
        return zzy("ap_personalization_type", 6);
    }
}
