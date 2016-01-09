// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import jp.co.cyberagent.gn.plugin.PluginManager;

public class Utility
{

    public Utility()
    {
    }

    public static byte[] decrypt(String s, String s1, byte abyte0[])
        throws IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, BadPaddingException, NoSuchPaddingException
    {
        Object obj = null;
        byte abyte1[] = obj;
        if(s != null)
        {
            abyte1 = obj;
            if(s1 != null)
            {
                abyte1 = obj;
                if(abyte0 != null)
                {
                    s1 = new SecretKeySpec(getKeyBytes(s, s1), s);
                    s = Cipher.getInstance(s);
                    s.init(2, s1);
                    abyte1 = s.doFinal(abyte0);
                }
            }
        }
        return abyte1;
    }

    public static byte[] decrypt(String s, byte abyte0[])
    {
        s = decrypt("AES", s, abyte0);
        return s;
        s;
        PluginManager.logDebug("Utility.decrypt : javax.crypto.IllegalBlockSizeException");
_L2:
        return null;
        s;
        PluginManager.logDebug("Utility.decrypt : java.security.InvalidKeyException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.decrypt : java.security.NoSuchAlgorithmException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.decrypt : java.io.UnsupportedEncodingException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.decrypt : javax.crypto.BadPaddingException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.decrypt : javax.crypto.NoSuchPaddingException");
        if(true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] encrypt(String s, String s1, byte abyte0[])
        throws IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, BadPaddingException, NoSuchPaddingException
    {
        Object obj = null;
        byte abyte1[] = obj;
        if(s != null)
        {
            abyte1 = obj;
            if(s1 != null)
            {
                abyte1 = obj;
                if(abyte0 != null)
                {
                    s1 = new SecretKeySpec(getKeyBytes(s, s1), s);
                    s = Cipher.getInstance(s);
                    s.init(1, s1);
                    abyte1 = s.doFinal(abyte0);
                }
            }
        }
        return abyte1;
    }

    public static byte[] encrypt(String s, byte abyte0[])
    {
        s = encrypt("AES", s, abyte0);
        return s;
        s;
        PluginManager.logDebug("Utility.encrypt : javax.crypto.IllegalBlockSizeException");
_L2:
        return null;
        s;
        PluginManager.logDebug("Utility.encrypt : java.security.InvalidKeyException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.encrypt : java.security.NoSuchAlgorithmException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.encrypt : java.io.UnsupportedEncodingException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.encrypt : javax.crypto.BadPaddingException");
        continue; /* Loop/switch isn't completed */
        s;
        PluginManager.logDebug("Utility.encrypt : javax.crypto.NoSuchPaddingException");
        if(true) goto _L2; else goto _L1
_L1:
    }

    private static byte[] getKeyBytes(String s, String s1)
    {
        byte abyte0[];
        int j;
        int k;
label0:
        {
            abyte0 = s1.getBytes();
            if(s.equals("AES"))
            {
                k = s1.length();
                if(k != 16 && k != 24 && k != 32)
                    break label0;
            }
            return abyte0;
        }
        if(32 < k)
        {
            s = new byte[32];
            int i = 0;
            do
            {
                if(i >= 32)
                    return s;
                s[i] = abyte0[i];
                i++;
            } while(true);
        }
        byte byte0;
        if(k < 16)
            byte0 = 16;
        else
        if(k < 24)
            byte0 = 24;
        else
            byte0 = 32;
        s = new byte[byte0];
        j = 0;
_L3:
        if(j < k) goto _L2; else goto _L1
_L1:
        if(j >= byte0)
            return s;
        break MISSING_BLOCK_LABEL_146;
_L2:
        s[j] = abyte0[j];
        j++;
          goto _L3
        s[j] = abyte0[0];
        j++;
          goto _L1
    }

    public static final int AES_KEY_LENGTH_16 = 16;
    public static final int AES_KEY_LENGTH_24 = 24;
    public static final int AES_KEY_LENGTH_32 = 32;
    public static final String CRYPTO_ALGORITHM_DEFAULT = "AES";
}
