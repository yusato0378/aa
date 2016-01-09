// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import java.util.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

public class zzbb extends zzak
{

    public zzbb()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        map = Locale.getDefault();
        if(map == null)
            return zzdf.zzxW();
        map = map.getLanguage();
        if(map == null)
            return zzdf.zzxW();
        else
            return zzdf.zzE(map.toLowerCase());
    }

    public volatile String zzwS()
    {
        return super.zzwS();
    }

    public volatile Set zzwT()
    {
        return super.zzwT();
    }

    public boolean zzwn()
    {
        return false;
    }

    private static final String ID;

    static 
    {
        ID = zza.zzN.toString();
    }
}
