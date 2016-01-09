// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzcp, zzdf

class zzai extends zzak
{

    public zzai(zzcp zzcp1)
    {
        super(ID, new String[0]);
        zzaCm = zzcp1;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = zzaCm.zzxv();
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
    private final zzcp zzaCm;

    static 
    {
        ID = zza.zzK.toString();
    }
}
