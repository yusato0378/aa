// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import android.os.Environment;
import java.io.*;

// Referenced classes of package jp.co.dimage.android:
//            l

public class j
{

    public j()
    {
    }

    public static String a(File file)
    {
        String s = "";
        BufferedReader bufferedreader;
        try
        {
            bufferedreader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch(File file)
        {
            return "";
        }
        file = s;
        s = bufferedreader.readLine();
        if(s == null)
            break; /* Loop/switch isn't completed */
        file = s;
        if(true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_30;
_L1:
        bufferedreader.close();
        return file;
    }

    public static String a(String s)
    {
        return a(new File(s));
    }

    public static boolean a()
    {
        String s = Environment.getExternalStorageState();
        if(s.equals("mounted"))
            return true;
        return !s.equals("mounted_ro") ? false : false;
    }

    public static boolean a(File file, String s)
    {
        file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
        file.write(s);
        file.flush();
        file.close();
        return true;
    }

    public static boolean a(String s, String s1)
    {
        return a(new File(s), s1);
    }

    public static boolean a(String s, String s1, String s2)
    {
        File file = (new File(s, s1)).getParentFile();
        if(!file.exists())
            file.mkdirs();
        return a(new File(s, s1), s2);
    }

    public static String b()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("/").toString();
    }

    public static boolean b(File file)
    {
        if(!file.exists())
            return false;
        File afile[];
        int k;
        if(file.isFile())
            file.delete();
        if(!file.isDirectory())
            break MISSING_BLOCK_LABEL_57;
        afile = file.listFiles();
        k = afile.length;
        int i = 0;
        while(i < k) 
        {
            try
            {
                b(afile[i]);
            }
            // Misplaced declaration of an exception variable
            catch(File file)
            {
                return false;
            }
            i++;
        }
        file = file.getParentFile();
        if(file.exists())
            file.delete();
        return true;
    }

    public static boolean b(String s, String s1)
    {
        while(l.a(s) || !(new File(s)).exists() || !l.a(s1) && !(new File(s, s1)).exists()) 
            return false;
        return true;
    }

    public static boolean c(String s, String s1)
    {
        while(l.a(s) || l.a(s1) || !b(s, s1)) 
            return false;
        boolean flag;
        try
        {
            flag = b(new File(s, s1));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return false;
        }
        return flag;
    }
}
