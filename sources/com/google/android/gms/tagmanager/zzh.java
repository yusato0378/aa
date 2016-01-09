// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.zza;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzak, zzdf, zzbg

class zzh extends zzak
{

    public zzh(Context context)
    {
        super(ID, new String[0]);
        mContext = context;
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        try
        {
            map = zzdf.zzE(Integer.valueOf(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode));
        }
        // Misplaced declaration of an exception variable
        catch(Map map)
        {
            zzbg.zzak((new StringBuilder()).append("Package name ").append(mContext.getPackageName()).append(" not found. ").append(map.getMessage()).toString());
            return zzdf.zzxW();
        }
        return map;
    }

    public boolean zzwn()
    {
        return true;
    }

    private static final String ID;
    private final Context mContext;

    static 
    {
        ID = zza.zzy.toString();
    }
}
