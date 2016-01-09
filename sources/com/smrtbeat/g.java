// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.smrtbeat;

import java.io.File;
import java.io.FileFilter;

final class g
    implements FileFilter
{

    g()
    {
    }

    public final boolean accept(File file)
    {
        return file.isDirectory();
    }
}
