// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;


// Referenced classes of package org.cocos2dx.plugin:
//            PluginWrapper, InterfaceUser

public class UserWrapper
{

    public UserWrapper()
    {
    }

    private static native void nativeOnActionResult(String s, int i, String s1);

    public static void onActionResult(InterfaceUser interfaceuser, int i, String s)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfaceuser, i, s) {

            public void run()
            {
                UserWrapper.nativeOnActionResult(curAdapter.getClass().getName().replace('.', '/'), curRet, curMsg);
            }

            final InterfaceUser val$curAdapter;
            final String val$curMsg;
            final int val$curRet;

            
            {
                curAdapter = interfaceuser;
                curRet = i;
                curMsg = s;
                super();
            }
        }
);
    }

    public static final int ACTION_RET_LOGIN_FAILED = 1;
    public static final int ACTION_RET_LOGIN_SUCCEED = 0;
    public static final int ACTION_RET_LOGOUT_SUCCEED = 2;

}
