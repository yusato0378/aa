// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.dimage.android;

import java.io.ByteArrayOutputStream;
import java.security.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class i
{
    public static final class a extends Enum
    {

        public static a a(int j)
        {
            a aa[] = values();
            int l = aa.length;
            for(int k = 0; k < l; k++)
            {
                a a1 = aa[k];
                if(a1.b() == j)
                    return a1;
            }

            new IllegalArgumentException((new StringBuilder()).append("Unknown key index: ").append(j).toString());
            return null;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(jp/co/dimage/android/i$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        byte[] a()
        {
            return d;
        }

        int b()
        {
            return c;
        }

        public static final a a;
        public static final a b;
        private static final a e[];
        private int c;
        private byte d[];

        static 
        {
            a = new a("XUNIQ", 0, 0, "a582a79754ac4f5fb75bc18271e4712c");
            b = new a("SERVER_URL", 1, 1, "910c256430ae453496018633be5e1629");
            e = (new a[] {
                a, b
            });
        }

        private a(String s, int j, int k, String s1)
        {
            super(s, j);
            c = k;
            d = i.c(s1);
        }
    }


    public i()
    {
    }

    static String a(String s)
    {
        String s1;
        a a1;
        Cipher cipher;
        int j;
        int k;
        try
        {
            j = Integer.parseInt(s.substring(0, 1));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new NoSuchAlgorithmException(s.getMessage());
        }
        try
        {
            k = Integer.parseInt(s.substring(1, 2));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new InvalidKeyException(s.getMessage());
        }
        a(j, k);
        s1 = a[j];
        a1 = a.a(k);
        s = s.substring(2);
        cipher = Cipher.getInstance(s1);
        cipher.init(2, new SecretKeySpec(a1.a(), s1));
        return new String(cipher.doFinal(d(s)));
    }

    public static String a(String s, a a1)
    {
        String s1 = a[0];
        Cipher cipher = Cipher.getInstance(s1);
        cipher.init(1, new SecretKeySpec(a1.a(), s1));
        s = a(cipher.doFinal(s.getBytes()));
        return (new StringBuilder()).append(Integer.toString(0)).append(Integer.toString(a1.b())).append(s).toString();
    }

    private static String a(byte abyte0[])
    {
        StringBuffer stringbuffer = new StringBuffer();
        for(int j = 0; j < abyte0.length; j++)
        {
            String s = Integer.toHexString(abyte0[j] & 0xff);
            if(s.length() == 1)
                stringbuffer.append("0");
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    private static void a(int j, int k)
    {
        if(j < 0 || j >= a.length)
            throw new NoSuchAlgorithmException("Invalid algorithm index.");
        try
        {
            if(a.a(k) == null)
                throw new InvalidKeyException("Invalid key index.");
        }
        catch(Exception exception)
        {
            throw new InvalidKeyException("Invalid key index.");
        }
    }

    static String b(String s)
    {
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(s.getBytes());
        return a(messagedigest.digest());
    }

    static byte[] c(String s)
    {
        return d(s);
    }

    private static byte[] d(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for(int j = 0; j < s.length(); j += 2)
            bytearrayoutputstream.write(Integer.parseInt(s.substring(j, j + 2), 16));

        return bytearrayoutputstream.toByteArray();
    }

    private static final String a[] = {
        "AES"
    };

}
