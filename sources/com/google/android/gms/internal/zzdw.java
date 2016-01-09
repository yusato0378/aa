// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.InAppPurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzdz, zzdq

public final class zzdw extends zzdr.zza
{

    public zzdw(InAppPurchaseListener inapppurchaselistener)
    {
        zzqH = inapppurchaselistener;
    }

    public void zza(zzdq zzdq)
    {
        zzqH.onInAppPurchaseRequested(new zzdz(zzdq));
    }

    private final InAppPurchaseListener zzqH;
}
