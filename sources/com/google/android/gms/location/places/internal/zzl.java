// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzq, zzo, PlaceImpl, PlaceLikelihoodEntity

public class zzl extends zzq
    implements PlaceLikelihood
{

    public zzl(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        mContext = context;
    }

    public Object freeze()
    {
        return zzti();
    }

    public float getLikelihood()
    {
        return zzb("place_likelihood", -1F);
    }

    public Place getPlace()
    {
        return new zzo(zzPy, zzRw, mContext);
    }

    public PlaceLikelihood zzti()
    {
        return PlaceLikelihoodEntity.zza((PlaceImpl)getPlace().freeze(), getLikelihood());
    }

    private final Context mContext;
}
