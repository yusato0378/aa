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
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.internal.zzl;

// Referenced classes of package com.google.android.gms.location.places:
//            PlaceLikelihood

public class PlaceLikelihoodBuffer extends AbstractDataBuffer
    implements Result
{
    public static class zza
    {

        static int zzfR(int i)
        {
            switch(i)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("invalid source: ").append(i).toString());

            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
            case 105: // 'i'
                return i;
            }
        }
    }


    public PlaceLikelihoodBuffer(DataHolder dataholder, int i, Context context)
    {
        super(dataholder);
        mContext = context;
        zzKr = new Status(dataholder.getStatusCode());
        zzarO = zza.zzfR(i);
        if(dataholder != null && dataholder.zzlm() != null)
        {
            zzarF = dataholder.zzlm().getString("com.google.android.gms.location.places.PlaceLikelihoodBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            zzarF = null;
            return;
        }
    }

    public PlaceLikelihood get(int i)
    {
        return new zzl(zzPy, i, mContext);
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

    public String toString()
    {
        return zzu.zzq(this).zzg("status", getStatus()).zzg("attributions", zzarF).toString();
    }

    private final Context mContext;
    private final Status zzKr;
    private final String zzarF;
    private final int zzarO;
}
