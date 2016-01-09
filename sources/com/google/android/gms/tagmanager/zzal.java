// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import java.io.File;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class zzal
{

    public static int version()
    {
        int i;
        try
        {
            i = Integer.parseInt(android.os.Build.VERSION.SDK);
        }
        catch(NumberFormatException numberformatexception)
        {
            zzbg.zzak((new StringBuilder()).append("Invalid version number: ").append(android.os.Build.VERSION.SDK).toString());
            return 0;
        }
        return i;
    }

    static boolean zzaQ(String s)
    {
        if(version() < 9)
        {
            return false;
        } else
        {
            s = new File(s);
            s.setReadable(false, false);
            s.setWritable(false, false);
            s.setReadable(true, true);
            s.setWritable(true, true);
            return true;
        }
    }
}
