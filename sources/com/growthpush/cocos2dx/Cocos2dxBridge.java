// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.growthpush.cocos2dx;

import android.os.Handler;
import com.growthpush.GrowthPush;
import com.growthpush.bridge.ExternalFrameworkBridge;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;

public class Cocos2dxBridge extends ExternalFrameworkBridge
{

    public Cocos2dxBridge()
    {
    }

    static native void didOpenRemoteNotification(String s);

    protected void callbackExternalFramework(final String customFiled)
    {
        if(GrowthPush.getInstance().getApplicationId() == 0)
        {
            (new Handler()).post(new Runnable() {

                public void run()
                {
                    callbackExternalFramework(customFiled);
                }

                final Cocos2dxBridge this$0;
                final String val$customFiled;

            
            {
                this$0 = Cocos2dxBridge.this;
                customFiled = s;
                super();
            }
            }
);
            return;
        } else
        {
            Cocos2dxGLSurfaceView.getInstance().queueEvent(new Runnable() {

                public void run()
                {
                    Cocos2dxBridge.didOpenRemoteNotification(customFiled);
                }

                final Cocos2dxBridge this$0;
                final String val$customFiled;

            
            {
                this$0 = Cocos2dxBridge.this;
                customFiled = s;
                super();
            }
            }
);
            return;
        }
    }
}
