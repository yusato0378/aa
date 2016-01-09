// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.util;


// Referenced classes of package jp.co.cyberagent.gn.plugin.util:
//            Utility, FileUtil

public class Keychain
{

    private Keychain()
    {
        valid = false;
        terminalBasePath = null;
        externalBasePath = null;
    }

    public static void addItem(String s, String s1, String s2)
    {
        if(s == null || s.isEmpty() || s1 == null || s1.isEmpty())
            return;
        deleteItem(s);
        byte abyte0[] = s1.getBytes();
        s1 = abyte0;
        if(s2 != null)
        {
            s1 = abyte0;
            if(!s2.isEmpty())
                s1 = Utility.encrypt(s2, abyte0);
        }
        s2 = getExternalFilename(s);
        FileUtil.getInstance().writeFile(s2, s1);
        s = getTerminalFilename(s);
        FileUtil.getInstance().writeFile(s, s1);
    }

    public static void deleteItem(String s)
    {
        if(s == null || s.isEmpty())
        {
            return;
        } else
        {
            String s1 = getExternalFilename(s);
            FileUtil.getInstance().deleteFile(s1);
            s = getTerminalFilename(s);
            FileUtil.getInstance().deleteFile(s);
            return;
        }
    }

    public static String getExternalFilename(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = null;
        if(stringbuilder != null)
        {
            stringbuilder.append(getExternalPath());
            stringbuilder.append(s);
            stringbuilder.append(".dat");
            s1 = new String(stringbuilder);
        }
        return s1;
    }

    public static String getExternalPath()
    {
        Keychain keychain = getInstance();
        if(keychain.externalBasePath == null || keychain.externalBasePath.isEmpty())
            keychain.externalBasePath = FileUtil.getInstance().getAbsolutePath(1, "Android/data/AmebaNativeCore/keychain/");
        return keychain.externalBasePath;
    }

    public static Keychain getInstance()
    {
        if(!instance.isValid())
            instance.init();
        return instance;
    }

    public static String getItem(String s, String s1)
    {
        Object obj;
        byte abyte0[];
        String s2 = "";
        if(s == null || s.isEmpty())
            return "";
        if(s1 == null || s1.isEmpty())
        {
label0:
            {
                s1 = getExternalFilename(s);
                s1 = FileUtil.getInstance().readFile(s1, "UTF-8");
                if(s1 != null)
                    s1 = new String(s1);
                else
                    s1 = null;
                if(s1 != null)
                {
                    obj = s1;
                    if(!s1.isEmpty())
                        break label0;
                }
                s = getTerminalFilename(s);
                s = FileUtil.getInstance().readFile(s, "UTF-8");
                if(s != null)
                    obj = new String(s);
                else
                    obj = "";
            }
        } else
        {
label1:
            {
                obj = getExternalFilename(s);
                obj = FileUtil.getInstance().readFile(((String) (obj)));
                if(obj != null)
                {
                    abyte0 = ((byte []) (obj));
                    if(obj.length > 0)
                        break label1;
                }
                s = getTerminalFilename(s);
                abyte0 = FileUtil.getInstance().readFile(s);
            }
            obj = s2;
            if(abyte0 != null)
            {
                obj = s2;
                if(abyte0.length > 0)
                {
label2:
                    {
                        s = Utility.decrypt(s1, abyte0);
                        if(s == null)
                            break label2;
                        obj = new String(s);
                    }
                }
            }
        }
_L6:
        return ((String) (obj));
        s = abyte0;
        if(3 > abyte0.length) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        i = abyte0[0];
        j = abyte0[1];
        k = abyte0[2];
        s = abyte0;
        if((i & 0xff) != 239) goto _L2; else goto _L3
_L3:
        s = abyte0;
        if((j & 0xff) != 187) goto _L2; else goto _L4
_L4:
        s = abyte0;
        if((k & 0xff) != 191) goto _L2; else goto _L5
_L5:
        k = abyte0.length - 3;
        s = new byte[k];
        j = 3;
        i = 0;
_L7:
        if(i < k)
            break MISSING_BLOCK_LABEL_286;
_L2:
        obj = new String(s);
          goto _L6
        s[i] = abyte0[j];
        j++;
        i++;
          goto _L7
    }

    public static String getTerminalFilename(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = null;
        if(stringbuilder != null)
        {
            stringbuilder.append(getTerminalPath());
            stringbuilder.append(s);
            stringbuilder.append(".dat");
            s1 = new String(stringbuilder);
        }
        return s1;
    }

    public static String getTerminalPath()
    {
        Keychain keychain = getInstance();
        if(keychain.terminalBasePath == null || keychain.terminalBasePath.isEmpty())
            keychain.terminalBasePath = FileUtil.getInstance().getAbsolutePath(0, "app_root/keychain/");
        return keychain.terminalBasePath;
    }

    public void exit()
    {
        if(valid)
            valid = false;
    }

    public boolean init()
    {
        if(!valid)
            valid = true;
        return valid;
    }

    public boolean isValid()
    {
        return valid;
    }

    public static final String CHARSET_NAME = "UTF-8";
    public static final String DATA_FILE_EXT = ".dat";
    public static final String EXTERNAL_KEYCHAIN_PATH = "Android/data/AmebaNativeCore/keychain/";
    public static final String KEYCHAIN_DIRECTORY = "keychain";
    public static final String SERVICE_NAME = "AmebaNativeCore";
    public static final String TERMINAL_KEYCHAIN_PATH = "app_root/keychain/";
    private static Keychain instance = new Keychain();
    private String externalBasePath;
    private String terminalBasePath;
    private boolean valid;

}
