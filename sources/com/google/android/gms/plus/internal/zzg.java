// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.plus.PlusOneDummyView;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzc

public final class zzg extends com.google.android.gms.dynamic.zzg
{

    private zzg()
    {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View zza(Context context, int i, int j, String s, int k)
    {
        if(s == null)
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch(String s)
            {
                return new PlusOneDummyView(context, i);
            }
        s = (View)zze.zzg(((zzc)zzazf.zzX(context)).zza(zze.zzt(context), i, j, s, k));
        return s;
    }

    protected zzc zzcz(IBinder ibinder)
    {
        return zzc.zza.zzcw(ibinder);
    }

    protected Object zzd(IBinder ibinder)
    {
        return zzcz(ibinder);
    }

    private static final zzg zzazf = new zzg();

}
