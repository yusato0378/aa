// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzab extends zzak
{

    public zzab()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        String s1 = Build.MANUFACTURER;
        String s = Build.MODEL;
        map = s;
        if(!s.startsWith(s1))
        {
            map = s;
            if(!s1.equals("unknown"))
                map = (new StringBuilder()).append(s1).append(" ").append(s).toString();
        }
        return zzdf.zzE(map);
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;

    static 
    {
        ID = zza.zzF.toString();
    }
}
