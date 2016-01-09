// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.purchase;


// Referenced classes of package com.google.android.gms.ads.purchase:
//            InAppPurchaseResult

public interface PlayStorePurchaseListener
{

    public abstract boolean isValidPurchase(String s);

    public abstract void onInAppPurchaseFinished(InAppPurchaseResult inapppurchaseresult);
}
