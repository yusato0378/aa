// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;
import java.util.regex.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf

class zzce extends zzak
{

    public zzce()
    {
        super(ID, new String[] {
            zzaEA, zzaEB
        });
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj = (com.google.android.gms.internal.zzd.zza)map.get(zzaEA);
        com.google.android.gms.internal.zzd.zza zza1 = (com.google.android.gms.internal.zzd.zza)map.get(zzaEB);
        if(obj == null || obj == zzdf.zzxW() || zza1 == null || zza1 == zzdf.zzxW())
            return zzdf.zzxW();
        byte byte0 = 64;
        if(zzdf.zzk((com.google.android.gms.internal.zzd.zza)map.get(zzaEC)).booleanValue())
            byte0 = 66;
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzaED);
        int i;
        if(map != null)
        {
            map = zzdf.zzi(map);
            if(map == zzdf.zzxR())
                return zzdf.zzxW();
            int j = map.intValue();
            i = j;
            if(j < 0)
                return zzdf.zzxW();
        } else
        {
            i = 1;
        }
        try
        {
            map = zzdf.zzg(((com.google.android.gms.internal.zzd.zza) (obj)));
            obj = zzdf.zzg(zza1);
        }
        // Misplaced declaration of an exception variable
        catch(Map map)
        {
            return zzdf.zzxW();
        }
        zza1 = null;
        obj = Pattern.compile(((String) (obj)), byte0).matcher(map);
        map = zza1;
        if(!((Matcher) (obj)).find())
            break MISSING_BLOCK_LABEL_186;
        map = zza1;
        if(((Matcher) (obj)).groupCount() >= i)
            map = ((Matcher) (obj)).group(i);
        if(map != null)
            break MISSING_BLOCK_LABEL_194;
        return zzdf.zzxW();
        map = zzdf.zzE(map);
        return map;
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private static final String zzaEA;
    private static final String zzaEB;
    private static final String zzaEC;
    private static final String zzaED;

    static 
    {
        ID = zza.zzag.toString();
        zzaEA = zzb.zzbO.toString();
        zzaEB = zzb.zzbP.toString();
        zzaEC = zzb.zzdG.toString();
        zzaED = zzb.zzdA.toString();
    }
}
