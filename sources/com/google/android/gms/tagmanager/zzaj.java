// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzdf, DataLayer, zzbg

class zzaj
{

    private static void zza(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        zzd = zzd.zzgq;
        int j = zzd.length;
        for(int i = 0; i < j; i++)
            datalayer.zzdF(zzdf.zzg(zzd[i]));

    }

    public static void zza(DataLayer datalayer, com.google.android.gms.internal.zzc.zzi zzi)
    {
        if(zzi.zzhf == null)
        {
            zzbg.zzan("supplemental missing experimentSupplemental");
            return;
        } else
        {
            zza(datalayer, zzi.zzhf);
            zzb(datalayer, zzi.zzhf);
            zzc(datalayer, zzi.zzhf);
            return;
        }
    }

    private static void zzb(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        zzd = zzd.zzgp;
        int j = zzd.length;
        for(int i = 0; i < j; i++)
        {
            Map map = zzc(zzd[i]);
            if(map != null)
                datalayer.push(map);
        }

    }

    private static Map zzc(com.google.android.gms.internal.zzd.zza zza1)
    {
        zza1 = ((com.google.android.gms.internal.zzd.zza) (zzdf.zzl(zza1)));
        if(!(zza1 instanceof Map))
        {
            zzbg.zzan((new StringBuilder()).append("value: ").append(zza1).append(" is not a map value, ignored.").toString());
            return null;
        } else
        {
            return (Map)zza1;
        }
    }

    private static void zzc(DataLayer datalayer, com.google.android.gms.internal.zzc.zzd zzd)
    {
        com.google.android.gms.internal.zzc.zzc azzc[];
        int i;
        int j;
        azzc = zzd.zzgr;
        j = azzc.length;
        i = 0;
_L2:
        com.google.android.gms.internal.zzc.zzc zzc1;
        if(i >= j)
            break MISSING_BLOCK_LABEL_291;
        zzc1 = azzc[i];
        if(zzc1.zzgk != null)
            break; /* Loop/switch isn't completed */
        zzbg.zzan("GaExperimentRandom: No key");
_L3:
        i++;
        if(true) goto _L2; else goto _L1
_L1:
label0:
        {
            Object obj = datalayer.get(zzc1.zzgk);
            long l;
            long l1;
            if(!(obj instanceof Number))
                zzd = null;
            else
                zzd = Long.valueOf(((Number)obj).longValue());
            l = zzc1.zzgl;
            l1 = zzc1.zzgm;
            if(!zzc1.zzgn || zzd == null || zzd.longValue() < l || zzd.longValue() > l1)
            {
                if(l > l1)
                    break label0;
                obj = Long.valueOf(Math.round(Math.random() * (double)(l1 - l) + (double)l));
            }
            datalayer.zzdF(zzc1.zzgk);
            zzd = datalayer.zzi(zzc1.zzgk, obj);
            if(zzc1.zzgo > 0L)
                if(!zzd.containsKey("gtm"))
                {
                    zzd.put("gtm", DataLayer.mapOf(new Object[] {
                        "lifetime", Long.valueOf(zzc1.zzgo)
                    }));
                } else
                {
                    Object obj1 = zzd.get("gtm");
                    if(obj1 instanceof Map)
                        ((Map)obj1).put("lifetime", Long.valueOf(zzc1.zzgo));
                    else
                        zzbg.zzan("GaExperimentRandom: gtm not a map");
                }
            datalayer.push(zzd);
        }
          goto _L3
        zzbg.zzan("GaExperimentRandom: random range invalid");
          goto _L3
          goto _L3
    }
}
