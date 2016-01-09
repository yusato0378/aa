// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzbi extends zzak
{

    public zzbi()
    {
        super(ID, new String[] {
            zzaDq
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return zzdf.zzE(zzdf.zzg((com.google.android.gms.internal.zzd.zza)map.get(zzaDq)).toLowerCase());
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private static final String zzaDq;

    static 
    {
        ID = zza.zzai.toString();
        zzaDq = zzb.zzbO.toString();
    }
}
