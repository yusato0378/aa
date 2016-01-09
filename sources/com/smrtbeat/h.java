// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import java.io.File;
import java.io.FilenameFilter;

final class h
    implements FilenameFilter
{

    h()
    {
    }

    public final boolean accept(File file, String s)
    {
        return s.endsWith(".id");
    }
}
