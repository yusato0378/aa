// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzfh

public final class zzfj
{
    private static abstract class zza extends zzfh
    {

        public void onStop()
        {
        }

        private zza()
        {
        }

    }

    public static interface zzb
    {

        public abstract void zzc(Bundle bundle);
    }


    public static Future zza(Context context, int i)
    {
        return (new zza(context, i) {

            public void zzcX()
            {
                android.content.SharedPreferences.Editor editor = zzfj.zzu(zzoH).edit();
                editor.putInt("webview_cache_version", zzCk);
                editor.commit();
            }

            final int zzCk;
            final Context zzoH;

            
            {
                zzoH = context;
                zzCk = i;
                super();
            }
        }
).zzeW();
    }

    public static Future zza(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            public void zzcX()
            {
                SharedPreferences sharedpreferences = zzfj.zzu(zzoH);
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_https", sharedpreferences.getBoolean("use_https", true));
                if(zzCj != null)
                    zzCj.zzc(bundle);
            }

            final zzb zzCj;
            final Context zzoH;

            
            {
                zzoH = context;
                zzCj = zzb1;
                super();
            }
        }
).zzeW();
    }

    public static Future zza(Context context, boolean flag)
    {
        return (new zza(context, flag) {

            public void zzcX()
            {
                android.content.SharedPreferences.Editor editor = zzfj.zzu(zzoH).edit();
                editor.putBoolean("use_https", zzCi);
                editor.commit();
            }

            final boolean zzCi;
            final Context zzoH;

            
            {
                zzoH = context;
                zzCi = flag;
                super();
            }
        }
).zzeW();
    }

    public static Future zzb(Context context, zzb zzb1)
    {
        return (new zza(context, zzb1) {

            public void zzcX()
            {
                SharedPreferences sharedpreferences = zzfj.zzu(zzoH);
                Bundle bundle = new Bundle();
                bundle.putInt("webview_cache_version", sharedpreferences.getInt("webview_cache_version", 0));
                if(zzCj != null)
                    zzCj.zzc(bundle);
            }

            final zzb zzCj;
            final Context zzoH;

            
            {
                zzoH = context;
                zzCj = zzb1;
                super();
            }
        }
).zzeW();
    }

    private static SharedPreferences zzn(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    static SharedPreferences zzu(Context context)
    {
        return zzn(context);
    }
}
