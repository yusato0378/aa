// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzmu, zzmv, zzmw

public class zzmx
{

    public zzmx()
    {
    }

    int zzwp()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public zzmw zzyM()
    {
        if(zzwp() < 8)
            return new zzmu();
        else
            return new zzmv();
    }
}
