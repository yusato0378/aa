// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzt
{

    private zzt(String s)
    {
        separator = s;
    }

    public static zzt zzbR(String s)
    {
        return new zzt(s);
    }

    public final String zza(Iterable iterable)
    {
        return zza(new StringBuilder(), iterable).toString();
    }

    public final StringBuilder zza(StringBuilder stringbuilder, Iterable iterable)
    {
        iterable = iterable.iterator();
        if(iterable.hasNext())
        {
            stringbuilder.append(zzp(iterable.next()));
            for(; iterable.hasNext(); stringbuilder.append(zzp(iterable.next())))
                stringbuilder.append(separator);

        }
        return stringbuilder;
    }

    CharSequence zzp(Object obj)
    {
        if(obj instanceof CharSequence)
            return (CharSequence)obj;
        else
            return obj.toString();
    }

    private final String separator;
}
