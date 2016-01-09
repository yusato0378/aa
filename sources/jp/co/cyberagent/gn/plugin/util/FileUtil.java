// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.util;

import android.app.Activity;
import android.net.Uri;
import android.os.Environment;
import java.io.*;
import java.util.*;
import jp.co.cyberagent.gn.plugin.PluginManager;

public class FileUtil
{

    private FileUtil()
    {
        valid = true;
    }

    private boolean deleteFile(File file)
    {
        boolean flag = false;
        if(file == null) goto _L2; else goto _L1
_L1:
        if(!file.isDirectory()) goto _L4; else goto _L3
_L3:
        String as[];
        int i;
        int j;
        as = file.list();
        j = as.length;
        i = 0;
_L7:
        if(i < j) goto _L5; else goto _L4
_L4:
        flag = file.delete();
_L2:
        return flag;
_L5:
        if(!deleteFile(new File(file, as[i])))
            return false;
        i++;
        if(true) goto _L7; else goto _L6
_L6:
    }

    public static String getExternalStoragePath(boolean flag)
    {
        if(!flag) goto _L2; else goto _L1
_L1:
        Object obj = Environment.getExternalStorageDirectory().getPath();
_L8:
        return ((String) (obj));
_L2:
        Object obj1;
        String s;
        Object obj3;
        ArrayList arraylist;
        HashSet hashset;
        hashset = new HashSet();
        s = null;
        obj3 = null;
        arraylist = new ArrayList();
        obj1 = null;
        if(hashset == null || arraylist == null)
            return null;
        obj = new Scanner(new FileInputStream(new File("/system/etc/vold.fstab")));
_L9:
        flag = ((Scanner) (obj)).hasNextLine();
        if(flag) goto _L4; else goto _L3
_L3:
        if(obj != null)
            ((Scanner) (obj)).close();
        if(!Environment.isExternalStorageRemovable())
            hashset.remove(Environment.getExternalStorageDirectory().getPath());
        obj = hashset.iterator();
_L10:
        if(((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        obj = obj1;
        if(arraylist.size() <= 0) goto _L8; else goto _L7
_L7:
        return (String)arraylist.get(0);
_L4:
        s = ((Scanner) (obj)).nextLine();
        if(s.startsWith("dev_mount") || s.startsWith("fuse_mount"))
            hashset.add(s.replaceAll("\245t", " ").split(" ")[2]);
          goto _L9
        Object obj2;
        obj2;
_L12:
        if(obj != null)
            ((Scanner) (obj)).close();
        return null;
        obj2;
        obj = s;
_L11:
        if(obj != null)
            ((Scanner) (obj)).close();
        throw obj2;
_L6:
        String s1 = (String)((Iterator) (obj)).next();
        if(isMounted(s1))
            arraylist.add(s1);
          goto _L10
        obj2;
          goto _L11
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = obj3;
          goto _L12
    }

    public static FileUtil getInstance()
    {
        return instance;
    }

    public static Uri getResourceFileUri(String s, String s1)
    {
        Uri uri = null;
        if(s1 != null)
            uri = Uri.parse((new StringBuilder("android.resource://")).append(s).append("/").append(s1).toString());
        return uri;
    }

    public static boolean isMounted(String s)
    {
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        obj1 = null;
        obj2 = null;
        Object obj = new Scanner(new FileInputStream(new File("/proc/mounts")));
_L5:
        boolean flag1 = ((Scanner) (obj)).hasNextLine();
        if(flag1) goto _L2; else goto _L1
_L1:
        if(obj != null)
            ((Scanner) (obj)).close();
        return flag;
_L2:
        flag1 = ((Scanner) (obj)).nextLine().contains(s);
        if(!flag1)
            break; /* Loop/switch isn't completed */
        flag = true;
        if(true) goto _L1; else goto _L3
_L3:
        if(true) goto _L5; else goto _L4
_L4:
        s;
        s = obj2;
_L9:
        if(s != null)
            s.close();
        return false;
        obj;
        s = obj1;
_L7:
        if(s != null)
            s.close();
        throw obj;
        Exception exception;
        exception;
        s = ((String) (obj));
        obj = exception;
        if(true) goto _L7; else goto _L6
_L6:
        s;
        s = ((String) (obj));
        if(true) goto _L9; else goto _L8
_L8:
    }

    public boolean createDirectory(int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(s.length() > 0)
            {
                s = new File(getAbsolutePath(i, s));
                flag = flag1;
                if(s != null)
                {
                    s.mkdirs();
                    flag = s.isDirectory();
                }
            }
        }
        return flag;
    }

    public boolean createFile(int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(s.length() > 0)
            {
                s = new File(getAbsolutePath(i, s));
                flag = flag1;
                if(s != null)
                    try
                    {
                        flag = s.createNewFile();
                    }
                    // Misplaced declaration of an exception variable
                    catch(String s)
                    {
                        return false;
                    }
            }
        }
        return flag;
    }

    public boolean deleteFile(int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(s.length() > 0)
                flag = deleteFile(getAbsolutePath(i, s));
        }
        return flag;
    }

