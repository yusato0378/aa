// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.adteck.lib;

import java.io.PrintStream;

public class Logger
{

    public Logger()
    {
    }

    public static transient void debug(Class class1, String s, String s1, Object aobj[])
    {
        execute(4, "debug", class1, s, s1, aobj);
    }

    public static transient void debug(Object obj, String s, String s1, Object aobj[])
    {
        execute(4, "debug", obj, s, s1, aobj);
    }

    public static void debug(String s)
    {
        execute(4, "debug", s, new Object[0]);
    }

    public static transient void error(Class class1, String s, String s1, Object aobj[])
    {
        execute(2, "error", class1, s, s1, aobj);
    }

    public static transient void error(Object obj, String s, String s1, Object aobj[])
    {
        execute(2, "error", obj, s, s1, aobj);
    }

    public static void error(String s)
    {
        execute(2, "error", s, new Object[0]);
    }

    protected static transient void execute(int i, String s, Class class1, String s1, String s2, Object aobj[])
    {
        if(i > level)
        {
            return;
        } else
        {
            execute(i, s, String.format("[%s::%s] %s", new Object[] {
                class1.getSimpleName(), s1, s2
            }), aobj);
            return;
        }
    }

    protected static transient void execute(int i, String s, Object obj, String s1, String s2, Object aobj[])
    {
        if(i > level)
        {
            return;
        } else
        {
            execute(i, s, String.format("[%s::%s] %s", new Object[] {
                obj.getClass().getSimpleName(), s1, s2
            }), aobj);
            return;
        }
    }

    protected static transient void execute(int i, String s, String s1, Object aobj[])
    {
        if(i > level)
            return;
        aobj = String.format("[%s] %s\n", new Object[] {
            s, String.format(s1, aobj)
        });
        s = ((String) (aobj));
_L1:
        if(i > 3)
        {
            System.out.print(s);
            return;
        } else
        {
            System.err.print(s);
            return;
        }
        aobj;
        s = String.format("[%s] %s\n", new Object[] {
            s, s1
        });
          goto _L1
    }

    public static transient void fatal(Class class1, String s, String s1, Object aobj[])
    {
        execute(1, "fatal", class1, s, s1, aobj);
    }

    public static transient void fatal(Object obj, String s, String s1, Object aobj[])
    {
        execute(1, "fatal", obj, s, s1, aobj);
    }

    public static void fatal(String s)
    {
        execute(1, "fatal", s, new Object[0]);
    }

    public static transient void notice(Class class1, String s, String s1, Object aobj[])
    {
        execute(3, "notice", class1, s, s1, aobj);
    }

    public static transient void notice(Object obj, String s, String s1, Object aobj[])
    {
        execute(3, "notice", obj, s, s1, aobj);
    }

    public static void notice(String s)
    {
        execute(3, "notice", s, new Object[0]);
    }

    public static void setLevel(int i)
    {
        level = i;
    }

    public static transient void trace(Class class1, String s, String s1, Object aobj[])
    {
        execute(5, "trace", class1, s, s1, aobj);
    }

    public static transient void trace(Object obj, String s, String s1, Object aobj[])
    {
        execute(5, "trace", obj, s, s1, aobj);
    }

    public static void trace(String s)
    {
        execute(5, "trace", s, new Object[] {
            null
        });
    }

    public static transient void warn(Class class1, String s, String s1, Object aobj[])
    {
        execute(3, "warn", class1, s, s1, aobj);
    }

    public static transient void warn(Object obj, String s, String s1, Object aobj[])
    {
        execute(3, "warn", obj, s, s1, aobj);
    }

    public static void warn(String s)
    {
        execute(3, "warn", s, new Object[0]);
    }

    public static final int LEVEL_DEBUG = 4;
    public static final int LEVEL_ERROR = 2;
    public static final int LEVEL_FATAL = 1;
    public static final int LEVEL_NONE = 0;
    public static final int LEVEL_NOTICE = 3;
    public static final int LEVEL_TRACE = 5;
    public static final int LEVEL_WARN = 3;
    private static int level = 0;

}
