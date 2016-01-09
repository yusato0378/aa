// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.util.Log;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbh

public class zzy
    implements zzbh
{

    public zzy()
    {
        zzGV = 5;
    }

    public void setLogLevel(int i)
    {
        zzGV = i;
    }

    public void zzaj(String s)
    {
        if(zzGV <= 3)
            Log.d("GoogleTagManager", s);
    }

    public void zzak(String s)
    {
        if(zzGV <= 6)
            Log.e("GoogleTagManager", s);
    }

    public void zzal(String s)
    {
        if(zzGV <= 4)
            Log.i("GoogleTagManager", s);
    }

    public void zzam(String s)
    {
        if(zzGV <= 2)
            Log.v("GoogleTagManager", s);
    }

    public void zzan(String s)
    {
        if(zzGV <= 5)
            Log.w("GoogleTagManager", s);
    }

    public void zzb(String s, Throwable throwable)
    {
        if(zzGV <= 6)
            Log.e("GoogleTagManager", s, throwable);
    }

    public void zzd(String s, Throwable throwable)
    {
        if(zzGV <= 5)
            Log.w("GoogleTagManager", s, throwable);
    }

    private int zzGV;
}
