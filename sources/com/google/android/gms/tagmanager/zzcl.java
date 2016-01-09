// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.*;
import java.io.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbg, zzbf, zzs, zzcb

class zzcl
    implements Runnable
{

    zzcl(Context context, String s, zzmx zzmx1, zzs zzs1)
    {
        mContext = context;
        zzaEE = zzmx1;
        zzaCk = s;
        zzaEH = zzs1;
        zzaEF = (new StringBuilder()).append("/r?id=").append(s).toString();
        zzaCH = zzaEF;
        zzaEI = null;
    }

    public zzcl(Context context, String s, zzs zzs1)
    {
        this(context, s, new zzmx(), zzs1);
    }

    private boolean zzxo()
    {
        NetworkInfo networkinfo = ((ConnectivityManager)mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if(networkinfo == null || !networkinfo.isConnected())
        {
            zzbg.zzam("...no network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    private void zzxp()
    {
        zzmw zzmw1;
        String s;
        if(!zzxo())
        {
            zzaEG.zza(zzbf.zza.zzaDU);
            return;
        }
        zzbg.zzam("Start loading resource from network ...");
        s = zzxq();
        zzmw1 = zzaEE.zzyM();
        Object obj = zzmw1.zzev(s);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        zzmq.zzc(((java.io.InputStream) (obj)), bytearrayoutputstream);
        obj = com.google.android.gms.internal.zzc.zzj.zzb(bytearrayoutputstream.toByteArray());
        zzbg.zzam((new StringBuilder()).append("Successfully loaded supplemented resource: ").append(obj).toString());
        if(((com.google.android.gms.internal.zzc.zzj) (obj)).zzhh == null && ((com.google.android.gms.internal.zzc.zzj) (obj)).zzhg.length == 0)
            zzbg.zzam((new StringBuilder()).append("No change for container: ").append(zzaCk).toString());
        zzaEG.zzv(obj);
        zzmw1.close();
        zzbg.zzam("Load resource from network finished.");
        return;
        Object obj1;
        obj1;
        zzbg.zzan((new StringBuilder()).append("No data is retrieved from the given url: ").append(s).append(". Make sure container_id: ").append(zzaCk).append(" is correct.").toString());
        zzaEG.zza(zzbf.zza.zzaDW);
        zzmw1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when loading resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaEG.zza(zzbf.zza.zzaDV);
        zzmw1.close();
        return;
        obj1;
        zzbg.zzd((new StringBuilder()).append("Error when parsing downloaded resources from url: ").append(s).append(" ").append(((IOException) (obj1)).getMessage()).toString(), ((Throwable) (obj1)));
        zzaEG.zza(zzbf.zza.zzaDW);
        zzmw1.close();
        return;
        Exception exception;
        exception;
        zzmw1.close();
        throw exception;
    }

    public void run()
    {
        if(zzaEG == null)
        {
            throw new IllegalStateException("callback must be set before execute");
        } else
        {
            zzaEG.zzwB();
            zzxp();
            return;
        }
    }

    void zza(zzbf zzbf1)
    {
        zzaEG = zzbf1;
    }

    void zzdE(String s)
    {
        if(s == null)
        {
            zzaCH = zzaEF;
            return;
        } else
        {
            zzbg.zzaj((new StringBuilder()).append("Setting CTFE URL path: ").append(s).toString());
            zzaCH = s;
            return;
        }
    }

    void zzdT(String s)
    {
        zzbg.zzaj((new StringBuilder()).append("Setting previous container version: ").append(s).toString());
        zzaEI = s;
    }

    String zzxq()
    {
        String s1 = (new StringBuilder()).append(zzaEH.zzwD()).append(zzaCH).append("&v=a65833898").toString();
        String s = s1;
        if(zzaEI != null)
        {
            s = s1;
            if(!zzaEI.trim().equals(""))
                s = (new StringBuilder()).append(s1).append("&pv=").append(zzaEI).toString();
        }
        s1 = s;
        if(zzcb.zzxl().zzxm().equals(zzcb.zza.zzaEw))
            s1 = (new StringBuilder()).append(s).append("&gtm_debug=x").toString();
        return s1;
    }

    private final Context mContext;
    private volatile String zzaCH;
    private final String zzaCk;
    private final zzmx zzaEE;
    private final String zzaEF;
    private zzbf zzaEG;
    private volatile zzs zzaEH;
    private volatile String zzaEI;
}
