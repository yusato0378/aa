// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.android.gms.ads.purchase;


public interface InAppPurchase
{

    public abstract String getProductId();

    public abstract void recordPlayBillingResolution(int i);

    public abstract void recordResolution(int i);

    public static final int RESOLUTION_CANCELED = 2;
    public static final int RESOLUTION_FAILURE = 0;
    public static final int RESOLUTION_INVALID_PRODUCT = 3;
    public static final int RESOLUTION_SUCCESS = 1;
}
