// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation.customevent;


public interface CustomEventListener
{

    public abstract void onDismissScreen();

    public abstract void onFailedToReceiveAd();

    public abstract void onLeaveApplication();

    public abstract void onPresentScreen();
}
