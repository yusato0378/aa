// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.res.Configuration;
import android.content.res.Resources;

// Referenced classes of package com.google.android.gms.internal:
//            zzic

public final class zzhw
{

    public static boolean zzb(Resources resources)
    {
        if(resources != null)
        {
            boolean flag;
            if((resources.getConfiguration().screenLayout & 0xf) > 3)
                flag = true;
            else
                flag = false;
            if(zzic.zzne() && flag || zzc(resources))
                return true;
        }
        return false;
    }

    private static boolean zzc(Resources resources)
    {
        boolean flag1 = false;
        resources = resources.getConfiguration();
        boolean flag = flag1;
        if(zzic.zzng())
        {
            flag = flag1;
            if((((Configuration) (resources)).screenLayout & 0xf) <= 3)
            {
                flag = flag1;
                if(((Configuration) (resources)).smallestScreenWidthDp >= 600)
                    flag = true;
            }
        }
        return flag;
    }
}
