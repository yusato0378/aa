// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;

import android.view.View;
import android.view.WindowManager;

// Referenced classes of package org.cocos2dx.plugin:
//            PluginWrapper, InterfaceAds

public class AdsWrapper
{

    public AdsWrapper()
    {
    }

    public static void addAdView(WindowManager windowmanager, View view, int i)
    {
        android.view.WindowManager.LayoutParams layoutparams;
        layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.type = 1000;
        layoutparams.width = -2;
        layoutparams.height = -2;
        layoutparams.flags = layoutparams.flags | 8;
        i;
        JVM INSTR tableswitch 0 6: default 80
    //                   0 89
    //                   1 98
    //                   2 107
    //                   3 116
    //                   4 125
    //                   5 134
    //                   6 143;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        windowmanager.addView(view, layoutparams);
        return;
_L2:
        layoutparams.gravity = 17;
        continue; /* Loop/switch isn't completed */
_L3:
        layoutparams.gravity = 48;
        continue; /* Loop/switch isn't completed */
_L4:
        layoutparams.gravity = 51;
        continue; /* Loop/switch isn't completed */
_L5:
        layoutparams.gravity = 53;
        continue; /* Loop/switch isn't completed */
_L6:
        layoutparams.gravity = 80;
        continue; /* Loop/switch isn't completed */
_L7:
        layoutparams.gravity = 83;
        continue; /* Loop/switch isn't completed */
_L8:
        layoutparams.gravity = 85;
        if(true) goto _L1; else goto _L9
_L9:
    }

    private static native void nativeOnAdsResult(String s, int i, String s1);

    private static native void nativeOnPlayerGetPoints(String s, int i);

    public static void onAdsResult(InterfaceAds interfaceads, int i, String s)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfaceads, i, s) {

            public void run()
            {
                AdsWrapper.nativeOnAdsResult(curObj.getClass().getName().replace('.', '/'), curCode, curMsg);
            }

            final int val$curCode;
            final String val$curMsg;
            final InterfaceAds val$curObj;

            
            {
                curObj = interfaceads;
                curCode = i;
                curMsg = s;
                super();
            }
        }
);
    }

    public static void onPlayerGetPoints(InterfaceAds interfaceads, int i)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfaceads, i) {

            public void run()
            {
                AdsWrapper.nativeOnPlayerGetPoints(curAdapter.getClass().getName().replace('.', '/'), curPoints);
            }

            final InterfaceAds val$curAdapter;
            final int val$curPoints;

            
            {
                curAdapter = interfaceads;
                curPoints = i;
                super();
            }
        }
);
    }

    public static final int POS_BOTTOM = 4;
    public static final int POS_BOTTOM_LEFT = 5;
    public static final int POS_BOTTOM_RIGHT = 6;
    public static final int POS_CENTER = 0;
    public static final int POS_TOP = 1;
    public static final int POS_TOP_LEFT = 2;
    public static final int POS_TOP_RIGHT = 3;
    public static final int RESULT_CODE_AdsDismissed = 2;
    public static final int RESULT_CODE_AdsReceived = 0;
    public static final int RESULT_CODE_AdsShown = 1;
    public static final int RESULT_CODE_NetworkError = 5;
    public static final int RESULT_CODE_PointsSpendFailed = 4;
    public static final int RESULT_CODE_PointsSpendSucceed = 3;
    public static final int RESULT_CODE_UnknownError = 6;


}
