// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.zzlj;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv

public final class zzn
{

    public zzn(String s)
    {
        zzTY = (String)zzv.zzr(s);
    }

    public void zza(Context context, String s, String s1, Throwable throwable)
    {
        StackTraceElement astacktraceelement[] = throwable.getStackTrace();
        StringBuilder stringbuilder = new StringBuilder();
        for(int i = 0; i < astacktraceelement.length && i < 2; i++)
        {
            stringbuilder.append(astacktraceelement[i].toString());
            stringbuilder.append("\n");
        }

        context = new zzlj(context, 10);
        context.zza("GMS_WTF", null, new String[] {
            "GMS_WTF", stringbuilder.toString()
        });
        context.send();
        if(zzaQ(7))
        {
            Log.e(s, s1, throwable);
            Log.wtf(s, s1, throwable);
        }
    }

    public void zza(String s, String s1, Throwable throwable)
    {
        if(zzaQ(4))
            Log.i(s, s1, throwable);
    }

    public boolean zzaQ(int i)
    {
        return Log.isLoggable(zzTY, i);
    }

    public void zzb(String s, String s1, Throwable throwable)
    {
        if(zzaQ(5))
            Log.w(s, s1, throwable);
    }

    public void zzc(String s, String s1, Throwable throwable)
    {
        if(zzaQ(6))
            Log.e(s, s1, throwable);
    }

    public void zzs(String s, String s1)
    {
        if(zzaQ(3))
            Log.d(s, s1);
    }

    public void zzt(String s, String s1)
    {
        if(zzaQ(5))
            Log.w(s, s1);
    }

    public void zzu(String s, String s1)
    {
        if(zzaQ(6))
            Log.e(s, s1);
    }

    private final String zzTY;
}
