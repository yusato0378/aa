// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class zzim
{

    public static long zza(long l, TimeUnit timeunit, TimeUnit timeunit1)
    {
        return timeunit.convert(timeunit1.convert(l, timeunit), timeunit1);
    }

    public static boolean zza(TimeUnit timeunit)
    {
        return zza(timeunit, TimeUnit.MILLISECONDS);
    }

    private static boolean zza(TimeUnit timeunit, TimeUnit timeunit1)
    {
        return zzacI.indexOf(timeunit) < zzacI.indexOf(timeunit1);
    }

    private static final List zzacI;

    static 
    {
        zzacI = Arrays.asList(new TimeUnit[] {
            TimeUnit.NANOSECONDS, TimeUnit.MICROSECONDS, TimeUnit.MILLISECONDS, TimeUnit.SECONDS, TimeUnit.MINUTES, TimeUnit.HOURS, TimeUnit.DAYS
        });
    }
}
