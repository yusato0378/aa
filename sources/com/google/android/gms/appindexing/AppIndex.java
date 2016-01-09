// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.appindexing;

import com.google.android.gms.appdatasearch.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.zzgv;

// Referenced classes of package com.google.android.gms.appindexing:
//            AppIndexApi

public final class AppIndex
{

    private AppIndex()
    {
    }

    public static final Api API;
    public static final Api APP_INDEX_API;
    public static final AppIndexApi AppIndexApi = new zzgv();

    static 
    {
        API = zza.zzIU;
        APP_INDEX_API = zza.zzIU;
    }
}
