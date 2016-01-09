// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.purchase;

import android.content.Intent;

public interface InAppPurchaseResult
{

    public abstract void finishPurchase();

    public abstract String getProductId();

    public abstract Intent getPurchaseData();

    public abstract int getResultCode();

    public abstract boolean isVerified();
}
