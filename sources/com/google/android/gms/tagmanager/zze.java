// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzax

class zze extends zzak
{

    public zze(Context context)
    {
        super(ID, new String[] {
            zzaCc
        });
        zzmH = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaCc);
        if(obj == null)
            return zzdf.zzxW();
        obj = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaCb);
        if(map != null)
            map = zzdf.zzg(map);
        else
            map = null;
        map = zzax.zzf(zzmH, ((String) (obj)), map);
        if(map != null)
            return zzdf.zzE(map);
        else
            return zzdf.zzxW();
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private static final String zzaCb;
    private static final String zzaCc;
    private final Context zzmH;

    static 
    {
        ID = zza.zzY.toString();
        zzaCb = zzb.zzcq.toString();
        zzaCc = zzb.zzct.toString();
    }
}
