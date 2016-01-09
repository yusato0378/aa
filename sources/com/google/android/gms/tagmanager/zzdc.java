// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class zzdc
{
    static class zza
        implements Logger
    {

        private static int zzhL(int i)
        {
            switch(i)
            {
            case 6: // '\006'
            default:
                return 3;

            case 5: // '\005'
                return 2;

            case 3: // '\003'
            case 4: // '\004'
                return 1;

            case 2: // '\002'
                return 0;
            }
        }

        public void error(Exception exception)
        {
            zzbg.zzb("", exception);
        }

        public void error(String s)
        {
            zzbg.zzak(s);
        }

        public int getLogLevel()
        {
            return zzhL(zzbg.getLogLevel());
        }

        public void info(String s)
        {
            zzbg.zzal(s);
        }

        public void setLogLevel(int i)
        {
            zzbg.zzan("GA uses GTM logger. Please use TagManager.setLogLevel(int) instead.");
        }

        public void verbose(String s)
        {
            zzbg.zzam(s);
        }

        public void warn(String s)
        {
            zzbg.zzan(s);
        }

        zza()
        {
        }
    }


    zzdc(Context context)
    {
        mContext = context;
    }

    private void zzdZ(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if(zzEv == null)
        {
            zzEv = GoogleAnalytics.getInstance(mContext);
            zzEv.setLogger(new zza());
            zzEt = zzEv.newTracker(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public Tracker zzdY(String s)
    {
        zzdZ(s);
        return zzEt;
    }

    private Context mContext;
    private Tracker zzEt;
    private GoogleAnalytics zzEv;
}
