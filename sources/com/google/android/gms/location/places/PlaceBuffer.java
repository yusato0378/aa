// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzo;

// Referenced classes of package com.google.android.gms.location.places:
//            Place

public class PlaceBuffer extends AbstractDataBuffer
    implements Result
{

    public PlaceBuffer(DataHolder dataholder, Context context)
    {
        super(dataholder);
        mContext = context;
        zzKr = new Status(dataholder.getStatusCode());
        if(dataholder != null && dataholder.zzlm() != null)
        {
            zzarF = dataholder.zzlm().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            zzarF = null;
            return;
        }
    }

    public Place get(int i)
    {
        return new zzo(zzPy, i, mContext);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public CharSequence getAttributions()
    {
        return zzarF;
    }

    public Status getStatus()
    {
        return zzKr;
    }

    private final Context mContext;
    private final Status zzKr;
    private final String zzarF;
}
