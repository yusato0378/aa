// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
    implements NetworkExtras
{

    public CustomEventExtras()
    {
    }

    public Object getExtra(String s)
    {
        return zzDM.get(s);
    }

    public void setExtra(String s, Object obj)
    {
        zzDM.put(s, obj);
    }

    private final HashMap zzDM = new HashMap();
}
