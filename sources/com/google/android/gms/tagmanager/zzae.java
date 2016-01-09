// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcz

class zzae extends zzcz
{

    public zzae()
    {
        super(ID);
    }

    protected boolean zza(String s, String s1, Map map)
    {
        return s.endsWith(s1);
    }

    private static final String ID;

    static 
    {
        ID = zza.zzav.toString();
    }
}
