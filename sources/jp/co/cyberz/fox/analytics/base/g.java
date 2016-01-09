// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberz.fox.analytics.base;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.UUID;

public class g
{

    public g()
    {
    }

    public static String a(Double double1)
    {
        return a(double1, "");
    }

    public static String a(Double double1, String s)
    {
        if(double1 == null)
            return s;
        else
            return double1.toString();
    }

    public static String a(Integer integer)
    {
        return a(integer, "");
    }

    public static String a(Integer integer, String s)
    {
        if(integer == null)
            return s;
        else
            return integer.toString();
    }

    public static String a(Long long1)
    {
        return a(long1, "");
    }

    public static String a(Long long1, String s)
    {
        if(long1 == null)
            return s;
        else
            return long1.toString();
    }

    public static String a(String s, String s1)
    {
        if(a(s))
            return s1;
        else
            return s;
    }

    public static String a(String s, String s1, String s2)
    {
        String s3;
        int j;
        int k;
        s3 = s2;
        if(s2 == null)
            s3 = "";
        j = s1.length();
        k = s3.length();
        s2 = s;
        if(j == 0) goto _L2; else goto _L1
_L1:
        if(k != 0) goto _L4; else goto _L3
_L3:
        s2 = s;
_L2:
        return s2;
_L4:
        int i = 0;
        do
        {
            i = s.indexOf(s1, i);
            s2 = s;
            if(i < 0)
                continue;
            s = (new StringBuilder()).append(s.substring(0, i)).append(s3).append(s.substring(i + j, s.length())).toString();
            i += k;
        } while(true);
        if(true) goto _L2; else goto _L5
_L5:
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean a(String s, String as[])
    {
        return a(s, as, true);
    }

    public static boolean a(String s, String as[], boolean flag)
    {
        if(!a(s) && as != null && as.length != 0)
        {
            int i = 0;
            while(i < as.length) 
            {
                if(as[i].length() != 0)
                {
                    if(flag && s.indexOf(as[i]) != -1)
                        return true;
                    if(!flag && s.equals(as[i]))
                        return true;
                }
                i++;
            }
        }
        return false;
    }

    public static String[] a(Object obj, String s)
    {
        return a(obj, s, 0);
    }

    public static String[] a(Object obj, String s, int i)
    {
        boolean flag = false;
        if(obj == null)
            return new String[0];
        String s1 = obj.toString();
        if(s1.length() == 0)
            return new String[0];
        ArrayList arraylist = new ArrayList();
        obj = s;
        if(s.startsWith("\\"))
        {
            obj = s;
            if(s.length() >= 2)
                obj = s.substring(1);
        }
        int l = s1.length();
        int j = 0;
        int k;
label0:
        do
        {
            do
            {
                k = j;
                if(j >= l)
                    break label0;
                int i1 = s1.indexOf(((String) (obj)), j);
                k = j;
                if(i1 < 0)
                    break label0;
                arraylist.add(s1.substring(j, i1));
                k = ((String) (obj)).length() + i1;
                j = k;
            } while(i <= 0);
            j = k;
        } while(arraylist.size() < i);
        arraylist.add(s1.substring(k));
        obj = new String[arraylist.size()];
        j = obj.length;
        for(i = ((flag) ? 1 : 0); i < j; i++)
            obj[i] = (String)arraylist.get(i);

        return ((String []) (obj));
    }

    public static String b(String s)
    {
        return a(s, "");
    }

    public static String b(String s, String s1)
    {
        if(a(s))
            return s;
        else
            return a(a(a(s, "\r\n", "\n"), "\r", "\n"), "\n", s1);
    }

    public static String c(String s)
    {
        String s1 = null;
        try
        {
            if(!a(s))
                s1 = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch(String s)
        {
            s.printStackTrace();
            return null;
        }
        return s1;
    }

    public static boolean d(String s)
    {
        if(!a(s))
        {
            UUID uuid;
            try
            {
                uuid = UUID.fromString(s);
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return false;
            }
            if(uuid != null)
                return s.equals(uuid.toString());
        }
        return false;
    }

    public static final String a = "";
    public static final String b = ",";
    public static final String c = "\\";
    public static final String d = "exists";
}
