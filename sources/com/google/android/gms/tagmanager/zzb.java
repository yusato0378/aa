// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zza, zzdf

class zzb extends zzak
{

    public zzb(Context context)
    {
        this(zza.zzan(context));
    }

    zzb(com.google.android.gms.tagmanager.zza zza1)
    {
        super(ID, new String[0]);
        zzaCa = zza1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = zzaCa.zzwj();
        if(map == null)
            return zzdf.zzxW();
        else
            return zzdf.zzE(map);
    }

    public boolean zzwn()
    {
        return false;
    }

    private static final String ID;
    private final com.google.android.gms.tagmanager.zza zzaCa;

    static 
    {
        ID = zza.zzu.toString();
    }
}
