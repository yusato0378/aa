// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.location.copresence.internal;

import android.content.Context;
import com.google.android.gms.location.internal.zzn;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            CopresenceApiOptions, zzc

public class zzb
{

    private zzb(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        mContext = context;
        zzKw = s;
        zzaqz = zzn;
        zzaqB = null;
        zzPC = s1;
        zzaqA = copresenceapioptions;
    }

    public static zzb zza(Context context, String s, String s1, zzn zzn, CopresenceApiOptions copresenceapioptions)
    {
        return new zzb(context, s, s1, zzn, copresenceapioptions);
    }

    private final Context mContext;
    private final String zzKw;
    private final String zzPC;
    private final CopresenceApiOptions zzaqA;
    private zzc zzaqB;
    private final zzn zzaqz;
}
