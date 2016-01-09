// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import java.io.File;
import java.io.FileInputStream;

public class GameControllerUtils
{

    public GameControllerUtils()
    {
    }

    public static void ensureDirectoryExist(String s)
    {
        s = new File(s);
        if(!s.exists())
            s.mkdirs();
    }

    public static String readJsonFile(String s)
    {
        s = new File(s);
        if(!s.exists())
            return null;
        try
        {
            s = new FileInputStream(s);
            byte abyte0[] = new byte[s.available()];
            s.read(abyte0);
            s.close();
            s = new String(abyte0, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }
}
