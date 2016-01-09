// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.cast.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzk

public abstract class zzb extends com.google.android.gms.common.api.zza.zza
{

    public zzb(GoogleApiClient googleapiclient)
    {
        super(zzk.zzKh, googleapiclient);
    }

    public void zzal(int i)
    {
        setResult(createFailedResult(new Status(i)));
    }

    public void zzd(int i, String s)
    {
        setResult(createFailedResult(new Status(i, s, null)));
    }
}
