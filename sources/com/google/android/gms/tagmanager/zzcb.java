// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg

class zzcb
{
    static final class zza extends Enum
    {

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/tagmanager/zzcb$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzaEx.clone();
        }

        public static final zza zzaEu;
        public static final zza zzaEv;
        public static final zza zzaEw;
        private static final zza zzaEx[];

        static 
        {
            zzaEu = new zza("NONE", 0);
            zzaEv = new zza("CONTAINER", 1);
            zzaEw = new zza("CONTAINER_DEBUG", 2);
            zzaEx = (new zza[] {
                zzaEu, zzaEv, zzaEw
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    zzcb()
    {
        clear();
    }

    private String zzdS(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String zzm(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    static zzcb zzxl()
    {
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorenter ;
        zzcb zzcb1;
        if(zzaEq == null)
            zzaEq = new zzcb();
        zzcb1 = zzaEq;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        return zzcb1;
        Exception exception;
        exception;
        com/google/android/gms/tagmanager/zzcb;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void clear()
    {
        zzaEr = zza.zzaEu;
        zzaEs = null;
        zzaCk = null;
        zzaEt = null;
    }

    String getContainerId()
    {
        return zzaCk;
    }

    boolean zzl(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if(!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        zzbg.zzam((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if(!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        zzaEr = zza.zzaEw;
_L6:
        zzaEt = zzm(uri);
        if(zzaEr == zza.zzaEv || zzaEr == zza.zzaEw)
            zzaEs = (new StringBuilder()).append("/r?").append(zzaEt).toString();
        zzaCk = zzdS(zzaEt);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        uri;
        flag = false;
          goto _L5
_L4:
        zzaEr = zza.zzaEv;
          goto _L6
        uri;
        throw uri;
_L2:
label0:
        {
            if(!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
                break label0;
            if(!zzdS(uri.getQuery()).equals(zzaCk))
                break MISSING_BLOCK_LABEL_247;
            zzbg.zzam((new StringBuilder()).append("Exit preview mode for container: ").append(zzaCk).toString());
            zzaEr = zza.zzaEu;
            zzaEs = null;
        }
          goto _L5
        zzbg.zzan((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    zza zzxm()
    {
        return zzaEr;
    }

    String zzxn()
    {
        return zzaEs;
    }

    private static zzcb zzaEq;
    private volatile String zzaCk;
    private volatile zza zzaEr;
    private volatile String zzaEs;
    private volatile String zzaEt;
}
