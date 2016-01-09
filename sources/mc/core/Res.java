// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.core;

import android.content.Context;
import android.content.res.Resources;

public class Res
{

    public Res()
    {
    }

    public static int getDrawableId(Context context, String s)
    {
        return getIdentifier(context, "drawable", s);
    }

    public static int getId(Context context, String s)
    {
        return getIdentifier(context, "id", s);
    }

    private static int getIdentifier(Context context, String s, String s1)
    {
        return context.getResources().getIdentifier(s1, s, context.getPackageName());
    }

    public static int getLayoutId(Context context, String s)
    {
        return getIdentifier(context, "layout", s);
    }

    public static int getRawId(Context context, String s)
    {
        return getIdentifier(context, "raw", s);
    }

    public static String getString(Context context, String s)
    {
        int i = getStringId(context, s);
        return context.getResources().getString(i);
    }

    public static int getStringId(Context context, String s)
    {
        return getIdentifier(context, "string", s);
    }
}
