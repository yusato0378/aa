// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.google.ads.mediation.customevent;

import android.view.View;

// Referenced classes of package com.google.ads.mediation.customevent:
//            CustomEventListener

public interface CustomEventBannerListener
    extends CustomEventListener
{

    public abstract void onClick();

    public abstract void onReceivedAd(View view);
}
