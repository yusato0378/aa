// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.mcraft.cocos2dx;

import android.content.Context;
import java.io.File;
import org.cocos2dx.lib.Cocos2dxActivity;

public class FileSystemAdapterAndroid
{

    public FileSystemAdapterAndroid()
    {
    }

    public static void clearDLCFiles()
    {
        File afile[] = getContext().getDir("DLC", 0).listFiles();
        if(afile != null)
        {
            int j = afile.length;
            for(int i = 0; i < j; i++)
                afile[i].delete();

        }
    }

    public static void clearTempFiles()
    {
        File afile[] = getContext().getDir("tmp", 0).listFiles();
        if(afile != null)
        {
            int j = afile.length;
            for(int i = 0; i < j; i++)
                afile[i].delete();

        }
    }

    public static boolean exists(String s)
    {
        return (new File(s)).exists();
    }

    private static Context getContext()
    {
        return Cocos2dxActivity.getContext();
    }

    public static String getDataFilesDirPath()
    {
        return (new StringBuilder()).append(getContext().getFilesDir().getAbsolutePath()).append(File.separator).toString();
    }

    public static String getDownloadableContentsDirPath()
    {
        return (new StringBuilder()).append(getContext().getDir("DLC", 0).getAbsolutePath()).append(File.separator).toString();
    }

    public static String getTempFilesDir()
    {
        return (new StringBuilder()).append(getContext().getDir("tmp", 0).getAbsolutePath()).append(File.separator).toString();
    }

    public static void initialize()
    {
        if(!sClassLoaded)
        {
            if(!nativeInit())
                throw new RuntimeException("native init failed");
            sClassLoaded = true;
        }
    }

    private static native boolean nativeInit();

    private static final String DLC_DIR_NAME = "DLC";
    private static final String TEMP_DIR_NAME = "tmp";
    private static boolean sClassLoaded;

    static 
    {
        if(!nativeInit())
        {
            throw new RuntimeException("native init failed");
        } else
        {
            sClassLoaded = true;
        }
    }
}
