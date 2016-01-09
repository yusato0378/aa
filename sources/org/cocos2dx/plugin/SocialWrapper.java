// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.plugin;


// Referenced classes of package org.cocos2dx.plugin:
//            PluginWrapper, InterfaceSocial

public class SocialWrapper
{

    public SocialWrapper()
    {
    }

    private static native void nativeOnSocialResult(String s, int i, String s1);

    public static void onSocialResult(InterfaceSocial interfacesocial, int i, String s)
    {
        PluginWrapper.runOnGLThread(new Runnable(interfacesocial, i, s) {

            public void run()
            {
                SocialWrapper.nativeOnSocialResult(curAdapter.getClass().getName().replace('.', '/'), curRet, curMsg);
            }

            final InterfaceSocial val$curAdapter;
            final String val$curMsg;
            final int val$curRet;

            
            {
                curAdapter = interfacesocial;
                curRet = i;
                curMsg = s;
                super();
            }
        }
);
    }

    public static final int SOCIAL_SUBMITSCORE_FAILED = 2;
    public static final int SOCIAL_SUBMITSCORE_SUCCESS = 1;
    public static final int SOCIAL_UNLOCKACH_FAILED = 4;
    public static final int SOCIAL_UNLOCKACH_SUCCESS = 3;

}
