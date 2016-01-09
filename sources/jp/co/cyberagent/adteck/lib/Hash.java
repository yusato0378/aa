// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import java.io.IOException;
import java.io.InputStream;
import java.security.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            Logger

public class Hash
{

    public Hash()
    {
    }

    public static byte[] HmacSHA1(String s, String s1)
    {
        s1 = new SecretKeySpec(s1.getBytes(), "HmacSHA1");
        Mac mac;
        try
        {
            mac = Mac.getInstance("HmacSHA1");
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            Logger.error(String.format("[%s::%s] failed to Mac.getInstance().", new Object[] {
                jp/co/cyberagent/adteck/lib/Hash, "HmacSHA1"
            }));
            return null;
        }
        try
        {
            mac.init(s1);
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            Logger.error(String.format("[%s::%s] failed to mac.init().", new Object[] {
                jp/co/cyberagent/adteck/lib/Hash, "HmacSHA1"
            }));
            return null;
        }
        return mac.doFinal(s.getBytes());
    }

    public static byte[] md5(InputStream inputstream)
    {
        if(inputstream == null) goto _L2; else goto _L1
_L1:
        if(inputstream.available() != 0) goto _L3; else goto _L2
_L2:
        Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "input stream is null or zero length.", new Object[0]);
_L6:
        return null;
        inputstream;
        Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "input stream is null or zero length.", new Object[0]);
        return null;
_L3:
        MessageDigest messagedigest;
        byte abyte0[];
        int i;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch(InputStream inputstream)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "no such algorithm 'MD5'.", new Object[0]);
            return null;
        }
        abyte0 = new byte[4096];
_L4:
        i = inputstream.read(abyte0, 0, abyte0.length);
        if(i < 0)
        {
            Object obj;
            if(inputstream != null)
                try
                {
                    inputstream.close();
                }
                // Misplaced declaration of an exception variable
                catch(InputStream inputstream) { }
            return messagedigest.digest();
        }
        messagedigest.update(abyte0, 0, i);
          goto _L4
        obj;
        Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "failed to digest.update.", new Object[0]);
        if(inputstream == null) goto _L6; else goto _L5
_L5:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch(InputStream inputstream)
        {
            return null;
        }
        return null;
        obj;
        if(inputstream != null)
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch(InputStream inputstream) { }
        throw obj;
    }

    public static byte[] md5(String s)
    {
        if(s == null || s.length() == 0)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "input stream is null or zero length.", new Object[0]);
            return null;
        }
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "no such algorithm 'MD5'.", new Object[0]);
            return null;
        }
        messagedigest.update(s.getBytes());
        return messagedigest.digest();
    }

    public static byte[] md5(byte abyte0[])
    {
        if(abyte0 == null || abyte0.length == 0)
            throw new IllegalArgumentException("bytes to encript cannot be null or zero length");
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        // Misplaced declaration of an exception variable
        catch(byte abyte0[])
        {
            Logger.error(jp/co/cyberagent/adteck/lib/Hash, "md5", "no such algorithm 'MD5'.", new Object[0]);
            return null;
        }
        return messagedigest.digest(abyte0);
    }

    public static String toString(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        int i = 0;
        do
        {
            if(i >= abyte0.length)
                return stringbuffer.toString();
            if((abyte0[i] & 0xff) < 16)
                stringbuffer.append((new StringBuilder("0")).append(Integer.toHexString(abyte0[i] & 0xff)).toString());
            else
                stringbuffer.append(Integer.toHexString(abyte0[i] & 0xff));
            i++;
        } while(true);
    }
}
