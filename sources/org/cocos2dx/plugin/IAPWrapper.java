// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;


// Referenced classes of package org.cocos2dx.plugin:
//            PluginWrapper, InterfaceIAP

public class IAPWrapper
{

    public IAPWrapper()
    {
    }

    private static native void nativeOnPayResult(String s, int i, String s1);

    public static void onPayResult(InterfaceIAP interfaceiap, int i, String s)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfaceiap, i, s) {

            public void run()
            {
                IAPWrapper.nativeOnPayResult(curObj.getClass().getName().replace('.', '/'), curRet, curMsg);
            }

            final String val$curMsg;
            final InterfaceIAP val$curObj;
            final int val$curRet;

            
            {
                curObj = interfaceiap;
                curRet = i;
                curMsg = s;
                super();
            }
        }
);
    }

    public static final int PAYRESULT_CANCEL = 2;
    public static final int PAYRESULT_FAIL = 1;
    public static final int PAYRESULT_SUCCESS = 0;
    public static final int PAYRESULT_TIMEOUT = 3;

}