    public boolean deleteFile(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(s.length() > 0)
                flag = deleteFile(new File(s));
        }
        return flag;
    }

    public String getAbsolutePath(int i, String s)
    {
        String s2 = getStoragePath(i);
        String s1 = null;
        if(s2 != null)
        {
            s1 = s2;
            if(s != null)
            {
                s1 = s2;
                if(s.length() > 0)
                    s1 = (new StringBuilder(String.valueOf(s2))).append("/").append(s).toString();
            }
        }
        return s1;
    }

    public long getFileSize(int i, String s)
    {
        long l1 = 0L;
        long l = l1;
        if(s != null)
        {
            l = l1;
            if(s.length() > 0)
            {
                s = new File(getAbsolutePath(i, s));
                l = l1;
                if(s != null)
                {
                    l = l1;
                    if(s.isFile())
                        l = s.length();
                }
            }
        }
        return l;
    }

    public String getStoragePath(int i)
    {
        String s = null;
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 30
    //                   1 40
    //                   2 45;
           goto _L1 _L2 _L3 _L4
_L1:
        return s;
_L2:
        return PluginManager.getCurrentActivity().getFilesDir().getPath();
_L3:
        return getExternalStoragePath(true);
_L4:
        String s1 = getExternalStoragePath(true);
        s = s1;
        if(s1 == null)
            return PluginManager.getCurrentActivity().getFilesDir().getPath();
        if(true) goto _L1; else goto _L5
_L5:
    }

    public boolean isExists(int i, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s != null)
        {
            flag = flag1;
            if(s.length() > 0)
            {
                s = new File(getAbsolutePath(i, s));
                flag = flag1;
                if(s != null)
                    flag = s.exists();
            }
        }
        return flag;
    }

    public boolean isValid()
    {
        return valid;
    }

    public ObjectInputStream openObjectInputStream(int i, String s)
    {
        Object obj = null;
        File file = new File(getAbsolutePath(i, s));
        s = obj;
        if(file != null)
            try
            {
                s = new ObjectInputStream(new FileInputStream(file));
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return null;
            }
        return s;
    }

    public ObjectOutputStream openObjectOutputStream(int i, String s)
    {
        Object obj = null;
        File file = new File(getAbsolutePath(i, s));
        s = obj;
        if(file != null)
        {
            s = file.getParentFile();
            if(s != null && !s.exists())
                s.mkdirs();
            try
            {
                s = new ObjectOutputStream(new FileOutputStream(file));
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return null;
            }
        }
        return s;
    }

    public byte[] readFile(int i, String s)
    {
        return readFile(getAbsolutePath(i, s));
    }

    public byte[] readFile(String s)
    {
        Object obj2 = new File(s);
        Object obj = null;
        Object obj1 = null;
        s = null;
        if(obj2 == null)
            break MISSING_BLOCK_LABEL_74;
        byte abyte0[] = obj;
        byte abyte1[] = obj1;
        try
        {
            obj2 = new FileInputStream(((File) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return abyte1;
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            return abyte0;
        }
        abyte0 = obj;
        abyte1 = obj1;
        s = new byte[((FileInputStream) (obj2)).available()];
        abyte0 = s;
        abyte1 = s;
        ((FileInputStream) (obj2)).read(s);
        abyte0 = s;
        abyte1 = s;
        ((FileInputStream) (obj2)).close();
        return s;
    }

    public char[] readFile(int i, String s, String s1)
    {
        return readFile(getAbsolutePath(i, s), s1);
    }

    public char[] readFile(String s, String s1)
    {
        char ac[];
        char ac3[];
        int k;
        Object obj2 = new File(s);
        Object obj = null;
        Object obj1 = null;
        ac = null;
        ac3 = null;
        if(obj2 == null)
            break MISSING_BLOCK_LABEL_267;
        ac = ac3;
        char ac1[] = obj;
        char ac2[] = obj1;
        InputStreamReader inputstreamreader;
        int j;
        try
        {
            obj2 = new FileInputStream(((File) (obj2)));
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            PluginManager.logDebug((new StringBuilder("FileUtil.readFile : FileNotFoundException : filePath = ")).append(s).toString());
            return ac;
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            PluginManager.logDebug((new StringBuilder("FileUtil.readFile : UnsupportedEncodingException : filePath = ")).append(s).toString());
            return ac1;
        }
        // Misplaced declaration of an exception variable
        catch(String s1)
        {
            PluginManager.logDebug((new StringBuilder("FileUtil.readFile : IOException : filePath = ")).append(s).toString());
            return ac2;
        }
        ac = ac3;
        ac1 = obj;
        ac2 = obj1;
        inputstreamreader = new InputStreamReader(((java.io.InputStream) (obj2)), s1);
        ac = ac3;
        ac1 = obj;
        ac2 = obj1;
        s1 = new char[((FileInputStream) (obj2)).available()];
        ac = s1;
        ac1 = s1;
        ac2 = s1;
        k = inputstreamreader.read(s1);
        ac = s1;
        ac1 = s1;
        ac2 = s1;
        inputstreamreader.close();
        ac = s1;
        if(1 > k)
            break MISSING_BLOCK_LABEL_267;
        ac = s1;
        if(s1[0] != '\uFEFF')
            break MISSING_BLOCK_LABEL_267;
        ac = s1;
        ac1 = s1;
        ac2 = s1;
        ac3 = new char[k - 1];
        int i = 1;
        for(j = 0; i < k; j++)
        {
            ac3[j] = s1[i];
            i++;
        }

        ac = ac3;
        return ac;
    }

    public boolean writeFile(int i, String s, String s1, String s2)
    {
        return writeFile(getAbsolutePath(i, s), s1, s2);
    }

    public boolean writeFile(int i, String s, byte abyte0[])
    {
        return writeFile(getAbsolutePath(i, s), abyte0);
    }

    public boolean writeFile(String s, String s1, String s2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(s1 != null)
        {
            File file = new File(s);
            flag = flag1;
            if(file != null)
            {
                File file1 = file.getParentFile();
                if(file1 != null && !file1.exists())
                    file1.mkdirs();
                try
                {
                    s2 = new OutputStreamWriter(new FileOutputStream(file), s2);
                    s2.write(s1);
                    s2.close();
                }
                // Misplaced declaration of an exception variable
                catch(String s1)
                {
                    PluginManager.logDebug((new StringBuilder("FileUtil.writeFile : FileNotFoundException : filePath = ")).append(s).toString());
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch(String s1)
                {
                    PluginManager.logDebug((new StringBuilder("FileUtil.writeFile : UnsupportedEncodingException : filePath = ")).append(s).toString());
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch(String s1)
                {
                    PluginManager.logDebug((new StringBuilder("FileUtil.writeFile : IOException : filePath = ")).append(s).toString());
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }

    public boolean writeFile(String s, byte abyte0[])
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if(abyte0 != null)
        {
            s = new File(s);
            flag = flag1;
            if(s != null)
            {
                File file = s.getParentFile();
                if(file != null && !file.exists())
                    file.mkdirs();
                try
                {
                    s = new FileOutputStream(s);
                    s.write(abyte0);
                    s.close();
                }
                // Misplaced declaration of an exception variable
                catch(String s)
                {
                    return false;
                }
                // Misplaced declaration of an exception variable
                catch(String s)
                {
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }

    public static final int STORAGE_TYPE_AUTO = 2;
    public static final int STORAGE_TYPE_EXTERNAL = 1;
    public static final int STORAGE_TYPE_TERMINAL = 0;
    public static final char UTF8_BOM_CHAR = 65279;
    private static FileUtil instance = new FileUtil();
    private boolean valid;

}
