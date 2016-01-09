// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.List;

public class zzil
{

    public static boolean zza(List list, List list1)
    {
        if(list.size() != list1.size())
            return false;
        for(list = list.iterator(); list.hasNext();)
            if(!list1.contains(list.next()))
                return false;

        return true;
    }
}
