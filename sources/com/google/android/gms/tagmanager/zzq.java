// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzq extends zzak
{

    public zzq(String s)
    {
        super(ID, new String[0]);
        zzacK = s;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        if(zzacK == null)
            return zzdf.zzxW();
        else
            return zzdf.zzE(zzacK);
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private final String zzacK;

    static 
    {
        ID = zza.zzD.toString();
    }
}
