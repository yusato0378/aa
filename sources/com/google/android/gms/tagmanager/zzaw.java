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

class zzaw extends zzak
{

    public zzaw(Context context)
    {
        super(ID, new String[0]);
        zzmH = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if((com.google.android.gms.internal.zzd.zza)map.get(zzaCb) != null)
            map = zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaCb));
        else
            map = null;
        map = zzax.zzi(zzmH, map);
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
    private final Context zzmH;

    static 
    {
        ID = zza.zzad.toString();
        zzaCb = zzb.zzcq.toString();
    }
}
