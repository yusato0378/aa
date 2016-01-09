// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.core;


public class MCLog
{

    public MCLog()
    {
    }

    public static transient void d(String s, Object aobj[])
    {
    }

    public static transient void dWithTag(String s, String s1, Object aobj[])
    {
    }

    public static transient void e(String s, Object aobj[])
    {
    }

    public static transient void eWithTag(String s, String s1, Object aobj[])
    {
    }

    private static String getMethodInfo()
    {
        if(!_isMethodInfoEnabled)
        {
            return "";
        } else
        {
            StackTraceElement stacktraceelement = Thread.currentThread().getStackTrace()[4];
            StringBuffer stringbuffer = new StringBuffer();
            stringbuffer.append('[');
            stringbuffer.append(stacktraceelement.getFileName());
            stringbuffer.append('#');
            stringbuffer.append(stacktraceelement.getMethodName());
            stringbuffer.append(':');
            stringbuffer.append(stacktraceelement.getLineNumber());
            stringbuffer.append("] ");
            return stringbuffer.toString();
        }
    }

    public static transient void i(String s, Object aobj[])
    {
    }

    public static transient void iWithTag(String s, String s1, Object aobj[])
    {
    }

    public static void setMethodInfoEnabled(boolean flag)
    {
        _isMethodInfoEnabled = flag;
    }

    public static transient void v(String s, Object aobj[])
    {
    }

    public static transient void vWithTag(String s, String s1, Object aobj[])
    {
    }

    public static transient void w(String s, Object aobj[])
    {
    }

    public static transient void wWithTag(String s, String s1, Object aobj[])
    {
    }

    private static final String TAG = "mc-java";
    private static boolean _isMethodInfoEnabled = false;

}
