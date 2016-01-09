// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbv, zzde

class zzbd extends zzbv
{

    public zzbd()
    {
        super(ID);
    }

    protected boolean zza(zzde zzde1, zzde zzde2, Map map)
    {
        return zzde1.zza(zzde2) < 0;
    }

    private static final String ID;

    static 
    {
        ID = zza.zzay.toString();
    }
}
