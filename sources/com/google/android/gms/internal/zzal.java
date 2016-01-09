// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzat, zzap

public final class zzal
{

    public zzal()
    {
        this((String)zzat.zzrh.zzcd(), -1);
    }

    public zzal(String s)
    {
        this(s, -1);
    }

    public zzal(String s, int i)
    {
        zzqZ = -1;
        if(TextUtils.isEmpty(s))
            s = (String)zzat.zzrh.zzcd();
        zzqY = s;
        zzqZ = i;
    }

    public String zzcb()
    {
        return zzqY;
    }

    public int zzcc()
    {
        return zzqZ;
    }

    private String zzqY;
    private int zzqZ;
}
