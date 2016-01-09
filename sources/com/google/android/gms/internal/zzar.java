// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

public class zzar
{

    public zzar()
    {
    }

    public SharedPreferences zzn(Context context)
    {
        return context.getSharedPreferences("google_ads_flags", 1);
    }
}
