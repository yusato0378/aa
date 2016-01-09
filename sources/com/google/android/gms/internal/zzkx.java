// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzki

public final class zzkx extends zzki
{

    public zzkx()
    {
    }

    public String getLabel()
    {
        return zzawK;
    }

    public long getTimeInMillis()
    {
        return zzawX;
    }

    public void setTimeInMillis(long l)
    {
        zzawX = l;
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("variableName", zzawW);
        hashmap.put("timeInMillis", Long.valueOf(zzawX));
        hashmap.put("category", mCategory);
        hashmap.put("label", zzawK);
        return zzu(hashmap);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzkx)zzki1);
    }

    public void zza(zzkx zzkx1)
    {
        if(!TextUtils.isEmpty(zzawW))
            zzkx1.zzdh(zzawW);
        if(zzawX != 0L)
            zzkx1.setTimeInMillis(zzawX);
        if(!TextUtils.isEmpty(mCategory))
            zzkx1.zzda(mCategory);
        if(!TextUtils.isEmpty(zzawK))
            zzkx1.zzdc(zzawK);
    }

    public void zzda(String s)
    {
        mCategory = s;
    }

    public void zzdc(String s)
    {
        zzawK = s;
    }

    public void zzdh(String s)
    {
        zzawW = s;
    }

    public String zzuI()
    {
        return mCategory;
    }

    public String zzuT()
    {
        return zzawW;
    }

    public String mCategory;
    public String zzawK;
    public String zzawW;
    public long zzawX;
}
