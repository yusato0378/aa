// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzaa extends zzak
{

    public zzaa(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = zzap(mContext);
        if(map == null)
            return zzdf.zzxW();
        else
            return zzdf.zzE(map);
    }

    protected String zzap(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private final Context mContext;

    static 
    {
        ID = zza.zzZ.toString();
    }
}
