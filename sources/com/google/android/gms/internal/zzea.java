// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.internal;

import com.google.android.gms.ads.purchase.PlayStorePurchaseListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzdy, zzdu

public final class zzea extends zzdv.zza
{

    public zzea(PlayStorePurchaseListener playstorepurchaselistener)
    {
        zzqI = playstorepurchaselistener;
    }

    public boolean isValidPurchase(String s)
    {
        return zzqI.isValidPurchase(s);
    }

    public void zza(zzdu zzdu)
    {
        zzqI.onInAppPurchaseFinished(new zzdy(zzdu));
    }

    private final PlayStorePurchaseListener zzqI;
}
