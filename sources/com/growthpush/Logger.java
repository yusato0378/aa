// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush;

import android.util.Log;

public class Logger
{

    public Logger()
    {
        debug = false;
    }

    public void debug(String s)
    {
        if(debug)
            Log.d("GrowthPush", s);
    }

    public void error(String s)
    {
        if(debug)
            Log.e("GrowthPush", s);
    }

    public void info(String s)
    {
        if(debug)
            Log.i("GrowthPush", s);
    }

    public void setDebug(boolean flag)
    {
        debug = flag;
    }

    public void warning(String s)
    {
        if(debug)
            Log.w("GrowthPush", s);
    }

    private static final String TAG = "GrowthPush";
    private boolean debug;
}
