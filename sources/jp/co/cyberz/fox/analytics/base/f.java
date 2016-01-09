// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

class f
{
    static final class a extends Enum
    {

        public static a a(int i)
        {
            a aa[] = values();
            int k = aa.length;
            for(int j = 0; j < k; j++)
            {
                a a1 = aa[j];
                if(a1.b() == i)
                    return a1;
            }

            new IllegalArgumentException((new StringBuilder()).append("Unknown key index: ").append(i).toString());
            return null;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(jp/co/cyberz/fox/analytics/base/f$a, s);
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

        private a(String s, int i, int j, String s1)
        {
            super(s, i);
            c = j;
            d = f.b(s1);
        }
    }


    f()
    {
    }

    static String a(String s)
    {
        String s1;
        a a1;
        Cipher cipher;
        int i;
        int j;
        try
        {
            i = Integer.parseInt(s.substring(0, 1));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new NoSuchAlgorithmException(s.getMessage());
        }
        try
        {
            j = Integer.parseInt(s.substring(1, 2));
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            throw new InvalidKeyException(s.getMessage());
        }
        a(i, j);
        s1 = a[i];
        a1 = a.a(j);
        s = s.substring(2);
        cipher = Cipher.getInstance(s1);
        cipher.init(2, new SecretKeySpec(a1.a(), s1));
        return new String(cipher.doFinal(c(s)));
    }

    static String a(String s, a a1)
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
        for(int i = 0; i < abyte0.length; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if(s.length() == 1)
                stringbuffer.append("0");
            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }

    private static void a(int i, int j)
    {
        if(i < 0 || i >= a.length)
            throw new NoSuchAlgorithmException("Invalid algorithm index.");
        try
        {
            if(a.a(j) == null)
                throw new InvalidKeyException("Invalid key index.");
        }
        catch(Exception exception)
        {
            throw new InvalidKeyException("Invalid key index.");
        }
    }

    static byte[] b(String s)
    {
        return c(s);
    }

    private static byte[] c(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        for(int i = 0; i < s.length(); i += 2)
            bytearrayoutputstream.write(Integer.parseInt(s.substring(i, i + 2), 16));

        return bytearrayoutputstream.toByteArray();
    }

    private static final String a[] = {
        "AES"
    };

}
