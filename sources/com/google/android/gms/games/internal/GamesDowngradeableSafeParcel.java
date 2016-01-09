// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.internal.zzhx;

public abstract class GamesDowngradeableSafeParcel extends DowngradeableSafeParcel
{

    public GamesDowngradeableSafeParcel()
    {
    }

    protected static boolean zzd(Integer integer)
    {
        if(integer == null)
            return false;
        else
            return zzhx.zzbk(integer.intValue());
    }
}
