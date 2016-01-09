// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;


// Referenced classes of package jp.co.cyberagent.adteck.lib:
//            StringEX, Logger

public class MathUtil
{
    public static class Parse
    {

        protected static String parse(String s)
        {
            if(s == null || s.equals(""))
            {
                s = "0";
            } else
            {
                String s1 = StringEX.preg_replace("[^0-9\\.\\-]", "", s);
                s = s1;
                if(s1.equals(""))
                    return "0";
            }
            return s;
        }

        public static double parseDouble(String s)
        {
            return Double.parseDouble(parse(s));
        }

        public static float parseFloat(String s)
        {
            return Float.parseFloat(parse(s));
        }

        public static int parseInt(CharSequence charsequence)
        {
            if(charsequence == null)
            {
                Logger.error(jp/co/cyberagent/adteck/lib/MathUtil$Parse, "toInt", "val is null.", new Object[0]);
                return 0;
            } else
            {
                return parseInt(charsequence.toString());
            }
        }

        public static int parseInt(Object obj)
        {
            if(obj == null)
            {
                Logger.warn(jp/co/cyberagent/adteck/lib/MathUtil, "parseInt", "object is null.", new Object[0]);
                return 0;
            }
            if(obj instanceof Integer)
                return ((Integer)obj).intValue();
            if(obj instanceof String)
            {
                int i;
                try
                {
                    i = Integer.valueOf((String)obj).intValue();
                }
                // Misplaced declaration of an exception variable
                catch(Object obj)
                {
                    return 0;
                }
                return i;
            } else
            {
                Logger.warn(jp/co/cyberagent/adteck/lib/MathUtil, "parseInt", "object is neither Integer nor String.", new Object[0]);
                return parseInt((String)obj);
            }
        }

        public static int parseInt(String s)
        {
            return Integer.parseInt(parse(s));
        }

        public static int[] parseInt(String as[])
        {
            if(as != null) goto _L2; else goto _L1
_L1:
            int ai[];
            Logger.error(jp/co/cyberagent/adteck/lib/MathUtil, "parseInt", "vars is null.", new Object[0]);
            ai = null;
_L4:
            return ai;
_L2:
            int ai1[] = new int[as.length];
            int i = 0;
            do
            {
                ai = ai1;
                if(i >= as.length)
                    continue;
                ai1[i] = parseInt(as[i]);
                i++;
            } while(true);
            if(true) goto _L4; else goto _L3
_L3:
        }

        public static long parseLong(String s)
        {
            return Long.parseLong(parse(s));
        }

        public Parse()
        {
        }
    }


    public MathUtil()
    {
    }
}
