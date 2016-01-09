// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package org.cocos2dx.lib;

import com.smrtbeat.SmartBeat;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package org.cocos2dx.lib:
//            Cocos2dxHelper

public class Cocos2dxRenderer
    implements android.opengl.GLSurfaceView.Renderer
{

    public Cocos2dxRenderer()
    {
    }

    private static native void nativeDeleteBackward();

    private static native String nativeGetContentText();

    private static native void nativeInit(int i, int j);

    private static native void nativeInsertText(String s);

    private static native boolean nativeKeyDown(int i);

    private static native void nativeOnPause();

    private static native void nativeOnResume();

    private static native void nativeOnSurfaceChanged(int i, int j);

    private static native void nativeRender();

    private static native void nativeTouchesBegin(int i, float f, float f1);

    private static native void nativeTouchesCancel(int ai[], float af[], float af1[]);

    private static native void nativeTouchesEnd(int i, float f, float f1);

    private static native void nativeTouchesMove(int ai[], float af[], float af1[]);

    public static void setAnimationInterval(double d)
    {
        sAnimationInterval = (long)(1000000000D * d);
    }

    public String getContentText()
    {
        return nativeGetContentText();
    }

    public void handleActionCancel(int ai[], float af[], float af1[])
    {
        nativeTouchesCancel(ai, af, af1);
    }

    public void handleActionDown(int i, float f, float f1)
    {
        nativeTouchesBegin(i, f, f1);
    }

    public void handleActionMove(int ai[], float af[], float af1[])
    {
        nativeTouchesMove(ai, af, af1);
    }

    public void handleActionUp(int i, float f, float f1)
    {
        nativeTouchesEnd(i, f, f1);
    }

    public void handleDeleteBackward()
    {
        nativeDeleteBackward();
    }

    public void handleInsertText(String s)
    {
        nativeInsertText(s);
    }

    public void handleKeyDown(int i)
    {
        nativeKeyDown(i);
    }

    public void handleOnPause()
    {
        Cocos2dxHelper.onEnterBackground();
        nativeOnPause();
    }

    public void handleOnResume()
    {
        Cocos2dxHelper.onEnterForeground();
        nativeOnResume();
    }

    public void onDrawFrame(GL10 gl10)
    {
        if(sIsScreenCapture)
        {
            SmartBeat.beginOnDrawFrame();
            nativeRender();
            SmartBeat.endOnDrawFrame();
            return;
        } else
        {
            nativeRender();
            return;
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        nativeOnSurfaceChanged(i, j);
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        nativeInit(mScreenWidth, mScreenHeight);
        mLastTickInNanoSeconds = System.nanoTime();
        if(18 <= android.os.Build.VERSION.SDK_INT)
            sIsScreenCapture = true;
        if(sIsScreenCapture)
            SmartBeat.onSurfaceCreated(2);
    }

    public void setScreenWidthAndHeight(int i, int j)
    {
        mScreenWidth = i;
        mScreenHeight = j;
    }

    private static final long NANOSECONDSPERMICROSECOND = 0xf4240L;
    private static final long NANOSECONDSPERSECOND = 0x3b9aca00L;
    private static long sAnimationInterval = 0xfe502aL;
    private static boolean sIsScreenCapture = false;
    private long mLastTickInNanoSeconds;
    private int mScreenHeight;
    private int mScreenWidth;

}
