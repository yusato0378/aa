// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak

class zzn extends zzak
{

    public zzn()
    {
        super(ID, new String[] {
            VALUE
        });
    }

    public static String zzwq()
    {
        return ID;
    }

    public static String zzwr()
    {
        return VALUE;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        return (com.google.android.gms.internal.zzd.zza)map.get(VALUE);
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private static final String VALUE;

    static 
    {
        ID = zza.zzA.toString();
        VALUE = zzb.zzfU.toString();
    }
}
