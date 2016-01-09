// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import java.util.ArrayList;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxHelper

public class GameControllerAdapter
{

    public GameControllerAdapter()
    {
    }

    public static void addRunnableToFrameStartList(Runnable runnable)
    {
        if(sRunnableFrameStartList == null)
            sRunnableFrameStartList = new ArrayList();
        sRunnableFrameStartList.add(runnable);
    }

    private static native void nativeControllerAxisEvent(String s, int i, int j, float f, boolean flag);

    private static native void nativeControllerButtonEvent(String s, int i, int j, boolean flag, float f, boolean flag1);

    private static native void nativeControllerConnected(String s, int i);

    private static native void nativeControllerDisconnected(String s, int i);

    public static void onAxisEvent(String s, int i, int j, float f, boolean flag)
    {
        Cocos2dxHelper.runOnGLThread(new Runnable(s, i, j, f, flag) {

            public void run()
            {
                GameControllerAdapter.nativeControllerAxisEvent(vendorName, controller, axisID, value, isAnalog);
            }

            final int val$axisID;
            final int val$controller;
            final boolean val$isAnalog;
            final float val$value;
            final String val$vendorName;

            
            {
                vendorName = s;
                controller = i;
                axisID = j;
                value = f;
                isAnalog = flag;
                super();
            }
        }
);
    }

    public static void onButtonEvent(String s, int i, int j, boolean flag, float f, boolean flag1)
    {
        Cocos2dxHelper.runOnGLThread(new Runnable(s, i, j, flag, f, flag1) {

            public void run()
            {
                GameControllerAdapter.nativeControllerButtonEvent(vendorName, controller, button, isPressed, value, isAnalog);
            }

            final int val$button;
            final int val$controller;
            final boolean val$isAnalog;
            final boolean val$isPressed;
            final float val$value;
            final String val$vendorName;

            
            {
                vendorName = s;
                controller = i;
                button = j;
                isPressed = flag;
                value = f;
                isAnalog = flag1;
                super();
            }
        }
);
    }

    public static void onConnected(String s, int i)
    {
        Cocos2dxHelper.runOnGLThread(new Runnable(s, i) {

            public void run()
            {
                GameControllerAdapter.nativeControllerConnected(vendorName, controller);
            }

            final int val$controller;
            final String val$vendorName;

            
            {
                vendorName = s;
                controller = i;
                super();
            }
        }
);
    }

    public static void onDisconnected(String s, int i)
    {
        Cocos2dxHelper.runOnGLThread(new Runnable(s, i) {

            public void run()
            {
                GameControllerAdapter.nativeControllerDisconnected(vendorName, controller);
            }

            final int val$controller;
            final String val$vendorName;

            
            {
                vendorName = s;
                controller = i;
                super();
            }
        }
);
    }

    public static void onDrawFrameStart()
    {
        if(sRunnableFrameStartList != null)
        {
            int j = sRunnableFrameStartList.size();
            for(int i = 0; i < j; i++)
                ((Runnable)sRunnableFrameStartList.get(i)).run();

        }
    }

    public static void removeRunnableFromFrameStartList(Runnable runnable)
    {
        if(sRunnableFrameStartList != null)
            sRunnableFrameStartList.remove(runnable);
    }

    private static ArrayList sRunnableFrameStartList = null;





}
