// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package mc.core;

import android.view.ScaleGestureDetector;

public class McScaleGestureListenerWrapper
    implements android.view.ScaleGestureDetector.OnScaleGestureListener
{

    public McScaleGestureListenerWrapper()
    {
        m_isNowGesture = true;
        m_scale = 1.0F;
    }

    private void callNativeGesture(int i, ScaleGestureDetector scalegesturedetector)
    {
        nativeGesture(i, (int)scalegesturedetector.getFocusX(), (int)scalegesturedetector.getFocusY(), m_scale);
    }

    public static native void nativeGesture(int i, int j, int k, float f);

    private void printGestureLog(String s, ScaleGestureDetector scalegesturedetector)
    {
    }

    public float getScaleFactor()
    {
        return m_scale;
    }

    public boolean isNowGesture()
    {
        return m_isNowGesture;
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        printGestureLog("onScale", scalegesturedetector);
        m_scale = m_scale * scalegesturedetector.getScaleFactor();
        callNativeGesture(1, scalegesturedetector);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        printGestureLog("onScaleBegin", scalegesturedetector);
        m_isNowGesture = true;
        m_scale = 1.0F;
        callNativeGesture(0, scalegesturedetector);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        printGestureLog("onScaleEnd", scalegesturedetector);
        m_scale = m_scale * scalegesturedetector.getScaleFactor();
        callNativeGesture(2, scalegesturedetector);
        m_isNowGesture = false;
    }

    private static final boolean DEBUG_PRINT = false;
    private static final int STATE_BEGAN = 0;
    private static final int STATE_CHANGED = 1;
    private static final int STATE_ENDED = 2;
    private boolean m_isNowGesture;
    private float m_scale;
}
