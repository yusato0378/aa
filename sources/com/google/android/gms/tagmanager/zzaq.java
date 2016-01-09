// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class zzaq
{

    zzaq(long l, long l1, long l2)
    {
        zzaDx = l;
        zzIf = l1;
        zzaDy = l2;
    }

    void zzdN(String s)
    {
        if(s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            zzaDz = s;
            return;
        }
    }

    long zzwU()
    {
        return zzaDx;
    }

    long zzwV()
    {
        return zzaDy;
    }

    String zzwW()
    {
        return zzaDz;
    }

    private final long zzIf;
    private final long zzaDx;
    private final long zzaDy;
    private String zzaDz;
}
