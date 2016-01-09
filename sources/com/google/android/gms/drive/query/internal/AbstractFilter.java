// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.zzc;

public abstract class AbstractFilter
    implements Filter
{

    public AbstractFilter()
    {
    }

    public String toString()
    {
        return String.format("Filter[%s]", new Object[] {
            zza(new zzc())
        });
    }
}
