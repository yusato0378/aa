// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzx

class zzr
    implements Logger
{

    zzr()
    {
        zzGV = 2;
    }

    public void error(Exception exception)
    {
    }

    public void error(String s)
    {
    }

    public int getLogLevel()
    {
        return zzGV;
    }

    public void info(String s)
    {
    }

    public void setLogLevel(int i)
    {
        zzGV = i;
        if(!zzEC)
        {
            Log.i((String)zzx.zzHf.get(), (new StringBuilder()).append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)zzx.zzHf.get()).append(" DEBUG").toString());
            zzEC = true;
        }
    }

    public void verbose(String s)
    {
    }

    public void warn(String s)
    {
    }

    private boolean zzEC;
    private int zzGV;
}
