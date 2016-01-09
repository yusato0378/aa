// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package jp.co.cyberagent.gn.plugin;


public class PluginParam
{
    public static final class ParamType extends Enum
    {

        public static ParamType valueOf(String s)
        {
            return (ParamType)Enum.valueOf(jp/co/cyberagent/gn/plugin/PluginParam$ParamType, s);
        }

        public static ParamType[] values()
        {
            ParamType aparamtype[] = ENUM$VALUES;
            int i = aparamtype.length;
            ParamType aparamtype1[] = new ParamType[i];
            System.arraycopy(aparamtype, 0, aparamtype1, 0, i);
            return aparamtype1;
        }

        public static final ParamType Boolean;
        private static final ParamType ENUM$VALUES[];
        public static final ParamType Float;
        public static final ParamType Int;
        public static final ParamType Null;
        public static final ParamType String;

        static 
        {
            Null = new ParamType("Null", 0);
            Int = new ParamType("Int", 1);
            Float = new ParamType("Float", 2);
            Boolean = new ParamType("Boolean", 3);
            String = new ParamType("String", 4);
            ENUM$VALUES = (new ParamType[] {
                Null, Int, Float, Boolean, String
            });
        }

        private ParamType(String s, int i)
        {
            super(s, i);
        }
    }


    public PluginParam()
    {
        paramType = ParamType.Null;
        intValue = 0;
        floatValue = 0.0F;
        booleanValue = false;
        stringValue = null;
    }

    public PluginParam(float f)
    {
        paramType = ParamType.Float;
        floatValue = f;
    }

    public PluginParam(int i)
    {
        paramType = ParamType.Int;
        intValue = i;
    }

    public PluginParam(String s)
    {
        paramType = ParamType.String;
        stringValue = s;
    }

    public PluginParam(boolean flag)
    {
        paramType = ParamType.Boolean;
        booleanValue = flag;
    }

    public final boolean getBooleanValue()
    {
        return booleanValue;
    }

    public final float getFloatValue()
    {
        return floatValue;
    }

    public final int getIntValue()
    {
        return intValue;
    }

    public final ParamType getParamType()
    {
        return paramType;
    }

    public final String getStringValue()
    {
        return stringValue;
    }

    protected boolean booleanValue;
    protected float floatValue;
    protected int intValue;
    protected ParamType paramType;
    protected String stringValue;
}
