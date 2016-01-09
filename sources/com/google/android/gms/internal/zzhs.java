// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class zzhs
{

    public static boolean zzV(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int zzbh(int i)
    {
        return i / 1000;
    }

    public static int zzbi(int i)
    {
        return (i % 1000) / 100;
    }

    public static boolean zzbj(int i)
    {
        return zzbi(i) == 3;
    }

    private static Pattern zzVB = null;

}
