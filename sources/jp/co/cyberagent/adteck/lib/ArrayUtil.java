// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import java.util.*;

// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            StringEX

public class ArrayUtil
{

    public ArrayUtil()
    {
    }

    public static String join(String s, List list)
    {
        if(list == null)
            return null;
        else
            return join(s, (String[])list.toArray(new String[0]));
    }

    public static String join(String s, Queue queue)
    {
        if(queue == null)
            return null;
        else
            return join(s, (String[])queue.toArray(new String[0]));
    }

    public static String join(String s, int ai[])
    {
        return join(s, StringEX.toString(ai));
    }

    public static String join(String s, String as[])
    {
        String s1 = s;
        if(s == null)
            s1 = "";
        if(as == null || as.length == 0)
            return null;
        s = "";
        int i = 0;
        do
        {
            if(i >= as.length - 1)
                return s.concat(as[as.length - 1]);
            s = s.concat(as[i].concat(s1));
            i++;
        } while(true);
    }

    public static String join(ArrayList arraylist)
    {
        if(arraylist == null)
            return null;
        else
            return join((String[])arraylist.toArray(new String[0]));
    }

    public static String join(String as[])
    {
        if(as == null)
            return null;
        String s = "";
        int i = 0;
        do
        {
            if(i >= as.length - 1)
                return s.concat(as[as.length - 1]);
            s = s.concat(as[i]);
            i++;
        } while(true);
    }
}
