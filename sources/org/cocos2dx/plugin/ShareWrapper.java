// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;


// Referenced classes of package org.cocos2dx.plugin:
//            PluginWrapper, InterfaceShare

public class ShareWrapper
{

    public ShareWrapper()
    {
    }

    private static native void nativeOnShareResult(String s, int i, String s1);

    public static void onShareResult(InterfaceShare interfaceshare, int i, String s)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfaceshare, i, s) {

            public void run()
            {
                ShareWrapper.nativeOnShareResult(curAdapter.getClass().getName().replace('.', '/'), curRet, curMsg);
            }

            final InterfaceShare val$curAdapter;
            final String val$curMsg;
            final int val$curRet;

            
            {
                curAdapter = interfaceshare;
                curRet = i;
                curMsg = s;
                super();
            }
        }
);
    }

    public static final int SHARERESULT_CANCEL = 2;
    public static final int SHARERESULT_FAIL = 1;
    public static final int SHARERESULT_SUCCESS = 0;
    public static final int SHARERESULT_TIMEOUT = 3;

}
