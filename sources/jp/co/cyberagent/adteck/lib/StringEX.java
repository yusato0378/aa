// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import android.os.Message;
import android.text.SpannableStringBuilder;
import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            Logger

public class StringEX
{

    public StringEX()
    {
    }

    public static boolean empty(String s)
    {
        while(s == null || s.equals("")) 
            return true;
        return false;
    }

    public static boolean empty(String as[])
    {
        return as == null || as.length == 0;
    }

    public static boolean equals(String s, String s1)
    {
        while(s == null || s1 == null || !s.equals(s1)) 
            return false;
        return true;
    }

    public static boolean inArray(String s, String as[])
    {
        if(s != null && as != null)
        {
            int j = as.length;
            int i = 0;
            while(i < j) 
            {
                String s1 = as[i];
                if(s1 == null || !s1.equals(s))
                    i++;
                else
                    return true;
            }
        }
        return false;
    }

    public static boolean isDouble(String s)
    {
        return preg_match("^[0-9]+\\.[0-9]+$", s);
    }

    public static boolean isInt(String s)
    {
        return preg_match("^[0-9]+$", s);
    }

    public static boolean isNumeric(String s)
    {
        return preg_match("^[\\.0-9]+$", s);
    }

    public static Matcher match(String s, String s1)
    {
        if(s == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "match", "regexp is null.", new Object[0]);
            return null;
        }
        if(s1 == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "match", "subject is null.", new Object[0]);
            return null;
        }
        String s2 = s;
        if(s.indexOf('\0') != 94)
            s2 = String.format(".*%s", new Object[] {
                s
            });
        s = s2;
        if(s2.lastIndexOf('\0') != 36)
            s = String.format("%s.*", new Object[] {
                s2
            });
        return Pattern.compile(s).matcher(s1);
    }

    public static String preg_match(String s, String s1, int i)
    {
        s = match(s, s1);
        if(s == null || !s.matches() || i > s.groupCount() || i < 0)
            return null;
        else
            return s.group(i);
    }

    public static boolean preg_match(String s, String s1)
    {
        s = match(s, s1);
        if(s == null)
            return false;
        else
            return s.matches();
    }

    public static boolean preg_match(String s, String s1, List list)
    {
        if(list == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "preg_match", "groups is null.", new Object[0]);
        } else
        {
            s = match(s, s1);
            if(s != null && s.matches())
            {
                int i = 0;
                do
                {
                    if(i >= s.groupCount() + 1)
                        return true;
                    list.add(s.group(i));
                    i++;
                } while(true);
            }
        }
        return false;
    }

    public static String preg_replace(String s, String s1, String s2)
    {
        if(s == null || s1 == null || s2 == null)
            return null;
        else
            return s2.replaceAll(s, s1);
    }

    public static String[] preg_split(String s)
    {
        return preg_split("(\r\n|\r|\n)", s);
    }

    public static String[] preg_split(String s, String s1)
    {
        if(s == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "split", "regexp is null.", new Object[0]);
            return null;
        }
        if(s1 == null)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "split", "subject is null.", new Object[0]);
            return null;
        } else
        {
            return Pattern.compile(s).split(s1);
        }
    }

    public static String toString(Message message)
    {
        if(message == null)
            return "";
        if(message.obj instanceof String)
            return (String)message.obj;
        else
            return "";
    }

    public static String toString(File file)
    {
        if(file == null)
            return null;
        else
            return file.getAbsolutePath();
    }

    public static String toString(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder();
        inputstream = new BufferedReader(new InputStreamReader(inputstream));
_L1:
        String s = inputstream.readLine();
        if(s != null)
            break MISSING_BLOCK_LABEL_38;
        return stringbuilder.toString();
        stringbuilder.append(s);
          goto _L1
        inputstream;
_L3:
        Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "toString", "failed to read from input stream.", new Object[0]);
        return "";
        inputstream;
        if(true) goto _L3; else goto _L2
_L2:
    }

    public static String toString(CharSequence charsequence)
    {
        if(charsequence == null)
            return null;
        else
            return ((SpannableStringBuilder)charsequence).toString();
    }

    public static String toString(Object obj)
    {
        if(obj == null)
            return "";
        if(obj instanceof String)
            return (String)obj;
        else
            return obj.toString();
    }

    public static String toString(byte abyte0[])
    {
        if(abyte0 == null)
            return null;
        else
            return new String(abyte0, 0, abyte0.length);
    }

    public static String[] toString(JSONArray jsonarray)
    {
        if(jsonarray == null)
            return null;
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if(i >= jsonarray.length())
                return (String[])arraylist.toArray(new String[0]);
            try
            {
                arraylist.add(toString(jsonarray.get(i)));
            }
            catch(Exception exception)
            {
                Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "toString", "failed to parse json array index '%d'.", new Object[] {
                    Integer.valueOf(i)
                });
            }
            i++;
        } while(true);
    }

    public static String[] toString(int ai[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ai.length;
        int i = 0;
        do
        {
            if(i >= j)
                return (String[])arraylist.toArray(new String[0]);
            arraylist.add(String.format("%d", new Object[] {
                Integer.valueOf(ai[i])
            }));
            i++;
        } while(true);
    }

    public static String[] toString(File afile[])
    {
        String as[] = new String[afile.length];
        int i = 0;
        do
        {
            if(i >= afile.length)
                return as;
            as[i] = afile[i].getAbsolutePath();
            i++;
        } while(true);
    }

    public static String urldecode(String s)
    {
        String s1;
        try
        {
            s1 = URLDecoder.decode(s, "UTF-8");
        }
        catch(Exception exception)
        {
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "urldecode", "failed to decode.", new Object[0]);
            return s;
        }
        return s1;
    }

    public static String urlencode(String s)
    {
        String s1;
        try
        {
            s1 = URLEncoder.encode(s, "UTF-8");
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
            Logger.error(jp/co/cyberagent/adteck/lib/StringEX, "urlencode", "failed to encode.", new Object[0]);
            return s;
        }
        return s1;
    }
}
