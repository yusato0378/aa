// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;
import java.util.regex.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcz, zzdf

class zzcf extends zzcz
{

    public zzcf()
    {
        super(ID);
    }

    protected boolean zza(String s, String s1, Map map)
    {
        byte byte0;
        boolean flag;
        if(zzdf.zzk((com.google.android.gms.internal.zzd.zza)map.get(zzaEC)).booleanValue())
            byte0 = 66;
        else
            byte0 = 64;
        try
        {
            flag = Pattern.compile(s1, byte0).matcher(s).find();
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        return flag;
    }

    private static final String ID;
    private static final String zzaEC;

    static 
    {
        ID = zza.zzat.toString();
        zzaEC = zzb.zzdG.toString();
    }
}
