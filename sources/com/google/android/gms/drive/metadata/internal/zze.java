// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzl

public final class zze
{

    public static void zzb(DataHolder dataholder)
    {
        zzig.zzaah.zzd(dataholder);
    }

    private static void zzb(MetadataField metadatafield)
    {
        if(zzZE.containsKey(metadatafield.getName()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate field name registered: ").append(metadatafield.getName()).toString());
        } else
        {
            zzZE.put(metadatafield.getName(), metadatafield);
            return;
        }
    }

    public static MetadataField zzcd(String s)
    {
        return (MetadataField)zzZE.get(s);
    }

    public static Collection zzoj()
    {
        return Collections.unmodifiableCollection(zzZE.values());
    }

    private static final Map zzZE = new HashMap();

    static 
    {
        zzb(zzig.zzZH);
        zzb(zzig.zzaal);
        zzb(zzig.zzaac);
        zzb(zzig.zzaaj);
        zzb(zzig.zzaam);
        zzb(zzig.zzZT);
        zzb(zzig.zzZS);
        zzb(zzig.zzZU);
        zzb(zzig.zzZV);
        zzb(zzig.zzZQ);
        zzb(zzig.zzZX);
        zzb(zzig.zzZY);
        zzb(zzig.zzZZ);
        zzb(zzig.zzaah);
        zzb(zzig.zzZI);
        zzb(zzig.zzaae);
        zzb(zzig.zzZK);
        zzb(zzig.zzZR);
        zzb(zzig.zzZL);
        zzb(zzig.zzZM);
        zzb(zzig.zzZN);
        zzb(zzig.zzaab);
        zzb(zzig.zzZW);
        zzb(zzig.zzaad);
        zzb(zzig.zzaaf);
        zzb(zzig.zzaag);
        zzb(zzig.zzaai);
        zzb(zzig.zzaan);
        zzb(zzig.zzaao);
        zzb(zzig.zzZP);
        zzb(zzig.zzZO);
        zzb(zzig.zzaak);
        zzb(zzig.zzaaa);
        zzb(zzig.zzZJ);
        zzb(zzig.zzaap);
        zzb(zzig.zzaaq);
        zzb(zzig.zzaar);
        zzb(zzig.zzaas);
        zzb(zzig.zzaat);
        zzb(zzii.zzaau);
        zzb(zzii.zzaaw);
        zzb(zzii.zzaax);
        zzb(zzii.zzaay);
        zzb(zzii.zzaav);
        zzb(zzik.zzaaA);
        zzb(zzik.zzaaB);
    }
}
